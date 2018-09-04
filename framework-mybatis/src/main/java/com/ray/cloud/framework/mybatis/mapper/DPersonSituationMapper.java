package com.ray.cloud.framework.mybatis.mapper;

import com.ray.cloud.framework.mybatis.entity.DPersonSituation;
import com.ray.cloud.framework.mybatis.entity.DPersonSituationExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DPersonSituationMapper extends BaseMapper<DPersonSituation,DPersonSituationExample> {
    long countByExample(DPersonSituationExample example);

    int insert(DPersonSituation record);

    int insertSelective(DPersonSituation record);

    List<DPersonSituation> selectByExample(DPersonSituationExample example);

    DPersonSituation selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") DPersonSituation record, @Param("example") DPersonSituationExample example);

    int updateByExample(@Param("record") DPersonSituation record, @Param("example") DPersonSituationExample example);

    int updateByPrimaryKeySelective(DPersonSituation record);

    int updateByPrimaryKey(DPersonSituation record);
}