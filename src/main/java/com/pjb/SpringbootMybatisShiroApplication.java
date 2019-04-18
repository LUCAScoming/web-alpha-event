package com.pjb;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/*
* 这是本地 项目
* */
@SpringBootApplication
@MapperScan("com.pjb.mapper")
//@ComponentScan(basePackages = {"com.pjb.test.controller.UserController"})
public class SpringbootMybatisShiroApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootMybatisShiroApplication.class, args);



	}
}
