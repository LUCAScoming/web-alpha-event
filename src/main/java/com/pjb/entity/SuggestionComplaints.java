package com.pjb.entity;

import com.pjb.base.BaseEntity;

import java.io.Serializable;
import java.util.Date;

/**
 * suggestion_complaints
 * @author 
 */
public class SuggestionComplaints extends BaseEntity implements Serializable {
//    /**
//     * 实体id
//     */
//    private String id;

    /**
     * 投诉建议人的id
     */
    private String scerId;

    /**
     * 投诉建议人的姓名
     */
    private String scerName;

    /**
     * 投诉建议内容
     */
    private String scMsg;

    /**
     * 投诉建议的类型
     */
    private Integer scType;

    /**
     * 投诉建议的状态
     */
    private Integer scStatus;

    /**
     * 处理者id
     */
    private String processerId;

    /**
     * 处理者姓名
     */
    private String processerName;

    /**
     * 处理时间
     */
    private Date peocesserTime;

    /**
     * 处理结果
     */
    private String processerResult;

    private static final long serialVersionUID = 1L;



    public String getScerId() {
        return scerId;
    }

    public void setScerId(String scerId) {
        this.scerId = scerId;
    }

    public String getScerName() {
        return scerName;
    }

    public void setScerName(String scerName) {
        this.scerName = scerName;
    }

    public String getScMsg() {
        return scMsg;
    }

    public void setScMsg(String scMsg) {
        this.scMsg = scMsg;
    }

    public Integer getScType() {
        return scType;
    }

    public void setScType(Integer scType) {
        this.scType = scType;
    }

    public Integer getScStatus() {
        return scStatus;
    }

    public void setScStatus(Integer scStatus) {
        this.scStatus = scStatus;
    }

    public String getProcesserId() {
        return processerId;
    }

    public void setProcesserId(String processerId) {
        this.processerId = processerId;
    }

    public String getProcesserName() {
        return processerName;
    }

    public void setProcesserName(String processerName) {
        this.processerName = processerName;
    }

    public Date getPeocesserTime() {
        return peocesserTime;
    }

    public void setPeocesserTime(Date peocesserTime) {
        this.peocesserTime = peocesserTime;
    }

    public String getProcesserResult() {
        return processerResult;
    }

    public void setProcesserResult(String processerResult) {
        this.processerResult = processerResult;
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
        SuggestionComplaints other = (SuggestionComplaints) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getScerId() == null ? other.getScerId() == null : this.getScerId().equals(other.getScerId()))
            && (this.getScerName() == null ? other.getScerName() == null : this.getScerName().equals(other.getScerName()))
            && (this.getScMsg() == null ? other.getScMsg() == null : this.getScMsg().equals(other.getScMsg()))
            && (this.getScType() == null ? other.getScType() == null : this.getScType().equals(other.getScType()))
            && (this.getScStatus() == null ? other.getScStatus() == null : this.getScStatus().equals(other.getScStatus()))
            && (this.getProcesserId() == null ? other.getProcesserId() == null : this.getProcesserId().equals(other.getProcesserId()))
            && (this.getProcesserName() == null ? other.getProcesserName() == null : this.getProcesserName().equals(other.getProcesserName()))
            && (this.getPeocesserTime() == null ? other.getPeocesserTime() == null : this.getPeocesserTime().equals(other.getPeocesserTime()))
            && (this.getProcesserResult() == null ? other.getProcesserResult() == null : this.getProcesserResult().equals(other.getProcesserResult()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getScerId() == null) ? 0 : getScerId().hashCode());
        result = prime * result + ((getScerName() == null) ? 0 : getScerName().hashCode());
        result = prime * result + ((getScMsg() == null) ? 0 : getScMsg().hashCode());
        result = prime * result + ((getScType() == null) ? 0 : getScType().hashCode());
        result = prime * result + ((getScStatus() == null) ? 0 : getScStatus().hashCode());
        result = prime * result + ((getProcesserId() == null) ? 0 : getProcesserId().hashCode());
        result = prime * result + ((getProcesserName() == null) ? 0 : getProcesserName().hashCode());
        result = prime * result + ((getPeocesserTime() == null) ? 0 : getPeocesserTime().hashCode());
        result = prime * result + ((getProcesserResult() == null) ? 0 : getProcesserResult().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(super.getId());
        sb.append(", scerId=").append(scerId);
        sb.append(", scerName=").append(scerName);
        sb.append(", scMsg=").append(scMsg);
        sb.append(", scType=").append(scType);
        sb.append(", scStatus=").append(scStatus);
        sb.append(", processerId=").append(processerId);
        sb.append(", processerName=").append(processerName);
        sb.append(", peocesserTime=").append(peocesserTime);
        sb.append(", processerResult=").append(processerResult);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}