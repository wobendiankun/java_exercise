package com.design;

/**机器处理
 * @author wobendiankun
 *2015-1-21 下午08:40:51
 */
public class MachineMilkProcess extends AbstractMilkProcess {

	/* (non-Javadoc)
	 * @see com.design.AbstractMilkProcess#milking()
	 */
	@Override
	protected void milking() {
		System.out.println("机器挤奶...");
	}

}
