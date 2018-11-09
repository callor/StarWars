package com.biz.start;

public class Star11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intNum1 = 50;
		int intNum2 = 30;
		// addVar를 호출, 실행할때
		// 포함하는 변수 intNum1, intNum2는
		// 변수가 전달되는 것이 아니고
		// 변수에 저장되어 있는 값 
		// 50과 30이 전달된다
		addVar(intNum1, intNum2);
	}
	public static void addVar(int intNum1, 
					int intNum2) {

		System.out.printf("%d + %d = %d",
				intNum1, 
				intNum2, 
				intNum1+intNum2);
	}
}
