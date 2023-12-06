
public class ProductItemPrint {

	public static void main(String[] args) {
		String product;
		String type;
		String productNumber;
		String productIntroduce;
		String price;
		double delivery;
		
		product = "청소기";
		type = "가전기기";
		productNumber = "123AED350001";
		productIntroduce = "못하는거 빼고 다 청소함";
		price = "125,000";
		delivery = 2.5;
		
		System.out.println("# 제품소개");
		System.out.println("--------------------------------------");
		System.out.println("1.제 품 명 : "+product);
		System.out.println("2.분    류 : "+type);
		System.out.println("3.제품번호 : "+productNumber);
		System.out.println("4.제품소개 : "+productIntroduce);
		System.out.println("5.가    격 : "+price+"원");
		System.out.println("6.딜리버리 : "+"약 "+delivery+"일 소요");
		System.out.println("--------------------------------------");

	}

}
