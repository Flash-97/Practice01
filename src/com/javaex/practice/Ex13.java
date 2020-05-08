package com.javaex.practice;
import java.util.Scanner;
public class Ex13 {

	public static void main(String[] args) {
		
		int money;
		double exmoney;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("환전할 원화를 입력하세요: ");
		money = sc.nextInt();
		
		exmoney = 1230.95;
		System.out.println(money/exmoney);
		
		sc.close();
	}

}
