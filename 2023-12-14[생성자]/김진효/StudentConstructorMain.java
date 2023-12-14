package com.itwill02.constructor;

public class StudentConstructorMain {

	public static void main(String[] args) {
		/*
		 학생객체생성(3명)
		  - 1명은 기본생성자사용
		      학생객체기본데이타(번호, 이름, 국어, 영어, 수학) 입력메쏘드호출
		  - 2명은 인자5개 생성자사용
		 */
		Student student1 = new Student();
		Student student2 = new Student(2, "LEE", 70, 85, 93);
		Student student3 = new Student(3, "KIM", 54, 76, 94);

		student1.setStudentData(1, "SIM", 83, 45, 67);

		/*
		 학생총점계산 메쏘드 호출(3명)
		 학생평균계산 메쏘드 호출(3명)
		 학생평점계산 메쏘드 호출(3명)
		 */
		student1.calculateTotal();
		student2.calculateTotal();
		student3.calculateTotal();

		student1.calculateAvg();
		student2.calculateAvg();
		student3.calculateAvg();

		student1.calculateGrade();
		student2.calculateGrade();
		student3.calculateGrade();

		/*
		 * 학생데이타 출력메쏘드 호출(3명)
		 */
		student1.headerPrint();
		student1.print();
		student2.print();
		student3.print();

		/*
		 * 학생 student1 의 이름변경메쏘드호출후 student1학생객체출력
		 * 학생 student1 의 총점데이타 반환받은후 메인블록에서출력
		 * 학생 student1 의 학점데이타 반환받은후 메인블록에서출력
		 */

		System.out.println();
		student1.changePrint();
		student1.headerPrint();
		student1.setName("PARK");
		student1.print();

		System.out.println();
		System.out.println("학생1의 총점은: " + student1.getTot());
		System.out.println("학생1의 총점은: " + student1.getGrade());
	}

}