package com.ray.cloud.framework.mybatis.mapper;

import com.ray.cloud.framework.mybatis.entity.DTrainExperience;
import com.ray.cloud.framework.mybatis.entity.DTrainExperienceExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DTrainExperienceMapper extends BaseMapper<DTrainExperience,DTrainExperienceExample> {
    long countByExample(DTrainExperienceExample example);

    int insert(DTrainExperience record);

    int insertSelective(DTrainExperience record);

    List<DTrainExperience> selectByExample(DTrainExperienceExample example);

    DTrainExperience selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") DTrainExperience record, @Param("example") DTrainExperienceExample example);

    int updateByExample(@Param("record") DTrainExperience record, @Param("example") DTrainExperienceExample example);

    int updateByPrimaryKeySelective(DTrainExperience record);

    int updateByPrimaryKey(DTrainExperience record);
}