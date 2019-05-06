package com.pjb.entity;

import com.pjb.base.BaseEntity;

import javax.persistence.Entity;
import java.io.Serializable;
import java.util.Date;

/**
 * cost_info
 * @author 
 */
@Entity
public class CostInfo extends BaseEntity implements Serializable {

//    /**
//     * 实体id
//     */
//    private String id;
    /**
     * 费用类型
     */
    private Integer costType;
    /**
     * 费用号
     */
    private Long costNum;
    /**
     * 消费者id
     */
    private String consumerId;
    /**
     * 消费时间
     */
    private Date consumerTime;
    /**
     * 消费地点
     */
    private String consumerArea;
    /**
     * 处理人id
     */
    private String processerId;
    /**
     * 余额
     */
    private Float balance;
    /**
     * 处理人姓名
     */
    private String processerName;
    /**
     * 消费明细
     */
    private String consumerDetail;
    /**
     * 消费项目
     */
    private Integer consumerEvent;
    /**
     * 备注
     */
    private String comment;
    private Date createDt;
    private Date updateDt;
    private static final long serialVersionUID = 1L;



    public Integer getCostType() {
        return costType;
    }


    public void setCostType(Integer costType) {
        this.costType = costType;
    }


    public Long getCostNum() {
        return costNum;
    }


    public void setCostNum(Long costNum) {
        this.costNum = costNum;
    }


    public String getConsumerId() {
        return consumerId;
    }


    public void setConsumerId(String consumerId) {
        this.consumerId = consumerId;
    }


    public Date getConsumerTime() {
        return consumerTime;
    }


    public void setConsumerTime(Date consumerTime) {
        this.consumerTime = consumerTime;
    }


    public String getConsumerArea() {
        return consumerArea;
    }


    public void setConsumerArea(String consumerArea) {
        this.consumerArea = consumerArea;
    }


    public String getProcesserId() {
        return processerId;
    }


    public void setProcesserId(String processerId) {
        this.processerId = processerId;
    }


    public Float getBalance() {
        return balance;
    }


    public void setBalance(Float balance) {
        this.balance = balance;
    }


    public String getProcesserName() {
        return processerName;
    }


    public void setProcesserName(String processerName) {
        this.processerName = processerName;
    }


    public String getConsumerDetail() {
        return consumerDetail;
    }


    public void setConsumerDetail(String consumerDetail) {
        this.consumerDetail = consumerDetail;
    }


    public Integer getConsumerEvent() {
        return consumerEvent;
    }


    public void setConsumerEvent(Integer consumerEvent) {
        this.consumerEvent = consumerEvent;
    }


    public String getComment() {
        return comment;
    }


    public void setComment(String comment) {
        this.comment = comment;
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
        CostInfo other = (CostInfo) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCostType() == null ? other.getCostType() == null : this.getCostType().equals(other.getCostType()))
            && (this.getCostNum() == null ? other.getCostNum() == null : this.getCostNum().equals(other.getCostNum()))
            && (this.getConsumerId() == null ? other.getConsumerId() == null : this.getConsumerId().equals(other.getConsumerId()))
            && (this.getConsumerTime() == null ? other.getConsumerTime() == null : this.getConsumerTime().equals(other.getConsumerTime()))
            && (this.getConsumerArea() == null ? other.getConsumerArea() == null : this.getConsumerArea().equals(other.getConsumerArea()))
            && (this.getProcesserId() == null ? other.getProcesserId() == null : this.getProcesserId().equals(other.getProcesserId()))
            && (this.getBalance() == null ? other.getBalance() == null : this.getBalance().equals(other.getBalance()))
            && (this.getProcesserName() == null ? other.getProcesserName() == null : this.getProcesserName().equals(other.getProcesserName()))
            && (this.getConsumerDetail() == null ? other.getConsumerDetail() == null : this.getConsumerDetail().equals(other.getConsumerDetail()))
            && (this.getConsumerEvent() == null ? other.getConsumerEvent() == null : this.getConsumerEvent().equals(other.getConsumerEvent()))
            && (this.getComment() == null ? other.getComment() == null : this.getComment().equals(other.getComment()))
            && (this.getCreateDt() == null ? other.getCreateDt() == null : this.getCreateDt().equals(other.getCreateDt()))
            && (this.getUpdateDt() == null ? other.getUpdateDt() == null : this.getUpdateDt().equals(other.getUpdateDt()));
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCostType() == null) ? 0 : getCostType().hashCode());
        result = prime * result + ((getCostNum() == null) ? 0 : getCostNum().hashCode());
        result = prime * result + ((getConsumerId() == null) ? 0 : getConsumerId().hashCode());
        result = prime * result + ((getConsumerTime() == null) ? 0 : getConsumerTime().hashCode());
        result = prime * result + ((getConsumerArea() == null) ? 0 : getConsumerArea().hashCode());
        result = prime * result + ((getProcesserId() == null) ? 0 : getProcesserId().hashCode());
        result = prime * result + ((getBalance() == null) ? 0 : getBalance().hashCode());
        result = prime * result + ((getProcesserName() == null) ? 0 : getProcesserName().hashCode());
        result = prime * result + ((getConsumerDetail() == null) ? 0 : getConsumerDetail().hashCode());
        result = prime * result + ((getConsumerEvent() == null) ? 0 : getConsumerEvent().hashCode());
        result = prime * result + ((getComment() == null) ? 0 : getComment().hashCode());
        result = prime * result + ((getCreateDt() == null) ? 0 : getCreateDt().hashCode());
        result = prime * result + ((getUpdateDt() == null) ? 0 : getUpdateDt().hashCode());
        return result;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(super.getId());
        sb.append(", costType=").append(costType);
        sb.append(", costNum=").append(costNum);
        sb.append(", consumerId=").append(consumerId);
        sb.append(", consumerTime=").append(consumerTime);
        sb.append(", consumerArea=").append(consumerArea);
        sb.append(", processerId=").append(processerId);
        sb.append(", balance=").append(balance);
        sb.append(", processerName=").append(processerName);
        sb.append(", consumerDetail=").append(consumerDetail);
        sb.append(", consumerEvent=").append(consumerEvent);
        sb.append(", comment=").append(comment);
        sb.append(", createDt=").append(createDt);
        sb.append(", updateDt=").append(updateDt);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }


}
