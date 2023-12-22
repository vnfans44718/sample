package com.itwill04.array.academy;

public class AcademyMemberArrayMain {

	public static void main(String[] args) {
		/*
		AcademyMember m1=new AcademyStaff();
		AcademyMember m2=new AcademyStudent();
		AcademyMember m3=new AcademyGangsa();
		*/

		AcademyMember[] members = { new AcademyStudent(1, "KIM", "자바"), new AcademyStudent(2, "LEE", "리눅스"),
				new AcademyStudent(3, "KIM", "자바"), new AcademyStudent(4, "LEE", "IOT"),
				new AcademyGangsa(5, "CHOI", "파이썬"), new AcademyGangsa(6, "KIM", "자바"),
				new AcademyGangsa(7, "DIM", "자바"), new AcademyStaff(8, "AIM", "영업"), new AcademyStaff(9, "QIM", "생산") };

		System.out.println("1.AcademyMember 전체출력");
		for (AcademyMember academyMemberAll : members) {
			academyMemberAll.print();
		}
		System.out.println();

		System.out.println("2.번호 1   번 AcademyMember 한명 출력");
		for (AcademyMember academyMember1 : members) {
			if (academyMember1.getNo() == 1) {
				academyMember1.print();
				break;
			}
		}
		System.out.println();

		System.out.println("2.번호 2   번 AcademyMember 한명 출력");
		for (AcademyMember academyMember2 : members) {
			if (academyMember2.getNo() == 2) {
				academyMember2.print();
				break;
			}
		}
		System.out.println();

		System.out.println("2.이름 KIM 인 AcademyMember 들   출력");
		for (AcademyMember academyMember3 : members) {
			if (academyMember3.getName().equals("KIM")) {
				academyMember3.print();
			}
		}
		System.out.println();

		/********************************************************************************/
		System.out.println("3.AcademyMember 중에서 AcademyStudent들 출력");
		for (AcademyMember academyMember4 : members) {
			if (academyMember4 instanceof AcademyStudent) {
				academyMember4.print();
			}
		}
		System.out.println();

		System.out.println("3.AcademyMember 중에서 AcademyGangsa들 출력");
		for (AcademyMember academyMember5 : members) {
			if (academyMember5 instanceof AcademyGangsa) {
				academyMember5.print();
			}
		}
		System.out.println();

		System.out.println("3.AcademyMember 중에서 AcademyStaff들 출력");
		for (AcademyMember academyMember6 : members) {
			if (academyMember6 instanceof AcademyStaff) {
				academyMember6.print();
			}
		}
		System.out.println();

		System.out.println("4.AcademyMember 중에서 자바 반  인 AcademyStudent 들 출력");
		for (AcademyMember academyMember7 : members) {
			if (academyMember7 instanceof AcademyStudent) {
				AcademyStudent tempStudent = (AcademyStudent) academyMember7;
				if (tempStudent.getBan().equals("자바")) {
					tempStudent.print();
				}
			}
		}
		System.out.println();

		System.out.println("4.AcademyMember 중에서 자바 과목인 AcademyGangsa  들 출력");
		for (AcademyMember academyMember8 : members) {
			if (academyMember8 instanceof AcademyGangsa) {
				AcademyGangsa tempGangsa = (AcademyGangsa) academyMember8;
				if (tempGangsa.getSubject().equals("자바")) {
					tempGangsa.print();
				}
			}
		}
		System.out.println();

		System.out.println("4.AcademyMember 중에서 영업 부서인 AcademyStaff   들 출력");
		for (AcademyMember academyMember9 : members) {
			if (academyMember9 instanceof AcademyStaff) {
				AcademyStaff tempStaff = (AcademyStaff) academyMember9;
				if (tempStaff.getDepart().equals("영업")) {
					tempStaff.print();
				}
			}
		}
		/********************************************************************************/
	}

}