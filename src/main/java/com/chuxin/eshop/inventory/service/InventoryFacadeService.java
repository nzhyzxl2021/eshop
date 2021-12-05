package com.chuxin.eshop.inventory.service;

import com.chuxin.eshop.order.dto.OrderDTO;
import com.chuxin.eshop.wms.dto.PurchaseInputOrderDTO;
import com.chuxin.eshop.wms.dto.ReturnGoodsInputOrderDTO;

/**
 * @author chuxin
 * @ClassName InventoryFacadeService
 * @Date 2021/12/5 10:30 PM
 * @Description: 库存中心对外提供的接口
 */
public interface InventoryFacadeService {

    /**
     * 通知库存中心，【采购入库完成】事件发生了
     * @param purchaseInputOrderDTO 采购入库单 dto
     * @return 处理结果
     */
    Boolean informPurchaseInputFinished(PurchaseInputOrderDTO purchaseInputOrderDTO);

    /**
     * 通知库存中心，【提交订单】事件发生了
     * @param orderDTO 订单 dto
     * @return 处理结果
     */
    Boolean informSubmitOrderEvent(OrderDTO orderDTO);

    /**
     * 通知库存中心，【支付订单】事件发生了
     * @param orderDTO
     * @return
     */
    Boolean informPayOrderEvent(OrderDTO orderDTO);

    /**
     * 通知库存中心，【取消订单】事件发生了
     * @param orderDTO 订单 dto
     * @return 处理结果
     */
    Boolean informCancelOrderEvent(OrderDTO orderDTO);

    /**
     * 通知库存中心，【完成退货入库】事件发生了
     * @param returnGoodsInputOrderDTO 退货入库单 dto
     * @return 处理结果
     */
    Boolean informReturnGoodsInputFinishedEvent(ReturnGoodsInputOrderDTO returnGoodsInputOrderDTO);

    /**
     * 查询商品 sku 库存
     * @param goodsSkuId 商品 sku id
     * @return 商品 sku 库存
     */
    Long getSaleStockQuantity(Long goodsSkuId);
}
