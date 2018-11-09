package com.biz.start;

public class Star05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * method() 이야기
		 * java는 우리(프로그래머)가 어딘가에
		 * public static void 라는 키워드로 시작된
		 * 명령문으로 method를 선언(정의)해 두면
		 * 마치 java에서 기본적으로 제공하는
		 * 키워드 처럼
		 * 명령을 실행할수 있다.
		 * 
		 * method 이름
		 * 1. 변수 이름짓기와 같다.
		 *    첫글자는 영문소문자
		 *    두번째부터는 영, 숫자
		 * 2. 가급적 2단어 이상을 묶어서 
		 * 3. 의미있는 이름으로 짓자
		 * 4. 첫글자를 제외하고 단어가 시작될때는
		 *    대문자로 시작하자(camel)
		 */
		triAngle();
		verTriAngle();
		triAngle();
		verTriAngle();
		triAngle();
		
		for(int i = 0 ; i < 10 ; i++) {
			triAngle();
		}
		

	}
	
	// TODO triAngle method 선언부
	// 지금부터 Star05 클래스에 
	// triAngle 이라는 나만의 keyword를 만들겠다.
	// 		라고 선언
	// 이제 부터 이런 키워드를 method(메서드)라고
	// 		부른다
	public static void triAngle() {
		for (int j = 0; j < 5; j++) {
			// 빈칸을 몇개 찍고
			for (int i = j; i < 5; i++) {
				System.out.print(" ");
			}

			// 남은 부분에 별을 찍어라
			for (int k = 0; k < j; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	} // end triAngle
	
	public static void verTriAngle() {
		for (int j = 0; j < 5; j++) {

			// 빈칸을 몇개 찍고
			for (int i = 0; i < j; i++) {
				System.out.print(" ");
			}

			// 남은 부분에 별을 찍어라
			for (int k = j; k < 5; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}









