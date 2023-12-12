package com.itwill01.method;

public class StudentMemberMethodMain {
	public static void main(String[] args) {

		Student st1 = new Student();
		Student st2 = new Student();
		Student st3 = new Student();

		st1.insert(1, "최인호", 100, 90, 80);
		st2.insert(2, "이종민", 88, 99, 70);
		st3.insert(3, "박필하", 100, 79, 69);

		st1.calTotal();
		st2.calTotal();
		st3.calTotal();
		
		st1.calAvg();
		st2.calAvg();
		st3.calAvg();
		
		st1.calGrade();
		st2.calGrade();
		st3.calGrade();

		st1.printHeader();
		
		st1.print();
		st2.print();
		st3.print();
	}
}