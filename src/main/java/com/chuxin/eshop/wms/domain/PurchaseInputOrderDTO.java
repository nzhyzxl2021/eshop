package com.chuxin.eshop.wms.domain;

import lombok.Data;

import java.util.Date;

/**
 * @author chuxin
 * @ClassName PurchaseInputOrderDTO
 * @Date 2021/12/5 11:58 AM
 * @Description: 采购入库单 DTO
 */
@Data
public class PurchaseInputOrderDTO {

    /**
     * 主键 ID
     */
    private Long id;

    /**
     * 供应商 ID
     */
    private Long supplierId;

    /**
     * 预期到达时间
     */
    private Date expectArrivalTime;

    /**
     * 实际到达时间
     */
    private Date arrivalTime;

    /**
     * 采购联系人
     */
    private String purchaseContactor;

    /**
     * 采购联系人电话号码
     */
    private String purchaseContactPhone;

    /**
     * 采购联系人邮箱
     */
    private String purchaseContactEmail;

    /**
     * 采购入库单备注
     */
    private String purchaseInputOrderComment;

    /**
     * 采购员
     */
    private String purchaser;

    /**
     * 采购入库单状态
     */
    private Integer purchaseInputOrderStatus;

    /**
     * 采购入库单创建时间
     */
    private Date gmtCreate;

    /**
     * 采购入库单修改时间
     */
    private Date gmtModified;
}
