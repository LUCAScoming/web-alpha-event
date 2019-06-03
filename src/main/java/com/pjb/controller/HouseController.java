package com.pjb.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.pjb.base.BaseController;
import com.pjb.entity.House;
import com.pjb.service.HouseService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author:Lucas
 * @description:
 * @Date:2019/5/1
 **/
@RequestMapping("/alpha/house")
@RestController
@Api(value = "房产资料管理")
public class HouseController extends BaseController<House> {

    @Autowired
    private HouseService houseService;

    @Override
    @ApiOperation(value = "新增或者修改", notes = "修改的时候传入实体id", produces = "application/json")
    @PostMapping(produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public House add(@RequestBody House house) {
        return super.add(house);
    }


    @ApiOperation(value = "查找", notes = "通过id返回对象实体", produces = "application/json")
    @GetMapping("/{id}")
    public House entity(@PathVariable String id) {
        return houseService.selectById(id);
    }


    @ApiOperation(value = "删除", notes = "通过实体没有返回", produces = "application/json")
    @DeleteMapping("/{id}")
    public Map<String, Object> delete(@PathVariable String id) {
        Map<String, Object> map = new HashMap<>();
        if (StringUtils.isEmpty(id)) {
            map.put("删除:", "失败,id为空");
            return map;
        } else if (houseService.selectById(id) == null) {
            map.put("删除:", "失败，删除对象不存在");
            return map;
        } else {
            House ownerInfo = new House();
            ownerInfo.setId(id);
            super.delete(ownerInfo);
            map.put("删除:", "删除成功");
            return map;
        }

    }


    @ApiOperation(value = "查询分页")
    @GetMapping("/condition")
    public PageInfo<House> pageByCondition(@ModelAttribute House ownerInfo) {
        if (ownerInfo == null) {
            PageHelper.startPage(1, 10);
            List<House> listByCondition = houseService.selectByAll();
            PageInfo<House> info = new PageInfo<>(listByCondition);
            return info;
        }
        PageHelper.startPage(ownerInfo.getPageNum(), ownerInfo.getPageSize());
//        List<OwnerInfo> listByCondition = ownerInfoService.selectByAll();
        List<House> listByCondition = houseService.listByCondition(ownerInfo);
        PageInfo<House> info = new PageInfo<>(listByCondition);
        return info;
    }


}
