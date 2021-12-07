package com.chuxin.eshop.wms.service;

import com.chuxin.eshop.order.domain.OrderDTO;
import com.chuxin.eshop.wms.domain.ReturnGoodsInputOrderDTO;
import com.chuxin.eshop.wms.domain.SaleDeliveryOrderDTO;
import com.chuxin.eshop.wms.domain.PurchaseInputOrderDTO;

/**
 * @author chuxin
 * @ClassName WmsFacadeService
 * @Date 2021/12/5 11:56 AM
 * @Description: WMS 中心对外接口
 */
public interface WmsFacadeService {

    /**
     * 创建采购入库单
     * @param purchaseInputOrderDTO 采购入库单 DTO
     * @return 处理结果
     */
    Boolean createPurchaseInputOrder(PurchaseInputOrderDTO purchaseInputOrderDTO);

    /**
     * 创建销售出库单
     * @param deliveryOrderDTO 销售出库单 DTO
     * @return 处理结果
     */
    Boolean createSaleDeliverOrder(SaleDeliveryOrderDTO deliveryOrderDTO);

    /**
     * 创建退货入库单
     * @param returnGoodsInputOrderDTO 退货入库单 DTO
     * @return 处理结果
     */
    Boolean createReturnGoodsInputOrder(ReturnGoodsInputOrderDTO returnGoodsInputOrderDTO);

    /**
     * 通知 WMS 中心，【提交订单】事件发生了
     * @param orderDTO 订单 DTO
     * @return 处理结果
     */
    Boolean informSubmitOrderEvent(OrderDTO orderDTO);

    /**
     * 通知 WMS 中心，【支付订单】事件发生了
     * @param orderDTO 订单 DTO
     * @return 处理结果
     */
    Boolean informPayOrderEvent(OrderDTO orderDTO);

    /**
     * 通知 WMS 中心，【取消订单】事件发生了
     * @param orderDTO 订单 DTO
     * @return 处理结果
     */
    Boolean informCancelOrderEvent(OrderDTO orderDTO);
}
