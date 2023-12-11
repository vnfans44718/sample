package com.itwill01.field;						//패키지 이름

public class StudentMemberFieldMain {			//접근제한자 타입, class 이름

	public static void main(String[] args) {	//접근제한자, 메인 메소드 선언, 호출

		/*
		 * 학생객체 2명생성
		 */

		Student student1, student2;	//사용자 정의타입의 자료형 클래스, 객체 생성
		student1 = new Student();	//생성된 학생객체에 학생1 데이터를 대입
		student2 = new Student();	//생성된 학생객체에 학생2 데이터를 대입

		/*
		 * 학생객체의 기본데이타(번호,이름,국어,영어,수학)대입(2명)
		 */

		student1.number = 01;		//학생클래스의 학생1넘버 멤버변수에 01 대입
		student2.number = 02;		//학생클래스의 학생2넘버 멤버변수에 02 대입
		student1.name = "김경호";	//학생클래스의 학생1이름 멤버변수에 "김경호" 대입
		student2.name = "김경수";	//학생클래스의 학생2이름 멤버변수에 "김경수" 대입
		student1.kor = 42;			//학생클래스의 학생1국어 멤버변수에 42 대입
		student2.kor = 45;			//학생클래스의 학생2국어 멤버변수에 45 대입
		student1.eng = 56;			//학생클래스의 학생1영어 멤버변수에 56 대입
		student2.eng = 53;			//학생클래스의 학생2영어 멤버변수에 53 대입
		student1.math = 78;		//학생클래스의 학생1수학 멤버변수에 78 대입
		student2.math = 76;		//학생클래스의 학생2수학 멤버변수에 76 대입

		/*
		 * 학생의 기본데이타를사용해서 총점,평균,평점 계산후 대입(2명)
		 */

		student1.tot = student1.kor + student1.eng + student1.math;	//학생클래스의 학생1총점 멤버변수에 국어1+영어1+수학1 대입
		student2.tot = student2.kor + student2.eng + student2.math;	//학생클래스의 학생2총점 멤버변수에 국어2+영어2+수학2 대입
		student1.avg = student1.tot / 3.0;							//학생클래스의 학생1평균 멤버변수에 총점1 대입
		student2.avg = student2.tot / 3.0;							//학생클래스의 학생1평균 멤버변수에 총점2 대입
		student1.grade = 'F';											//학생클래스의 학생1학점 멤버변수에 'F' 대입
		student2.grade = 'F';											//학생클래스의 학생1학점 멤버변수에 'F' 대입
		student1.sukcha = 1;
		student2.sukcha = 2;
		
		if (student1.avg >= 90) {										//조건문 학생클래스의 학생1학점1 멤버변수에 학점 대입하기
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

		if (student2.avg >= 90) {										//조건문 학생클래스의 학생2학점2 멤버변수에 학점 대입하기
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

		/*
		 * 학생 데이타를 출력 2명
		 */

		System.out.printf("--------------학생 성적출력-------------------%n");
		System.out.printf("%s %3s %3s %s %s %s %s %s %s%n", "학번", "이름", "국어", "영어", "수학", "총점", "평균", "평점", "석차");
		System.out.printf("-----------------------------------------------%n");
		System.out.printf("%3d %4s %4d %4d %4d %4d %4.1f %3c %4d%n", student1.number, student1.name, student1.kor,		//객체 학생1의 데이터 호출
				student1.eng, student1.math, student1.tot, student1.avg, student1.grade, student1.sukcha);
		System.out.printf("%3d %4s %4d %4d %4d %4d %4.1f %3c %4d%n", student2.number, student2.name, student2.kor,		//객체 학생2의 데이터 호출 
				student2.eng, student2.math, student2.tot, student2.avg, student2.grade, student2.sukcha);

	}

}																		//메인 메소드 종료, 결과값 리턴
