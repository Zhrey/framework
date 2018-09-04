package com.ray.cloud.framework.mybatis.mapper;

import com.ray.cloud.framework.mybatis.entity.DPersonProcess;
import com.ray.cloud.framework.mybatis.entity.DPersonProcessExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DPersonProcessMapper extends BaseMapper<DPersonProcess,DPersonProcessExample> {
    long countByExample(DPersonProcessExample example);

    int insert(DPersonProcess record);

    int insertSelective(DPersonProcess record);

    List<DPersonProcess> selectByExample(DPersonProcessExample example);

    DPersonProcess selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") DPersonProcess record, @Param("example") DPersonProcessExample example);

    int updateByExample(@Param("record") DPersonProcess record, @Param("example") DPersonProcessExample example);

    int updateByPrimaryKeySelective(DPersonProcess record);

    int updateByPrimaryKey(DPersonProcess record);
}