package com.itwill99.review;

public class MemberMethodReturnMain {
	public static void main(String[] args) {
		/*
		 * MemberMethodReturn 객체생성
		 */
		MemberMethodReturn mmr=
				new MemberMethodReturn();
		
		/*
		 MemberMethodReturn객체의  method1 호출후 반환데이타받아서 출력
		 */
		 System.out.println("method1의 결과값: " + mmr.method1());
		
		
		
		/*
		 MemberMethodReturn객체의  method2 호출후 반환데이타받아서 출력
		 */
		 System.out.println("method2의 결과값: " + mmr.method2());
	
		
		/*
		 MemberMethodReturn객체의 add메쏘드를 정수인자 두개를 넣어서 호출후 
		 반환되는 정수데이타받아서 출력
		 */
		 
		
		 System.out.println("add의 결과값: " +  mmr.add(7,6));
		
		
		/*
		 MemberMethodReturn객체의 hello 메쏘드를 문자열인자 한개 넣어서 호출후 
		 반환되는 문자열데이타받아서 출력
		 */
		
		 System.out.println("hello의 결과값: " +  mmr.hello("지민"));
		
	
	}
}














