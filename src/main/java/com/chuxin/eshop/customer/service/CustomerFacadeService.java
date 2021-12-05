package com.chuxin.eshop.customer.service;

/**
 * @author chuxin
 * @ClassName CustomerFacadeService
 * @Date 2021/12/5 10:21 PM
 * @Description: 客服中心对外提供接口
 */
public interface CustomerFacadeService {

    /**
     * 创建退货工单
     * @param orderId 订单 id
     * @param orderNo 订单编号
     * @param returnGoodsReason 退货原因
     * @param returnGoodsComment 退货备注
     * @return 处理结果
     */
    Boolean createReturnGoodsWorksheet(Long orderId, String orderNo, String returnGoodsReason, String returnGoodsComment);

    /**
     * 同步物流单号
     * @param orderId 订单 id
     * @param returnGoodsCourierNumber 物流单号
     * @return 处理结果
     */
    Boolean syncReturnGoodsCourierNumber(Long orderId, String returnGoodsCourierNumber);

    /**
     * 通知客服中心，【退货入库单】完成事件发生了
     * @param returnGoodsWorksheetId 退货入库单 id
     * @return 处理结果
     */
    Boolean informReturnGoodsInputFinishedEvent(Long returnGoodsWorksheetId);

    /**
     * 通知客服中心，【完成退款事件】发生了
     * @param returnGoodsWorksheetId 退货工单 id
     * @return 处理结果
     */
    Boolean informRefundFinishedEvent(Long returnGoodsWorksheetId);
}
