/* 
 * AccountPayService.java  
 * 
 * version TODO
 *
 * 2016年11月11日 
 * 
 * Copyright (c) 2016,zlebank.All rights reserved.
 * 
 */
package com.zcbspay.platform.payment.accpay.service;

import com.zcbspay.platform.payment.accpay.bean.AccountPayBean;
import com.zcbspay.platform.payment.bean.ResultBean;
import com.zcbspay.platform.payment.exception.PaymentAccountPayException;
import com.zcbspay.platform.payment.exception.PaymentQuickPayException;

/**
 * 账户支付service
 *
 * @author guojia
 * @version
 * @date 2016年11月11日 上午10:24:56
 * @since 
 */
public interface AccountPayService {

	/**
	 * 账户支付（无密码）
	 * @param payBean 账户支付bean
	 * @return
	 */
	public ResultBean pay(AccountPayBean payBean) throws PaymentAccountPayException,PaymentQuickPayException;
}
