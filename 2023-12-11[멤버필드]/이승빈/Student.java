package com.itwill01.field;
/*
 * 성적처리를위해 필요한 학생객체를 만들기위한클래스정의(틀,타입)
 */
public class Student {
	/*
	 * 1.멤버필드(변수)선언:속성
	 *   -번호,이름,국어,영어,수학,총점,평균,평점(A,B,C,D,F),석차
	 *    를 저장할 멤버필드(변수) 선언
	 */
	int no;			// 학생 개체에 번호를 저장할 멤버변수 no 선언
	String name;	// 학생 개체에 이름을 저장할 멤버변수 name 선언
	int kor;		// 학생 개체에 국어점수를 저장할 멤버변수 kor 선언
	int eng;		// 학생 개체에 영어점수를 저장할 멤버변수 eng 선언
	int math;		// 학생 개체에 수학점수를 저장할 멤버변수 math 선언
	int tot;		// 학생 개체에 총점을 저장할 멤버변수 tot 선언
	double avg;		// 학생 개체에 평균을 저장할 멤버변수 avg 선언
	char grade;		// 학생 개체에 평점을 저장할 멤버변수 grade 선언
	int rank;		// 학생 개체에 석차를 저장할 멤버변수 rank 선언
}
