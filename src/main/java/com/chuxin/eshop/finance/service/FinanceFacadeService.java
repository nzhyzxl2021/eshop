package com.chuxin.eshop.finance.service;

import com.chuxin.eshop.wms.dto.PurchaseInputOrderDTO;
import com.chuxin.eshop.wms.dto.ReturnGoodsInputOrderDTO;
import com.chuxin.eshop.wms.dto.SaleDeliveryOrderDTO;

/**
 * @author chuxin
 * @ClassName FinanceFacadeService
 * @Date 2021/12/5 10:26 PM
 * @Description: 财务中心对象提供的接口
 */
public interface FinanceFacadeService {

    /**
     * 创建采购结算单
     * @param purchaseInputOrderDTO 采购入库单 dto
     * @return 处理结果
     */
    Boolean createPurchaseSettlementOrder(PurchaseInputOrderDTO purchaseInputOrderDTO);

    /**
     * 给物流公司打款
     * @param saleDeliveryOrderDTO 销售出库单
     * @return 处理结果
     */
    Boolean payForLogisticsCompany(SaleDeliveryOrderDTO saleDeliveryOrderDTO);

    /**
     * 执行退货退款操作
     * @param returnGoodsInputOrderDTO 退货入库单 dto
     * @return 处理结果
     */
    Boolean executeReturnGoodsRefund(ReturnGoodsInputOrderDTO returnGoodsInputOrderDTO);
}
