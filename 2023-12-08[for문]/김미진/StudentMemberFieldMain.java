package com.itwill01.field;

public class StudentMemberFieldMain {
	public static void main(String[] args) {
		/*
		 * 학생객체 2명생성
		 */
		Student student1;
		student1 = new Student();

		Student student2;
		student2 = new Student();

		/*
		 * 학생객체의 기본데이타(번호,이름,국어,영어,수학)대입(2명)
		 */
		student1.no1 = 1;
		student1.name1 = "김미진";
		student1.kor1 = 98;
		student1.eng1 = 84;
		student1.math1 = 76;

		student2.no2 = 2;
		student2.name2 = "김경희";
		student2.kor2 = 85;
		student2.eng2 = 97;
		student2.math2 = 80;

		/*
		 * 학생의 기본데이타를사용해서 총점,평균,평점 계산후 대입(2명)
		 */

		student1.tot1 = student1.kor1 + student1.eng1 + student1.math1;
		student1.avg1 = student1.tot1 / 3;

		student1.grade1 = 'F';
		if (student1.avg1 >= 90 && student1.avg1 <= 100) {
			student1.grade1 = 'A';
		} else if (student1.avg1 >= 80 && student1.avg1 < 89) {
			student1.grade1 = 'B';
		} else if (student1.avg1 >= 70 && student1.avg1 < 79) {
			student1.grade1 = 'C';
		} else if (student1.avg1 >= 60 && student1.avg1 < 69) {
			student1.grade1 = 'D';
		} else {
			student1.grade1 = 'F';
		}

		student2.tot2 = student2.kor2 + student2.eng2 + student2.math2;
		student2.avg2 = student2.tot2 / 3;

		student2.grade2 = 'F';
		if (student2.avg2 >= 90 && student2.avg2 <= 100) {
			student2.grade2 = 'A';
		} else if (student2.avg2 >= 80 && student2.avg2 < 89) {
			student2.grade2 = 'B';
		} else if (student2.avg2 >= 70 && student2.avg2 < 79) {
			student2.grade2 = 'C';
		} else if (student2.avg2 >= 60 && student2.avg2 < 69) {
			student2.grade2 = 'D';
		} else {
			student2.grade2 = 'F';
		}

		student1.rank1 = 0;
		student2.rank2 = 0;

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
		System.out.printf("%3d %4s %4d %4d %4d %4d %4.1f %3c %4d%n", student1.no1, student1.name1, student1.kor1,
				student1.eng1, student1.math1, student1.tot1, student1.avg1, student1.grade1, student1.rank1);
		System.out.printf("%3d %4s %4d %4d %4d %4d %4.1f %3c %4d%n", student2.no2, student2.name2, student2.kor2,
				student2.eng2, student2.math2, student2.tot2, student2.avg2, student2.grade2, student2.rank2);
	}
}