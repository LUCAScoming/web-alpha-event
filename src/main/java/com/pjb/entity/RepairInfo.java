package com.pjb.entity;

import com.pjb.base.BaseEntity;

import java.io.Serializable;
import java.util.Date;

/**
 * repair_info
 * @author 
 */
public class RepairInfo extends BaseEntity implements Serializable {
//    /**
//     * 实体id
//     */
//    private String id;

    /**
     * 报修人id
     */
    private String reporterId;

    /**
     * 报修人姓名
     */
    private String reporterName;

    /**
     * 报修原因
     */
    private Integer repReason;

    /**
     * 报修详细信息
     */
    private String repDescription;

    /**
     * 报修日期
     */
    private Date repTime;

    /**
     * 报修状态
     */
    private Integer repStatu;

    /**
     * 报修地点
     */
    private String repArea;

    /**
     * 维修人员id
     */
    private String serviceId;

    /**
     * 维修人员姓名
     */
    private String serviceName;

    /**
     * 维修状态
     */
    private Integer serviceStatu;

    /**
     * 验收人id
     */
    private String checkerId;

    /**
     * 验收人姓名
     */
    private String checkerName;

    /**
     * 报修备注
     */
    private String repComment;

    private static final long serialVersionUID = 1L;



    public String getReporterId() {
        return reporterId;
    }

    public void setReporterId(String reporterId) {
        this.reporterId = reporterId;
    }

    public String getReporterName() {
        return reporterName;
    }

    public void setReporterName(String reporterName) {
        this.reporterName = reporterName;
    }

    public Integer getRepReason() {
        return repReason;
    }

    public void setRepReason(Integer repReason) {
        this.repReason = repReason;
    }

    public String getRepDescription() {
        return repDescription;
    }

    public void setRepDescription(String repDescription) {
        this.repDescription = repDescription;
    }

    public Date getRepTime() {
        return repTime;
    }

    public void setRepTime(Date repTime) {
        this.repTime = repTime;
    }

    public Integer getRepStatu() {
        return repStatu;
    }

    public void setRepStatu(Integer repStatu) {
        this.repStatu = repStatu;
    }

    public String getRepArea() {
        return repArea;
    }

    public void setRepArea(String repArea) {
        this.repArea = repArea;
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public Integer getServiceStatu() {
        return serviceStatu;
    }

    public void setServiceStatu(Integer serviceStatu) {
        this.serviceStatu = serviceStatu;
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

    public String getRepComment() {
        return repComment;
    }

    public void setRepComment(String repComment) {
        this.repComment = repComment;
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
        RepairInfo other = (RepairInfo) that;
        return (this.getReporterId() == null ? other.getReporterId() == null : this.getReporterId().equals(other.getReporterId()))
            && (this.getReporterName() == null ? other.getReporterName() == null : this.getReporterName().equals(other.getReporterName()))
            && (this.getRepReason() == null ? other.getRepReason() == null : this.getRepReason().equals(other.getRepReason()))
            && (this.getRepDescription() == null ? other.getRepDescription() == null : this.getRepDescription().equals(other.getRepDescription()))
            && (this.getRepTime() == null ? other.getRepTime() == null : this.getRepTime().equals(other.getRepTime()))
            && (this.getRepStatu() == null ? other.getRepStatu() == null : this.getRepStatu().equals(other.getRepStatu()))
            && (this.getRepArea() == null ? other.getRepArea() == null : this.getRepArea().equals(other.getRepArea()))
            && (this.getServiceId() == null ? other.getServiceId() == null : this.getServiceId().equals(other.getServiceId()))
            && (this.getServiceName() == null ? other.getServiceName() == null : this.getServiceName().equals(other.getServiceName()))
            && (this.getServiceStatu() == null ? other.getServiceStatu() == null : this.getServiceStatu().equals(other.getServiceStatu()))
            && (this.getCheckerId() == null ? other.getCheckerId() == null : this.getCheckerId().equals(other.getCheckerId()))
            && (this.getCheckerName() == null ? other.getCheckerName() == null : this.getCheckerName().equals(other.getCheckerName()))
            && (this.getRepComment() == null ? other.getRepComment() == null : this.getRepComment().equals(other.getRepComment()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getReporterId() == null) ? 0 : getReporterId().hashCode());
        result = prime * result + ((getReporterName() == null) ? 0 : getReporterName().hashCode());
        result = prime * result + ((getRepReason() == null) ? 0 : getRepReason().hashCode());
        result = prime * result + ((getRepDescription() == null) ? 0 : getRepDescription().hashCode());
        result = prime * result + ((getRepTime() == null) ? 0 : getRepTime().hashCode());
        result = prime * result + ((getRepStatu() == null) ? 0 : getRepStatu().hashCode());
        result = prime * result + ((getRepArea() == null) ? 0 : getRepArea().hashCode());
        result = prime * result + ((getServiceId() == null) ? 0 : getServiceId().hashCode());
        result = prime * result + ((getServiceName() == null) ? 0 : getServiceName().hashCode());
        result = prime * result + ((getServiceStatu() == null) ? 0 : getServiceStatu().hashCode());
        result = prime * result + ((getCheckerId() == null) ? 0 : getCheckerId().hashCode());
        result = prime * result + ((getCheckerName() == null) ? 0 : getCheckerName().hashCode());
        result = prime * result + ((getRepComment() == null) ? 0 : getRepComment().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", reporterId=").append(reporterId);
        sb.append(", reporterName=").append(reporterName);
        sb.append(", repReason=").append(repReason);
        sb.append(", repDescription=").append(repDescription);
        sb.append(", repTime=").append(repTime);
        sb.append(", repStatu=").append(repStatu);
        sb.append(", repArea=").append(repArea);
        sb.append(", serviceId=").append(serviceId);
        sb.append(", serviceName=").append(serviceName);
        sb.append(", serviceStatu=").append(serviceStatu);
        sb.append(", checkerId=").append(checkerId);
        sb.append(", checkerName=").append(checkerName);
        sb.append(", repComment=").append(repComment);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}