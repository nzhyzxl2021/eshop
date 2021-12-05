package com.chuxin.eshop.customer.dto;

import lombok.Data;

import java.util.Date;

/**
 * @author chuxin
 * @ClassName ReturnGoodsWorksheetDTO
 * @Date 2021/12/5 10:52 PM
 * @Description: 退货工单 dto
 */
@Data
public class ReturnGoodsWorksheetDTO {

    /**
     * 主键
     */
    private Long id;

    /**
     * 订单 id
     */
    private Long orderId;

    /**
     * 订单编号
     */
    private String orderNo;

    /**
     * 退货工单状态
     */
    private Integer returnGoodsWorksheetStatus;

    /**
     * 退货原因
     */
    private String returnGoodsReason;

    /**
     * 退货备注
     */
    private String returnGoodsComment;

    /**
     * 退货物流单号
     */
    private String returnGoodsCourierNumber;

    /**
     * 退货工单创建时间
     */
    private Date gmtCreate;

    /**
     * 退货工单修改时间
     */
    private Date gmtModified;
}
