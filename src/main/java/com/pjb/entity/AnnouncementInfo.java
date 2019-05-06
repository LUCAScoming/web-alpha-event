package com.pjb.entity;

import com.pjb.base.BaseEntity;

import javax.persistence.Entity;
import java.io.Serializable;
import java.util.Date;

/**
 * announcement_info
 *
 * @author
 */
@Entity
public class AnnouncementInfo extends BaseEntity implements Serializable {

    /**
     * 实体id
     */
    private String id;
    /**
     * 公告内容
     */
    private String annoMsg;
    /**
     * 公告开始时间
     */
    private Date annoStartTime;
    /**
     * 公告结束时间
     */
    private Date annoEndTime;
    /**
     * 公告发布者id
     */
    private String announcerId;
    /**
     * 公告发布者姓名
     */
    private String announcerName;
    /**
     * 是否紧急
     */
    private Integer isEmergency;
    /**
     * 状态
     */
    private Integer status;
    private static final long serialVersionUID = 1L;

    @Override
    public String getId() {
        return id;
    }


    @Override
    public void setId(String id) {
        this.id = id;
    }


    public String getAnnoMsg() {
        return annoMsg;
    }


    public void setAnnoMsg(String annoMsg) {
        this.annoMsg = annoMsg;
    }


    public Date getAnnoStartTime() {
        return annoStartTime;
    }


    public void setAnnoStartTime(Date annoStartTime) {
        this.annoStartTime = annoStartTime;
    }


    public Date getAnnoEndTime() {
        return annoEndTime;
    }


    public void setAnnoEndTime(Date annoEndTime) {
        this.annoEndTime = annoEndTime;
    }


    public String getAnnouncerId() {
        return announcerId;
    }


    public void setAnnouncerId(String announcerId) {
        this.announcerId = announcerId;
    }


    public String getAnnouncerName() {
        return announcerName;
    }


    public void setAnnouncerName(String announcerName) {
        this.announcerName = announcerName;
    }


    public Integer getIsEmergency() {
        return isEmergency;
    }


    public void setIsEmergency(Integer isEmergency) {
        this.isEmergency = isEmergency;
    }


    public Integer getStatus() {
        return status;
    }


    public void setStatus(Integer status) {
        this.status = status;
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
        AnnouncementInfo other = (AnnouncementInfo) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
                && (this.getAnnoMsg() == null ? other.getAnnoMsg() == null : this.getAnnoMsg().equals(other.getAnnoMsg()))
                && (this.getAnnoStartTime() == null ? other.getAnnoStartTime() == null : this.getAnnoStartTime().equals(other.getAnnoStartTime()))
                && (this.getAnnoEndTime() == null ? other.getAnnoEndTime() == null : this.getAnnoEndTime().equals(other.getAnnoEndTime()))
                && (this.getAnnouncerId() == null ? other.getAnnouncerId() == null : this.getAnnouncerId().equals(other.getAnnouncerId()))
                && (this.getAnnouncerName() == null ? other.getAnnouncerName() == null : this.getAnnouncerName().equals(other.getAnnouncerName()))
                && (this.getIsEmergency() == null ? other.getIsEmergency() == null : this.getIsEmergency().equals(other.getIsEmergency()))
                && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()));
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getAnnoMsg() == null) ? 0 : getAnnoMsg().hashCode());
        result = prime * result + ((getAnnoStartTime() == null) ? 0 : getAnnoStartTime().hashCode());
        result = prime * result + ((getAnnoEndTime() == null) ? 0 : getAnnoEndTime().hashCode());
        result = prime * result + ((getAnnouncerId() == null) ? 0 : getAnnouncerId().hashCode());
        result = prime * result + ((getAnnouncerName() == null) ? 0 : getAnnouncerName().hashCode());
        result = prime * result + ((getIsEmergency() == null) ? 0 : getIsEmergency().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return result;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", annoMsg=").append(annoMsg);
        sb.append(", annoStartTime=").append(annoStartTime);
        sb.append(", annoEndTime=").append(annoEndTime);
        sb.append(", announcerId=").append(announcerId);
        sb.append(", announcerName=").append(announcerName);
        sb.append(", isEmergency=").append(isEmergency);
        sb.append(", status=").append(status);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }


}
