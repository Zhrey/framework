package com.ray.cloud.framework.mybatis.mapper;

import com.ray.cloud.framework.mybatis.entity.FilePicDisplay;
import com.ray.cloud.framework.mybatis.entity.FilePicDisplayExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FilePicDisplayMapper extends BaseMapper<FilePicDisplay,FilePicDisplayExample> {
    long countByExample(FilePicDisplayExample example);

    int insert(FilePicDisplay record);

    int insertSelective(FilePicDisplay record);

    List<FilePicDisplay> selectByExample(FilePicDisplayExample example);

    FilePicDisplay selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") FilePicDisplay record, @Param("example") FilePicDisplayExample example);

    int updateByExample(@Param("record") FilePicDisplay record, @Param("example") FilePicDisplayExample example);

    int updateByPrimaryKeySelective(FilePicDisplay record);

    int updateByPrimaryKey(FilePicDisplay record);
}