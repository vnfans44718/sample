package com.itwill01.option;

public class FoodOrderMethodMain {

	public static void main(String[] args) {

		/*
		 * (음식)주문 객체 생성(1개)
		 */
		FoodOrder order = new FoodOrder();

		/*
		 * 주문객체 기본데이터 입력메쏘드 추출 
		 */

		order.orderData("202011020003", 01023450001, "서울시 강남구 역삼동 111-333", 20201102, 130258, 35000, 0003);

		/*
		 * 주문 데이터 출력메쏘드 호출 
		 */
		order.printHeader();

		order.printOrder();

	}
}