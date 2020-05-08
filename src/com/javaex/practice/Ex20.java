package com.javaex.practice;
import java.util.Scanner;
public class Ex20 {

	public static void main(String[] args) {
		
		int num1;
		int num2;
		int num3;
		int num4;
		int money;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("500원 개수: ");
		num1 = sc.nextInt();
		
		System.out.print("100원 개수: ");
		num2=sc.nextInt();
		
		System.out.print("50원 개수: ");
		num3=sc.nextInt();
		
		System.out.print("10원 개수: ");
		num4=sc.nextInt();
		
		money = num1*500+num2*100+num3*50+num4*10;
		System.out.println("동전의 총합은 " + money + "원 입니다.");
		
		sc.close();
	}

}
