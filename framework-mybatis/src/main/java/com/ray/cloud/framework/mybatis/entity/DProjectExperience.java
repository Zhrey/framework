package com.ray.cloud.framework.mybatis.entity;

import com.ray.cloud.framework.base.entity.BasicEntity;

import java.util.Date;

public class DProjectExperience extends BasicEntity {
    private String id;

    private String personId;

    private String projectName;

    private String content;

    private String dutyContent;

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

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName == null ? null : projectName.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getDutyContent() {
        return dutyContent;
    }

    public void setDutyContent(String dutyContent) {
        this.dutyContent = dutyContent == null ? null : dutyContent.trim();
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