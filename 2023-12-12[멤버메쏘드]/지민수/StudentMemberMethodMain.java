package com.itwill01.method;

public class StudentMemberMethodMain {

	public static void main(String[] args) {

		Student stu1 = new Student();
		Student stu2 = new Student();
		Student stu3 = new Student();

		stu1.data(1, "차은우", 96, 88, 100);
		stu2.data(2, "정해인", 70, 62, 97);
		stu3.data(3, "김영광", 76, 98, 88);

		stu1.tot(0);
		stu2.tot(0);
		stu3.tot(0);

		stu1.avg();
		stu2.avg();
		stu3.avg();

		stu1.grade();
		stu2.grade();
		stu3.grade();

		stu1.headerprint();
		stu1.print();
		stu2.print();
		stu3.print();
	}

}
