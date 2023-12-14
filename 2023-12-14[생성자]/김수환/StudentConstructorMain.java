package com.itwill02.constructor;

public class StudentConstructorMain {

	public static void main(String[] args) {
		/*
		 학생객체생성(3명)
		  - 1명은 기본생성자사용
		      학생객체기본데이타(번호, 이름, 국어, 영어, 수학) 입력메쏘드호출
		  - 2명은 인자5개 생성자사용
		 */
		
		Student student1=new Student();
		student1.setStudentData(1, "김수환", 23, 99, 88);
		/*
		student1.setNo(1);
		student1.setName("김수환");
		student1.setKor(23);
		student1.setEng(99);
		student1.setMath(88);
		*/
		Student student2=new Student(2, "김우환", 57, 31, 100);
		Student student3=new Student(3, "김마환", 88, 99, 70);
		
		
		/*
		 학생총점계산 메쏘드 호출(3명)
		 학생평균계산 메쏘드 호출(3명)
		 학생평점계산 메쏘드 호출(3명)
		 */
		student1.calculateTotal();
		student2.calculateTotal();
		student3.calculateTotal();
		student1.calculateAvg();
		student2.calculateAvg();
		student3.calculateAvg();
		student1.calculateGrade();
		student2.calculateGrade();
		student3.calculateGrade();
		
		/*
		 * 학생데이타 출력메쏘드 호출(3명)
		 */
		student1.headerPrint();
		student1.print();
		student2.print();
		student3.print();
		
		/*
		 * 학생 student1 의 이름변경메쏘드호출후 student1학생객체출력
		 * 학생 student1 의 총점데이타 반환받은후 메인블록에서출력
		 * 학생 student1 의 학점데이타 반환받은후 메인블록에서출력
		 */
		System.out.println();
		System.out.println();
		student1.setName("김또깡");
		student1.print();
		System.out.println("student1 의 총점데이타: "+student1.getTot());
		System.out.println("student1 의 학점데이타: "+student1.getGrade());
		
	}

}