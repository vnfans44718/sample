package com.itwill00.veriable;

public class Calculator {
	/*
	 * - add( 두개의 정수를 매개변수로 받아서 더한 결과값을 반환)
	 * - sub( 두개의 정수를 매개변수로 받아서 뺀   결과값을 반환)
	 * - mul( 두개의 정수를 매개변수로 받아서 곱한 결과값을 반환)
	 * - div( 두개의 정수를 매개변수로 받아서 나눈 결과값을 반환)
	 */
	public int add(int a, int b) {
		int result = a+b;
		return result;
	}
	public int sub(int c, int d) {
		int result = c-d;
		return result;
	}
	public int mul(int e, int f) {
		int result = e*f;
		return result;
	}
	public int div(int g, int h) {
		int result = g/h;
		return result;
	}
}
