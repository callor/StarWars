package com.biz.start;

public class Star10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int intN1 = 30;
		int intN2 = 40;
		addVar(intN1, intN2);
		
		float fN1 = 2.5f;
		float fN2 = 3.6f;
		addVar(fN1, fN2);
		
	}
	
	public static void addVar(int intNum1, int intNum2) {
		System.out.printf("정수 %d, %d ",intNum1, intNum2);
		System.out.print(" 덧셈 ");
		System.out.println(intNum1 + intNum2);
	}

	public static void addVar(float floatNum1, float floatNum2) {
		System.out.printf("실수 %f, %f ",floatNum1, floatNum2);
		System.out.print(" 덧셈 ");
		System.out.println(floatNum1+ floatNum2);
	}

	
}
