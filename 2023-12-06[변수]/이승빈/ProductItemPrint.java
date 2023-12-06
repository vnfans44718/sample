
public class ProductItemPrint {

	public static void main(String[] args) {
		String product;
		String type;
		String productNumber;
		String productIntroduce1;
		String productIntroduce2;
		String productIntroduce3;
		String price;
		double delivery;
		
		product = "청소기";
		type = "가전기기";
		productNumber = "123AED350001";
		productIntroduce1 = "못하는거 빼고 다 청소함";
		productIntroduce2 = "무선으로 알아서 돌아다님";
		productIntroduce3 = "음성인식 기능 탑재";
		price = "125,000";
		delivery = 2.5;
		
		System.out.println("# 제품소개");
		System.out.println("--------------------------------------");
		System.out.println("1.제 품 명 : "+product);
		System.out.println("2.분    류 : "+type);
		System.out.println("3.제품번호 : "+productNumber);
		System.out.println("4.제품소개 : 1) "+productIntroduce1);
		System.out.println("             2) "+productIntroduce2);
		System.out.println("             3) "+productIntroduce3);
		System.out.println("5.가    격 : "+price+"원");
		System.out.println("6.딜리버리 : "+"약 "+delivery+"일 소요");
		System.out.println("--------------------------------------");

	}

}
