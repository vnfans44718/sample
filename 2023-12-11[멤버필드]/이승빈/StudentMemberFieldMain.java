package com.itwill00.Field;

public class StudentMemberFieldMain {

	public static void main(String[] args) {
		/*
		 * 학생객체 2명생성
		 */
		Student std1;	// 학생1 객체 생성
		Student std2;	// 학생2 객체 생성
		/*
		 * 학생객체의 기본데이타(번호,이름,국어,영어,수학)대입(2명)
		 */
		std1 = new Student();	// Student 클래스를 사용하여 학생객체를 생성 후 학생1의 기본데이타를 std1 변수에 대입
		std1.no = 1;
		std1.name = "이피자";
		std1.kor = 56;
		std1.eng = 74;
		std1.math = 88;

		std2 = new Student();	// Student 클래스를 사용하여 학생객체를 생성 후 학생2의 기본데이타를 std2 변수에 대입
		std2.no = 2;
		std2.name = "박버거";
		std2.kor = 63;
		std2.eng = 92;
		std2.math = 41;
		/*
		 * 학생의 기본데이타를사용해서 총점,평균,평점 계산후 대입(2명)
		 */
		std1.tot = std1.kor + std1.eng + std1.math;
		std1.avg = std1.tot / 3.0;
		std1.grade = 'F';
		if (std1.avg >= 90 && std1.avg <= 100) {
			std1.grade = 'A';
		} else if (std1.avg >= 80 && std1.avg < 90) {
			std1.grade = 'B';
		} else if (std1.avg >= 70 && std1.avg < 80) {
			std1.grade = 'C';
		} else if (std1.avg >= 60 && std1.avg < 70) {
			std1.grade = 'D';
		} else {
			std1.grade = 'F';
		}
		std1.rank = 0;
		
		std2.tot = std2.kor + std2.eng + std2.math;
		std2.avg = std2.tot / 3.0;
		std2.grade = 'F';
		if (std2.avg >= 90 && std2.avg <= 100) {
			std2.grade = 'A';
		} else if (std2.avg >= 80 && std2.avg < 90) {
			std2.grade = 'B';
		} else if (std2.avg >= 70 && std2.avg < 80) {
			std2.grade = 'C';
		} else if (std2.avg >= 60 && std2.avg < 70) {
			std2.grade = 'D';
		} else {
			std2.grade = 'F';
		}
		std2.rank = 0;
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
		System.out.printf("--------------학생 성적출력--------------------\n");
		System.out.printf("%s %3s %3s %s %s %s %s %s %s%n", "학번", "이름", "국어", "영어", "수학", "총점", "평균", "평점", "석차");
		System.out.printf("-----------------------------------------------\n");
		System.out.printf("%3d %4s %4d %4d %4d %4d %4.1f %3c %4d\n", std1.no, std1.name, std1.kor, std1.eng, std1.math, std1.tot, std1.avg, std1.grade, std1.rank);
		System.out.printf("%3d %4s %4d %4d %4d %4d %4.1f %3c %4d\n", std2.no, std2.name, std2.kor, std2.eng, std2.math, std2.tot, std2.avg, std2.grade, std2.rank);

	}

}
