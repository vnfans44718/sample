package com.itwill01.field;

public class StudentMemberFieldMain {

	public static void main(String[] args) {
		/*
		 * 학생객체 2명생성
		 */
		Student student1;
		Student student2;
		
		/*
		 * 학생객체의 기본데이타(번호,이름,국어,영어,수학)대입(2명)
		 */
		student1 = new Student();
		student1.no = "1";
		student1.name = "남다연";
		student1.kor = 95;
		student1.eng = 97;
		student1.math = 80;
		student1.rank = 1;
		
		student2 = new Student();
		student2.no = "2";
		student2.name = "최예나";
		student2.kor = 88;
		student2.eng = 80;
		student2.math = 96;
		student2.rank = 2;

		/*
		 * 학생의 기본데이타를사용해서 총점,평균,평점 계산후 대입(2명)
		 */
		student1.sum = student1.kor+student1.eng+student1.math;
		student1.avg = student1.sum/3.0;
		
		student2.sum = student2.kor+student2.eng+student2.math;
		student2.avg = student2.sum/3.0;
		
		if(student1.avg>=90) {
			student1.score ='A';
		}else if(student1.avg>=80) {
			student1.score = 'B';
		}else if(student1.avg>=70) {
			student1.score = 'C';
		}else if(student1.avg>=60) {
			student1.score = 'D';
		}else {
			student1.score = 'F';
		}
		
		if(student2.avg>=90) {
			student2.score ='A';
		}else if(student2.avg>=80) {
			student2.score = 'B';
		}else if(student2.avg>=70) {
			student2.score = 'C';
		}else if(student2.avg>=60) {
			student2.score = 'D';
		}else {
			student2.score = 'F';
		}
			
		/*
		 * 학생 데이타를 출력 2명
		 */
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
		System.out.printf("-------------------학생 성적 출력--------------------\n");
		System.out.printf("%s %6s %s %s %s %4s %4s %2s %s \n",
				"학번","이름","국어","영어","수학","총점","평균","평점","석차");
		System.out.printf("-----------------------------------------------------\n");
		System.out.printf("%4s %5s %4d %4d %4d %6d %6.1f %4c %4d \n",
				student1.no,student1.name,student1.kor,student1.eng,student1.math,student1.sum,student1.avg,student1.score,student1.rank);
		System.out.printf("%4s %5s %4d %4d %4d %6d %6.1f %4c %4d \n",
				student2.no,student2.name,student2.kor,student2.eng,student2.math,student2.sum,student2.avg,student2.score,student2.rank);
	}
}
