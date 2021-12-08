package com.chuxin.eshop.auth.controller;

import com.chuxin.eshop.auth.domain.PriorityVO;
import com.chuxin.eshop.auth.service.PriorityService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
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
@RequestMapping("/auth")
public class PriorityController {

    /**
     * 权限管理模块 service 组件
     */
    private final PriorityService priorityService;

    /**
     * 查询根权限
     * @return
     */
    @GetMapping("/priority/root")
    List<PriorityVO> listRootPriorities() {
        return null;
    }
}
