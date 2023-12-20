package com.ab;

public class BMain {
	public static void main(String[] args) {
		B b=new B();
		b.x=3;
		b.y=5;
		System.out.println(b.x);
		System.out.println(b.y);
		b.m1();
		b.m2();
	}
}
