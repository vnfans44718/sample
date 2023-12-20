package com.itwill99.review;

public class MemberMethodReturnMain {

	public static void main(String[] args) {

		MemberMethodReturn mmr=
				new MemberMethodReturn();
		
		System.out.println(mmr.method1());
		System.out.println(mmr.method2());
		System.out.println(mmr.add(23,99));
		System.out.println(mmr.hello("원위"));
		
	}
}
