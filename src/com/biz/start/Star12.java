package com.biz.start;

public class Star12 {

	public static void main(String[] args) {
		triAngle(3);
		
		for(int i = 5; i <= 20 ; i++) {
			triAngle(i);
		}
		
	}
	
	public static void triAngle(int intStarCount) {
		
//		 int intStarCount = 5;
		
		for (int j = 0; j < intStarCount; j++) {
			// 빈칸을 몇개 찍고
			for (int i = j; i < intStarCount; i++) {
				System.out.print(" ");
			}

			// 남은 부분에 별을 찍어라
			for (int k = 0; k < j; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	} // end triAngle
	
	
}
