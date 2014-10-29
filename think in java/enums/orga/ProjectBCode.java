package com.demo.enums.orga;

/**
 * @author wobendiankun
 *2014-10-28 下午10:58:47
 */
public enum ProjectBCode implements ProjectBErrorCode{
	ADD_USER("10001","添加用户失败"),
	DELETE_USER("10002","删除用户失败");
	private String code;
	private String desc;
	
	private ProjectBCode(String code, String desc) {
		this.code = code;
		this.desc = desc;
	}

	@Override
	public String getCode() {
		return this.code;
	}

	@Override
	public String getDesc() {
		return this.desc;
	}

}
