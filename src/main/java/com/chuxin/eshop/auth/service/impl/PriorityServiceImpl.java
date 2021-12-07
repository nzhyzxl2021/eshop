package com.chuxin.eshop.auth.service.impl;

import com.chuxin.eshop.auth.dao.PriorityDAO;
import com.chuxin.eshop.auth.domain.PriorityDTO;
import com.chuxin.eshop.auth.service.PriorityService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author chuxin
 * @ClassName PriorityServiceImpl
 * @Date 2021/12/7 11:58 PM
 * @Description: 权限管理模块的 service 组件接口实现类
 */
@Service
@RequiredArgsConstructor
public class PriorityServiceImpl implements PriorityService {

    /**
     * 权限管理模块 DAO 组件
     */
    private final PriorityDAO priorityDAO;

    @Override
    public List<PriorityDTO> listRootPriorities() {
        return null;
    }
}
