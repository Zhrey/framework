package com.ray.cloud.framework.mybatis.mapper;

import com.ray.cloud.framework.mybatis.entity.DPersonBase;
import com.ray.cloud.framework.mybatis.entity.DPersonBaseExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DPersonBaseMapper extends BaseMapper<DPersonBase,DPersonBaseExample> {
    long countByExample(DPersonBaseExample example);

    int insert(DPersonBase record);

    int insertSelective(DPersonBase record);

    List<DPersonBase> selectByExample(DPersonBaseExample example);

    DPersonBase selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") DPersonBase record, @Param("example") DPersonBaseExample example);

    int updateByExample(@Param("record") DPersonBase record, @Param("example") DPersonBaseExample example);

    int updateByPrimaryKeySelective(DPersonBase record);

    int updateByPrimaryKey(DPersonBase record);
}