package com.itwill01.method;

public class StudentMemberMethodMain {
	public static void main(String[] args) {
		/*
		학생객체생성(3명)
		*/
		Student student1=new Student();
		Student student2=new Student();
		Student student3=new Student();
		
		/*
		 학생객체기본데이타(번호, 이름, 국어, 영어, 수학) 입력메쏘드호출(3명)
		 */
		student1.data(1,"kim",40,55,60);
		student2.data(2,"Lee",50,95,60);
		student3.data(3,"Bak",85,90,100);
		
		
		//학생총점계산 메쏘드 호출(3명)
		student1.tot();
		student2.tot();
		student3.tot();
		
		//학생평균계산 메쏘드 호출(3명)
		student1.avg();
		student2.avg();
		student3.avg();
		
		//학생평점계산 메쏘드 호출(3명)
		student1.grade();
		student2.grade();
		student3.grade();
		
		//헤더
		student1.Header();
		
		/*
		 * 학생데이타 출력메쏘드 호출(3명)
		 */
		student1.Print();
		student2.Print();
		student3.Print();
	}
}
