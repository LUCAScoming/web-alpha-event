package com.pjb.base;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

/**
 * @author:Lucas
 * @description:
 * @Date:2019/4/25
 **/
@Entity
@Data
public class BaseEntity {

    @Id
    String id;

    public String getId() {
        return id;
    }


    public void setId(String id) {
        this.id = id;
    }

    @Transient
    private Integer pageSize=10;
    @Transient
    private Integer pageNum=1;

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }
}
