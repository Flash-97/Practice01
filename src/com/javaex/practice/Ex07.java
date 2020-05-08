package com.javaex.practice;

public class Ex07 {

	public static void main(String[] args) {

		int i =10;		// i는 10값이다.
		
		int n =++i %2;	// ++가 먼저 나오므로 값이 11이 되어서 11%2의 값은 1
		
		System.out.println(i);	// 11
		
		System.out.println(n);	// 1
	}

}
