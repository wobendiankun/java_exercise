package com.design;

/**
 * @author wobendiankun
 *2015-1-21 下午07:48:25
 */
public class TemplateTest {
	public static void main(String[] args) {
		// process = new ManualMilkProcess();
		AbstractMilkProcess process = new MachineMilkProcess();
		process.handle();
	}
}
