package com.itwill05.service.account;

public class AcademyMemberServiceMain {

	public static void main(String[] args) {
		AcademyMemberService m1 = new AcademyMemberService();
		System.out.println("1.AcademyMember 전체출력");
		m1.print();
		System.out.println("2-1.번호 1 번 AcademyMember 객체 참조변수반환해줘");
		m1.findMemberNo(1);
		System.out.println("2-2.이름 KIM 인 AcademyMember 배열객체 참조변수반환해줘");
		m1.findMemberName("KIM");
		System.out.println("3.AcademyMember 중에서 AcademyStudent객체들 모두반환해줘 [ AcademyMember[] 객체주소반환 ]");
		m1.findMemberAcademyStudent();
		System.out.println("3.AcademyMember 중에서 AcademyStaff객체들  모두반환해줘 [ AcademyMember[] 객체주소반환 ]");
		m1.findMemberAcademyStaff();
		System.out.println("3.AcademyMember 중에서 AcademyGangsa객체들 모두반환해줘 [ AcademyMember[] 객체주소반환 ]");
		m1.findMemberAcademyGangsa();
		System.out.println("4.AcademyMember 중에서 자바반인  AcademyStudent객체들 배열참조변수반환해줘");
		m1.findMemberAcademyStudent("자바");
		System.out.println("4.AcademyMember 중에서 영업부서인 AcademyStaff  객체들 배열참조변수반환해줘");
		m1.findMemberAcademyStaff("영업");
		System.out.println("4.AcademyMember 중에서 자바과목인 AcademyGangsa 객체들 배열참조변수반환해줘");
		m1.findMemberAcademyGangsa("자바");
		System.out.println("---------------------------------------------");
		System.out.println("5.AcademyMember 중에서 자바반인  AcademyStudent객체들 배열참조변수반환해줘");
		System.out.println("5.AcademyMember 중에서 영업부서인 AcademyStaff  객체들 배열참조변수반환해줘");
		System.out.println("5.AcademyMember 중에서 자바과목인 AcademyGangsa 객체들 배열참조변수반환해줘");

	}

}
