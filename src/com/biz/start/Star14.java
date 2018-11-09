package com.biz.start;

public class Star14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i = 0 ; i < 20;i++) {
			boolean end = loop01(i);
			if(end == false) break;
		}
	}
	
	public static boolean loop01(int count) {
		if(count > 10) {
			System.out.println("그만!!!");
			return false;
		}
		System.out.println(count);
		return true;
	}
}
