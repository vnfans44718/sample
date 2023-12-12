package com.itwill01.MemberMethod;

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

	public void studentInfo(int no, String name, int kor, int eng, int math) {
		this.no = no;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		if ((kor < 0 || kor > 100) || (eng < 0 || eng > 100) || (math < 0 || math > 100)) {
			System.out.println("점수가 유효하지 않습니다.");
			return;
		}
	}

	public void total(int kor, int eng, int math) {
		this.tot = kor + eng + math;
	}

	public void average(int kor, int eng, int math) {
		this.avg = (kor + eng + math) / 3;
	}

	public void grade(int kor, int eng, int math) {
		if ((kor + eng + math) / 3 >= 90) {
			this.grade = 'A';
		} else if ((kor + eng + math) / 3 >= 80) {
			this.grade = 'B';
		} else if ((kor + eng + math) / 3 >= 70) {
			this.grade = 'C';
		} else if ((kor + eng + math) / 3 >= 60) {
			this.grade = 'D';
		} else {
			this.grade = 'F';
		}
	}

	public void headerPrint() {
		System.out.printf("--------------학생 성적출력-------------------%n");
		System.out.printf("%s %3s %3s %s %s %s %s %s %s%n", "학번", "이름", "국어", "영어", "수학", "총점", "평균", "평점", "석차");
		System.out.printf("-----------------------------------------------%n");
	}

	public void print() {
		System.out.printf("%3d %4s %4d %4d %4d %4d %4.1f %3c %4d%n", this.no, this.name, this.kor, this.eng, this.math,
				this.tot, this.avg, this.grade, this.rank);
	}

}
