package com.chuxin.eshop.order.service;

/**
 * @author chuxin
 * @ClassName OrderFacadeService
 * @Date 2021/12/5 10:04 PM
 * @Description: 订单中心对外提供接口
 */
public interface OrderFacadeService {

    /**
     * 通知订单中心，【商品完成发货】事件发生了
     * @param orderId 订单 ID
     * @return 处理结果
     */
    Boolean informGoodsDeliveryFinishedEvent(Long orderId);

    /**
     * 通知订单中心，【退货工单审核不通过】事件发生了
     * @param orderId 订单 ID
     * @return 处理结果
     */
    Boolean informReturnGoodsWorksheetRejectedEvent(Long orderId);

    /**
     * 通知订单中心，【确认收到退货商品】事件发生了
     * @param orderId 订单 ID
     * @return 处理结果
     */
    Boolean informReturnGoodsReceivedEvent(Long orderId);

    /**
     * 通知订单中心，【退货入库单审核通过】事件发生了
     * @param orderId 订单 ID
     * @return 处理结果
     */
    Boolean informReturnGoodsInputOrderApprovedEvent(Long orderId);

    /**
     * 通知订单中心，【完成退款事件】发生了
     * @param orderId 订单 ID
     * @return 处理结果
     */
    Boolean informRefundFinishedEvent(Long orderId);
}
