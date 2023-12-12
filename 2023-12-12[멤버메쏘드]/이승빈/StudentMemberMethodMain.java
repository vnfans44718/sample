package com.itwill01.method;

public class StudentMemberMethodMain {
	public static void main(String[] args) {
		/*
		학생객체생성(3명)
		*/
		Student std1 = new Student();
		Student std2 = new Student();
		Student std3 = new Student();
		/*
		 학생객체기본데이타(번호, 이름, 국어, 영어, 수학) 입력메쏘드호출(3명)
		 */
		std1.setBasicData(1, "김감자", 91, 86, 93);
		std2.setBasicData(2, "이당근", 57, 92, 85);
		std3.setBasicData(3, "고구마", 84, 73, 90);
		/*
		 학생총점계산 메쏘드 호출(3명)
		 학생평균계산 메쏘드 호출(3명)
		 학생평점계산 메쏘드 호출(3명)
		 */
		std1.calculateTot();
		std1.calculateAvg();
		std1.calculateGrade();
		
		std2.calculateTot();
		std2.calculateAvg();
		std2.calculateGrade();
		
		std3.calculateTot();
		std3.calculateAvg();
		std3.calculateGrade();
		/*
		 * 학생데이타 출력메쏘드 호출(3명)
		 */
		std1.headerPrint();
		std1.studentInfoPrint();
		std2.studentInfoPrint();
		std3.studentInfoPrint();
	}
}