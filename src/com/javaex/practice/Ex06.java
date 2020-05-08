package com.javaex.practice;

public class Ex06 {

	public static void main(String[] args) {

		int i =	10;		//i는 10값 
		
		int n =i++%2;	// i=10에서 2로 나눴으므로 0 뒤늦게 ++이 붙었으므로 1
		
		System.out.println(i);	//++이 뒤늦게 붙어서 10+1=11
		
		System.out.println(n);	//0
	}

}
