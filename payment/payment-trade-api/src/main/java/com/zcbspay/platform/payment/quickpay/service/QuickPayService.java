/* 
 * QuickPayService.java  
 * 
 * version TODO
 *
 * 2016年10月11日 
 * 
 * Copyright (c) 2016,zlebank.All rights reserved.
 * 
 */
package com.zcbspay.platform.payment.quickpay.service;


import com.zcbspay.platform.payment.bean.ResultBean;
import com.zcbspay.platform.payment.exception.PaymentQuickPayException;
import com.zcbspay.platform.payment.exception.PaymentRouterException;
import com.zcbspay.platform.payment.quickpay.bean.PayBean;

/**
 * 快捷支付接口
 *
 * @author guojia
 * @version
 * @date 2016年10月11日 下午4:55:26
 * @since 
 */
public interface QuickPayService {

	/**
	 * 订单支付（无短信验证码，无支付密码）
	 * @param payBean
	 * @return 交易结果bean
	 */
	public ResultBean pay(PayBean payBean) throws PaymentQuickPayException,PaymentRouterException;
}
