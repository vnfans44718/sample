package com.itwill001.Field;

public class HealthTeacherMethodMain {

	public static void main(String[] args) {
		Health health1 = new Health();
		Health health2 = new Health();
		
		health1.name1(null);
		health1.height1(0);
		health1.weight1(0);
		health1.lecture1(null);
		health1.age1(0);
		
		health2.name1(null);
		health2.height1(0);
		health2.weight1(0);
		health2.lecture1(null);
		health2.age1(0);
		
		health1.headerprint();
		health1.print();
		health2.print();
		
		

	}

}
