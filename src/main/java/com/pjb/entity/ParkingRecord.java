package com.pjb.entity;

import com.pjb.base.BaseEntity;

import java.io.Serializable;
import java.util.Date;

/**
 * parking_record
 * @author 
 */
public class ParkingRecord extends BaseEntity implements Serializable {
//    /**
//     * 记录id
//     */
//    private String id;

    /**
     * 车辆号码
     */
    private Long carNum;

    /**
     * 车主id
     */
    private String carOwnerId;

    /**
     * 车主姓名
     */
    private String carOwnerName;

    /**
     * 车辆进入时间
     */
    private Date carEnterTime;

    /**
     * 车辆离开时间
     */
    private Date carLeaveTime;

    /**
     * 车辆进入地点
     */
    private String carEnterArea;

    /**
     * 车辆离开地点
     */
    private String carLeaveArea;

    /**
     * 负责人id
     */
    private String managerId;

    /**
     * 负责人姓名
     */
    private String managerName;

    private static final long serialVersionUID = 1L;



    public Long getCarNum() {
        return carNum;
    }

    public void setCarNum(Long carNum) {
        this.carNum = carNum;
    }

    public String getCarOwnerId() {
        return carOwnerId;
    }

    public void setCarOwnerId(String carOwnerId) {
        this.carOwnerId = carOwnerId;
    }

    public String getCarOwnerName() {
        return carOwnerName;
    }

    public void setCarOwnerName(String carOwnerName) {
        this.carOwnerName = carOwnerName;
    }

    public Date getCarEnterTime() {
        return carEnterTime;
    }

    public void setCarEnterTime(Date carEnterTime) {
        this.carEnterTime = carEnterTime;
    }

    public Date getCarLeaveTime() {
        return carLeaveTime;
    }

    public void setCarLeaveTime(Date carLeaveTime) {
        this.carLeaveTime = carLeaveTime;
    }

    public String getCarEnterArea() {
        return carEnterArea;
    }

    public void setCarEnterArea(String carEnterArea) {
        this.carEnterArea = carEnterArea;
    }

    public String getCarLeaveArea() {
        return carLeaveArea;
    }

    public void setCarLeaveArea(String carLeaveArea) {
        this.carLeaveArea = carLeaveArea;
    }

    public String getManagerId() {
        return managerId;
    }

    public void setManagerId(String managerId) {
        this.managerId = managerId;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
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
        ParkingRecord other = (ParkingRecord) that;
        return
             (this.getCarNum() == null ? other.getCarNum() == null : this.getCarNum().equals(other.getCarNum()))
            && (this.getCarOwnerId() == null ? other.getCarOwnerId() == null : this.getCarOwnerId().equals(other.getCarOwnerId()))
            && (this.getCarOwnerName() == null ? other.getCarOwnerName() == null : this.getCarOwnerName().equals(other.getCarOwnerName()))
            && (this.getCarEnterTime() == null ? other.getCarEnterTime() == null : this.getCarEnterTime().equals(other.getCarEnterTime()))
            && (this.getCarLeaveTime() == null ? other.getCarLeaveTime() == null : this.getCarLeaveTime().equals(other.getCarLeaveTime()))
            && (this.getCarEnterArea() == null ? other.getCarEnterArea() == null : this.getCarEnterArea().equals(other.getCarEnterArea()))
            && (this.getCarLeaveArea() == null ? other.getCarLeaveArea() == null : this.getCarLeaveArea().equals(other.getCarLeaveArea()))
            && (this.getManagerId() == null ? other.getManagerId() == null : this.getManagerId().equals(other.getManagerId()))
            && (this.getManagerName() == null ? other.getManagerName() == null : this.getManagerName().equals(other.getManagerName()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime * result + ((getCarNum() == null) ? 0 : getCarNum().hashCode());
        result = prime * result + ((getCarOwnerId() == null) ? 0 : getCarOwnerId().hashCode());
        result = prime * result + ((getCarOwnerName() == null) ? 0 : getCarOwnerName().hashCode());
        result = prime * result + ((getCarEnterTime() == null) ? 0 : getCarEnterTime().hashCode());
        result = prime * result + ((getCarLeaveTime() == null) ? 0 : getCarLeaveTime().hashCode());
        result = prime * result + ((getCarEnterArea() == null) ? 0 : getCarEnterArea().hashCode());
        result = prime * result + ((getCarLeaveArea() == null) ? 0 : getCarLeaveArea().hashCode());
        result = prime * result + ((getManagerId() == null) ? 0 : getManagerId().hashCode());
        result = prime * result + ((getManagerName() == null) ? 0 : getManagerName().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", carNum=").append(carNum);
        sb.append(", carOwnerId=").append(carOwnerId);
        sb.append(", carOwnerName=").append(carOwnerName);
        sb.append(", carEnterTime=").append(carEnterTime);
        sb.append(", carLeaveTime=").append(carLeaveTime);
        sb.append(", carEnterArea=").append(carEnterArea);
        sb.append(", carLeaveArea=").append(carLeaveArea);
        sb.append(", managerId=").append(managerId);
        sb.append(", managerName=").append(managerName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}