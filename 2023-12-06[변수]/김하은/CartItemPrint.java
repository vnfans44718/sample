
public class CartItemPrint {

	public static void main(String[] args) {
		
		String name;
		String option;
		int pcs;
		int productFee;
		int deliveryFee;
		int totalFee;
		
		name="마론디 레더 패딩";
		option="블랙";
		pcs=1;
		productFee=92000;
		deliveryFee=0;
		totalFee=92000;
		
		System.out.println("---------------------------");
		System.out.println("이름 : "+name);
		System.out.println("옵션 : "+option);
		System.out.println("수량 : "+pcs);
		System.out.println("상품 금액 : "+productFee+"원");	
		System.out.println("배송비 : "+deliveryFee+"원");	
		System.out.println("총 주문금액 : "+totalFee+"원");	
		System.out.println("---------------------------");
		
	}

}
