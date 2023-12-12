package com.itwill01.method;

public class StudentMemberMethodMain {

	public static void main(String[] args) {
		/*
		학생객체생성(3명)
		*/
		Student student1 = new Student();
		Student student2 = new Student();
		Student student3 = new Student();

		/*
		 학생객체기본데이타(번호, 이름, 국어, 영어, 수학) 입력메쏘드호출(3명)
		 */
		student1.inFo(1, "김미진", 97, 82, 74);
		student2.inFo(2, "김경희", 87, 96, 79);
		student3.inFo(3, "김수민", 98, 84, 91);
		/*
		 학생총점계산 메쏘드 호출(3명)
		 학생평균계산 메쏘드 호출(3명)
		 학생평점계산 메쏘드 호출(3명)
		 */
		student1.tot();
		student2.tot();
		student3.tot();

		student1.avg();
		student2.avg();
		student3.avg();

		student1.grade();
		student2.grade();
		student3.grade();
		/*
		 * 학생데이타 출력메쏘드 호출(3명)
		 */
		student1.headerPrint();
		student1.print();
		student2.print();
		student3.print();

	}

}
