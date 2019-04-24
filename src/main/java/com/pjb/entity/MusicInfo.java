package com.pjb.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * music_info
 * @author 
 */
public class MusicInfo implements Serializable {
    /**
     * 记录id
     */
    private String id;

    /**
     * 广播开始时间
     */
    private Date musicStartTime;

    /**
     * 广播结束时间
     */
    private Date musicEndTime;

    /**
     * 广播内容
     */
    private String musicMsg;

    /**
     * 广播地址
     */
    private String musicAdress;

    /**
     * 操作人id
     */
    private String managerId;

    /**
     * 操作人姓名
     */
    private String managerName;

    private Date updateDt;

    private Date createDt;

    private Integer dr;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getMusicStartTime() {
        return musicStartTime;
    }

    public void setMusicStartTime(Date musicStartTime) {
        this.musicStartTime = musicStartTime;
    }

    public Date getMusicEndTime() {
        return musicEndTime;
    }

    public void setMusicEndTime(Date musicEndTime) {
        this.musicEndTime = musicEndTime;
    }

    public String getMusicMsg() {
        return musicMsg;
    }

    public void setMusicMsg(String musicMsg) {
        this.musicMsg = musicMsg;
    }

    public String getMusicAdress() {
        return musicAdress;
    }

    public void setMusicAdress(String musicAdress) {
        this.musicAdress = musicAdress;
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
        MusicInfo other = (MusicInfo) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getMusicStartTime() == null ? other.getMusicStartTime() == null : this.getMusicStartTime().equals(other.getMusicStartTime()))
            && (this.getMusicEndTime() == null ? other.getMusicEndTime() == null : this.getMusicEndTime().equals(other.getMusicEndTime()))
            && (this.getMusicMsg() == null ? other.getMusicMsg() == null : this.getMusicMsg().equals(other.getMusicMsg()))
            && (this.getMusicAdress() == null ? other.getMusicAdress() == null : this.getMusicAdress().equals(other.getMusicAdress()))
            && (this.getManagerId() == null ? other.getManagerId() == null : this.getManagerId().equals(other.getManagerId()))
            && (this.getManagerName() == null ? other.getManagerName() == null : this.getManagerName().equals(other.getManagerName()))
            && (this.getUpdateDt() == null ? other.getUpdateDt() == null : this.getUpdateDt().equals(other.getUpdateDt()))
            && (this.getCreateDt() == null ? other.getCreateDt() == null : this.getCreateDt().equals(other.getCreateDt()))
            && (this.getDr() == null ? other.getDr() == null : this.getDr().equals(other.getDr()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getMusicStartTime() == null) ? 0 : getMusicStartTime().hashCode());
        result = prime * result + ((getMusicEndTime() == null) ? 0 : getMusicEndTime().hashCode());
        result = prime * result + ((getMusicMsg() == null) ? 0 : getMusicMsg().hashCode());
        result = prime * result + ((getMusicAdress() == null) ? 0 : getMusicAdress().hashCode());
        result = prime * result + ((getManagerId() == null) ? 0 : getManagerId().hashCode());
        result = prime * result + ((getManagerName() == null) ? 0 : getManagerName().hashCode());
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
        sb.append(", id=").append(id);
        sb.append(", musicStartTime=").append(musicStartTime);
        sb.append(", musicEndTime=").append(musicEndTime);
        sb.append(", musicMsg=").append(musicMsg);
        sb.append(", musicAdress=").append(musicAdress);
        sb.append(", managerId=").append(managerId);
        sb.append(", managerName=").append(managerName);
        sb.append(", updateDt=").append(updateDt);
        sb.append(", createDt=").append(createDt);
        sb.append(", dr=").append(dr);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}