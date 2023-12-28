package com.itwill05.service.array.academy;

public class AcademyMemberServiceMain {

	public static void main(String[] args) {
		AcademyMemberService academyMemberService = new AcademyMemberService();

		System.out.println("1.AcademyMember 전체출력");
		academyMemberService.print();

		System.out.println("2-1.번호 1 번 AcademyMember 객체 참조변수반환해줘");
		AcademyMember findNo = academyMemberService.findByNo(1);
		findNo.print();

		System.out.println("2-2.이름 KIM 인 AcademyMember 배열객체 참조변수반환해줘");
		AcademyMember[] findName = academyMemberService.findByName("KIM");
		for (AcademyMember academyMember : findName) {
			academyMember.print();
		}

		System.out.println("3.AcademyMember 중에서 AcademyStudent객체들 모두반환해줘 [ AcademyMember[] 객체주소반환 ]");
		AcademyMember[] students = academyMemberService.findByStudent();
		for (AcademyMember academyMember : students) {
			if (academyMember != null) {
				academyMember.print();
			}
		}

		System.out.println("3.AcademyMember 중에서 AcademyStaff객체들  모두반환해줘 [ AcademyMember[] 객체주소반환 ]");
		AcademyMember[] staffs = academyMemberService.findByStaff();
		for (AcademyMember academyMember : staffs) {
			if (academyMember != null) {
				academyMember.print();
			}
		}

		System.out.println("3.AcademyMember 중에서 AcademyGangsa객체들 모두반환해줘 [ AcademyMember[] 객체주소반환 ]");
		AcademyMember[] gansas = academyMemberService.findByGangsa();
		for (AcademyMember academyMember : gansas) {
			if (academyMember != null) {
				academyMember.print();
			}
		}

		System.out.println("4.AcademyMember 중에서 자바반인  AcademyStudent객체들 배열참조변수반환해줘");
		AcademyMember[] javas = academyMemberService.findByJava();
		for (AcademyMember academyMember : javas) {
			if (academyMember != null) {
				academyMember.print();
			}
		}

		System.out.println("4.AcademyMember 중에서 영업부서인 AcademyStaff  객체들 배열참조변수반환해줘");
		AcademyMember[] sales = academyMemberService.findBySale();
		for (AcademyMember academyMember : sales) {
			if (academyMember != null) {
				academyMember.print();
			}
		}

		System.out.println("4.AcademyMember 중에서 자바과목인 AcademyGangsa 객체들 배열참조변수반환해줘");
		AcademyMember[] gangsaJava = academyMemberService.findByGangsaJava();
		for (AcademyMember academyMember : gangsaJava) {
			if (academyMember != null) {
				academyMember.print();
			} else {
				System.out.println("자바를 수업하는 강사님이 현재 없습니다.");
				break;
			}
		}

		System.out.println("---------------------------------------------");
		System.out.println("5.AcademyMember 중에서 자바반인  AcademyStudent객체들 배열참조변수반환해줘");
		System.out.println("5.AcademyMember 중에서 영업부서인 AcademyStaff  객체들 배열참조변수반환해줘");
		System.out.println("5.AcademyMember 중에서 자바과목인 AcademyGangsa 객체들 배열참조변수반환해줘");

	}

}