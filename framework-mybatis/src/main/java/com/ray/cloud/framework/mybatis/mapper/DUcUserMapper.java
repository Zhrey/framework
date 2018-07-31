package com.ray.cloud.framework.mybatis.mapper;

import com.ray.cloud.framework.mybatis.entity.DUcUser;
import com.ray.cloud.framework.mybatis.entity.DUcUserExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DUcUserMapper extends BaseMapper<DUcUser,DUcUserExample> {
    long countByExample(DUcUserExample example);

    int insert(DUcUser record);

    int insertSelective(DUcUser record);

    List<DUcUser> selectByExample(DUcUserExample example);

    DUcUser selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") DUcUser record, @Param("example") DUcUserExample example);

    int updateByExample(@Param("record") DUcUser record, @Param("example") DUcUserExample example);

    int updateByPrimaryKeySelective(DUcUser record);

    int updateByPrimaryKey(DUcUser record);
}