package com.chuxin.eshop.wms.dto;

import lombok.Data;

import java.util.Date;

/**
 * @author chuxin
 * @ClassName ReturnGoodsInputOrderDTO
 * @Date 2021/12/5 12:39 PM
 * @Description: 退货入库单 DTO
 */
@Data
public class ReturnGoodsInputOrderDTO {

    /**
     * 主键
     */
    private Long id;

    /**
     * 用户账号 ID
     */
    private Long userAccountId;

    /**
     * 订单 ID
     */
    private Long orderId;

    /**
     * 订单编号
     */
    private String orderNo;

    /**
     * 退货入库单状态
     */
    private Integer returnGoodsInputOrderStatus;

    /**
     * 收货人
     */
    private String consignee;

    /**
     * 收货地址
     */
    private String deliveryAddress;

    /**
     * 收货人手机号码
     */
    private String consigneeCellPhoneNumber;

    /**
     * 运费
     */
    private Double freight;

    /**
     * 支付方式
     */
    private Integer payType;

    /**
     * 订单总金额
     */
    private Double totalAmount;

    /**
     * 折扣金额
     */
    private Double discountAmount;

    /**
     * 优惠券抵扣金额
     */
    private Double couponAmount;

    /**
     * 应付金额
     */
    private Double payableAmount;

    /**
     * 发票抬头
     */
    private String invoiceTitle;

    /**
     * 纳税人识别号
     */
    private String taxpayerId;

    /**
     * 订单备注
     */
    private String orderComment;

    /**
     * 退货原因
     */
    private String returnGoodsReason;

    /**
     * 退货备注
     */
    private String returnGoodsComment;

    /**
     * 退货实际到货时间
     */
    private Date arrivalTime;

    /**
     * 销售出库单创建时间
     */
    private Date gmtCreate;

    /**
     * 销售出库单修改时间
     */
    private Date gmtModified;
}
