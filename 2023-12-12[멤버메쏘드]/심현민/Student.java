package com.itwill01.method;

public class Student {
	int no;
	String name;
	int kor;
	int eng;
	int math;
	int tot;
	double avg;
	char grade;
	int rank;

	public void no1(int no) {
		this.no = no;
	}

	public void name1(String name) {
		this.name = name;
	}

	public void kor1(int kor) {
		this.kor = kor;
	}

	public void eng1(int eng) {
		this.eng = eng;
	}

	public void math1(int math) {
		this.math = math;
	}

	public void total1() {
		this.tot = (this.kor + this.eng + this.math);
	}

	public void avg1() {
		this.avg = this.tot / 3;
	}

	public void grade() {

		if (this.avg >= 90 && this.avg <= 100) {
			this.grade = 'A';
		} else if (this.avg >= 80) {
			this.grade = 'B';
		} else if (this.avg >= 70) {
			this.grade = 'C';
		} else if (this.avg >= 60) {
			this.grade = 'D';
		} else {
			this.grade = 'F';
		}

	}

	

	public void mainPrint() {
		System.out.printf("%2d %4s %3d %3d %3d %3d  %.1f %c  %d\n", no, name, kor, eng, math, tot, avg, grade, rank);
		System.out.printf("-----------------------------------------------\n");
	}
	public void print() {
		System.out.printf("--------------학생 성적출력-------------------\n");
		System.out.printf("%s %3s %3s %s %s %s  %s  %s  %s\n", "번호", "이름", "국어", "영어", "수학", "총점", "평균", "평점", "석차");
		System.out.printf("-----------------------------------------------\n");

	}
}