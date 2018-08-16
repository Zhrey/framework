package com.ray.cloud.framework.base.entity;

import com.ray.cloud.framework.base.Enum.DataFlagEnum;
import org.apache.commons.lang3.StringUtils;

import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

/**
 * @author ZhangRui
 */
public abstract class BasicEntity implements Serializable {

    private String id;

    private String createUser;

    private Date createTime;

    private String updateUser;

    private Date updateTime;

    private Integer dataFlag;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
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
        this.updateUser = updateUser;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getDataFlag() {
        return dataFlag;
    }

    public void setDataFlag(Integer dataFlag) {
        this.dataFlag = dataFlag;
    }

    public boolean preInsert() {
        if (preUpdate()) {
            this.setCreateUser(this.getUpdateUser());
            this.setCreateTime(this.getUpdateTime());
            this.setId(UUID.randomUUID().toString().replace("-", StringUtils.EMPTY));
            this.setDataFlag(DataFlagEnum.NON_DELETE.ordinal());
            return true;
        }
        return false;
    }

    public boolean preUpdate() {
//        String userId = TokenUtils.getUserId();
//        if (StringUtils.isNotEmpty(userId)) {
//            this.setUpdateUser(userId);
//            this.setUpdateTime(new Date());
//            if (null != this.getVerid()
//                    && 0 != this.getVerid().intValue()) {
//                this.setVerid(this.getVerid() + 1);
//            }
        return true;
//        }
//        return false;
    }

    public boolean remove() {
        if (preUpdate()) {
            this.setDataFlag(DataFlagEnum.DELETE.ordinal());
            return true;
        }
        return false;
    }

    public boolean everRemoved() {
        return dataFlag == DataFlagEnum.DELETE.ordinal();
    }
}
