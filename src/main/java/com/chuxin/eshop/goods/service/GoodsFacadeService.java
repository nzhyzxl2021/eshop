package com.chuxin.eshop.goods.service;

import com.chuxin.eshop.goods.dto.GoodsSkuDTO;

/**
 * @author chuxin
 * @ClassName GoodsFacadeService
 * @Date 2021/12/5 1:31 AM
 * @Description: 商品中心对外接口
 */
public interface GoodsFacadeService {

    /**
     * 根据 ID 查询商品 SKU
     * @param goodsSkuId 商品 SKU ID
     * @return 商品 sku DTO 对象
     */
    GoodsSkuDTO getGoodsSkuById(Long goodsSkuId);
}
