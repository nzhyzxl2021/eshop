package com.chuxin.eshop.logistics.service;

import com.chuxin.eshop.goods.dto.GoodsSkuDTO;

/**
 * @author chuxin
 * @ClassName LogisticsFacadeService
 * @Date 2021/12/5 10:11 PM
 * @Description: 物流中心对外提供的接口
 */
public interface LogisticsFacadeService {

    /**
     * 这样算运费
     * @param goodsSkuDTO 商品 sku DTO
     * @return 商品 sku 的运费
     */
    Double calculateFreight(GoodsSkuDTO goodsSkuDTO);
}
