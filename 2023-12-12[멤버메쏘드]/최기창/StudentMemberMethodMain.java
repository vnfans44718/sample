package com.itwill01.method;

public class StudentMemberMethodMain {
	public static void main(String[] args) {
		/*
		학생객체생성(3명)
		*/
		Student st1=new Student();
		Student st2=new Student();
		Student st3=new Student();
		/*
		 학생객체기본데이타(번호, 이름, 국어, 영어, 수학) 입력메쏘드호출(3명)
		 */
		st1.basic(1, "가나다", 80, 85, 70);
		st2.basic(2, "라마바", 75, 60, 65);
		st3.basic(3, "사아자", 90, 95, 80);
		/*
		 학생총점계산 메쏘드 호출(3명)
		 학생평균계산 메쏘드 호출(3명)
		 학생평점계산 메쏘드 호출(3명)
		 */
		st1.tot();
		st2.tot();
		st3.tot();
		
		st1.avg();
		st2.avg();
		st3.avg();
		
		st1.greade();
		st2.greade();
		st3.greade();
		
		/*
		 * 학생데이타 출력메쏘드 호출(3명)
		 */
		st1.headerPrint();
		st1.print();
		st2.print();
		st3.print();
		st1.tailPrint();
	}
}