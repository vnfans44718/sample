package com.itwill04.array;

public class StudentArrayMain {

	public static void main(String[] args) {
		/*
		 * 0.학생배열객체초기화
		 */
		Student[] students = { new Student(1, "KIM", 100, 100, 100), new Student(2, "HIM", 100, 100, 100),
				new Student(3, "AIM", 65, 87, 99), new Student(4, "BIM", 75, 97, 60), new Student(5, "XIM", 85, 98, 90),
				new Student(6, "KIM", 95, 88, 77), new Student(7, "ZIM", 99, 93, 95), new Student(8, "LIM", 83, 80, 99),
				new Student(9, "QIM", 73, 90, 80) };
		/*
		 * 1. 전체학생들 개인별 총점,평균,평점계산
		 */
		for (int i = 0; i < students.length; i++) {
			students[i].calculateTotal();
			students[i].calculateAvg();
			students[i].calculateGrade();

		}
		System.out.println("1. 전체학생총점,평균,평점계산");
		System.out.println();
		Student.headerPrint();
		for (int i = 0; i < students.length; i++) {
			students[i].print();
		}
		/*
		 * 2. 전체학생 총점으로 석차계산
		 */
		for (int i = 0; i < students.length; i++) {
			for (int j = 0; j < students.length; j++) {
				if (students[i].getTot() < students[j].getTot()) {
					students[i].setRank(students[i].getRank() + 1);
				} else if (students[i].getTot() == students[j].getTot()) {

				}
			}
		}
		System.out.println();
		System.out.println("2. 전체학생 총점으로 석차계산");
		System.out.println();
		Student.headerPrint();
		for (int i = 0; i < students.length; i++) {
			students[i].print();
		}
		/*
		 * 3. 전체학생출력
		 */
		System.out.println();
		System.out.println("3. 전체학생출력 ");
		System.out.println();
		Student.headerPrint();
		for (int i = 0; i < students.length; i++) {
			students[i].print();
		}
		/*
		 * 4. 번호3번 학생한명 출력
		 */
		System.out.println();
		System.out.println("4.번호3번 학생한명 출력  ");
		System.out.println();
		Student.headerPrint();
		for (int i = 0; i < students.length; i++) {
			if (students[i].getNo() == 3) {
				students[i].print();
			}
//			break;
		}
		/*
		 * 5. 학점A인 학생들 출력
		 */
		System.out.println();
		System.out.println("5. 학점A인 학생들 출력");
		System.out.println();
		Student.headerPrint();
		for (int i = 0; i < students.length; i++) {
			if (students[i].getGrade() == 'A')
				students[i].print();
		}
		/*
		 * 6. 학생총점으로 오름차순정렬
		 */
		System.out.println();
		System.out.println("6. 학생총점으로 오름차순정렬");
		System.out.println();
		Student.headerPrint();
		int tempInt;
		String tempString;
		double tempDouble;
		char tempChar;
		for (int i = 0; i < students.length - 1; i++) {
			for (int j = 0; j < students.length - 1 - i; j++) {
				if (students[j].getTot() > students[j + 1].getTot()) {

					tempInt = students[j].getTot();
					students[j].setTot(students[j + 1].getTot());
					students[j + 1].setTot(tempInt);

					tempDouble = students[j].getAvg();
					students[j].setAvg(students[j + 1].getAvg());
					students[j + 1].setAvg(tempDouble);

					tempChar = students[j].getGrade();
					students[j].setGrade(students[j + 1].getGrade());
					students[j + 1].setGrade(tempChar);

					tempInt = students[j].getRank();
					students[j].setRank(students[j + 1].getRank());
					students[j + 1].setRank(tempInt);

					tempInt = students[j].getNo();
					students[j].setNo(students[j + 1].getNo());
					students[j + 1].setNo(tempInt);

					tempString = students[j].getName();
					students[j].setName(students[j + 1].getName());
					students[j + 1].setName(tempString);

					tempInt = students[j].getKor();
					students[j].setKor(students[j + 1].getKor());
					students[j + 1].setKor(tempInt);

					tempInt = students[j].getEng();
					students[j].setEng(students[j + 1].getEng());
					students[j + 1].setEng(tempInt);

					tempInt = students[j].getMath();
					students[j].setMath(students[j + 1].getMath());
					students[j + 1].setMath(tempInt);

				}
			}
		}
		for (int i = 0; i < students.length; i++) {
			students[i].print();
		}
		System.out.println();
		System.out.println("6. 학생총점으로 내림차순정렬");
		System.out.println();
		Student.headerPrint();
		for (int i = 0; i < students.length - 1; i++) {
			for (int j = 0; j < students.length - 1 - i; j++) {
				if (students[j].getTot() < students[j + 1].getTot()) {
					tempInt = students[j].getTot();
					students[j].setTot(students[j + 1].getTot());
					students[j + 1].setTot(tempInt);

					tempDouble = students[j].getAvg();
					students[j].setAvg(students[j + 1].getAvg());
					students[j + 1].setAvg(tempDouble);

					tempChar = students[j].getGrade();
					students[j].setGrade(students[j + 1].getGrade());
					students[j + 1].setGrade(tempChar);

					tempInt = students[j].getRank();
					students[j].setRank(students[j + 1].getRank());
					students[j + 1].setRank(tempInt);

					tempInt = students[j].getNo();
					students[j].setNo(students[j + 1].getNo());
					students[j + 1].setNo(tempInt);

					tempString = students[j].getName();
					students[j].setName(students[j + 1].getName());
					students[j + 1].setName(tempString);

					tempInt = students[j].getKor();
					students[j].setKor(students[j + 1].getKor());
					students[j + 1].setKor(tempInt);

					tempInt = students[j].getEng();
					students[j].setEng(students[j + 1].getEng());
					students[j + 1].setEng(tempInt);

					tempInt = students[j].getMath();
					students[j].setMath(students[j + 1].getMath());
					students[j + 1].setMath(tempInt);

				}
			}
		}
		for (int i = 0; i < students.length; i++) {
			students[i].print();
		}
	}

}
