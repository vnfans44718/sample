package com.itwill02.constructor;

public class StudentConstructorMain {
	public static void main(String[] args) {

		Student st1 = new Student();
		st1.setStudentData(1, "박효신", 100, 100, 100);
		Student st2 = new Student(2, "최인호", 100, 90, 80);
		Student st3 = new Student(3, "김길중", 88, 99, 100);

		st1.calculateTotal();
		st2.calculateTotal();
		st3.calculateTotal();

		st1.calculateAvg();
		st2.calculateAvg();
		st3.calculateAvg();

		st1.calculateGrade();
		st2.calculateGrade();
		st3.calculateGrade();

		st1.headerPrint();
		st1.print();
		st2.print();
		st3.print();
		/*
		 * 학생 student1 의 이름변경한후(이름변경메쏘드호출후) student1학생객체출력
		 * 학생 student1 의 총점데이타 반환받은후 메인블록에서출력
		 * 학생 student1 의 학점데이타 반환받은후 메인블록에서출력
		 */
		st1.setName("박효순");
		st1.headerPrint();
		st1.print();
		System.out.printf("%s의 총점 데이터 : %d\n", st1.getName(), st1.getTot());
		System.out.printf("%s의 학점 데이터 : %c\n", st1.getName(), st1.getGrade());
	}
}