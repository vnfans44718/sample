package com.itwill01.method;

public class HealthMain {

	public static void main(String[] args) {
		Health hea1 = new Health();
		Health hea2 = new Health();
		
	hea1.data(180,78,"남성","Tomas",37,"PT담당");
	hea2.data(170,50,"여성","Alice",26,"요가담당");
	
	hea1.print();
	hea2.print();
	}
}
