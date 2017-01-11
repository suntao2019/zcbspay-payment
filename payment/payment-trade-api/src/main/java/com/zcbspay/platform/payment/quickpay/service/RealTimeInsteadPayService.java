/* 
 * RealTimeInsteadPayService.java  
 * 
 * version TODO
 *
 * 2016年10月21日 
 * 
 * Copyright (c) 2016,zlebank.All rights reserved.
 * 
 */
package com.zcbspay.platform.payment.quickpay.service;

import com.zcbspay.platform.payment.bean.ResultBean;
import com.zcbspay.platform.payment.exception.PaymentInsteadPayException;
import com.zcbspay.platform.payment.exception.PaymentQuickPayException;
import com.zcbspay.platform.payment.exception.PaymentRouterException;
import com.zcbspay.platform.payment.quickpay.bean.InsteadPayOrderBean;

/**
 * 实时代付接口
 *
 * @author guojia
 * @version
 * @date 2016年10月21日 上午10:53:03
 * @since 
 */
public interface RealTimeInsteadPayService {

	/**
	 * 实时代付
	 * @param insteadPayOrderBean 代付订单bean
	 * @return 交易结果bean
	 */
	public ResultBean singleInsteadPay(InsteadPayOrderBean insteadPayOrderBean) throws PaymentInsteadPayException,PaymentQuickPayException,PaymentRouterException;
}
