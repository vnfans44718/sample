package com.itwill05.service.array.academy;

public class AcademyMemberServiceMain {

	public static void main(String[] args) {
		
		AcademyMemberService academyMemberService = new AcademyMemberService();
		
		System.out.println("1.AcademyMember 전체출력");
		academyMemberService.print();
		
		System.out.println("2-1.번호 1 번 AcademyMember 객체 참조변수반환해줘");
		AcademyMember findbyNo = academyMemberService.findByNo(1);
		findbyNo.print();
		
		System.out.println("2-2.이름 KIM 인 AcademyMember 배열객체 참조변수반환해줘");
		AcademyMember[] findbyName = academyMemberService.findByName("KIM");
		for (AcademyMember academyMember : findbyName) {
			academyMember.print();
		}
		
		System.out.println("3.AcademyMember 중에서 AcademyStudent객체들 모두반환해줘 [ AcademyMember[] 객체주소반환 ]");
		AcademyMember[] findbyStu = academyMemberService.findByStu();
		for (int i=0; i<findbyStu.length; i++) {
			findbyStu[i].print();
		}
		
		System.out.println("3.AcademyMember 중에서 AcademyStaff객체들  모두반환해줘 [ AcademyMember[] 객체주소반환 ]");
		AcademyMember[] findbyStaff = academyMemberService.findByStaff();
		for (int i=0; i<findbyStaff.length; i++) {
			findbyStaff[i].print();
		}
		
		System.out.println("3.AcademyMember 중에서 AcademyGangsa객체들 모두반환해줘 [ AcademyMember[] 객체주소반환 ]");
		AcademyMember[] findbyGangsa = academyMemberService.findByGangsa();
		for (int i=0; i<findbyGangsa.length; i++) {
			findbyGangsa[i].print();
		}

		System.out.println(
		"4.AcademyMember 중에서 자바반인  AcademyStudent객체들 배열참조변수반환해줘");
		AcademyMember[] findbyBan = academyMemberService.findByBan("자바");
		for (int i=0; i<findbyBan.length; i++) {
			findbyBan[i].print();
		}
		
		System.out.println(
		"4.AcademyMember 중에서 영업부서인 AcademyStaff  객체들 배열참조변수반환해줘");
		AcademyMember[] findbyDepart = academyMemberService.findByDepart("영업");
		for (int i=0; i<findbyDepart.length; i++) {
			findbyDepart[i].print();
		}
		
		System.out.println(
		"4.AcademyMember 중에서 자바과목인 AcademyGangsa 객체들 배열참조변수반환해줘");
		AcademyMember[] findbySubject = academyMemberService.findBySubject("자바");
		for (int i=0; i<findbySubject.length; i++) {
			findbySubject[i].print();
		}
		
		System.out.println("---------------------------------------------");
		System.out.println(
				"5.AcademyMember 중에서 자바반인  AcademyStudent객체들 배열참조변수반환해줘");
		System.out.println(
				"5.AcademyMember 중에서 영업부서인 AcademyStaff  객체들 배열참조변수반환해줘");
		System.out.println(
				"5.AcademyMember 중에서 자바과목인 AcademyGangsa 객체들 배열참조변수반환해줘");
		
	}

}