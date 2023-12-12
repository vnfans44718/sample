package com.itwill01.option;

public class HealthMethodMain {

	public static void main(String[] args) {
		/*
		 * 헬스장 강사 객체 생성(2명)
		 */
		Health healthT1 = new Health();
		Health healthT2 = new Health();
		
		/*
		 * 헬스장 강사 객체 기본 데이터 입력메쏘드 호출! 
		 */
		healthT1.basicData(180, 78, "남성", "Tomas", 37, "PT");
		healthT2.basicData(170, 50, "여성", "Alice", 26, "요가");
		
		/*
		 * 헬스장 강사 객체 데이터 출력메쏘드 호출 
		 */
		
		healthT1.headerPrint();
		healthT1.infoPrint();
		healthT2.infoPrint();
		
	}

}
