package com.biz.start;

public class Star01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1부터 5까지 반복 코드
		for(int j = 0 ; j < 5 ; j++) {
		
			// 내부의 for는
			// i값이 1씩 증가하는 동안
			// 총 5번의 반복 실행
			for(int i = 1 ; i <= 5; i++) {
				System.out.print("* ");
			}
			System.out.println();
		
		}
	}

}
