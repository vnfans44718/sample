package com.itwill02.constructor;

public class StudentConstructorMain {
	public static void main(String[] args) {

		// 1명은 기본생성자사용
		Student student1 = new Student();
		student1.setStudentData(1, "Kim", 50, 70, 87);

		/*학생객체기본데이타(번호, 이름, 국어, 영어, 수학) 입력메쏘드호출
		 2명은 인자5개 생성자사용*/
		Student student2 = new Student(2,"LEE",30,45,34);
		Student student3 = new Student(3,"CHOI",97,85,83);

		// 학생총점계산 메쏘드 호출(3명)
		student1.calculateTotal();
		student2.calculateTotal();
		student3.calculateTotal();

		// 학생평균계산 메쏘드 호출(3명)
		student1.calculateAvg();
		student2.calculateAvg();
		student3.calculateAvg();

		// 학생평점계산 메쏘드 호출(3명)
		student1.calculateGrade();
		student2.calculateGrade();
		student3.calculateGrade();

		// 학생데이타 출력메쏘드 호출(3명)
		student1.headerPrint();
		student1.print();
		student2.print();
		student3.print();
		System.out.println();
		
		//학생 student1 의 이름변경한후(이름변경메쏘드호출후) student1학생객체출력
		student1.setName("PARK");
		student1.print();
		
		//학생 student1 의 총점데이타 반환받은후 메인블록에서출력
		System.out.println("student1 총점: "+student1.getTot());
		
		//학생 student1 의 학점데이타 반환받은후 메인블록에서출력
		System.out.println("student1 총점: "+student1.getGrade());
	}
}
