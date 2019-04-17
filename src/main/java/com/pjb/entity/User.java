package com.pjb.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;
import java.util.Date;

/**
 * @author:Lucas
 * @description:
 * @Date:2019/4/9
 **/
@Entity
@Data
public class User {

    @Id
    private Long id;
    private int identity;
    private String password;
    private Date updateDt;
    private String username;
    private Date createDt;
    private int status;
    private int dr;

    @Transient
    public static final String SECRET = "JKKLJOoasdlfj";
}
