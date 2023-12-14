package com.itwill02.constructor;

public class StudentConstructorMain {

	public static void main(String[] args) {
		
		Student student1 = new Student();
		student1.setStudentData(1, "남다연", 98, 100, 88);
		Student student2 = new Student(2, "최예나", 80, 75, 98);
		Student student3 = new Student(3, "우지영", 70, 65, 80);
	
		student1.calTot();
		student2.calTot();
		student3.calTot();
		
		student1.calAvg();
		student2.calAvg();
		student3.calAvg();
		
		student1.calGrade();
		student2.calGrade();
		student3.calGrade();
		
		student1.headerPrint();
		student1.print();
		student2.print();
		student3.print();
		
		student1.setName("윤태희");
		System.out.print("\n");
		student1.print();
		System.out.print("\n");
		System.out.println("윤태희의 총점: "+student1.getTot());
		System.out.println("윤태희의 평점: "+student1.getGrade());
	}

}
