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
		student2 = new Student();

		student1.no = 1;
		student1.name = "유학렬";
		student1.kor = 78;
		student1.eng = 62;
		student1.math = 53;
		student1.rank = 1;

		student2.no = 2;
		student2.name = "렬학유";
		student2.kor = 40;
		student2.eng = 42;
		student2.math = 68;
		student2.rank = 2;

		/*
		 * 학생의 기본데이타를사용해서 총점,평균,평점 계산후 대입(2명)
		 */

		student1.tot = student1.kor + student1.eng + student1.math;
		student1.avg = student1.tot / 3.0;
		student1.grade = 'F';

		if (student1.avg >= 90 && student1.avg <= 100) {
			student1.grade = 'A';
		} else if (student1.avg >= 80 && student1.avg < 89) {
			student1.grade = 'B';
		} else if (student1.avg >= 70 && student1.avg < 79) {
			student1.grade = 'C';
		} else if (student1.avg >= 60 && student1.avg < 69) {
			student1.grade = 'D';
		} else {
			student1.grade = 'F';
		}

		student2.tot = student2.kor + student2.eng + student2.math;
		student2.avg = student2.tot / 3.0;
		student2.grade = 'F';

		if (student2.avg >= 90 && student2.avg <= 100) {
			student2.grade = 'A';
		} else if (student2.avg >= 80 && student2.avg < 89) {
			student2.grade = 'B';
		} else if (student2.avg >= 70 && student2.avg < 79) {
			student2.grade = 'C';
		} else if (student2.avg >= 60 && student2.avg < 69) {
			student2.grade = 'D';
		} else {
			student2.grade = 'F';
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
		System.out.printf("--------------학생 성적출력-------------------%n");
		System.out.printf("%s %3s %3s %s %s %s %s %s %s%n", "학번", "이름", "국어", "영어", "수학", "총점", "평균", "평점", "석차");
		System.out.printf("-----------------------------------------------%n");
		System.out.printf("%3d %4s %4d %4d %4d %4d %4.1f %3c %4d%n", student1.no, student1.name, student1.kor,
				student1.eng, student1.math, student1.tot, student1.avg, student1.grade, student1.rank);
		System.out.printf("%3d %4s %4d %4d %4d %4d %4.1f %3c %4d%n", student2.no, student2.name, student2.kor,
				student2.eng, student2.math, student2.tot, student2.avg, student2.grade, student2.rank);
	}

}