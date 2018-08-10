package com.ray.cloud.framework.mybatis.mapper;

import com.ray.cloud.framework.mybatis.entity.DCards;
import com.ray.cloud.framework.mybatis.entity.DCardsExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DCardsMapper extends BaseMapper<DCards,DCardsExample> {
    long countByExample(DCardsExample example);

    int insert(DCards record);

    int insertSelective(DCards record);

    List<DCards> selectByExample(DCardsExample example);

    DCards selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") DCards record, @Param("example") DCardsExample example);

    int updateByExample(@Param("record") DCards record, @Param("example") DCardsExample example);

    int updateByPrimaryKeySelective(DCards record);

    int updateByPrimaryKey(DCards record);
}