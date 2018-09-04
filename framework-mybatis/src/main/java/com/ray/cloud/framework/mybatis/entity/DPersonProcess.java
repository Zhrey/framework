package com.ray.cloud.framework.mybatis.entity;

import com.ray.cloud.framework.base.entity.BasicEntity;

import java.util.Date;

public class DPersonProcess extends BasicEntity {
    private String id;

    private String personId;

    private Integer recommendPosition;

    private Integer bu;

    private Integer deliveDepartment;

    private Integer project;

    private Integer job;

    private Date submitDate;

    private Integer comeFrom;

    private Date firstInterview;

    private Date secondInterview;

    private Date joinIn;

    private Date quitDate;

    private String quitReason;

    private Integer status;

    private Integer dataFlag;

    private String createUser;

    private Date createTime;

    private String updateUser;

    private Date updateTiem;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId == null ? null : personId.trim();
    }

    public Integer getRecommendPosition() {
        return recommendPosition;
    }

    public void setRecommendPosition(Integer recommendPosition) {
        this.recommendPosition = recommendPosition;
    }

    public Integer getBu() {
        return bu;
    }

    public void setBu(Integer bu) {
        this.bu = bu;
    }

    public Integer getDeliveDepartment() {
        return deliveDepartment;
    }

    public void setDeliveDepartment(Integer deliveDepartment) {
        this.deliveDepartment = deliveDepartment;
    }

    public Integer getProject() {
        return project;
    }

    public void setProject(Integer project) {
        this.project = project;
    }

    public Integer getJob() {
        return job;
    }

    public void setJob(Integer job) {
        this.job = job;
    }

    public Date getSubmitDate() {
        return submitDate;
    }

    public void setSubmitDate(Date submitDate) {
        this.submitDate = submitDate;
    }

    public Integer getComeFrom() {
        return comeFrom;
    }

    public void setComeFrom(Integer comeFrom) {
        this.comeFrom = comeFrom;
    }

    public Date getFirstInterview() {
        return firstInterview;
    }

    public void setFirstInterview(Date firstInterview) {
        this.firstInterview = firstInterview;
    }

    public Date getSecondInterview() {
        return secondInterview;
    }

    public void setSecondInterview(Date secondInterview) {
        this.secondInterview = secondInterview;
    }

    public Date getJoinIn() {
        return joinIn;
    }

    public void setJoinIn(Date joinIn) {
        this.joinIn = joinIn;
    }

    public Date getQuitDate() {
        return quitDate;
    }

    public void setQuitDate(Date quitDate) {
        this.quitDate = quitDate;
    }

    public String getQuitReason() {
        return quitReason;
    }

    public void setQuitReason(String quitReason) {
        this.quitReason = quitReason == null ? null : quitReason.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getDataFlag() {
        return dataFlag;
    }

    public void setDataFlag(Integer dataFlag) {
        this.dataFlag = dataFlag;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser == null ? null : updateUser.trim();
    }

    public Date getUpdateTiem() {
        return updateTiem;
    }

    public void setUpdateTiem(Date updateTiem) {
        this.updateTiem = updateTiem;
    }
}