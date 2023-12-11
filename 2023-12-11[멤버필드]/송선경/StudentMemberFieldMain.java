package com.itwill00.variable;

public class StudentMemberFieldMain {

	public static void main(String[] args) {

		// 학생 객체 2명 생성 /
		Student student1;
		Student student2;
		student1 = new Student();
		student2 = new Student();

		// 학생 객체의 기본 데이터

		// 학생1
		student1.no1 = 1; // 번호
		student1.name1 = "김경호"; // 이름
		student1.kor1 = 42; // 국어
		student1.eng1 = 56; // 영어
		student1.math1 = 78; // 수학
		student1.rank1 = 3;

		// 학생2
		student2.no2 = 2; // 번호
		student2.name2 = "김경수"; // 이름
		student2.kor2 = 45; // 국어
		student2.eng2 = 53; // 영어
		student2.math2 = 76; // 수학
		student2.rank2 = 3;

		// 학생의 기본 데이터를 사용해서 총점, 평균, 평점 계산 후 대입

		// 학생1
		// 1-1. 총점
		student1.tot1 = (student1.kor1 + student1.eng1 + student1.math1);
		// 1-2. 평균
		student1.avg1 = (student1.kor1 + student1.eng1 + student1.math1) / 3;
		// 1-3. 평점
		student1.grade1 = 'F'; // 평점 구하는 것도 총점 구하는 것과 동일
								// 초기값 세팅 동일하게

		if (student1.avg1 >= 90) {
			student1.grade1 = 'A';
		} else if (student1.avg1 >= 80) {
			student1.grade1 = 'B';
		} else if (student1.avg1 >= 70) {
			student1.grade1 = 'C';
		} else if (student1.avg1 >= 60) {
			student1.grade1 = 'D';
		} else {
			student1.grade1 = 'E';
		}

		// 학생2
		// 1-1. 총점
		student2.tot2 = (student2.kor2 + student2.eng2 + student2.math2);
		// 1-2. 평균
		student2.avg2 = (student2.kor2 + student2.eng2 + student2.math2) / 3;
		// 1-3. 평점
		student2.grade2 = 'F';

		if (student2.avg2 >= 90) {
			student2.grade2 = 'A';
		} else if (student2.avg2 >= 80) {
			student2.grade2 = 'B';
		} else if (student2.avg2 >= 70) {
			student2.grade2 = 'C';
		} else if (student2.avg2 >= 60) {
			student2.grade2 = 'D';
		} else {
			student2.grade2 = 'E';
		}

		System.out.printf("--------------학생 성적출력-------------------%n");
		System.out.printf("%s %3s %3s %s %s %s %s %s %s%n", "학번", "이름", "국어", "영어", "수학", "총점", "평균", "평점","석차");
		System.out.printf("-----------------------------------------------%n");
		System.out.printf("%3d %4s %4d %4d %4d %4f %4.1f %3c %4d%n", student1.no1, student1.name1, student1.kor1,
				student1.eng1, student1.math1, student1.tot1, student1.avg1, student1.grade1, student1.rank1);
		System.out.printf("%3d %4s %4d %4d %4d %4f %4.1f %3c %4d%n", student2.no2, student2.name2, student2.kor2,
				student2.eng2, student2.math2, student2.tot2, student2.avg2, student2.grade2, student2.rank2);

		/*
		 * car1.no ="1234"; // 차 객체(car1)의 멤버필드 
		car1.inTime=12; 
		 */

	}

}
