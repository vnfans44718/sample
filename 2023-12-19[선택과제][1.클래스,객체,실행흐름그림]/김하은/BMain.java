package com.itwill99.practice;

public class BMain {

	public static void main(String[] args) {
		
		B candy = new B();
		
		candy.x = "청포도사탕";
		candy.y = 100;
		
		System.out.println(candy.x);
		System.out.println(candy.y);
		
		candy.m1();
		candy.m2();

	}
}
