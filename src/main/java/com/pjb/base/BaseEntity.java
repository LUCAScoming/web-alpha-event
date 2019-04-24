package com.pjb.base;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author:Lucas
 * @description:
 * @Date:2019/4/25
 **/
@Entity
public class BaseEntity {
    @Id
    String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
