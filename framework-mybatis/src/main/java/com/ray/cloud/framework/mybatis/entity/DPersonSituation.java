package com.ray.cloud.framework.mybatis.entity;

import com.ray.cloud.framework.base.entity.BasicEntity;

import java.util.Date;

public class DPersonSituation extends BasicEntity {
    private String id;

    private String personId;

    private Integer situationType;

    private Integer interviewResult;

    private String memo;

    private Date talkDate;

    private Integer dataFlag;

    private String createUser;

    private Date createTime;

    private String updateUser;

    private Date updateTime;

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

    public Integer getSituationType() {
        return situationType;
    }

    public void setSituationType(Integer situationType) {
        this.situationType = situationType;
    }

    public Integer getInterviewResult() {
        return interviewResult;
    }

    public void setInterviewResult(Integer interviewResult) {
        this.interviewResult = interviewResult;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    public Date getTalkDate() {
        return talkDate;
    }

    public void setTalkDate(Date talkDate) {
        this.talkDate = talkDate;
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

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}