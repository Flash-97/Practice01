package com.javaex.practice;

public class Ex09 {

	public static void main(String[] args) {

		double f=80.0;
		System.out.println(5 / 9 * (f-32.0));
		// 앞의 값이 0이 되므로 값이 0이 나와버린다

		System.out.println((double)5 /(double)9 * (f-32.0)); // 공식
		
	}

}
