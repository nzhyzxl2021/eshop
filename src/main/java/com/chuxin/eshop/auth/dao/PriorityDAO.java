package com.chuxin.eshop.auth.dao;

import com.chuxin.eshop.auth.domain.PriorityDO;

import java.util.List;

/**
 * @author chuxin
 * @ClassName PriorityDAO
 * @Date 2021/12/7 11:44 PM
 * @Description: 权限管理模块的 DAO 组件接口
 */
public interface PriorityDAO {

    /**
     * 查询根权限列表
     * @return 根权限列表
     */
    List<PriorityDO> listRootPriorities();

    /**
     * 根据父权限 ID 查询子权限集合
     * @param parentId 父权限 ID
     * @return 子权限集合
     */
    List<PriorityDO> listChildPriorities(Long parentId);
}
