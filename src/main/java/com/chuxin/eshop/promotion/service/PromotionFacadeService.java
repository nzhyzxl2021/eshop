package com.chuxin.eshop.promotion.service;

import com.chuxin.eshop.promotion.domain.PromotionActivityDTO;

import java.util.List;

/**
 * @author chuxin
 * @ClassName PromotionFacadeService
 * @Date 2021/12/5 10:13 PM
 * @Description: 促销中心对外提供接口
 */
public interface PromotionFacadeService {

    /**
     * 根据商品 ID 查询促销活动
     * @param goodsId 商品 id
     * @return 促销活动列表
     */
    List<PromotionActivityDTO> listPromotionActivitiesByGoodsId(Long goodsId);
}
