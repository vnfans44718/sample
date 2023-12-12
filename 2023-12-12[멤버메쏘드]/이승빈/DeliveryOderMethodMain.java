package com.itwill01.method;

public class DeliveryOderMethodMain {

	public static void main(String[] args) {
		// 배달주문정보 객체 생성
		Delivery deliveryOrder = new Delivery();

		// 배달주문정보(접수번호, 핸드폰번호, 집주소, 날짜, 시간, 가격, 메뉴번호) 입력메쏘드 호출
		deliveryOrder.deliveryOrderInfo(202011020003L, "01023450001", "서울시 강남구 역삼동 111-333", 20201102, 130258, 35000,
				"0003");

		// 배달주문정보 출력메쏘드 호출
		deliveryOrder.headerPrint();
		deliveryOrder.deliveryOrderPrint();
	}

}
