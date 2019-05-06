package com.pjb.entity;

import com.pjb.base.BaseEntity;

import javax.persistence.Entity;
import java.io.Serializable;
import java.util.Date;

/**
 * equipment_info
 *
 * @author
 */
@Entity
public class EquipmentInfo extends BaseEntity implements Serializable {

    /**
     * 设备id
     */
    private String equipmentId;
    /**
     * 设备地点
     */
    private String equArea;
    /**
     * 设备类型
     */
    private Integer equType;
    /**
     * 设备状态
     */
    private Integer equStatu;
    /**
     * 设备名称
     */
    private String equName;
    /**
     * 检查时间
     */
    private Date checkTime;
    /**
     * 检查人员id
     */
    private String checkerId;
    /**
     * 检察人员姓名
     */
    private String checkerName;
    /**
     * 设备使用时间单位天
     */
    private Long equUsetime;
    /**
     * 设备使用时间
     */
    private String equHeadId;
    private static final long serialVersionUID = 1L;

    public String getEquipmentId() {
        return equipmentId;
    }


    public void setEquipmentId(String equipmentId) {
        this.equipmentId = equipmentId;
    }


    public String getEquArea() {
        return equArea;
    }


    public void setEquArea(String equArea) {
        this.equArea = equArea;
    }


    public Integer getEquType() {
        return equType;
    }


    public void setEquType(Integer equType) {
        this.equType = equType;
    }


    public Integer getEquStatu() {
        return equStatu;
    }


    public void setEquStatu(Integer equStatu) {
        this.equStatu = equStatu;
    }


    public String getEquName() {
        return equName;
    }


    public void setEquName(String equName) {
        this.equName = equName;
    }


    public Date getCheckTime() {
        return checkTime;
    }


    public void setCheckTime(Date checkTime) {
        this.checkTime = checkTime;
    }


    public String getCheckerId() {
        return checkerId;
    }


    public void setCheckerId(String checkerId) {
        this.checkerId = checkerId;
    }


    public String getCheckerName() {
        return checkerName;
    }


    public void setCheckerName(String checkerName) {
        this.checkerName = checkerName;
    }


    public Long getEquUsetime() {
        return equUsetime;
    }


    public void setEquUsetime(Long equUsetime) {
        this.equUsetime = equUsetime;
    }


    public String getEquHeadId() {
        return equHeadId;
    }


    public void setEquHeadId(String equHeadId) {
        this.equHeadId = equHeadId;
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
        EquipmentInfo other = (EquipmentInfo) that;
        return (this.getEquipmentId() == null ? other.getEquipmentId() == null : this.getEquipmentId().equals(other.getEquipmentId()))
                && (this.getEquArea() == null ? other.getEquArea() == null : this.getEquArea().equals(other.getEquArea()))
                && (this.getEquType() == null ? other.getEquType() == null : this.getEquType().equals(other.getEquType()))
                && (this.getEquStatu() == null ? other.getEquStatu() == null : this.getEquStatu().equals(other.getEquStatu()))
                && (this.getEquName() == null ? other.getEquName() == null : this.getEquName().equals(other.getEquName()))
                && (this.getCheckTime() == null ? other.getCheckTime() == null : this.getCheckTime().equals(other.getCheckTime()))
                && (this.getCheckerId() == null ? other.getCheckerId() == null : this.getCheckerId().equals(other.getCheckerId()))
                && (this.getCheckerName() == null ? other.getCheckerName() == null : this.getCheckerName().equals(other.getCheckerName()))
                && (this.getEquUsetime() == null ? other.getEquUsetime() == null : this.getEquUsetime().equals(other.getEquUsetime()))
                && (this.getEquHeadId() == null ? other.getEquHeadId() == null : this.getEquHeadId().equals(other.getEquHeadId()));
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getEquipmentId() == null) ? 0 : getEquipmentId().hashCode());
        result = prime * result + ((getEquArea() == null) ? 0 : getEquArea().hashCode());
        result = prime * result + ((getEquType() == null) ? 0 : getEquType().hashCode());
        result = prime * result + ((getEquStatu() == null) ? 0 : getEquStatu().hashCode());
        result = prime * result + ((getEquName() == null) ? 0 : getEquName().hashCode());
        result = prime * result + ((getCheckTime() == null) ? 0 : getCheckTime().hashCode());
        result = prime * result + ((getCheckerId() == null) ? 0 : getCheckerId().hashCode());
        result = prime * result + ((getCheckerName() == null) ? 0 : getCheckerName().hashCode());
        result = prime * result + ((getEquUsetime() == null) ? 0 : getEquUsetime().hashCode());
        result = prime * result + ((getEquHeadId() == null) ? 0 : getEquHeadId().hashCode());
        return result;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", equipmentId=").append(equipmentId);
        sb.append(", equArea=").append(equArea);
        sb.append(", equType=").append(equType);
        sb.append(", equStatu=").append(equStatu);
        sb.append(", equName=").append(equName);
        sb.append(", checkTime=").append(checkTime);
        sb.append(", checkerId=").append(checkerId);
        sb.append(", checkerName=").append(checkerName);
        sb.append(", equUsetime=").append(equUsetime);
        sb.append(", equHeadId=").append(equHeadId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }


}
