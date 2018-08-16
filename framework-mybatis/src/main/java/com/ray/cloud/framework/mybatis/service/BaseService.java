package com.ray.cloud.framework.mybatis.service;

import com.ray.cloud.framework.base.dto.PageResultDTO;
import com.ray.cloud.framework.base.dto.ResultDTO;
import com.ray.cloud.framework.base.dto.ResultError;
import com.ray.cloud.framework.base.entity.BasicEntity;
import com.ray.cloud.framework.base.example.BaseExample;
import com.ray.cloud.framework.base.utils.MysqlUtils;
import com.ray.cloud.framework.mybatis.mapper.BaseMapper;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author ZhangRui
 */
@Service
public abstract class BaseService<ENTITY extends BasicEntity, EXAMPLE extends BaseExample> {

    private final static String NO_AUTH = "权限不足";

    @Autowired
    private BaseMapper<ENTITY, EXAMPLE> mapper;

    public ResultDTO<Long> countByExample(@NotNull EXAMPLE example) {
        return ResultDTO.success(mapper.countByExample(example));
    }

    public ResultDTO<String> insertSelective(@NotNull ENTITY record) {
        if (!record.preInsert()) {
            return ResultDTO.failure(ResultError.error(NO_AUTH));
        }
        mapper.insertSelective(record);
        return ResultDTO.success(record.getId());
    }

    public ResultDTO<List<ENTITY>> selectByExample(@NotNull EXAMPLE example) {
        return ResultDTO.success(mapper.selectByExample(example));
    }

    public ResultDTO<ENTITY> selectByPrimaryKey(@NotEmpty String id) {
        return ResultDTO.success(mapper.selectByPrimaryKey(id));
    }

    public ResultDTO<List<String>> updateByExample(@NotNull ENTITY record,
                                                            @NotNull EXAMPLE example) {
        if (!record.preUpdate()) {
            return ResultDTO.failure(ResultError.error(NO_AUTH));
        }
        List<ENTITY> entityList = mapper.selectByExample(example);
        if (null != entityList) {
            List<String> idList = entityList.stream()
                    .map(entity -> entity.getId())
                    .collect(Collectors.toList());
            mapper.updateByExampleSelective(record, example);
            return ResultDTO.success(idList);
        }
        return ResultDTO.success();
    }

    public ResultDTO<String> updateByPrimaryKeySelective(@NotNull ENTITY record) {
        if (!record.preUpdate()) {
            return ResultDTO.failure(ResultError.error(NO_AUTH));
        }
        mapper.updateByPrimaryKeySelective(record);
        return ResultDTO.success(record.getId());
    }

    public ResultDTO<String> removeByPrimaryKey(@NotEmpty String id) {
        ENTITY entity = mapper.selectByPrimaryKey(id);
        if (null != entity) {
            if (!entity.remove()) {
                return ResultDTO.failure(ResultError.error(NO_AUTH));
            }
            mapper.updateByPrimaryKeySelective(entity);
            return ResultDTO.success(entity.getId());
        }
        return ResultDTO.success();
    }

    public ResultDTO<List<String>> removeByExample(@NotNull EXAMPLE example) {
        List<ENTITY> entityList = mapper.selectByExample(example);
        if (null != entityList) {
            List<String> idList = new ArrayList<>();
            for (ENTITY entity : entityList) {
                if (!entity.remove()) {
                    return ResultDTO.failure(ResultError.error(NO_AUTH));
                }
                idList.add(entity.getId());
                mapper.updateByPrimaryKeySelective(entity);
            }
            return ResultDTO.success(idList);
        }
        return ResultDTO.success();
    }

    public ResultDTO<PageResultDTO<ENTITY>> selectByExamplePageable(@NotNull EXAMPLE example,
                                                                    Integer pageNo,
                                                                    Integer pageSize) {
        long count = mapper.countByExample(example);
        if (0 == count) {
            return ResultDTO.success(PageResultDTO.rows(0, null));
        }
        example.setOrderBy(MysqlUtils.pageMysql(count, example.getOrderBy(), pageNo, pageSize));
        return ResultDTO.success(PageResultDTO.rows(count, mapper.selectByExample(example)));
    }
}
