package com.pjb.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.util.Date;

/**
 * @author:Lucas
 * @description:
 * @Date:2019/4/9
 **/
@Entity
@Data
@Table
public class User {

    @Id
    private Long id;
    private int identity;
    private String password;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date updateDt;
    private String username;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date createDt;
    private int status;
    private int dr;
    @Transient
    private int loginStatus;
    @Transient
    public static final String SECRET = "JKKLJOoasdlfj";

}
