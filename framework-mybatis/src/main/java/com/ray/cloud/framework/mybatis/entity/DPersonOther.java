package com.ray.cloud.framework.mybatis.entity;

import com.ray.cloud.framework.base.entity.BasicEntity;

import java.util.Date;

public class DPersonOther extends BasicEntity {
    private String id;

    private String personId;

    private String content;

    private String educationBackground;

    private String learnSituation;

    private String socialSituation;

    private String languageSituation;

    private String professionalSkills;

    private String hobby;

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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getEducationBackground() {
        return educationBackground;
    }

    public void setEducationBackground(String educationBackground) {
        this.educationBackground = educationBackground == null ? null : educationBackground.trim();
    }

    public String getLearnSituation() {
        return learnSituation;
    }

    public void setLearnSituation(String learnSituation) {
        this.learnSituation = learnSituation == null ? null : learnSituation.trim();
    }

    public String getSocialSituation() {
        return socialSituation;
    }

    public void setSocialSituation(String socialSituation) {
        this.socialSituation = socialSituation == null ? null : socialSituation.trim();
    }

    public String getLanguageSituation() {
        return languageSituation;
    }

    public void setLanguageSituation(String languageSituation) {
        this.languageSituation = languageSituation == null ? null : languageSituation.trim();
    }

    public String getProfessionalSkills() {
        return professionalSkills;
    }

    public void setProfessionalSkills(String professionalSkills) {
        this.professionalSkills = professionalSkills == null ? null : professionalSkills.trim();
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby == null ? null : hobby.trim();
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