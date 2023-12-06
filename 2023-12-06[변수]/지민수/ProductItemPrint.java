
public class ProductItemPrint {

	public static void main(String[] args) {
		// 상품명 가격 수량 상세정보 상품리뷰 상품문의
		
		String product = "나랑드사이다";
		String price = "19,900";
		String number = "10EA";
		String info = "업데이트 예정";
		String review = "good";
		String inquiry = "없음";
		String line = "------------------------";
		
		System.out.println(line);
		System.out.println("상 품 명 : "+product);
		System.out.println("가    격 : "+price);
		System.out.println("수    량 : "+number);
		System.out.println("상세정보 : "+info);
		System.out.println("상품리뷰 : "+review);
		System.out.println("상품문의 : "+inquiry);
		System.out.println(line);
		
		
	}

}
