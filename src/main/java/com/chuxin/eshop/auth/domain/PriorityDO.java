package com.chuxin.eshop.auth.domain;

import lombok.Data;

import java.util.Date;

/**
 * @author chuxin
 * @ClassName PriorityDO
 * @Date 2021/12/7 11:35 PM
 * @Description: 权限 DO 类
 */
@Data
public class PriorityDO {

    /**
     * 主键
     */
    private Long id;

    /**
     * 权限编号
     */
    private String code;

    /**
     * 权限 URL
     */
    private String url;

    /**
     * 权限类型
     */
    private Integer priorityType;

    /**
     * 父权限 ID
     */
    private Long parentId;

    /**
     * 权限创建时间
     */
    private Date gmtCreate;

    /**
     * 权限修改时间
     */
    private Date gmtModified;
}
