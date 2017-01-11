/* 
 * PaymentQuickPayException.java  
 * 
 * version TODO
 *
 * 2016年10月11日 
 * 
 * Copyright (c) 2016,zlebank.All rights reserved.
 * 
 */
package com.zcbspay.platform.payment.exception;


/**
 * Class Description
 *
 * @author guojia
 * @version
 * @date 2016年10月11日 下午5:10:06
 * @since 
 */
public class PaymentRouterException extends AbstractDescException{

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 4634586182669271478L;
	private String code;
	/**
	 *
	 * @return
	 */
	@Override
	public String getCode() {
		// TODO Auto-generated method stub
		return code;
	}
	
	public PaymentRouterException(String code,Object ... para ) {
        this.params = para;
        this.code = code;
    }
	
	public PaymentRouterException(String code) {
        this.code = code;
    }
	/**
	 * 
	 */
	public PaymentRouterException() {
		super();
		// TODO Auto-generated constructor stub
	}
    
}
