package com.pjb.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.pjb.base.BaseController;
import com.pjb.entity.FamilyMembers;
import com.pjb.service.FamilyMembersService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author zl_liao
 * 2019/5/6 15:39
 */
@Api("家庭成员管理")
@RestController
@RequestMapping("/alpha/FamilyMembers")
public class FamilyMembersController extends BaseController<FamilyMembers> {

    @Autowired
    private FamilyMembersService familyMembersService;

    @Override
    @ApiOperation(value = "新增或者修改", notes = "修改的时候传入实体id", produces = "application/json")
    @PostMapping(produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public FamilyMembers add(@RequestBody FamilyMembers info) {
        return super.add(info);
    }


    @ApiOperation(value = "查找", notes = "通过id返回对象实体", produces = "application/json")
    @GetMapping("/{id}")
    public FamilyMembers entity(@PathVariable String id) {
        return familyMembersService.selectById(id);
    }


    @Override
    @ApiOperation(value = "删除", notes = "通过实体没有返回", produces = "application/json")
    @DeleteMapping()
    public void delete(@RequestBody FamilyMembers info) {
        super.delete(info);
    }


    @ApiOperation(value = "查询分页")
    @PostMapping("/condition")
    public PageInfo<FamilyMembers> pageByCondition(@RequestBody FamilyMembers info) {
        if (info == null) {
            PageHelper.startPage(1, 10);
            List<FamilyMembers> listByCondition = familyMembersService.selectByAll();
            PageInfo<FamilyMembers> infos = new PageInfo<>(listByCondition);
            return infos;
        }
        PageHelper.startPage(info.getPageNum(), info.getPageSize());
//        List<OwnerInfo> listByCondition = ownerInfoService.selectByAll();
        List<FamilyMembers> listByCondition = familyMembersService.listByCondition(info);
        PageInfo<FamilyMembers> infos = new PageInfo<>(listByCondition);
        return infos;
    }


}
