package com.pjb.entity;

import com.pjb.base.BaseEntity;

import javax.persistence.Entity;
import java.io.Serializable;
import java.util.Date;

/**
 * cardtoon_info
 * @author 
 */
@Entity
public class CardtoonInfo extends BaseEntity implements Serializable {

    /**
     * 实体id
     */
    private String id;
    /**
     * 使用者的id
     */
    private String userId;
    /**
     * 使用时间
     */
    private Date useTime;
    /**
     * 使用类型
     */
    private Integer useType;
    /**
     * 一卡通号码
     */
    private Long cardNum;
    /**
     * 使用地点
     */
    private String useArea;
    /**
     * 一卡通状态
     */
    private Integer cardStatu;
    /**
     * 余额
     */
    private Double moneyRemained;
    /**
     * 操作人id
     */
    private String operId;
    private Date createDt;
    private Date updateDt;
    private Integer dr;
    private static final long serialVersionUID = 1L;

    @Override
    public String getId() {
        return id;
    }


    @Override
    public void setId(String id) {
        this.id = id;
    }


    public String getUserId() {
        return userId;
    }


    public void setUserId(String userId) {
        this.userId = userId;
    }


    public Date getUseTime() {
        return useTime;
    }


    public void setUseTime(Date useTime) {
        this.useTime = useTime;
    }


    public Integer getUseType() {
        return useType;
    }


    public void setUseType(Integer useType) {
        this.useType = useType;
    }


    public Long getCardNum() {
        return cardNum;
    }


    public void setCardNum(Long cardNum) {
        this.cardNum = cardNum;
    }


    public String getUseArea() {
        return useArea;
    }


    public void setUseArea(String useArea) {
        this.useArea = useArea;
    }


    public Integer getCardStatu() {
        return cardStatu;
    }


    public void setCardStatu(Integer cardStatu) {
        this.cardStatu = cardStatu;
    }


    public Double getMoneyRemained() {
        return moneyRemained;
    }


    public void setMoneyRemained(Double moneyRemained) {
        this.moneyRemained = moneyRemained;
    }


    public String getOperId() {
        return operId;
    }


    public void setOperId(String operId) {
        this.operId = operId;
    }


    public Date getCreateDt() {
        return createDt;
    }


    public void setCreateDt(Date createDt) {
        this.createDt = createDt;
    }


    public Date getUpdateDt() {
        return updateDt;
    }


    public void setUpdateDt(Date updateDt) {
        this.updateDt = updateDt;
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
        CardtoonInfo other = (CardtoonInfo) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getUseTime() == null ? other.getUseTime() == null : this.getUseTime().equals(other.getUseTime()))
            && (this.getUseType() == null ? other.getUseType() == null : this.getUseType().equals(other.getUseType()))
            && (this.getCardNum() == null ? other.getCardNum() == null : this.getCardNum().equals(other.getCardNum()))
            && (this.getUseArea() == null ? other.getUseArea() == null : this.getUseArea().equals(other.getUseArea()))
            && (this.getCardStatu() == null ? other.getCardStatu() == null : this.getCardStatu().equals(other.getCardStatu()))
            && (this.getMoneyRemained() == null ? other.getMoneyRemained() == null : this.getMoneyRemained().equals(other.getMoneyRemained()))
            && (this.getOperId() == null ? other.getOperId() == null : this.getOperId().equals(other.getOperId()))
            && (this.getCreateDt() == null ? other.getCreateDt() == null : this.getCreateDt().equals(other.getCreateDt()))
            && (this.getUpdateDt() == null ? other.getUpdateDt() == null : this.getUpdateDt().equals(other.getUpdateDt()))
            && (this.getDr() == null ? other.getDr() == null : this.getDr().equals(other.getDr()));
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getUseTime() == null) ? 0 : getUseTime().hashCode());
        result = prime * result + ((getUseType() == null) ? 0 : getUseType().hashCode());
        result = prime * result + ((getCardNum() == null) ? 0 : getCardNum().hashCode());
        result = prime * result + ((getUseArea() == null) ? 0 : getUseArea().hashCode());
        result = prime * result + ((getCardStatu() == null) ? 0 : getCardStatu().hashCode());
        result = prime * result + ((getMoneyRemained() == null) ? 0 : getMoneyRemained().hashCode());
        result = prime * result + ((getOperId() == null) ? 0 : getOperId().hashCode());
        result = prime * result + ((getCreateDt() == null) ? 0 : getCreateDt().hashCode());
        result = prime * result + ((getUpdateDt() == null) ? 0 : getUpdateDt().hashCode());
        result = prime * result + ((getDr() == null) ? 0 : getDr().hashCode());
        return result;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", useTime=").append(useTime);
        sb.append(", useType=").append(useType);
        sb.append(", cardNum=").append(cardNum);
        sb.append(", useArea=").append(useArea);
        sb.append(", cardStatu=").append(cardStatu);
        sb.append(", moneyRemained=").append(moneyRemained);
        sb.append(", operId=").append(operId);
        sb.append(", createDt=").append(createDt);
        sb.append(", updateDt=").append(updateDt);
        sb.append(", dr=").append(dr);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }


}
