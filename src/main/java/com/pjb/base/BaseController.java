package com.pjb.base;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author zl_liao
 * 2019/4/25 18:57
 */
public class BaseController<T extends BaseEntity> {

    @Autowired
    private BaseService<T> service;

    public T add(T t) {
        return service.add(t);
    }


    public T select(T t) {
        return service.selectById(t.id);
    }


    public void delete(T t) {
        service.deleteById(t.getId());
    }

    public void update(T t) {
        service.update(t);
    }


}
