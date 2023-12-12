package com.itwill01.method;

public class StudentMemberMethodMain {
	public static void main(String[] args) {
		/*
		학생객체생성(3명)
		*/
		Student stu1= new Student ();
		Student stu2= new Student ();
		Student stu3= new Student ();
		
		/*
		 학생객체기본데이타(번호, 이름, 국어, 영어, 수학) 입력메쏘드호출(3명)
		 */

		stu1.Data(1,"김경호",80, 90, 100 );
		stu2.Data(2,"김경수",75, 88, 68 );
		stu3.Data(3,"정수빈",85, 70, 80 );
		
		/*
		 학생총점계산 메쏘드 호출(3명)
		 학생평균계산 메쏘드 호출(3명)
		 학생평점계산 메쏘드 호출(3명)
		 */
		
		stu1.total();
		stu2.total();
		stu3.total();
		
		stu1.average();
		stu2.average();
		stu3.average();
		
		stu1.gra();
		stu2.gra();
		stu3.gra();
		
		/*
		 * 학생데이타 출력메쏘드 호출(3명)
		 */
		
		stu1.headerprint();
		stu1.print();
		stu2.print();
		stu3.print();
	}
}