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

	public void tot(int kor, int eng, int math) {
		this.tot = kor + eng + math;
	}

	public void avg(int tot) {
		this.avg = this.tot / 3.0;
	}

	public void grade(double avg) {
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

	public void hearderPrint() {
		System.out.println("----------------------학생 성적 출력-------------------------");
		System.out.println("학번  이름   국어 영어 수학 총점 평균 평점 석차");
	}

	public void print() {

		System.out.printf("%2d %5s %4d %4d %4d %4d %5.1f %3s %4d \n", this.no, this.name, this.kor, this.eng, this.math,
				this.tot, this.avg, this.grade, this.rank);

	}
}
