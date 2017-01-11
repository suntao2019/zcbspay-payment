/* 
 * OrderService.java  
 * 
 * version TODO
 *
 * 2016年10月11日 
 * 
 * Copyright (c) 2016,zlebank.All rights reserved.
 * 
 */
package com.zcbspay.platform.payment.order.service;

import com.zcbspay.platform.payment.exception.PaymentOrderException;
import com.zcbspay.platform.payment.order.bean.InsteadPayOrderBean;
import com.zcbspay.platform.payment.order.bean.RefundOrderBean;
import com.zcbspay.platform.payment.order.bean.SimpleOrderBean;
import com.zcbspay.platform.payment.order.bean.WithdrawOrderBean;

/**
 * 订单生成接口
 *
 * @author guojia
 * @version
 * @date 2016年10月11日 下午4:01:32
 * @since 
 */
public interface OrderService {

	/**
	 *  生成消费订单
	 * @param orderBean 订单数据bean
	 * @return 受理订单号TN
	 * @throws PaymentOrderException
	 */
	
	public String createConsumeOrder(final SimpleOrderBean orderBean) throws PaymentOrderException;
	
	/**
	 * 创建充值订单
	 * @param orderBean 订单数据bean
	 * @return 受理订单号TN
	 * @throws PaymentOrderException
	 */
	public String createRechargeOrder(final SimpleOrderBean orderBean)throws PaymentOrderException;
	
	/**
	 * 生成实时代付订单 
	 * @param orderBean 代付订单数据bean
	 * @return 受理订单号 tn
	 * @throws PaymentOrderException
	 */
	public String createInsteadPayOrder(final InsteadPayOrderBean orderBean)  throws PaymentOrderException;
	
	/**
	 * 创建退款申请订单
	 * @param refundOrderBean 退款订单bean
	 * @return 受理订单号
	 */
	public String createRefundOrder(final RefundOrderBean refundOrderBean) throws PaymentOrderException;
	
	/**
	 * 创建提现订单
	 * @param withdrawOrderBean 订单数据bean
	 * @return 受理订单号
	 */
	public String createWithdrawOrder(final WithdrawOrderBean withdrawOrderBean) throws PaymentOrderException;
}
