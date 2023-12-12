package com.itwill01.method;

public class CalculatorMain {

	public static void main(String[] args) {
		
		Calculator calculator = new Calculator();
		
		int result1 = calculator.add(23,34);
		System.out.println(result1);
		int result2 = calculator.sub(23,34);
		System.out.println(result2);
		double result4 = calculator.div(45435,34);
		System.out.println(result4);
		int result3 = calculator.mul(23,34);
		System.out.println(result3);

	}

}
