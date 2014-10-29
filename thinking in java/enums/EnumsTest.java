package com.demo.enums;

/**
 * @author wobendiankun
 *2014-10-28 下午10:09:53
 */
public class EnumsTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		valueList();
		ordinal();
		valueOf("A");//A
		//valueOf("F");//java.lang.IllegalArgumentException: No enum const class com.demo.enums.GradeType.F
		getValuesByClass();
	}

	private static void getValuesByClass() {
		for(GradeType type:GradeType.class.getEnumConstants()){
			System.out.print(type+"\t");//A		B	C	D	E
		}
		System.out.println();
	}

	private static void valueOf(String type) {
		System.out.println();
		System.out.println(GradeType.valueOf(type));
	}

	private static void ordinal() {
		System.out.println();
		//获取枚举常量的序数
		for(GradeType type:GradeType.values()){
			System.out.print(type.ordinal()+"\t");//0	1	2	3	4
		}
	}

	private static void valueList() {
		//获取枚举的所有值
		for(GradeType type:GradeType.values()){
			System.out.print(type+"\t");// A	B	C	D	E
		}
	}

}
enum GradeType {
	A,B,C,D,E
}