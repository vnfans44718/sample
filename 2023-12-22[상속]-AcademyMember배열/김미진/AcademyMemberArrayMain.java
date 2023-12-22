package com.itwill04.array.academy;

public class AcademyMemberArrayMain {

	public static void main(String[] args) {
		/*
		AcademyMember m1=new AcademyStaff();
		AcademyMember m2=new AcademyStudent();
		AcademyMember m3=new AcademyGangsa();
		*/

		AcademyMember[] members = { new AcademyStudent(1, "KIM", "자바"),
					    new AcademyStudent(2, "LEE", "리눅스"),
					    new AcademyStudent(3, "KIM", "자바"), 
					    new AcademyStudent(4, "LEE", "IOT"),
					    new AcademyGangsa(5, "CHOI", "파이썬"), 
					    new AcademyGangsa(6, "KIM", "자바"),
					    new AcademyGangsa(7, "DIM", "자바"), 
					    new AcademyStaff(8, "AIM", "영업"), 
					    new AcademyStaff(9, "QIM", "생산") };

		AcademyMember[] recvmembers = members;

		System.out.println("1.AcademyMember 전체출력");
		for (AcademyMember academyMember : recvmembers) {
			academyMember.print();
		}

		System.out.println("2.번호 1   번 AcademyMember 한명 출력");
		for (AcademyMember academyMember : recvmembers) {
			if (academyMember.getNo() == 1) {
				academyMember.print();
			}
		}

		System.out.println("2.번호 2   번 AcademyMember 한명 출력");
		for (AcademyMember academyMember : recvmembers) {
			if (academyMember.getNo() == 2) {
				academyMember.print();
			}
		}

		System.out.println("2.이름 KIM 인 AcademyMember 들   출력");
		for (AcademyMember academyMember : recvmembers) {
			if (academyMember.getName().equals("KIM")) {
				academyMember.print();
			}
		}
		/********************************************************************************/
		System.out.println("3.AcademyMember 중에서 AcademyStudent들 출력");
		for (AcademyMember academyMember : recvmembers) {
			if (academyMember instanceof AcademyStudent) {
				academyMember.print();
			}
		}

		System.out.println("3.AcademyMember 중에서 AcademyGangsa들 출력");
		for (AcademyMember academyMember : recvmembers) {
			if (academyMember instanceof AcademyGangsa) {
				academyMember.print();
			}
		}

		System.out.println("3.AcademyMember 중에서 AcademyStaff들 출력");
		for (AcademyMember academyMember : recvmembers) {
			if (academyMember instanceof AcademyStaff) {
				academyMember.print();
			}
		}
		System.out.println("4.AcademyMember 중에서 자바 반  인 AcademyStudent 들 출력");
		for (AcademyMember academyMember : recvmembers) {
			if (academyMember instanceof AcademyStudent && ((AcademyStudent) academyMember).getBan() == "자바") {
				academyMember.print();
			}
		}
		System.out.println("4.AcademyMember 중에서 자바 과목인 AcademyGangsa  들 출력");
		for (AcademyMember academyMember : recvmembers) {
			if (academyMember instanceof AcademyGangsa && ((AcademyGangsa) academyMember).getSubject() == "자바") {
				academyMember.print();
			}
		}
		System.out.println("4.AcademyMember 중에서 영업 부서인 AcademyStaff   들 출력");
		for (AcademyMember academyMember : recvmembers) {
			if (academyMember instanceof AcademyStaff && ((AcademyStaff) academyMember).getDepart() == "영업") {
				academyMember.print();
			}
		}
		/********************************************************************************/
	}

}
