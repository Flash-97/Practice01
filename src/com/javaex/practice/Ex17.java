package com.javaex.practice;
import java.util.Scanner;
public class Ex17 {

	public static void main(String[] args) {

		int r;
		double V;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("반지름: ");
		
		r = sc.nextInt();
		
		V = (double)4/(double)3*3.14*r*r*r;
		
		System.out.println("구의부피는: "+V + " 입니다.");
		
		sc.close();
	}

}
