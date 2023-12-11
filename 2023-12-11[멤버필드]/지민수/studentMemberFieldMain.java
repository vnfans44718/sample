package com.itwill01.field;

public class studentMemberFieldMain {

	public static void main(String[] args) {
		/*
		 * 학생객체 2명생성
		 */
		Student stu1, stu2; // stu1,stu2 객체에 저장할 Student클래스타입의 변수 선언
		stu1 = new Student(); // Student클래스라는 설계도에 stu1이라는 객체를 생성
		stu2 = new Student(); // Student클래스라는 설계도에 stu2이라는 객체를 생성
		/*
		 * 학생객체의 기본데이타(번호,이름,국어,영어,수학)대입(2명)
		 */
		// stu1,stu2의 객체에 선언한 멤버필드에 값 대입
		stu1.name = "김경호";
		stu1.number = 1;
		stu1.kor = 78;
		stu1.eng = 96;
		stu1.math = 95;
		stu2.name = "김경수";
		stu2.number = 2;
		stu2.kor = 95;
		stu2.eng = 75;
		stu2.math = 62;
		/*
		 * 학생의 기본데이타를사용해서 총점,평균,평점 계산후 대입(2명)
		 */
		// stu1,stu2의 객체에 선언한 멤버필드에 계산 후 대입

		stu1.tot = stu1.kor + stu1.eng + stu1.math;
		stu2.tot = stu2.kor + stu2.eng + stu2.math;
		stu1.avg = stu1.tot / 3.0;
		stu2.avg = stu2.tot / 3.0;

		if (stu1.avg <= 100 & stu1.avg >= 90) {
			stu1.grade = 'A';
		} else if (stu1.avg < 90 & stu1.avg >= 80) {
			stu1.grade = 'B';
		} else if (stu1.avg < 80 & stu1.avg >= 70) {
			stu1.grade = 'C';
		} else if (stu1.avg < 70 & stu1.avg >= 60) {
			stu1.grade = 'D';
		} else {
			stu1.grade = 'F';
		}

		if (stu2.avg <= 100 & stu2.avg >= 90) {
			stu2.grade = 'A';
		} else if (stu2.avg < 90 & stu2.avg >= 80) {
			stu2.grade = 'B';
		} else if (stu2.avg < 80 & stu2.avg >= 70) {
			stu2.grade = 'C';
		} else if (stu2.avg < 70 & stu2.avg >= 60) {
			stu2.grade = 'D';
		} else {
			stu2.grade = 'F';
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
		System.out.printf("%3d %4s %4d %4d %4d %4d %4.1f %3c %4d%n", stu1.number, stu1.name, stu1.kor, stu1.eng,
				stu1.math, stu1.tot, stu1.avg, stu1.grade, 1);
		System.out.printf("%3d %4s %4d %4d %4d %4d %4.1f %3c %4d%n", stu2.number, stu2.name, stu2.kor, stu2.eng,
				stu2.math, stu2.tot, stu2.avg, stu2.grade, 2);
	}

}
