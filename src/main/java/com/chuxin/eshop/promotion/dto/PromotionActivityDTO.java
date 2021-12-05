package com.chuxin.eshop.promotion.dto;

import lombok.Data;

import java.util.Date;

/**
 * @author chuxin
 * @ClassName PromotionActivityDTO
 * @Date 2021/12/5 10:14 PM
 * @Description: 促销活动 DTO
 */
@Data
public class PromotionActivityDTO {

    /**
     * 主键
     */
    private Long id;

    /**
     * 促销活动名称
     */
    private String promotionActivityName;

    /**
     * 促销活动开始时间
     */
    private Date promotionActivityStartTime;

    /**
     * 促销活动结束时间
     */
    private Date promotionActivityEndTime;

    /**
     * 促销活动状态
     */
    private Integer promotionActivityStatus;

    /**
     * 促销活动规则
     */
    private String promotionActivityRule;

    /**
     * 促销活动创建时间
     */
    private Date gmtCreate;

    /**
     * 促销活动修改时间
     */
    private Date gmtModified;
}
