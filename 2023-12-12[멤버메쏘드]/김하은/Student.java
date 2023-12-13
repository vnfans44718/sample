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
	
	// 멤버메쏘드 선언 메쏘드는 동작기능이므로 동사 관련 이름 붙이기
	/*
	 * 기본데이타(번호,이름,국어,영어,수학)멤버변수에대입하는메쏘드
	 */
	public void inputData(int no, String name, int kor, int eng, int math) {
		this.no = no;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		return;
	} 
	
	/*
	 * 총점계산메쏘드
	 */
	public void calTot() {
		this.tot = this.kor + this.eng + this.math;
		return;
	}
	
	/*
	 * 평균계산메쏘드
	 */
	public void calAvg() {
		this.avg = this.tot / 3.0;
		return;
	}
	
	/*
	 * 평점계산메쏘드
	 */
	public void calGrade() {
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
		return;
	}
	
	/*
	 * 출력메쏘드
	 */
	public void headerPrint() {
		System.out.printf("-------------------학생 성적 출력-----------------------\n");
		System.out.printf("%s %6s %4s %s %s %4s %4s %2s %s \n",
				"학번","이름","국어","영어","수학","총점","평균","평점","석차");
		System.out.printf("--------------------------------------------------------\n");
	}
	
	public void dataPrint() {
		System.out.printf("%4d %5s %6d %4d %4d %6d %6.1f %4c %4d \n",
				this.no,this.name,this.kor,this.eng,this.math,this.tot,this.avg,this.grade,this.rank);
		return;
	}
}