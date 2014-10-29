package com.demo.enums.orga;

/**
 * @author wobendiankun
 *2014-10-28 下午10:45:43
 */
public class DepAException extends RuntimeException {
	public DepAException(DepAErrorCode depAErrorCode) {
		super(getMsg(depAErrorCode));
	}
	static String getMsg(DepAErrorCode depAErrorCode){
		return "错误码:"+depAErrorCode.getCode()+",错误信息:"+depAErrorCode.getDesc();
	}
	
}
