package com.chuxin.eshop.auth.controller;

import com.chuxin.eshop.auth.domain.PriorityDTO;
import com.chuxin.eshop.auth.domain.PriorityVO;
import com.chuxin.eshop.auth.mapstruct.PrioritySwitcher;
import com.chuxin.eshop.auth.service.PriorityService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author chuxin
 * @ClassName PriorityController
 * @Date 2021/12/8 12:00 AM
 * @Description: 权限管理模块的 controller 组件
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/auth/priority")
public class PriorityController {

    /**
     * 权限管理模块 service 组件
     */
    private final PriorityService priorityService;

    /**
     * 权限 Switcher 转换类
     */
    private final PrioritySwitcher prioritySwitcher;

    /**
     * 查询根权限
     * @return
     */
    @GetMapping("/root")
    List<PriorityVO> listRootPriorities() {
        List<PriorityDTO> priorityDTOS = priorityService.listRootPriorities();
        return prioritySwitcher.dtoList2VOList(priorityDTOS);
    }

    /**
     * 根据父权限查询子权限
     * @param parentId 父权限 ID
     * @return 子权限集合
     */
    @GetMapping("/child/{parentId}")
    List<PriorityVO> listChildPriorities(@PathVariable("parentId") Long parentId) {
        List<PriorityDTO> priorityDTOS = priorityService.listChildPriorities(parentId);
        return prioritySwitcher.dtoList2VOList(priorityDTOS);
    }
}
