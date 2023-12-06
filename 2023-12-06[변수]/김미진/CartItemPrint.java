
public class CartItemPrint {

	public static void main(String[] args) {
		
		String mtitle;
		String choice;
		String img;
		String title;
		String price1;
		String price2;
		String store;
		String order;
		
		mtitle = "장바구니";
		choice = "□";
		img = "이미지";
		title = "(한정수량) 제주도 서귀포 감귤 선물세트 10kg";
		price1 = "67,500";
		price2 = "3,500";
		store = "제서감댁";
		order = "주문하기";
		
		String content = "│ "+choice+" │ "+img+" │ "+title+" │ "+price1+" │  "+price2+"  │ "+store+" │ "+order+" │ ";
		
		System.out.println(mtitle);
		System.out.println("-----------------------------------------------------------------------------------------------------");
		System.out.println("│   │        │                   상품명                    │  금액  │ 배송비  │  스토어  │          │");
		System.out.println("-----------------------------------------------------------------------------------------------------");
		System.out.println(content);

	}

}
