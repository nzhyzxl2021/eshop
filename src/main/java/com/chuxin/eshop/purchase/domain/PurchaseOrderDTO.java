package com.chuxin.eshop.purchase.domain;

import lombok.Data;

import java.util.Date;

/**
 * @author chuxin
 * @ClassName PurchaseOrderDTO
 * @Date 2021/12/5 10:48 PM
 * @Description: 采购单 DTO
 */
@Data
public class PurchaseOrderDTO {

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
     * 采购单备注
     */
    private String purchaseOrderComment;

    /**
     * 采购员
     */
    private String purchaser;

    /**
     * 采购单状态
     */
    private Integer purchaseOrderStatus;

    /**
     * 采购单创建时间
     */
    private Date gmtCreate;

    /**
     * 采购单修改时间
     */
    private Date gmtModified;
}
