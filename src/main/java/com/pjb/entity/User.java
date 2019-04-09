package com.pjb.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
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
    private Date update_dt;
    private String username;
    private Date create_dt;
    private int dr;

}
