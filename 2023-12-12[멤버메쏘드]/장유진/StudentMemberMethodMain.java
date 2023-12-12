package com.itwill01.method;

public class StudentMemberMethodMain {
	public static void main(String[] args) {
		/*
		학생객체생성(3명)
		*/
		Student student1 = new Student();
		Student student2 = new Student();
		Student student3 = new Student();
		
		/*
		 학생객체기본데이타(번호, 이름, 국어, 영어, 수학) 입력메쏘드호출(3명)
		 */
		student1.dataInput(1, "장유진", 92, 84, 95);
		student2.dataInput(2, "장우진", 88, 90, 70);
		student3.dataInput(3, "장서진", 76, 74, 83);
		
		/*
		 학생총점계산 메쏘드 호출(3명)
		 학생평균계산 메쏘드 호출(3명)
		 학생평점계산 메쏘드 호출(3명)
		 */
		student1.calTot();
		student2.calTot();
		student3.calTot();
		
		student1.calAvg();
		student2.calAvg();
		student3.calAvg();
		
		student1.calGrade();
		student2.calGrade();
		student3.calGrade();
		
		/*
		 * 학생데이타 출력메쏘드 호출(3명)
		 */
		
		student1.dataOutput();
		student2.dataOutput();
		student3.dataOutput();
		
		}
}
