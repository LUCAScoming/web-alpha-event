package com.pjb.entity;


import com.pjb.base.BaseEntity;

import javax.persistence.Entity;
import java.io.Serializable;
import java.util.Date;

/**
 * house
 *
 * @author
 */

public class House extends BaseEntity implements Serializable {


    /**
     * 业主id
     */
    private String ownerId;

    /**
     * 业主姓名
     */
    private String ownerName;

    /**
     * 电话号码
     */
    private String phone;

    /**
     * 楼栋单元
     */
    private Integer building;

    /**
     * 房屋号
     */
    private Integer homeNum;

    /**
     * 买房日期
     */
    private Date buyhouseDate;

    /**
     * 房屋面积
     */
    private Double houseArea;

    /**
     * 房屋构造（几室几厅）
     */
    private String houseStructure;

    /**
     * 房屋类型
     */
    private Integer houseType;

    private Date createdDate;

    private Date updatedDate;

    private String createdBy;

    /**
     * 说明
     */
    private String comment;

    private static final long serialVersionUID = 1L;



    public String getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getBuilding() {
        return building;
    }

    public void setBuilding(Integer building) {
        this.building = building;
    }

    public Integer getHomeNum() {
        return homeNum;
    }

    public void setHomeNum(Integer homeNum) {
        this.homeNum = homeNum;
    }

    public Date getBuyhouseDate() {
        return buyhouseDate;
    }

    public void setBuyhouseDate(Date buyhouseDate) {
        this.buyhouseDate = buyhouseDate;
    }

    public Double getHouseArea() {
        return houseArea;
    }

    public void setHouseArea(Double houseArea) {
        this.houseArea = houseArea;
    }

    public String getHouseStructure() {
        return houseStructure;
    }

    public void setHouseStructure(String houseStructure) {
        this.houseStructure = houseStructure;
    }

    public Integer getHouseType() {
        return houseType;
    }

    public void setHouseType(Integer houseType) {
        this.houseType = houseType;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        House other = (House) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
                && (this.getOwnerId() == null ? other.getOwnerId() == null : this.getOwnerId().equals(other.getOwnerId()))
                && (this.getOwnerName() == null ? other.getOwnerName() == null : this.getOwnerName().equals(other.getOwnerName()))
                && (this.getPhone() == null ? other.getPhone() == null : this.getPhone().equals(other.getPhone()))
                && (this.getBuilding() == null ? other.getBuilding() == null : this.getBuilding().equals(other.getBuilding()))
                && (this.getHomeNum() == null ? other.getHomeNum() == null : this.getHomeNum().equals(other.getHomeNum()))
                && (this.getBuyhouseDate() == null ? other.getBuyhouseDate() == null : this.getBuyhouseDate().equals(other.getBuyhouseDate()))
                && (this.getHouseArea() == null ? other.getHouseArea() == null : this.getHouseArea().equals(other.getHouseArea()))
                && (this.getHouseStructure() == null ? other.getHouseStructure() == null : this.getHouseStructure().equals(other.getHouseStructure()))
                && (this.getHouseType() == null ? other.getHouseType() == null : this.getHouseType().equals(other.getHouseType()))
                && (this.getCreatedDate() == null ? other.getCreatedDate() == null : this.getCreatedDate().equals(other.getCreatedDate()))
                && (this.getUpdatedDate() == null ? other.getUpdatedDate() == null : this.getUpdatedDate().equals(other.getUpdatedDate()))
                && (this.getCreatedBy() == null ? other.getCreatedBy() == null : this.getCreatedBy().equals(other.getCreatedBy()))
                && (this.getComment() == null ? other.getComment() == null : this.getComment().equals(other.getComment()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getOwnerId() == null) ? 0 : getOwnerId().hashCode());
        result = prime * result + ((getOwnerName() == null) ? 0 : getOwnerName().hashCode());
        result = prime * result + ((getPhone() == null) ? 0 : getPhone().hashCode());
        result = prime * result + ((getBuilding() == null) ? 0 : getBuilding().hashCode());
        result = prime * result + ((getHomeNum() == null) ? 0 : getHomeNum().hashCode());
        result = prime * result + ((getBuyhouseDate() == null) ? 0 : getBuyhouseDate().hashCode());
        result = prime * result + ((getHouseArea() == null) ? 0 : getHouseArea().hashCode());
        result = prime * result + ((getHouseStructure() == null) ? 0 : getHouseStructure().hashCode());
        result = prime * result + ((getHouseType() == null) ? 0 : getHouseType().hashCode());
        result = prime * result + ((getCreatedDate() == null) ? 0 : getCreatedDate().hashCode());
        result = prime * result + ((getUpdatedDate() == null) ? 0 : getUpdatedDate().hashCode());
        result = prime * result + ((getCreatedBy() == null) ? 0 : getCreatedBy().hashCode());
        result = prime * result + ((getComment() == null) ? 0 : getComment().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(super.getId());
        sb.append(", ownerId=").append(ownerId);
        sb.append(", ownerName=").append(ownerName);
        sb.append(", phone=").append(phone);
        sb.append(", building=").append(building);
        sb.append(", homeNum=").append(homeNum);
        sb.append(", buyhouseDate=").append(buyhouseDate);
        sb.append(", houseArea=").append(houseArea);
        sb.append(", houseStructure=").append(houseStructure);
        sb.append(", houseType=").append(houseType);
        sb.append(", createdDate=").append(createdDate);
        sb.append(", updatedDate=").append(updatedDate);
        sb.append(", createdBy=").append(createdBy);
        sb.append(", comment=").append(comment);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}