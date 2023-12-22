package com.itwill04.array;
public class AcademyStudent extends AcademyMember {
	public String ban;// 반

	public AcademyStudent() {
	}

	public AcademyStudent(int no, String name, String ban) {
//		this.no = no;
//		this.name = name;
		super(no, name);
		this.ban = ban;
	}

	public void print() {
		super.print();
		System.out.println(this.ban);
	}

	@Override
	public String toString() {
		return "AcademyStudent [no=" + this.getNo() + ",name=" + this.getName() + ",ban=" + ban + "]";
	}

	public String getBan() {
		return ban;
	}

	public void setBan(String ban) {
		this.ban = ban;
	}

}
