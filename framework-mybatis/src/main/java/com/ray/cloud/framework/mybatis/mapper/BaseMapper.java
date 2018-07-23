package com.ray.cloud.framework.mybatis.mapper;

import com.ray.cloud.framework.database.entity.BasicEntity;
import com.ray.cloud.framework.database.example.BaseExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface BaseMapper<ENTITY extends BasicEntity, EXAMPLE extends BaseExample> {

    long countByExample(EXAMPLE example);

    int insertSelective(ENTITY record);

    List<ENTITY> selectByExample(EXAMPLE example);

    ENTITY selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ENTITY record, @Param("example") EXAMPLE example);

    int updateByPrimaryKeySelective(ENTITY record);

}


