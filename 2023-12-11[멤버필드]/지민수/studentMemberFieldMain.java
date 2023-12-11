package com.itwill01.field;

public class studentMemberFieldMain {

	public static void main(String[] args) {
		/*
		 * 학생객체 2명생성
		 */
		Student stu1, stu2;
		stu1 = new Student();
		stu2 = new Student();
		/*
		 * 학생객체의 기본데이타(번호,이름,국어,영어,수학)대입(2명)
		 */
		stu1.name1 = "김경호";
		stu1.number1 = 1;
		stu1.kor1 = 78;
		stu1.eng1 = 96;
		stu1.math1 = 95;
		stu2.name2 = "김경수";
		stu2.number2 = 2;
		stu2.kor2 = 95;
		stu2.eng2 = 75;
		stu2.math2 = 62;
		/*
		 * 학생의 기본데이타를사용해서 총점,평균,평점 계산후 대입(2명)
		 */
		stu1.tot1 = stu1.kor1 + stu1.eng1 + stu1.math1;
		stu2.tot2 = stu2.kor2 + stu2.eng2 + stu2.math2;
		stu1.avg1 = stu1.tot1 / 3.0;
		stu2.avg2 = stu2.tot2 / 3.0;

		if (stu1.avg1 <= 100 & stu1.avg1 >= 90) {
			stu1.grade1 = 'A';
		} else if (stu1.avg1 < 90 & stu1.avg1 >= 80) {
			stu1.grade1 = 'B';
		} else if (stu1.avg1 < 80 & stu1.avg1 >= 70) {
			stu1.grade1 = 'C';
		} else if (stu1.avg1 < 70 & stu1.avg1 >= 60) {
			stu1.grade1 = 'D';
		} else {
			stu1.grade1 = 'F';
		}

		if (stu2.avg2 <= 100 & stu2.avg2 >= 90) {
			stu2.grade2 = 'A';
		} else if (stu2.avg2 < 90 & stu2.avg2 >= 80) {
			stu2.grade2 = 'B';
		} else if (stu2.avg2 < 80 & stu2.avg2 >= 70) {
			stu2.grade2 = 'C';
		} else if (stu2.avg2 < 70 & stu2.avg2 >= 60) {
			stu2.grade2 = 'D';
		} else {
			stu2.grade2 = 'F';
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
		System.out.printf("%3d %4s %4d %4d %4d %4d %4.1f %3c %4d%n", stu1.number1, stu1.name1, stu1.kor1, stu1.eng1,
				stu1.math1, stu1.tot1, stu1.avg1, stu1.grade1, 1);
		System.out.printf("%3d %4s %4d %4d %4d %4d %4.1f %3c %4d%n", stu2.number2, stu2.name2, stu2.kor2, stu2.eng2,
				stu2.math2, stu2.tot2, stu2.avg2, stu2.grade2, 2);
	}

}
