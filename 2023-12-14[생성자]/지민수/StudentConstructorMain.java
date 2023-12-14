package com.itwill02.constructor;

public class StudentConstructorMain {

	public static void main(String[] args) {

		Student stu1 = new Student();
		stu1.setStudentData(1, "이강인", 87, 90, 81);
		Student stu2 = new Student(2, "손흥민", 99, 100, 78);
		Student stu3 = new Student(3, "김민재", 87, 97, 60);
	
		stu1.calculateTotal();
		stu2.calculateTotal();
		stu3.calculateTotal();

		stu1.calculateAvg();
		stu2.calculateAvg();
		stu3.calculateAvg();

		stu1.calculateGrade();
		stu2.calculateGrade();
		stu3.calculateGrade();
		
		stu1.headerPrint();
		stu1.print();
		stu2.print();
		stu3.print();
		
		System.out.println();
		stu1.setName("황희찬");
		stu1.print();
		System.out.println(stu1.getTot());
		System.out.println(stu1.getGrade());
	}

}
