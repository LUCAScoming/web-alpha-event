package com.pjb.entity;

import com.pjb.base.BaseEntity;

import javax.persistence.Entity;
import java.io.Serializable;

/**
 * family_members
 *
 * @author
 */
@Entity
public class FamilyMembers extends BaseEntity implements Serializable {

//    private String id;

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
    private String memberId;
    /*
     * 关系 1父子
     * */
    private String relation;
    private String workPlace;
    private String workName;
    private String workPosition;
    private String phone;
    private String ownerId;

    public String getOwnerId() {
        return ownerId;
    }


    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }


    public String getWorkPlace() {
        return workPlace;
    }


    public void setWorkPlace(String workPlace) {
        this.workPlace = workPlace;
    }


    public String getWorkName() {
        return workName;
    }

    public void setWorkName(String workName) {
        this.workName = workName;
    }

    public String getWorkPosition() {
        return workPosition;
    }


    public void setWorkPosition(String workPosition) {
        this.workPosition = workPosition;
    }


    public String getPhone() {
        return phone;
    }


    public void setPhone(String phone) {
        this.phone = phone;
    }


    public String getRelation() {
        return relation;
    }

    public void setRelation(String relation) {
        this.relation = relation;
    }

    private static final long serialVersionUID = 1L;

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


    public String getMemberId() {
        return memberId;
    }


    public void setMemberId(String memberId) {
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
                && (this.getIdenty() == null ? other.getIdenty() == null : this.getIdenty().equals(other.getIdenty()));
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getMemberName() == null) ? 0 : getMemberName().hashCode());
        result = prime * result + ((getIdenty() == null) ? 0 : getIdenty().hashCode());
        return result;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(super.getId());
        sb.append(", memberName=").append(memberName);
        sb.append(", identy=").append(identy);
        sb.append(", memberId=").append(memberId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }


}
