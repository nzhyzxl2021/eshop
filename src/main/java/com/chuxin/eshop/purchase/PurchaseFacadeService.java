package com.chuxin.eshop.purchase;

/**
 * @author chuxin
 * @ClassName PurchaseFacadeService
 * @Date 2021/12/5 1:35 AM
 * @Description: 采购中心对外提供的接口
 */
public interface PurchaseFacadeService {

    /**
     * 判断是否有关联商品 SKU 的采购单
     * @param goodsSkuId 商品 sku id
     * @return 是否存有采购单关联了商品 sku id
     */
    Boolean existRelatedPurchaseOrder(Long goodsSkuId);

    /**
     * 通知采购中心，【创建采购入库单】事件发生了
     * @param purchaseOrderId 采购单 ID
     * @return 处理结果
     */
    Boolean informCreatePurchaseInputOrderEvent(Long purchaseOrderId);

    /**
     * 通知采购中心，【完成采购入库单】事件发生了
     * @param purchaseOrderId 采购入库单 id
     * @return 处理结果
     */
    Boolean informFinishPurchaseInputOrderEvent(Long purchaseOrderId);

    /**
     * 通知采购中心，【创建采购结算单】事件发生了
     * @param purchaseOrderId 采购入库单 id
     * @return 处理结果
     */
    Boolean informCreatePurchaseSettlementOrderEvent(Long purchaseOrderId);

    /**
     * 通知采购中心，【完成采购结算单】事件发生了
     * @param purchaseOrderId 采购入库单 id
     * @return 处理结果
     */
    Boolean informFinishPurchaseSettlementOrderEvent(Long purchaseOrderId);
}
