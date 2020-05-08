package com.javaex.practice;
import java.util.Scanner;
public class Ex16 {

	public static void main(String[] args) {
		
		double num0;
		double num1;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("상품가격: ");
		num0 = sc.nextDouble();
		
		System.out.print("받은돈: ");
		num1 = sc.nextDouble();
		
		System.out.println("==================");
		System.out.println("받은돈: "+ num1);
		System.out.println("상품가격: "+ num0);
		System.out.println("부가세: "+ num0/10);
		System.out.println("잔액: " + (num1-num0));
		
		sc.close();
	}

}
