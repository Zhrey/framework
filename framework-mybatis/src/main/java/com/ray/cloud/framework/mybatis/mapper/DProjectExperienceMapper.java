package com.ray.cloud.framework.mybatis.mapper;

import com.ray.cloud.framework.mybatis.entity.DProjectExperience;
import com.ray.cloud.framework.mybatis.entity.DProjectExperienceExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DProjectExperienceMapper extends BaseMapper<DProjectExperience,DProjectExperienceExample> {
    long countByExample(DProjectExperienceExample example);

    int insert(DProjectExperience record);

    int insertSelective(DProjectExperience record);

    List<DProjectExperience> selectByExample(DProjectExperienceExample example);

    DProjectExperience selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") DProjectExperience record, @Param("example") DProjectExperienceExample example);

    int updateByExample(@Param("record") DProjectExperience record, @Param("example") DProjectExperienceExample example);

    int updateByPrimaryKeySelective(DProjectExperience record);

    int updateByPrimaryKey(DProjectExperience record);
}