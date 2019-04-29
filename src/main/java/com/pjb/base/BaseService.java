package com.pjb.base;

import com.pjb.config.BussinessException;
import com.pjb.config.Constant;
import com.pjb.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import tk.mybatis.mapper.entity.Example;

import javax.persistence.Transient;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author:Lucas
 * @description:
 * @Date:2019/4/25
 **/
@Service
public abstract class BaseService<T extends BaseEntity> {

    @Autowired
    public BaseMapper<T> mapper;
    private final String orderRule_DESC = "DESC";
    private final String orderRule_ASC = "ASC";

    /**
     * 若查询不到类，则需要override这个方法
     */
    protected Class<T> getEntityClass() {
        return (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
    }


    /**
     * 插入或更新对象
     *
     * @param t
     * @return
     */
    public String saveOrUpdate(T t) {
        if (t.getId() == null || t.getId().equals("")) {
            t.setId(UUID.genUUID());
            this.insert(t);
            return t.getId();
        } else {
            T tt = this.selectById(t.getId());
            if (tt == null) {
                this.insert(t);
                return t.getId();
            } else {
                this.update(t);
                return t.getId();
            }
        }
    }


    public T selectById(String id) {
        if (StringUtils.isEmpty(id)) {
            throw new BussinessException(Constant.EX002);
        }
        return mapper.selectByPrimaryKey(id);
    }


    public List<T> selectByAll() {
        return mapper.selectAll();

    }


    public int deleteById(String id) {
        if (StringUtils.isEmpty(id)) {
            throw new BussinessException(Constant.EX002);
        }
        return mapper.deleteByPrimaryKey(id);
    }


    public void update(T t) throws BussinessException {
        if (t == null) {
            throw new BussinessException(Constant.EX001);
        }
        mapper.updateByPrimaryKeySelective(t);
    }


    public void insert(T t) {
        if (t == null) {
            throw new BussinessException(Constant.EX001);
        }
        t.setId(UUID.genUUID());

        mapper.insert(t);
    }


    /**
     * 通过实体查找
     */
    public List<T> selectByEntity(T entity) {
        if (entity == null) {
            throw new BussinessException(Constant.EX001);
        }
        return mapper.select(entity);
    }


    /**
     * 通过实体查找
     * 排序
     * 如果不定义排序规则，默认升序
     *
     * @param entity
     * @return
     */
    public List<T> selectByEntity(T entity, String orderByProperty, String orderRule) {
        Example example = toExample(entity);
        Example.OrderBy orderBy = example.orderBy(orderByProperty);
        if (orderRule == orderRule_ASC || StringUtils.isEmpty(orderRule)) {
            orderBy.asc();
        } else if (orderRule == orderRule_DESC) {
            orderBy.desc();
        }
        return mapper.selectByExample(example);
    }


    public Example toExample(T entity) {
        Class tempClass = getEntityClass();
        Example example = new Example(tempClass);
        if (entity == null) {
            return example;
        }
        Example.Criteria criteria = example.createCriteria();
        List<Field> fields = new ArrayList<>();

        while (tempClass != null && !tempClass.getName().equals(BaseEntity.class.getName())) {
            // 到BaseEntity为止
            List<Field> list = Arrays.asList(tempClass.getDeclaredFields());
            for (Field f : list) {
                //获取字段中包含fieldMeta的注解 有transient不做查询
                Transient meta = f.getAnnotation(Transient.class);
                if (meta == null) {
                    fields.add(f);
                }
            }
            tempClass = tempClass.getSuperclass(); //得到父类,然后赋给自己
        }

        for (Field field : fields) {
            field.setAccessible(true);
            Object value = null;
            try {
                value = field.get(entity);
            } catch (IllegalAccessException e) {

            }
            if (value == null) {
                continue;
            }
            try {
                criteria.andEqualTo(field.getName(), value);
            } catch (Exception e) {

            }
        }
        return example;
    }


    public T add(T t) {
        String id = null;
//        if (t.getId() != null) {
//            throw new BussinessException(Constant.EX003);
//        }
//        id = UUID.genUUID();
//        ownerInfo.setId(id);
        id = saveOrUpdate(t);

        return selectById(id);
    }


    /*
     * 条件查询
     * 返回对象
     * */
    public T selectByCondition(T t) {
        return mapper.selectOneByExample(toExample(t));
    }


    /*
     * 条件查询返回list
     * */
    public List<T> listByCondition(T t) {
        return mapper.selectByExample(toExample(t));
    }


}
