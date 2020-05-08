package com.javaex.practice;
import java.util.Scanner;
public class Ex15 {

	public static void main(String[] args) {
		
		double num0;
		double Km;
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("마일을 입력하세요: ");
		num0 = sc.nextDouble();
		
		Km = num0*1.609;
		System.out.println(num0+"마일은 "+Km+"킬로미터 입니다.");
		
		sc.close();
	}

}
