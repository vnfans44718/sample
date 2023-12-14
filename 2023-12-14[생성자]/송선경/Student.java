package com.itwill02;

public class Student {

	// 멤버변수 선언 (캡슐화)
	private int no;
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int tot;
	private double avg;
	private char grade;
	private int rank;

	// 생성자 메소드 선언
	// - 인자 0개짜리 생성자(기본생성자선언)

	public Student() {

	}

	// - 인자 5개짜리(번호 이름 국어 영어 수학) 생성자선언
	public Student(int no, String name, int kor, int eng, int math) {
		this.no = no;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;

	}

	// 학생기본정보 입력 메소드
	public void setData(int no, String name, int kor, int eng, int math) {
		this.no = no;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

// 질문. 생성자도 메소드처럼 가져다 쓸 수 있는지? 
	/*
	 * 총점계산메쏘드
	 */
	public void calculateTotal() {
		this.tot = this.kor + this.eng + this.math;
	}

	/*
	 * 평균계산메쏘드
	 */
	public void calculateAvg() {

		this.avg = (((int) ((this.tot / 3.0) * 100.0)) / 100.0);
	}

	/*
	 * 평점계산메쏘드
	 */
	public void calculateGrade() {
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

	/*
	 * header출력메쏘드
	 */
	public void headerPrint() {
		System.out.printf("---------------학생 성적출력-------------------%n");
		System.out.printf("%s %s %s %s %s %s %3s %s %s%n", "학번", "이름", "국어", "영어", "수학", "총점", "평균", "평점", "석차");
		System.out.printf("-----------------------------------------------%n");

	}

	/*
	 * 학생정보출력메쏘드
	 */
	public void print() {
		System.out.printf("%3d %5s %4d %4d %4d %4d %5.1f %3c %4d%n", this.no, this.name, this.kor, this.eng, this.math,
				this.tot, this.avg, this.grade, this.rank);
	}

	// setter, getter 메소드
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

}