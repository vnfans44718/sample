package com.itwill01.MemberMethod;

public class StudentMemberMethodMain {

	public static void main(String[] args) {

		Student student1, student2, student3;
		student1 = new Student();
		student2 = new Student();
		student3 = new Student();
		student1.studentInfo(01, "김경호", 72, 76, 78);
		student2.studentInfo(02, "김경수", 85, 83, 86);
		student3.studentInfo(03, "김민섭", 60, 61, 63);
		student1.total(72, 76, 78);
		student2.total(85, 83, 86);
		student3.total(60, 61, 63);
		student1.average(72, 76, 78);
		student2.average(85, 83, 86);
		student3.average(60, 61, 63);
		student1.grade(72, 76, 78);
		student2.grade(85, 83, 86);
		student3.grade(60, 61, 63);
		student1.headerPrint();
		student1.print();
		student2.print();
		student3.print();

	}

}
