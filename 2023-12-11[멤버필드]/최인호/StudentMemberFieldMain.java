package com.itwill01.field;

public class StudentMemberFieldMain {

	public static void main(String[] args) {

		Student st1 = new Student();
		Student st2 = new Student();

		st1.no = 1;
		st1.name = "최인호";
		st1.kor = 90;
		st1.eng = 88;
		st1.math = 95;
		
		st2.no = 2;
		st2.name = "박필하";
		st2.kor = 100;
		st2.eng = 65;
		st2.math = 85;
		
		st1.tot = st1.kor+st1.eng+st1.math;
		st2.tot = st2.kor+st2.eng+st2.math;
		
		st1.avg = st1.tot/3.0;
		st2.avg = st2.tot/3.0;
		
		if(st1.avg>=0 && st1.avg<=100) {
			if(st1.avg >= 90) {
				st1.grade = 'A';
			} else if(st1.avg >= 80) {
				st1.grade = 'B';
			} else if(st1.avg >= 70) {
				st1.grade = 'C';
			} else if(st1.avg >= 60) {
				st1.grade = 'D';
			} else {
				st1.grade = 'F';
			}
		}
		if(st2.avg>=0 && st2.avg<=100) {
			if(st2.avg >= 90) {
				st2.grade = 'A';
			} else if(st2.avg >= 80) {
				st2.grade = 'B';
			} else if(st2.avg >= 70) {
				st2.grade = 'C';
			} else if(st2.avg >= 60) {
				st2.grade = 'D';
			} else {
				st2.grade = 'F';
			}
		}

		System.out.printf("--------------학생 성적출력-------------------%n");
			System.out.printf("%s %3s %3s %s %s %s %s %s %s%n","학번","이름","국어", "영어","수학","총점","평균","평점","석차");
			System.out.printf("-----------------------------------------------%n");
			System.out.printf("%3d %4s %4d %4d %4d %4d %4.1f %3c %4d%n"
					,st1.no,st1.name,st1.kor,st1.eng,st1.math,st1.tot,st1.avg,st1.grade,1);
			System.out.printf("%3d %4s %4d %4d %4d %4d %4.1f %3c %4d%n"
					,st2.no,st2.name,st2.kor,st2.eng,st2.math,st2.tot,st2.avg,st2.grade,1);
	}

}