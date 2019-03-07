package com.pjb;

import com.pjb.SpringbootMybatisShiroApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * @author:Lucas
 * @description:
 * @Date:2019/3/6
 **/
public class SpringTomcatApplication extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(SpringbootMybatisShiroApplication.class);
    }

//    public static void main(String[] args) {
//        SpringApplication.run(SpringTomcatApplication.class, args);
//    }
}
