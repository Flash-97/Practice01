package com.javaex.practice;

public class Ex03 {

	public static void main(String[] args) {

		int x=	1;
		int y=	1;
		
		int a= 	++x *2;	//x에 1을먼저 더한후 *2
		int b=	y++ *2;	//y출력한후 +1
		
		System.out.println("a=" +a);
		System.out.println("b=" +b);
		System.out.println("x=" +x);
		System.out.println("y=" +y);
	}

}
