package com.demo.event;

public class EventTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Listener listener=new MyListener();
		//添加监听者
		Context.addListener(listener);
		//模拟bundle安装完成事件触发
		Context.sendNotification(new Event(Event.INSTALLED, new MyBundle()));
	}

}
