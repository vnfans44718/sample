package com.itwill01.field;

public class StudentMemberFieldMain {

	public static void main(String[] args) {
		Student student1 = new Student();
		Student student2 = new Student();

		student1.num = 1;
		student1.name = "김경호";
		student1.kor = 42;
		student1.eng = 56;
		student1.math = 78;
		student1.tot = student1.kor + student1.eng + student1.math;
		student1.avg = student1.tot / 3.0;

		student2.num = 2;
		student2.name = "김경수";
		student2.kor = 45;
		student2.eng = 53;
		student2.math = 76;
		student2.tot = student2.kor + student2.eng + student2.math;
		student2.avg = student2.tot / 3.0;

		if (student1.tot > student2.tot) {
			student1.rank = 1;
			student2.rank = 2;
		} else {
			student1.rank = 2;
			student2.rank = 1;
		}

		if (student1.avg >= 90) {
			student1.grade = 'A';
		} else if (student1.avg >= 80) {
			student1.grade = 'B';
		} else if (student1.avg >= 70) {
			student1.grade = 'C';
		} else if (student1.avg >= 60) {
			student1.grade = 'D';
		} else {
			student1.grade = 'F';
		}

		if (student2.avg >= 90) {
			student2.grade = 'A';
		} else if (student2.avg >= 80) {
			student2.grade = 'B';
		} else if (student2.avg >= 70) {
			student2.grade = 'C';
		} else if (student2.avg >= 60) {
			student2.grade = 'D';
		} else {
			student2.grade = 'F';
		}

		int[] score = { student1.kor, student1.eng, student1.math, student2.kor, student2.eng, student2.math };

		for (int i = 0; i < score.length; i++) {
			int validation = score[i];
			if (validation < 0 || validation > 100) {
				System.out.println("유효하지 않는 점수입니다.");
				return;
			}
		}

		System.out.println("----------------------학생 성적 출력-------------------------");
		System.out.println("학번  이름   국어 영어 수학 총점 평균 평점 석차");
		System.out.printf("%2d %5s %4d %4d %4d %4d %5.1f %3s %4d \n", student1.num, student1.name, student1.kor,
				student1.eng, student1.math, student1.tot, student1.avg, student1.grade, student1.rank);
		System.out.printf("%2d %5s %4d %4d %4d %4d %5.1f %3s %4d \n", student2.num, student2.name, student2.kor,
				student2.eng, student2.math, student2.tot, student2.avg, student2.grade, student2.rank);

	}

}
