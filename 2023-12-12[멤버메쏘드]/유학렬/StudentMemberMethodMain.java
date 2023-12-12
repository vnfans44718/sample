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
		 학생객체기본데이타(번호, 이름, 국어, 영어, 수학) 대입메쏘드호출(3명)
		 */
		
		student1.setBasic(1, "유학렬", 50, 75, 67);
		student2.setBasic(2, "유렬학", 92, 92, 88);
		student3.setBasic(3, "렬학유", 73, 25, 15);
		
		
		/*
		 학생총점,평균,평점 계산 메쏘드 호출(3명)
		 */
		
		student1.setTot();
		student2.setTot();
		student3.setTot();
		
		student1.setAvg();
		student2.setAvg();
		student3.setAvg();
		
		student1.setGrade();
		student2.setGrade();
		student3.setGrade();
		
		/*
		 * 학생데이타 출력메쏘드 호출(3명)
		 */
		
		student1.headerPrint();
		student1.print();
		student2.print();
		student3.print();
		
		/*
		- 출력포맷
 		- 평균은 소수점이하 첫째자리까지출력(반올림)
 		- 석차는 구하지마세요
		--------------학생 성적출력-------------------
		학번  이름   국어 영어 수학 총점 평균 평점 석차
		-----------------------------------------------
		 1   김경호   42   56   78   334  34.8  A   3  
		 2   김경수   45   53   76   334  34.8  A   2  
		-----------------------------------------------
		*/
		
		
	}

}