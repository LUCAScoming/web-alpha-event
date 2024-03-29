package com.pjb.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class SysPermission {
    Integer id;//主键.
    String name;//名称.
    String url;//资源路径.
    String permission; //权限字符串
}
