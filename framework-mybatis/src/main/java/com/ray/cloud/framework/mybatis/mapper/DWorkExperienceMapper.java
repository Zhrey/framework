package com.ray.cloud.framework.mybatis.mapper;

import com.ray.cloud.framework.mybatis.entity.DWorkExperience;
import com.ray.cloud.framework.mybatis.entity.DWorkExperienceExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DWorkExperienceMapper extends BaseMapper<DWorkExperience,DWorkExperienceExample> {
    long countByExample(DWorkExperienceExample example);

    int insert(DWorkExperience record);

    int insertSelective(DWorkExperience record);

    List<DWorkExperience> selectByExample(DWorkExperienceExample example);

    DWorkExperience selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") DWorkExperience record, @Param("example") DWorkExperienceExample example);

    int updateByExample(@Param("record") DWorkExperience record, @Param("example") DWorkExperienceExample example);

    int updateByPrimaryKeySelective(DWorkExperience record);

    int updateByPrimaryKey(DWorkExperience record);
}