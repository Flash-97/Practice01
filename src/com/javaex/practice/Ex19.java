package com.javaex.practice;

public class Ex19 {

	public static void main(String[] agrgs) {
		//속력 및 거리
		long speed = 300000l;
		long distance;
	
		//거리 공식
		distance = speed * 60 * 60 * 24 * 365;
	
		System.out.println("빛이 1년 동안 가는 거리는  " + distance + "  km 입니다." );
		
	}
}