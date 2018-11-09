package com.biz.start;

public class Star07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 다음에 나열된 두 숫자의 덧셈, 곱셈을
		 * 계산하여 콘솔에 보여주는 코드를
		 * 작성하시오
		 * 30,40
		 * 50,20
		 * 100,200
		 * 3,100
		 * 5,20
		 */
		
		calcNum(30,40);
		calcNum(50,20);
		calcNum(100,200);
		calcNum(3,100);
		calcNum(5,20);

		/*
		System.out.printf("%d + %d = %d",30,40,30+40);
		System.out.printf("%d x %d = %d",30,40,30*40);

		System.out.printf("%d + %d = %d",50,20,50+20);
		System.out.printf("%d x %d = %d",50,20,50*20);

		System.out.printf("%d + %d = %d",100,200,100+200);
		System.out.printf("%d x %d = %d",100,200,100*200);
		*/
	}
	
	public static void calcNum(int intNum1, int intNum2) {
		
//		int intNum1 = 30;
//		int intNum2 = 40;
		System.out.printf("%d + %d = %d\n",
				intNum1,intNum2,intNum1+intNum2);
		System.out.printf("%d x %d = %d\n",
				intNum1,intNum2,intNum1*intNum2);
	}
}



