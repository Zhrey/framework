package com.ray.cloud.framework.mybatis.entity;

import com.ray.cloud.framework.base.entity.BasicEntity;

import java.util.Date;

public class DJobWant extends BasicEntity {
    private String id;

    private String personId;

    private String desiredNatrue;

    private String desiredPosition;

    private String desiredIndustry;

    private String desiredAddress;

    private String currentSituation;

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

    public String getDesiredNatrue() {
        return desiredNatrue;
    }

    public void setDesiredNatrue(String desiredNatrue) {
        this.desiredNatrue = desiredNatrue == null ? null : desiredNatrue.trim();
    }

    public String getDesiredPosition() {
        return desiredPosition;
    }

    public void setDesiredPosition(String desiredPosition) {
        this.desiredPosition = desiredPosition == null ? null : desiredPosition.trim();
    }

    public String getDesiredIndustry() {
        return desiredIndustry;
    }

    public void setDesiredIndustry(String desiredIndustry) {
        this.desiredIndustry = desiredIndustry == null ? null : desiredIndustry.trim();
    }

    public String getDesiredAddress() {
        return desiredAddress;
    }

    public void setDesiredAddress(String desiredAddress) {
        this.desiredAddress = desiredAddress == null ? null : desiredAddress.trim();
    }

    public String getCurrentSituation() {
        return currentSituation;
    }

    public void setCurrentSituation(String currentSituation) {
        this.currentSituation = currentSituation == null ? null : currentSituation.trim();
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