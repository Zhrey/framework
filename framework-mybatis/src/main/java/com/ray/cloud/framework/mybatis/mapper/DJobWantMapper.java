package com.ray.cloud.framework.mybatis.mapper;

import com.ray.cloud.framework.mybatis.entity.DJobWant;
import com.ray.cloud.framework.mybatis.entity.DJobWantExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DJobWantMapper extends BaseMapper<DJobWant,DJobWantExample> {
    long countByExample(DJobWantExample example);

    int insert(DJobWant record);

    int insertSelective(DJobWant record);

    List<DJobWant> selectByExample(DJobWantExample example);

    DJobWant selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") DJobWant record, @Param("example") DJobWantExample example);

    int updateByExample(@Param("record") DJobWant record, @Param("example") DJobWantExample example);

    int updateByPrimaryKeySelective(DJobWant record);

    int updateByPrimaryKey(DJobWant record);
}