package com.javaex.practice;
import java.util.Scanner;
public class Ex18 {

	public static void main(String[] args) {
		
		double f; //화씨
		double c; //섭씨
		//스캐너
		Scanner sc = new Scanner(System.in);
		//출력
		System.out.print("화씨: ");
		//입력
		f = sc.nextDouble();
		
		c = (double)5/(double)9*(f-32);
		
		System.out.println("화씨 "+ f +"의 섭씨온도는 " + c +"입니다.");
		
		sc.close();
	}

}
