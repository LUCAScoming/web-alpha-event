package com.pjb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author:Lucas
 * @description:
 * @Date:2019/4/28
 **/

@Controller
public class IndexController {
    @RequestMapping("/index")
    public String index() {
        return "index";
    }
}
