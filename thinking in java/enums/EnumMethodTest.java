package com.demo.enums;

public class EnumMethodTest {
	enum GradeType {
		//枚举实例 
		A(85),B(75),C(65),D(59);
		private int score ;
		
		private GradeType(int score) {
			this.score = score;
		}

		public int getScore() {
			return score;
		}
		
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		GradeType type=GradeType.valueOf("A");
		System.out.println("成绩:"+type.getScore());//成绩:85
	}

}
