package com.itwill02.constructor;

public class Student {

	private int no;
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int tot;
	private double avg;
	private char grade;
	private int rank;

	public Student() {

	}

	public Student(int no, String name, int kor, int eng, int math) {
		this.no = no;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	public void setStudent(int no, String name, int kor, int eng, int math) {
		this.no = no;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	public void calculateTotal(int kor, int eng, int math) {
		this.tot = this.kor + this.eng + this.math;
	}

	public void calculateAvg(int tot) {

		this.avg = (((int) ((this.tot / 3.0) * 100.0)) / 100.0);
	}

	public void calculateGrade(double avg) {
		if (this.avg >= 90)
			this.grade = 'A';
		else if (this.avg < 90 && this.avg >= 80)
			this.grade = 'B';
		else if (this.avg < 80 && this.avg >= 70)
			this.grade = 'C';
		else if (this.avg < 70 && this.avg >= 60)
			this.grade = 'D';
		else
			this.grade = 'F';
	}

	public void headerPrint() {
		System.out.printf("---------------학생 성적출력-------------------------%n");
		System.out.printf("%s  %s  %s  %s  %s  %s  %3s  %s  %s%n", "학번", "이름", "국어", "영어", "수학", "총점", "평균", "평점",
				"석차");
		System.out.printf("-----------------------------------------------------%n");

	}

	public void print() {
		System.out.printf("%3d %4s %4d %5d %5d %5d %6.1f %4c %5d%n", this.no, this.name, this.kor, this.eng, this.math,
				this.tot, this.avg, this.grade, this.rank);
	}

	public int getNo() {
		return no;
	}

	public void setNo() {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getTot() {
		return tot;
	}

	public void setTot(int tot) {
		this.tot = tot;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	public char getGrade() {
		return grade;
	}

	public void setGrade(char grade) {
		this.grade = grade;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

}
