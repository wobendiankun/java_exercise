package com.design;

/**牛奶加工过程
 * @author wobendiankun
 *2015-1-21 下午08:01:57
 */
public abstract class AbstractMilkProcess {
	/**
	 *挤奶 
	 */
	protected abstract void milking();
	
	/**
	 * 杀菌
	 */
	protected  void sterilize(){
		System.out.println("杀菌.....");
	}
	/**
	 * 打包
	 */
	protected  void packaging(){
		System.out.println("打包.....");
	}
	
	/**
	 * 模版方法
	 */
	public void handle(){
		milking();
		sterilize();
		packaging();
	}
}
