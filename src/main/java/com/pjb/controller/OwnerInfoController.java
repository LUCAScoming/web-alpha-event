package com.pjb.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.pjb.base.BaseController;
import com.pjb.entity.FamilyMembers;
import com.pjb.entity.OwnerInfo;
import com.pjb.service.FamilyMembersService;
import com.pjb.service.OwnerInfoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.*;

/**
 * @author:Lucas
 * @description:
 * @Date:2019/4/25
 **/
@RestController
@Api(value = "业主信息相关接口")
@RequestMapping("alpha/owner")
public class OwnerInfoController extends BaseController<OwnerInfo> {

    @Autowired
    private OwnerInfoService ownerInfoService;
    @Autowired
    private FamilyMembersService familyMembersService;

    @Override
    @ApiOperation(value = "新增", notes = "", produces = "application/json")
    @PostMapping(produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public OwnerInfo add(@RequestBody OwnerInfo ownerInfo) {
        if (ownerInfo.getId() == null) {
            ownerInfo.setCreateDt(new Date());
            ownerInfo.setUpdateDt(new Date());
        } else {
            ownerInfo.setUpdateDt(new Date());
        }
        OwnerInfo info = super.add(ownerInfo);
        if (ownerInfo.getFamilyMembersList() != null) {
            List<FamilyMembers> familyMembersList = ownerInfo.getFamilyMembersList();
            for (FamilyMembers familyMember : familyMembersList) {
                familyMember.setOwnerId(info.getId());
                familyMembersService.saveOrUpdate(familyMember);
            }
        }
        return info;
    }


    @ApiOperation(value = "查找", notes = "通过id返回对象实体", produces = "application/json")
    @GetMapping("/{id}")
    public OwnerInfo entity(@PathVariable String id) {
        if (StringUtils.isEmpty(id)) {
            return new OwnerInfo();
        }
        FamilyMembers familyMembers = new FamilyMembers();
        familyMembers.setOwnerId(id);
        OwnerInfo ownerInfo = new OwnerInfo();
        ownerInfo.setId(id);
        OwnerInfo ownerInfo1 = super.select(ownerInfo);
        if (ownerInfo1 == null) {
            return null;
        }
        List<FamilyMembers> familyMembersList = familyMembersService.selectByEntity(familyMembers);
        if (familyMembersList == null) {
            List<FamilyMembers> list = new ArrayList<>();
            ownerInfo1.setFamilyMembersList(list);
            return ownerInfo1;
        }
        ownerInfo1.setFamilyMembersList(familyMembersList);
        return ownerInfo1;

    }


    @ApiOperation(value = "删除", notes = "通过实体没有返回", produces = "application/json")
    @DeleteMapping("/{id}")
    public Map<String, Object> delete(@PathVariable String id) {
        Map<String, Object> map = new HashMap<>();
        if (StringUtils.isEmpty(id)) {
            map.put("删除:", "失败,id为空");
            return map;
        } else if (ownerInfoService.selectById(id) == null) {
            map.put("删除:", "失败，删除对象不存在");
            return map;
        } else {
            OwnerInfo ownerInfo = new OwnerInfo();
            ownerInfo.setId(id);
            super.delete(ownerInfo);
            map.put("删除:", "删除成功");
            return map;
        }

    }


    @ApiOperation(value = "查询分页",
            notes = "传入查询的条件和分页条件，查询全部数据分页的时候传一个空对象，默认一页10条")
    @GetMapping("/condition")
    @ResponseBody
    public PageInfo<OwnerInfo> pageByCondition(@ModelAttribute OwnerInfo ownerInfo) {
//        if (ownerInfo.getOwnerId() == null && ownerInfo.getOwnerName() == null) {
//            PageHelper.startPage(1, 10);
//            List<OwnerInfo> listByCondition = ownerInfoService.listByOrdeBY();
//            PageInfo<OwnerInfo> info = new PageInfo<>(listByCondition);
//            return info;
//        } else {
//
//        }
        PageHelper.startPage(ownerInfo.getPageNum(), ownerInfo.getPageSize());
//        List<OwnerInfo> listByCondition = ownerInfoService.selectByAll();
        String createDt = "createDt";
        String rule = "orderRule_DESC";
        List<OwnerInfo> listByCondition = ownerInfoService.selectByEntity(ownerInfo, createDt, rule);
//            ownerInfoService.sort(listByCondition);
        PageInfo<OwnerInfo> info = new PageInfo<>(listByCondition);
        return info;

    }


}
