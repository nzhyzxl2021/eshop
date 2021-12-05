package com.chuxin.eshop.membership.service;

/**
 * @author chuxin
 * @ClassName MembershipFacadeService
 * @Date 2021/12/5 6:57 PM
 * @Description: 会员中心对外提供接口
 */
public interface MembershipFacadeService {

    /**
     * 通知会员中心，【用户今日第一次登录】事件发生了
     * @param userAccountId 用户账号 ID
     * @return 处理结果
     */
    Boolean informFirstLoginDailyEvent(Long userAccountId);

    /**
     * 通知会员中心，【支付订单】事件发生了
     * @param userAccountId 用户账号 ID
     * @param totalOrderAmount 订单总金额
     * @return 处理结果
     */
    Boolean informPayOrderEvent(Long userAccountId, Long totalOrderAmount);

    /**
     * 通知会员中心，【完成退货】事件发生了
     * @param userAccountId 用户账号 ID
     * @param totalOrderAmount 订单总金额
     * @return 处理结果
     */
    Boolean informFinishReturnGoodsEvent(Long userAccountId, Long totalOrderAmount);

    /**
     * 通知会员中心，【发表评论】事件发生了
     * @param userAccountId 用户账号 ID
     * @param showPictures 是否晒图
     * @return 处理结果
     */
    Boolean informSubmitComment(Long userAccountId, Boolean showPictures);

    /**
     * 通知会员中心，【删除评论】事件发生了
     * @param userAccountId 用户账号 ID
     * @param showPictures 是否晒图
     * @return 处理结果
     */
    Boolean informRemoveCommentEvent(Long userAccountId, Boolean showPictures);
}
