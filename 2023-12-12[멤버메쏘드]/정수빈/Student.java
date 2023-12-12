package com.itwill01.method;

/*
  #### 성적처리를 위한 필요한 학생객체를 만들기 위한 클래스
 */
public class Student {

	/*
	 * << 속성(멤버변수)   >> 번호 이름 국어 영어 수학 총점 평균 평점 석차
	 * << 기능(멤버메쏘드) >> 기본데이타입력,총점계산,평균계산,평점계산, 출력
	 */

	// 멤버변수 선언
	int no;
	String name;
	int kor;
	int eng;
	int math;
	int tot;
	double avg;
	char grade;
	int rank;
	
	// 멤버메쏘드 선언
	/*
	 * 기본데이타(번호,이름,국어,영어,수학)멤버변수에대입하는메쏘드
	 */
	public void Data(int no, String name, int kor, int eng, int math) {
		this.no=no;
		this.name=name;
		this.kor=kor;
		this.eng=eng;
		this.math=math;
	}
	
	/*
	 * 총점계산메쏘드
	 */
	
	public void total() {
		this.tot=(this.kor+this.eng+this.math);
	}
	
	/*
	 * 평균계산메쏘드
	 */
	
	public void average() {
		this.avg=(this.tot /3.0);
	}
	/*
	 * 평점계산메쏘드
	 */
	
	public void gra() {
		if (this.avg >=90) {
			grade = 'A';
		}else if (avg >=80) {
			grade = 'B';
		}else if (avg >=70) {
			grade = 'C';
		}else if(avg>=60) {
			grade = 'D';
		}else {
			grade = 'F';
		}
		
	}
	
	public void headerprint() {
		
		System.out.println("--------------학생 성적 출력-----------------");
		System.out.println("학번 "+""+"이름"+" "+"국어"+" "+"영어"+" "+"수학"+" "+"총점"+" "+"평균"+" "+"평점"+" "+"석차");
		System.out.println("---------------------------------------------");
	}
	/*
	 * 출력메쏘드
	 */
	
	public void print() {
		
		System.out.printf("%2d %4s %d %4d %4d %4d %5.1f %3c %3d\n",this.no,this.name,this.kor,this.eng,this.math,this.tot,this.avg,this.grade,this.rank);
	}

	
}