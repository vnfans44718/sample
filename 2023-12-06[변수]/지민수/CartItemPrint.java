
public class CartItemPrint {

	public static void main(String[] args) {
		/*
		  장바구니 주문정보입력 결제하기 주문완료
		이미지 상품 수량 가격 배송정보 상품합계 총상품합계
		 */
		
		
		String image = "img";
		String product = "다우니";
		int number = 3;
		int price = 18000;
		String infoDelivery = "무료배송";
		int totalProduct = number * price;
		String infoCart = "장바구니 주문정보입력 결제하기 주문완료";
		String infoProduct = "상품 ㅣ 수량 ㅣ 가격 ㅣ 배송정보 ㅣ 상품합계";
		String line = "==============================================================";
	
		System.out.println(line);
		System.out.println(infoCart);
		System.out.println(line);
		System.out.println(image);
		System.out.println(infoProduct);
		System.out.println(product+" ㅣ "+number+" ㅣ "+price+"원 ㅣ "+infoDelivery+" ㅣ "+totalProduct+"원");
		System.out.println(line);
		System.out.println("총 상품 합계 : "+totalProduct+"원");
		System.out.println(line);
	}

}
