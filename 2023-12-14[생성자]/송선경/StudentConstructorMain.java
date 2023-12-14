package com.itwill02;

public class StudentConstructorMain {

	public static void main(String[] args) {

		// 학생객체생성(3명)
		// 1명은 기본생성자사용
		// 학생객체기본데이타(번호, 이름, 국어, 영어, 수학) 입력메쏘드호출
		Student std1 = new Student();
		std1.setData(1, "이지현", 89, 95, 78);

		// 2명은 인자5개 생성자사용
		Student std2 = new Student(2, "전아인", 95, 90, 100);
		Student std3 = new Student(3, "김우재", 92, 87, 80);

		// 학생총점계산 메쏘드 호출(3명)
		std1.calculateTotal();
		std2.calculateTotal();
		std3.calculateTotal();

		// 학생평균계산 메쏘드 호출(3명)
		std1.calculateAvg();
		std2.calculateAvg();
		std3.calculateAvg();

		// 학생평점계산 메쏘드 호출(3명)
		std1.calculateGrade();
		std2.calculateGrade();
		std3.calculateGrade();

		// 학생데이타 출력메쏘드 호출(3명)
		std1.headerPrint();
		std1.print();
		std2.print();
		std3.print();

		// 학생 student1 의 이름변경한후(이름변경메쏘드호출후) student1학생객체출력
		std1.setName("이지혜");
		std1.print();

		// 학생 student1 의 총점데이타 반환받은후 메인블록에서출력
		System.out.println("학생1의 총점 데이타: " + std1.getTot());

		// 학생 student1 의 학점데이타 반환받은후 메인블록에서출력
		System.out.println("학생1의 총점 데이타: " + std1.getGrade());
	}

}
