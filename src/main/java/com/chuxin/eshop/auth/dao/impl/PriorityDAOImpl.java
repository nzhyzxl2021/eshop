package com.chuxin.eshop.auth.dao.impl;

import com.chuxin.eshop.auth.dao.PriorityDAO;
import com.chuxin.eshop.auth.domain.PriorityDO;
import com.chuxin.eshop.auth.mapper.PriorityMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author chuxin
 * @ClassName PriorityDAOImpl
 * @Date 2021/12/7 11:46 PM
 * @Description: 权限管理模块的 DAO 组件
 */
@Repository
@RequiredArgsConstructor
public class PriorityDAOImpl implements PriorityDAO {

    /**
     * 权限管理模块的 Mapper 组件
     */
    private final PriorityMapper priorityMapper;

    @Override
    public List<PriorityDO> listRootPriorities() {
        return priorityMapper.listRootPriorities();
    }

    @Override
    public List<PriorityDO> listChildPriorities(Long parentId) {
        return priorityMapper.listChildPriorities(parentId);
    }
}
