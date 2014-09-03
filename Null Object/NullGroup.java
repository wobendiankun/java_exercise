package com.demo.user;

public class NullGroup extends Group {
	
	private NullGroup() {
	}

	@Override
	public int getGroupId() {
		return 9999999;
	}
	@Override
	public boolean isNull() {
		return false;
	}
	static Group createNull(){
		return new NullGroup();
	}
}
