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

	public void insert(int no, String name, int kor, int eng, int math) {
		this.no = no;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;

	}

	public void calTotal() {
		this.tot = this.kor + this.eng + this.math;

	}

	public void calAvg() {
		avg = tot / 3.0;

	}

	public void calGrade() {
		grade = 'F';
		if (avg <= 100 && avg >= 0) {
			if (avg >= 90) {
				grade = 'A';
			} else if (avg >= 80) {
				grade = 'B';
			} else if (avg >= 70) {
				grade = 'C';
			} else if (avg >= 60) {
				grade = 'D';
			} else {
				grade = 'F';
			}
		}

	}

	public void print() {
		
		System.out.println("-----------------------------------------------");
		System.out.printf("%d   %s   %d   %d   %d   %d   %.1f   %c  0\n", no, name, kor, eng, math, tot, avg,
				grade);
		System.out.printf("%d   %s   %d   %d   %d   %d   %.1f   %c  0\n", no, name, kor, eng, math, tot, avg,
				grade);
		System.out.println("-----------------------------------------------");
		
	}

	public void printHeader() {
		System.out.println("-------------------학생 성적출력--------------------");
		System.out.println("학번  이름   국어   영어   수학   총점   평균   평점   석차");
		
	}

}