package com.pjb.entity;

import com.pjb.base.BaseEntity;

import java.io.Serializable;
import java.util.Date;

/**
 * property
 * @author 
 */
public class Property extends BaseEntity implements Serializable {
//    private String id;

    /**
     * 物业人员名字
     */
    private String propertyName;

    /**
     * 职位名字
     */
    private String positionName;

    /**
     * 管辖权限
     */
    private Integer jurisdiction;

    /**
     * 电话
     */
    private String phone;

    /**
     * 入职时间
     */
    private Date inTime;

    /**
     * 所属部门
     */
    private String partment;

    /**
     * 身份证号码
     */
    private String idtyNum;

    /**
     * 是否在职
     */
    private Integer isin;

    private Date updateDt;

    private Date createDt;

    private Integer dr;

    private static final long serialVersionUID = 1L;



    public String getPropertyName() {
        return propertyName;
    }

    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }

    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }

    public Integer getJurisdiction() {
        return jurisdiction;
    }

    public void setJurisdiction(Integer jurisdiction) {
        this.jurisdiction = jurisdiction;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getInTime() {
        return inTime;
    }

    public void setInTime(Date inTime) {
        this.inTime = inTime;
    }

    public String getPartment() {
        return partment;
    }

    public void setPartment(String partment) {
        this.partment = partment;
    }

    public String getIdtyNum() {
        return idtyNum;
    }

    public void setIdtyNum(String idtyNum) {
        this.idtyNum = idtyNum;
    }

    public Integer getIsin() {
        return isin;
    }

    public void setIsin(Integer isin) {
        this.isin = isin;
    }

    public Date getUpdateDt() {
        return updateDt;
    }

    public void setUpdateDt(Date updateDt) {
        this.updateDt = updateDt;
    }

    public Date getCreateDt() {
        return createDt;
    }

    public void setCreateDt(Date createDt) {
        this.createDt = createDt;
    }

    public Integer getDr() {
        return dr;
    }

    public void setDr(Integer dr) {
        this.dr = dr;
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
        Property other = (Property) that;
        return (this.getPropertyName() == null ? other.getPropertyName() == null : this.getPropertyName().equals(other.getPropertyName()))
            && (this.getPositionName() == null ? other.getPositionName() == null : this.getPositionName().equals(other.getPositionName()))
            && (this.getJurisdiction() == null ? other.getJurisdiction() == null : this.getJurisdiction().equals(other.getJurisdiction()))
            && (this.getPhone() == null ? other.getPhone() == null : this.getPhone().equals(other.getPhone()))
            && (this.getInTime() == null ? other.getInTime() == null : this.getInTime().equals(other.getInTime()))
            && (this.getPartment() == null ? other.getPartment() == null : this.getPartment().equals(other.getPartment()))
            && (this.getIdtyNum() == null ? other.getIdtyNum() == null : this.getIdtyNum().equals(other.getIdtyNum()))
            && (this.getIsin() == null ? other.getIsin() == null : this.getIsin().equals(other.getIsin()))
            && (this.getUpdateDt() == null ? other.getUpdateDt() == null : this.getUpdateDt().equals(other.getUpdateDt()))
            && (this.getCreateDt() == null ? other.getCreateDt() == null : this.getCreateDt().equals(other.getCreateDt()))
            && (this.getDr() == null ? other.getDr() == null : this.getDr().equals(other.getDr()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPropertyName() == null) ? 0 : getPropertyName().hashCode());
        result = prime * result + ((getPositionName() == null) ? 0 : getPositionName().hashCode());
        result = prime * result + ((getJurisdiction() == null) ? 0 : getJurisdiction().hashCode());
        result = prime * result + ((getPhone() == null) ? 0 : getPhone().hashCode());
        result = prime * result + ((getInTime() == null) ? 0 : getInTime().hashCode());
        result = prime * result + ((getPartment() == null) ? 0 : getPartment().hashCode());
        result = prime * result + ((getIdtyNum() == null) ? 0 : getIdtyNum().hashCode());
        result = prime * result + ((getIsin() == null) ? 0 : getIsin().hashCode());
        result = prime * result + ((getUpdateDt() == null) ? 0 : getUpdateDt().hashCode());
        result = prime * result + ((getCreateDt() == null) ? 0 : getCreateDt().hashCode());
        result = prime * result + ((getDr() == null) ? 0 : getDr().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", propertyName=").append(propertyName);
        sb.append(", positionName=").append(positionName);
        sb.append(", jurisdiction=").append(jurisdiction);
        sb.append(", phone=").append(phone);
        sb.append(", inTime=").append(inTime);
        sb.append(", partment=").append(partment);
        sb.append(", idtyNum=").append(idtyNum);
        sb.append(", isin=").append(isin);
        sb.append(", updateDt=").append(updateDt);
        sb.append(", createDt=").append(createDt);
        sb.append(", dr=").append(dr);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}