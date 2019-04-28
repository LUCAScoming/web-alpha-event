package com.pjb.entity;

import com.pjb.base.BaseEntity;

import java.io.Serializable;
import java.util.Arrays;

/**
 * family_members
 * @author 
 */
public class FamilyMembers extends BaseEntity implements Serializable {
    private String id;

    /**
     * 成员姓名
     */
    private String memberName;

    /**
     * 身份证号码
     */
    private String identy;

    /**
     * 成员id
     */
    private byte[] memberId;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getIdenty() {
        return identy;
    }

    public void setIdenty(String identy) {
        this.identy = identy;
    }

    public byte[] getMemberId() {
        return memberId;
    }

    public void setMemberId(byte[] memberId) {
        this.memberId = memberId;
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
        FamilyMembers other = (FamilyMembers) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getMemberName() == null ? other.getMemberName() == null : this.getMemberName().equals(other.getMemberName()))
            && (this.getIdenty() == null ? other.getIdenty() == null : this.getIdenty().equals(other.getIdenty()))
            && (Arrays.equals(this.getMemberId(), other.getMemberId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getMemberName() == null) ? 0 : getMemberName().hashCode());
        result = prime * result + ((getIdenty() == null) ? 0 : getIdenty().hashCode());
        result = prime * result + (Arrays.hashCode(getMemberId()));
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", memberName=").append(memberName);
        sb.append(", identy=").append(identy);
        sb.append(", memberId=").append(memberId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}