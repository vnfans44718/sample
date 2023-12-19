package com.itwill00.MemberFieldReturn;

/*
 * 1.객체를 생성할 클래스
 * 2.데이타타입
 */
public class MemberField {
	/*
	1. 멤버변수4개생성
	*/
	
	int memberField1;
	double memberField2;
	char memberField3;
	String memberField4;
	
	public MemberField() {
		// TODO Auto-generated constructor stub
	}
	
	public MemberField(int memberField1, double memberField2, char memberField3, String memberField4 ) {
		this.memberField1=memberField1;
		this.memberField2=memberField2;
		this.memberField3=memberField3;
		this.memberField4=memberField4;
	}
	
	public void print() {
		System.out.println(memberField1+"\n"+memberField2+"\n"+memberField3+"\n"+memberField4);
		
	}
}