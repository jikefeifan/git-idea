package com.lagou.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @TableName employee
 */
public class Employee implements Serializable {
    /**
     * 员工id
     */
    private Integer empId;

    /**
     * 员工姓名
     */
    private String empName;

    /**
     * 所属部门id 
     */
    private Integer deptId;

    /**
     * 入职日期
     */
    private String jobName;

    /**
     * 员工电话号码
     */
    private Date joinDate;

    /**
     * 
     */
    private String telephone;

    private static final long serialVersionUID = 1L;

    /**
     * 员工id
     */
    public Integer getEmpId() {
        return empId;
    }

    /**
     * 员工id
     */
    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    /**
     * 员工姓名
     */
    public String getEmpName() {
        return empName;
    }

    /**
     * 员工姓名
     */
    public void setEmpName(String empName) {
        this.empName = empName;
    }

    /**
     * 所属部门id 
     */
    public Integer getDeptId() {
        return deptId;
    }

    /**
     * 所属部门id 
     */
    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    /**
     * 入职日期
     */
    public String getJobName() {
        return jobName;
    }

    /**
     * 入职日期
     */
    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    /**
     * 员工电话号码
     */
    public Date getJoinDate() {
        return joinDate;
    }

    /**
     * 员工电话号码
     */
    public void setJoinDate(Date joinDate) {
        this.joinDate = joinDate;
    }

    /**
     * 
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * 
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone;
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
        Employee other = (Employee) that;
        return (this.getEmpId() == null ? other.getEmpId() == null : this.getEmpId().equals(other.getEmpId()))
            && (this.getEmpName() == null ? other.getEmpName() == null : this.getEmpName().equals(other.getEmpName()))
            && (this.getDeptId() == null ? other.getDeptId() == null : this.getDeptId().equals(other.getDeptId()))
            && (this.getJobName() == null ? other.getJobName() == null : this.getJobName().equals(other.getJobName()))
            && (this.getJoinDate() == null ? other.getJoinDate() == null : this.getJoinDate().equals(other.getJoinDate()))
            && (this.getTelephone() == null ? other.getTelephone() == null : this.getTelephone().equals(other.getTelephone()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getEmpId() == null) ? 0 : getEmpId().hashCode());
        result = prime * result + ((getEmpName() == null) ? 0 : getEmpName().hashCode());
        result = prime * result + ((getDeptId() == null) ? 0 : getDeptId().hashCode());
        result = prime * result + ((getJobName() == null) ? 0 : getJobName().hashCode());
        result = prime * result + ((getJoinDate() == null) ? 0 : getJoinDate().hashCode());
        result = prime * result + ((getTelephone() == null) ? 0 : getTelephone().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", empId=").append(empId);
        sb.append(", empName=").append(empName);
        sb.append(", deptId=").append(deptId);
        sb.append(", jobName=").append(jobName);
        sb.append(", joinDate=").append(joinDate);
        sb.append(", telephone=").append(telephone);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}