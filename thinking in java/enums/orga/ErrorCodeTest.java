package com.demo.enums.orga;

/**
 * @author wobendiankun
 *2014-10-28 下午10:58:40
 */
public class ErrorCodeTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		add();//com.demo.enums.orga.DepAException: 错误码:10001,错误信息:添加用户失败
	}

	private static void add() {
		new UserSerivce().add();
	}

}
class UserSerivce{
	void add(){
		throw new DepAException(ProjectBCode.ADD_USER);
	}
}
