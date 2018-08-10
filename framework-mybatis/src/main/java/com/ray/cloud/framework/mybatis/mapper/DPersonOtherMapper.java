package com.ray.cloud.framework.mybatis.mapper;

import com.ray.cloud.framework.mybatis.entity.DPersonOther;
import com.ray.cloud.framework.mybatis.entity.DPersonOtherExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DPersonOtherMapper extends BaseMapper<DPersonOther,DPersonOtherExample> {
    long countByExample(DPersonOtherExample example);

    int insert(DPersonOther record);

    int insertSelective(DPersonOther record);

    List<DPersonOther> selectByExample(DPersonOtherExample example);

    DPersonOther selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") DPersonOther record, @Param("example") DPersonOtherExample example);

    int updateByExample(@Param("record") DPersonOther record, @Param("example") DPersonOtherExample example);

    int updateByPrimaryKeySelective(DPersonOther record);

    int updateByPrimaryKey(DPersonOther record);
}