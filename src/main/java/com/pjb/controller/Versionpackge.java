package com.pjb.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author:Lucas
 * @description:
 * @Date:2019/4/28
 **/
@Api(value = "这是程序打包版本号")
@RestController
@RequestMapping("alpha/version")
public class Versionpackge {


    @ApiOperation(value = "这是版本号，get请求", notes = "要保证版本和时间最新")
    @GetMapping
    public Map<String, String> version() {
        Map<String, String> version = new HashMap<>();
        String versions_current = "1.7";
        String version_time = "2019/5/5,17.10";
        version.put("当前版本号是：", versions_current);
        version.put("版本号：" + versions_current + "更新的时间是：", version_time);
        return version;
    }
}
