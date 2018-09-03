package com.ray.cloud.framework.mybatis.mapper;

import com.ray.cloud.framework.mybatis.entity.DPersonFile;
import com.ray.cloud.framework.mybatis.entity.DPersonFileExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DPersonFileMapper extends BaseMapper<DPersonFile,DPersonFileExample> {
    long countByExample(DPersonFileExample example);

    int insert(DPersonFile record);

    int insertSelective(DPersonFile record);

    List<DPersonFile> selectByExample(DPersonFileExample example);

    DPersonFile selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") DPersonFile record, @Param("example") DPersonFileExample example);

    int updateByExample(@Param("record") DPersonFile record, @Param("example") DPersonFileExample example);

    int updateByPrimaryKeySelective(DPersonFile record);

    int updateByPrimaryKey(DPersonFile record);
}