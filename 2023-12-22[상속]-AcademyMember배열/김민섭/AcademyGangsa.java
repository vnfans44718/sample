//public class AcademyGangsa extends AcademyMember {
//	public String subject;// 과목
//
//	public AcademyGangsa() {
//
//	}
//
//	public AcademyGangsa(int no, String name, String subject) {
//		this.no = no;
//		this.name = name;
//		this.subject = subject;
//	}
//
//	public void gangsaPrint() {
//		this.print();
//		System.out.println(subject);
//	}
//
//	public String getSubject() {
//		return subject;
//	}
//
//	public void setSubject(String subject) {
//		this.subject = subject;
//	}
//
//}
package com.itwill04.array;

public class AcademyGangsa extends AcademyMember {
	public String subject;// 과목

	public AcademyGangsa() {
	}

	public AcademyGangsa(int no, String name, String subject) {
//		this.no = no;
//		this.name = name;
		super(no, name);
		this.subject = subject;
	}

	@Override
	public void print() {
		super.print();
		System.out.println(subject);
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

}
