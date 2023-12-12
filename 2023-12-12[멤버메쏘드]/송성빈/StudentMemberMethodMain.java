package com.itwill01.method;

public class StudentMemberMethodMain {

	public static void main(String[] args) {
		
		Student student1 = new Student();
		Student student2 = new Student();
		Student student3 = new Student();
		
		student1.data(1, "김경호", 42, 56, 78);
		student2.data(2, "김경수", 45, 53, 76);
		student3.data(3, "김경주", 40, 52, 74);
		
		student1.tot(42, 56, 78);
		student2.tot(45, 53, 76);
		student3.tot(40, 52, 74);
		
		student1.avg(student1.tot);
		student2.avg(student2.tot);
		student3.avg(student3.tot);
		
		student1.grade(student1.avg);
		student2.grade(student2.avg);
		student3.grade(student3.avg);
		
		student1.hearderPrint();
		student1.print();
		student2.print();
		student3.print();
		
	}

}
