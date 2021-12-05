package com.chuxin.eshop.goods.dto;

import lombok.Data;

import java.util.Date;

/**
 * @author chuxin
 * @ClassName GoodsSkuDTO
 * @Date 2021/12/5 1:23 AM
 * @Description: 商品 sku DTO
 */
@Data
public class GoodsSkuDTO {

    /**
     * 主键
     */
    private Long id;

    /**
     * 商品 ID
     */
    private Long goodsId;

    /**
     * 商品 SKU 编号
     */
    private String goodsSkuCode;

    /**
     * 采购价格
     */
    private Double purchasePrice;

    /**
     * 销售价格
     */
    private Double salePrice;

    /**
     * 折扣价格
     */
    private Double discountPrice;

    /**
     * 创建时间
     */
    private Date gmtCreate;

    /**
     * 修改时间
     */
    private Date gmtModified;
}
