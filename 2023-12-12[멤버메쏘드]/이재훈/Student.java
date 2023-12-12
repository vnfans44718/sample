package com.itwill01.method;
/*
#### 성적처리를 위한 필요한 학생객체를 만들기 위한 클래스
*/
public class Student {

	/*
 * << 속성(멤버변수)   >> 번호 이름 국어 영어 수학 총점 평균 평점 석차
 * << 기능(멤버메쏘드) >> 기본데이타입력,총점계산,평균계산,평점계산, 출력
 */

//멤버변수 선언
int no; //학번,gkr
String name; //이름,dl
int kor; //국어,rnr
int eng; //영어,dud
int math; //수학,tn
int tot; //총점,chd
double avg; //평점,vud
char grade; //학점,gkr
int rank; //석차

 // 멤버메쏘드 선언

 //기본데이타(번호,이름,국어,영어,수학)멤버변수에대입하는메쏘드
 
	public void data(int no,String name,int kor, int eng, int math){
		this.no = no;		
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	} 
	
	//총점계산메쏘드
	public void tot(){
		this.tot = kor+eng+math;
		return;
	}
	
	//평균계산메쏘드
	public void avg(){
		this.avg = tot/3;
		return;
	}
	
	//평점계산메쏘드
	//평점(A(90~100),B(80~89),C(70~79),D(60~69),F(0~59))
	public void grade(){
		
		if (avg >= 90 && avg <= 100) {
			grade = 'A';
		} else if (avg >= 80 && avg < 90) {
			grade = 'B';
		} else if (avg >= 70 && avg < 80) {
			grade = 'C';
		} else if (avg >= 60 && avg < 70) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		return;
	}
	
	//출력메쏘드
	
	public void Header(){
		System.out.printf("--------------------------------------------\n");
		System.out.printf("%s %s %s %s %s  %s %s  %s %s\n","학번","이름","국어","영어","수학","총점","평점","학점","석차");
		System.out.printf("--------------------------------------------\n");
	}
	public void Print(){
		System.out.printf("%2s %4s %2d %3d %3d %4d %3.1f %2c \n",no,name,kor,eng,math,tot,avg,grade);
	

	}
	
		
}
