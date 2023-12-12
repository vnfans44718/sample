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

	public void data(int no, String name, int kor, int eng, int math) {
		this.no = no;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	public void tot(int tot) {
		this.tot = kor + eng + math;

	}

	public void avg() {

		this.avg = tot / 3.0;
	}

	public void grade() {

		if (this.avg >= 90) {
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

	public void headerprint() {
		System.out.printf("--------------학생 성적출력-------------------%n");
		System.out.printf("%s %3s %3s %s %s %s %s %s %s%n", "학번", "이름", "국어", "영어", "수학", "총점", "평균", "평점", "석차");
		System.out.printf("-----------------------------------------------%n");
	}

	public void print() {
		System.out.printf("%3d %4s %4d %4d %4d %4d %4.1f %3c %4d%n", no, name, kor, eng, math, tot, avg, grade, rank);
	}
}
