package com.lagou.domain;

import java.io.Serializable;

/**
 * 
 * @TableName dept
 */
public class Dept implements Serializable {
    /**
     * 部门id
     */

    private Integer deptId;

    /**
     * 部门名称
     */
    private String deptName;

    /**
     * 主管名称
     */
    private String majorName;

    /**
     * 电话号码
     */
    private String telephone;

    /**
     * 邮箱
     */
    private String email;

    private static final long serialVersionUID = 1L;

    /**
     * 部门id
     */
    public Integer getDeptId() {
        return deptId;
    }

    /**
     * 部门id
     */
    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    /**
     * 部门名称
     */
    public String getDeptName() {
        return deptName;
    }

    /**
     * 部门名称
     */
    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    /**
     * 主管名称
     */
    public String getMajorName() {
        return majorName;
    }

    /**
     * 主管名称
     */
    public void setMajorName(String majorName) {
        this.majorName = majorName;
    }

    /**
     * 电话号码
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * 电话号码
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    /**
     * 邮箱
     */
    public String getEmail() {
        return email;
    }

    /**
     * 邮箱
     */
    public void setEmail(String email) {
        this.email = email;
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
        Dept other = (Dept) that;
        return (this.getDeptId() == null ? other.getDeptId() == null : this.getDeptId().equals(other.getDeptId()))
            && (this.getDeptName() == null ? other.getDeptName() == null : this.getDeptName().equals(other.getDeptName()))
            && (this.getMajorName() == null ? other.getMajorName() == null : this.getMajorName().equals(other.getMajorName()))
            && (this.getTelephone() == null ? other.getTelephone() == null : this.getTelephone().equals(other.getTelephone()))
            && (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDeptId() == null) ? 0 : getDeptId().hashCode());
        result = prime * result + ((getDeptName() == null) ? 0 : getDeptName().hashCode());
        result = prime * result + ((getMajorName() == null) ? 0 : getMajorName().hashCode());
        result = prime * result + ((getTelephone() == null) ? 0 : getTelephone().hashCode());
        result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", deptId=").append(deptId);
        sb.append(", deptName=").append(deptName);
        sb.append(", majorName=").append(majorName);
        sb.append(", telephone=").append(telephone);
        sb.append(", email=").append(email);
//        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}