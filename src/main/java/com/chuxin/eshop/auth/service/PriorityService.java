package com.chuxin.eshop.auth.service;

import com.chuxin.eshop.auth.domain.PriorityDTO;

import java.util.List;

/**
 * @author chuxin
 * @ClassName PriorityService
 * @Date 2021/12/7 11:56 PM
 * @Description: 权限管理模块的 service 组件接口
 */
public interface PriorityService {

    /**
     * 查询根权限列表
     * @return 根权限列表
     */
    List<PriorityDTO> listRootPriorities();
}
