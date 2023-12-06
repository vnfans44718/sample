
public class CartItemPrint {

	public static void main(String[] args) {
		
		String name;
		String option;
		int pcs;
		String productFee;
		String deliveryFee;
		String totalFee;
		
		name="마론디 레더 패딩";
		option="블랙";
		pcs=1;
		productFee="92,000원";
		deliveryFee="0원";
		totalFee="92,000원";
		
		System.out.println("---------------------------");
		System.out.println("이름 : "+name);
		System.out.println("옵션 : "+option);
		System.out.println("수량 : "+pcs);
		System.out.println("상품 금액 : "+productFee);	
		System.out.println("배송비 : "+deliveryFee);	
		System.out.println("총 주문금액 : "+totalFee);	
		System.out.println("---------------------------");
		
	}

}
