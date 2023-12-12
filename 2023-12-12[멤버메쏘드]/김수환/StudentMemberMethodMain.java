package com.itwill01.method;



public class StudentMemberMethodMain {

	public static void main(String[] args) {
		/*
		학생객체생성(3명)
		 */
		Student stu1=new Student();
		Student stu2=new Student();
		Student stu3=new Student();
		
		
		/*
		 학생객체기본데이타(번호, 이름, 국어, 영어, 수학) 대입메쏘드호출(3명)
		 */
		stu1.basicData(1, "김수환", 30, 80, 70);
		stu2.basicData(2, "김우환", 50, 30, 20);
		stu3.basicData(3, "김미환", 99, 99, 80);
		
		/*
		 학생총점,평균,평점 계산 메쏘드 호출(3명)
		 */
		stu1.totData();
		stu1.avgData();
		stu1.gradeData();
		stu2.totData();
		stu2.avgData();
		stu2.gradeData();
		stu3.totData();
		stu3.avgData();
		stu3.gradeData();
		
		/*
		 * 학생데이타 출력메쏘드 호출(3명)
		 */
		stu1.headPrint();
		stu1.print();
		stu2.print();
		stu3.print();
		
		
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