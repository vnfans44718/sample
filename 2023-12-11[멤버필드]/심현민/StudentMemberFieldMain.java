package com.itwill01.field;

public class StudentMemberFieldMain {

	public static void main(String[] args) {
		Student studentMember1 = new Student();
		Student studentMember2 = new Student();

		studentMember1.num = 1;
		studentMember2.num = 2;
		studentMember1.name = "가나다";
		studentMember2.name = "라마바";
		studentMember1.kor = 90;
		studentMember2.kor = 70;
		studentMember1.math = 80;
		studentMember2.math = 90;
		studentMember1.eng = 90;
		studentMember2.eng = 30;
		
		if (studentMember1.kor > 100 || studentMember1.math > 100 || studentMember1.eng > 100) {
			System.out.println("100점을 초과 할 수 없습니다");
			return;
		}
		studentMember1.total = studentMember1.kor + studentMember1.math + studentMember1.eng;
		studentMember2.total = studentMember2.kor + studentMember2.math + studentMember2.eng;
		studentMember1.avg = (studentMember1.kor + studentMember1.math+ studentMember1.eng) / 3;
		studentMember2.avg = (studentMember2.kor + studentMember2.math + studentMember2.eng) / 3;

		if (studentMember1.avg >= 90) {
			studentMember1.grade = 'A';
		} else if (studentMember1.avg >= 80) {
			studentMember1.grade = 'B';
		} else if (studentMember1.avg >= 70) {
			studentMember1.grade = 'C';
		} else if (studentMember1.avg >= 60) {
			studentMember1.grade = 'D';
		} else {
			studentMember1.grade = 'F';
		}

		if (studentMember2.avg >= 90) {
			studentMember2.grade = 'A';
		} else if (studentMember2.avg >= 80) {
			studentMember2.grade = 'B';
		} else if (studentMember2.avg >= 70) {
			studentMember2.grade = 'C';
		} else if (studentMember2.avg >= 60) {
			studentMember2.grade = 'D';
		} else {
			studentMember2.grade = 'F';
		}

		System.out.printf("--------------학생 성적출력-------------------\n");
		System.out.printf("%s %3s %3s %s %s %s %s %s %s%n", "학번", "이름", "국어", "영어", "수학", "총점", "평균", "평점", "석차");
		System.out.printf("-----------------------------------------------\n");
		System.out.printf("%d %4s %4d %5d %5d %5d %5.1f %3s  3\n", studentMember1.num, studentMember1.name,
				studentMember1.kor, studentMember1.math, studentMember1.eng, studentMember1.total, studentMember1.avg,
				studentMember1.grade);
		System.out.printf("%d %4s %4d %5d %5d %5d %5.1f %3s  2\n", studentMember2.num, studentMember2.name,
				studentMember2.kor, studentMember2.math, studentMember2.eng, studentMember2.total, studentMember2.avg,
				studentMember2.grade);
		System.out.print("-----------------------------------------------");

	}

}
