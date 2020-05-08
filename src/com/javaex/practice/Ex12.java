package com.javaex.practice;
import java.util.Scanner;
public class Ex12 {

	public static void main(String[] args) {
		
		double Pi;
		int num0;
		
		Scanner sc 	= new Scanner(System.in);
		
		System.out.print("반지름을 입력하세요: ");
		Pi = 3.14;
		num0 = sc.nextInt();
		
		System.out.println("원의 넓이는 " + num0*num0*Pi);
		
		sc.close();
	}

}
