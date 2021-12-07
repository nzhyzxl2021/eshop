package com.chuxin.eshop.schedule.service;

import com.chuxin.eshop.customer.domain.ReturnGoodsWorksheetDTO;
import com.chuxin.eshop.order.domain.OrderDTO;
import com.chuxin.eshop.purchase.domain.PurchaseOrderDTO;
import com.chuxin.eshop.wms.domain.PurchaseInputOrderDTO;
import com.chuxin.eshop.wms.domain.ReturnGoodsInputOrderDTO;

/**
 * @author chuxin
 * @ClassName ScheduleFacadeService
 * @Date 2021/12/5 10:46 PM
 * @Description: 调试中心对外提供接口
 */
public interface ScheduleFacadeService {

    /**
     * 通知调度中心，【采购入库完成】事件发生了
     * @param purchaseInputOrderDTO 采购入库单 dto
     * @return 处理结果
     */
    Boolean informPurchaseInputFinished(PurchaseInputOrderDTO purchaseInputOrderDTO);

    /**
     * 通知调度中心，【提交订单】事件发生了
     * @param orderDTO 订单 dto
     * @return 处理结果
     */
    Boolean informSubmitOrderEvent(OrderDTO orderDTO);

    /**
     * 通知调度中心，【支付订单】事件发生了
     * @param orderDTO
     * @return
     */
    Boolean informPayOrderEvent(OrderDTO orderDTO);

    /**
     * 通知调度中心，【取消订单】事件发生了
     * @param orderDTO 订单 dto
     * @return 处理结果
     */
    Boolean informCancelOrderEvent(OrderDTO orderDTO);

    /**
     * 通知调度中心，【完成退货入库】事件发生了
     * @param returnGoodsInputOrderDTO 退货入库单 dto
     * @return 处理结果
     */
    Boolean informReturnGoodsInputFinishedEvent(ReturnGoodsInputOrderDTO returnGoodsInputOrderDTO);

    /**
     * 调度采购入库
     * @param purchaseOrderDTO 采购单 DTO
     * @return 处理结果
     */
    Boolean schedulePurchaseInput(PurchaseOrderDTO purchaseOrderDTO);

    /**
     * 调度销售出库
     * @param orderDTO 订单 dto
     * @return 处理结果
     */
    Boolean scheduleSaleDelivery(OrderDTO orderDTO);

    /**
     * 调度退货入库
     * @param orderDTO 订单 dto
     * @param returnGoodsWorksheetDTO 退货工单 dto
     * @return 处理结果
     */
    Boolean scheduleReturnGoodsInput(OrderDTO orderDTO, ReturnGoodsWorksheetDTO returnGoodsWorksheetDTO);
}
