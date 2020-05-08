package com.javaex.practice;
import java.util.Scanner;
public class Ex14 {

	public static void main(String[] args) {
		
		int width;
		int height;
		float Area;
		float num2;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("가로를 입력하세요: ");
		width = sc.nextInt();
		
		System.out.print("세로를 입력하세요: ");
		height = sc.nextInt();
		
		Area = width*height;
		num2 = (width+height)*2;
		
		System.out.println("사각형의 넓이는 " + Area);
		System.out.println("사각형의 둘레는 " + num2);
		
		sc.close();
	}

}
