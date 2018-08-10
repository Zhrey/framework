package com.ray.cloud.framework.mybatis.mapper;

import com.ray.cloud.framework.mybatis.entity.DResume;
import com.ray.cloud.framework.mybatis.entity.DResumeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DResumeMapper extends BaseMapper<DResume,DResumeExample> {
    long countByExample(DResumeExample example);

    int insert(DResume record);

    int insertSelective(DResume record);

    List<DResume> selectByExample(DResumeExample example);

    DResume selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") DResume record, @Param("example") DResumeExample example);

    int updateByExample(@Param("record") DResume record, @Param("example") DResumeExample example);

    int updateByPrimaryKeySelective(DResume record);

    int updateByPrimaryKey(DResume record);
}