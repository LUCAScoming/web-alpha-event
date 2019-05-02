package com.pjb.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.pjb.base.BaseEntity;

import java.io.Serializable;
import java.util.Date;

/**
 * owner_info
 *
 * @author
 */
public class OwnerInfo extends BaseEntity implements Serializable {

//    private String id;

    /**
     * 业主id
     */
    private String ownerId;
    private String ownerName;
    /**
     * 电话号码
     */
    private String phone;
    /**
     * 楼号
     */
    private Integer building;
    /**
     * 房屋号
     */
    private Integer homeNum;
    /**
     * 是否结婚
     */
    private Integer marriage;
    /**
     * 身份证号码
     */
    private String idtyNum;
    /**
     * 政治面貌
     */
    private String politicalLandscape;
    /**
     * 一卡通号码
     */
    private Long cardNum;
    /**
     * 缴费情况
     */
    private Integer payment;
    /**
     * 家庭成员id
     */
    private String familyId;
    /**
     * 家庭收入，单位万
     */
    private Integer income;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date updateDt;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createDt;
    private Integer dr;

    

    private static final long serialVersionUID = 1L;

    public String getOwnerId() {
        return ownerId;
    }


    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
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


    public Integer getMarriage() {
        return marriage;
    }


    public void setMarriage(Integer marriage) {
        this.marriage = marriage;
    }


    public String getIdtyNum() {
        return idtyNum;
    }


    public void setIdtyNum(String idtyNum) {
        this.idtyNum = idtyNum;
    }


    public String getPoliticalLandscape() {
        return politicalLandscape;
    }


    public void setPoliticalLandscape(String politicalLandscape) {
        this.politicalLandscape = politicalLandscape;
    }


    public Long getCardNum() {
        return cardNum;
    }


    public void setCardNum(Long cardNum) {
        this.cardNum = cardNum;
    }


    public Integer getPayment() {
        return payment;
    }


    public void setPayment(Integer payment) {
        this.payment = payment;
    }


    public String getFamilyId() {
        return familyId;
    }


    public void setFamilyId(String familyId) {
        this.familyId = familyId;
    }


    public Integer getIncome() {
        return income;
    }


    public void setIncome(Integer income) {
        this.income = income;
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


    public String getOwnerName() {
        return ownerName;
    }


    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
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
        OwnerInfo other = (OwnerInfo) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
                && (this.getOwnerId() == null ? other.getOwnerId() == null : this.getOwnerId().equals(other.getOwnerId()))
                && (this.getPhone() == null ? other.getPhone() == null : this.getPhone().equals(other.getPhone()))
                && (this.getBuilding() == null ? other.getBuilding() == null : this.getBuilding().equals(other.getBuilding()))
                && (this.getHomeNum() == null ? other.getHomeNum() == null : this.getHomeNum().equals(other.getHomeNum()))
                && (this.getMarriage() == null ? other.getMarriage() == null : this.getMarriage().equals(other.getMarriage()))
                && (this.getIdtyNum() == null ? other.getIdtyNum() == null : this.getIdtyNum().equals(other.getIdtyNum()))
                && (this.getPoliticalLandscape() == null ? other.getPoliticalLandscape() == null : this.getPoliticalLandscape().equals(other.getPoliticalLandscape()))
                && (this.getCardNum() == null ? other.getCardNum() == null : this.getCardNum().equals(other.getCardNum()))
                && (this.getPayment() == null ? other.getPayment() == null : this.getPayment().equals(other.getPayment()))
                && (this.getFamilyId() == null ? other.getFamilyId() == null : this.getFamilyId().equals(other.getFamilyId()))
                && (this.getIncome() == null ? other.getIncome() == null : this.getIncome().equals(other.getIncome()))
                && (this.getUpdateDt() == null ? other.getUpdateDt() == null : this.getUpdateDt().equals(other.getUpdateDt()))
                && (this.getCreateDt() == null ? other.getCreateDt() == null : this.getCreateDt().equals(other.getCreateDt()))
                && (this.getDr() == null ? other.getDr() == null : this.getDr().equals(other.getDr()));
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getOwnerId() == null) ? 0 : getOwnerId().hashCode());
        result = prime * result + ((getPhone() == null) ? 0 : getPhone().hashCode());
        result = prime * result + ((getBuilding() == null) ? 0 : getBuilding().hashCode());
        result = prime * result + ((getHomeNum() == null) ? 0 : getHomeNum().hashCode());
        result = prime * result + ((getMarriage() == null) ? 0 : getMarriage().hashCode());
        result = prime * result + ((getIdtyNum() == null) ? 0 : getIdtyNum().hashCode());
        result = prime * result + ((getPoliticalLandscape() == null) ? 0 : getPoliticalLandscape().hashCode());
        result = prime * result + ((getCardNum() == null) ? 0 : getCardNum().hashCode());
        result = prime * result + ((getPayment() == null) ? 0 : getPayment().hashCode());
        result = prime * result + ((getFamilyId() == null) ? 0 : getFamilyId().hashCode());
        result = prime * result + ((getIncome() == null) ? 0 : getIncome().hashCode());
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
        sb.append(", id=").append(super.getId());
        sb.append(", ownerId=").append(ownerId);
        sb.append(", phone=").append(phone);
        sb.append(", building=").append(building);
        sb.append(", homeNum=").append(homeNum);
        sb.append(", marriage=").append(marriage);
        sb.append(", idtyNum=").append(idtyNum);
        sb.append(", politicalLandscape=").append(politicalLandscape);
        sb.append(", cardNum=").append(cardNum);
        sb.append(", payment=").append(payment);
        sb.append(", familyId=").append(familyId);
        sb.append(", income=").append(income);
        sb.append(", updateDt=").append(updateDt);
        sb.append(", createDt=").append(createDt);
        sb.append(", dr=").append(dr);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }


}
