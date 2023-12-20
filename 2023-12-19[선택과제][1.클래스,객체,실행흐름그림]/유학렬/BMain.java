package com.itwill03.포함;

public class BMain {

	public static void main(String[] args) {
		B b1 = new B();
		B b2 = new B();

		b1.x = 10;
		b1.y = 1.5;

		b2.x = 20;
		b2.y = 20.5;

		System.out.println("b1: " + b1.x + " " + b1.y);
		System.out.println("b2: " + b2.x + " " + b2.y);
		System.out.println();
		b1.print();
		b2.print1();

	}

}
