package com.itwill02.constructor;

public class StudentConstructorMain {

	public static void main(String[] args) {
		/*
		 학생객체생성(3명)
		  - 1명은 기본생성자사용
		      학생객체기본데이타(번호, 이름, 국어, 영어, 수학) 입력메쏘드호출
		  - 2명은 인자5개 생성자사용
		 */
		Student std1 = new Student();
		std1.setStudentData(1, "이일번", 84, 91, 79);
		Student std2 = new Student(2, "김이번", 54, 62, 88);
		Student std3 = new Student(3, "박삼번", 76, 92, 98);
		
		/*
		 학생총점계산 메쏘드 호출(3명)
		 학생평균계산 메쏘드 호출(3명)
		 학생평점계산 메쏘드 호출(3명)
		 */
		std1.calculateTot();
		std2.calculateTot();
		std3.calculateTot();

		std1.calculateAvg();
		std2.calculateAvg();
		std3.calculateAvg();
		
		std1.calculateGrade();
		std2.calculateGrade();
		std3.calculateGrade();
		
		/*
		 * 학생데이타 출력메쏘드 호출(3명)
		 */
		std1.headerPrint();
		std1.print();
		std2.print();
		std3.print();
		
		/*
		 * 학생 student1 의 이름변경메쏘드호출후 student1학생객체출력
		 * 학생 student1 의 총점데이타 반환받은후 메인블록에서출력
		 * 학생 student1 의 학점데이타 반환받은후 메인블록에서출력
		 */
		System.out.println();
		System.out.println("***** 학생 student1 의 이름변경메쏘드호출후 student1학생객체출력 *****");
		std1.setName("이변경");
		std1.headerPrint();
		std1.print();
		
		System.out.println();
		System.out.println("***** 학생 student1 의 총점데이타 반환받은후 메인블록에서출력 *****");
		System.out.printf("이일번 학생의 총점: %d %s\n", std1.getTot(), "점");
		
		System.out.println();
		System.out.println("***** 학생 student1 의 학점데이타 반환받은후 메인블록에서출력 *****");
		System.out.printf("이일번 학생의 학점: %c\n", std1.getGrade());
	}

}