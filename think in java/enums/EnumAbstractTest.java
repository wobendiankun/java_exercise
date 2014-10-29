package com.demo.enums;

/**
 * @author wobendiankun
 *2014-10-28 下午11:13:19
 */
public class EnumAbstractTest {
	enum GradeType {
		A(){

			@Override
			void print() {
				System.out.println("优秀");
			}
			
		},
		B(){
			
			@Override
			void print() {
				System.out.println("良");
			}
			
		};
		//定义一个抽象方法
		abstract void print();
	}
	public static void main(String[] args) {
		GradeType type=GradeType.B;
		type.print();//良
	}
}
