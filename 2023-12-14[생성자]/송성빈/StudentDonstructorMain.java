package com.itwill02.constructor;

public class StudentDonstructorMain {

	public static void main(String[] args) {
		Student student1 = new Student();
		Student student2 = new Student(2, "김경수", 45, 53, 76);
		Student student3 = new Student(3, "김경주", 40, 52, 74);

		student1.setStudent(1, "김경호", 42, 56, 78);

		student1.calculateTotal(42, 56, 78);
		student2.calculateTotal(45, 53, 76);
		student3.calculateTotal(40, 52, 74);

		student1.calculateAvg(student1.getTot());
		student2.calculateAvg(student2.getTot());
		student3.calculateAvg(student3.getTot());

		student1.calculateGrade(student1.getAvg());
		student2.calculateGrade(student2.getAvg());
		student3.calculateGrade(student3.getAvg());

		student1.headerPrint();
		student1.print();
		student2.print();
		student3.print();

		student1.setName("김경태");
		student1.print();

		student1.setTot(student1.getTot());
		System.out.println(student1.getTot());

		student1.setGrade(student1.getGrade());
		System.out.println(student1.getGrade());
	}

}
