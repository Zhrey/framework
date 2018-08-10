package com.ray.cloud.framework.mybatis.mapper;

import com.ray.cloud.framework.mybatis.entity.DUser;
import com.ray.cloud.framework.mybatis.entity.DUserExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DUserMapper extends BaseMapper<DUser,DUserExample> {
    long countByExample(DUserExample example);

    int insert(DUser record);

    int insertSelective(DUser record);

    List<DUser> selectByExample(DUserExample example);

    DUser selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") DUser record, @Param("example") DUserExample example);

    int updateByExample(@Param("record") DUser record, @Param("example") DUserExample example);

    int updateByPrimaryKeySelective(DUser record);

    int updateByPrimaryKey(DUser record);
}