package com.chuxin.eshop.auth.mapper;

import com.chuxin.eshop.auth.domain.PriorityDO;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author chuxin
 * @ClassName PriorityMapper
 * @Date 2021/12/7 11:38 PM
 * @Description: 权限管理模块 mapper 组件
 */
@Mapper
public interface PriorityMapper {

    /**
     * 查询根权限集合
     * @return 权限 DO 集合
     */
    @Select("SELECT " +
            "id, " +
            "code, " +
            "url, " +
            "priority_comment, " +
            "priority_type, " +
            "parent_id, " +
            "gmt_create, " +
            "gmt_modified " +
            "FROM auth_priority " +
            "WHERE parent_id IS NULL ")
    @Results({
            @Result(column = "id", property = "id", id = true),
            @Result(column = "code", property = "code"),
            @Result(column = "url", property = "url"),
            @Result(column = "priority_comment", property = "priorityComment"),
            @Result(column = "priority_type", property = "priorityType"),
            @Result(column = "parent_id", property = "parentId"),
            @Result(column = "gmt_create", property = "gmtCreate"),
            @Result(column = "gmt_modified", property = "gmtModified")
    })
    List<PriorityDO> listRootPriorities();

    /**
     * 根据父权限 ID 查询子权限集合
     * @param parentId 父权限 ID
     * @return 子权限集合
     */
    @Select("SELECT " +
            "id, " +
            "code, " +
            "url, " +
            "priority_comment, " +
            "priority_type, " +
            "parent_id, " +
            "gmt_create, " +
            "gmt_modified " +
            "FROM auth_priority " +
            "WHERE parent_id = #{parentId} ")
    @Results({
            @Result(column = "id", property = "id", id = true),
            @Result(column = "code", property = "code"),
            @Result(column = "url", property = "url"),
            @Result(column = "priority_comment", property = "priorityComment"),
            @Result(column = "priority_type", property = "priorityType"),
            @Result(column = "parent_id", property = "parentId"),
            @Result(column = "gmt_create", property = "gmtCreate"),
            @Result(column = "gmt_modified", property = "gmtModified")
    })
    List<PriorityDO> listChildPriorities(@Param("parentId") Long parentId);
}
