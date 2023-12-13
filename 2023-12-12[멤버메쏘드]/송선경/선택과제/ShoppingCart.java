
public class ShoppingCart {

	// 필드 선언

	String name;
	int weight;
	int review;
	int pRate;
	int price;
	int oPrice;
	int orderNo;
	String origin;
	int total;
	String prtGrd;

	// 메소드 선언

	// 기본 정보데이터 입력 메소드

	public void setData(String name, int weight, int review, int pRate, int oPrice, int orderNo, String origin) {

		this.name = name;
		this.weight = weight;
		this.review = review;
		this.pRate = pRate;
		this.oPrice = oPrice;
		this.orderNo = orderNo;
		this.origin = origin;

	}

	// 제품 할인가격 메소드

	public void discountP() {
		price = oPrice - ((oPrice * pRate) / 100);
	}

	// 제품 총합계 메소드
	public void Ptotal() {
		total = price * orderNo;
	}

	// 제품 등급 매기기 메소드 (별로 표시/ 별 유니코드 U+2605)
	public void prtGrd() {

		if (review >= 10000) {
			prtGrd = "★★★★★";
		} else if (review >= 8000) {
			prtGrd = "★★★★";
		} else if (review >= 6000) {
			prtGrd = "★★★";
		} else if (review >= 4000) {
			prtGrd = "★★";
		} else {
			prtGrd = "★";
		}
	}

	// 제품 출력 헤더 메소드
	public void headerPrint() {
		System.out.printf("SSG 푸드마켓\n");
	}

	// 제품 출력 메소드

	public void print() {
		System.out.printf("SSG%s %dg\n", this.name, this.weight);
		System.out.printf("%s %d건\n", this.prtGrd, this.review);
		System.out.printf("원산지: 상세설명참조\n");
		System.out.printf("%d%% %d원\n", this.pRate, this.price);
		System.out.printf("카드사별 무이자 할부\n");
		System.out.printf("새벽배송\n");
		System.out.printf("SSG%s %dg\n", this.name, this.weight);
		System.out.printf("수량 : %d\n", this.orderNo);
		System.out.printf("총합계 : %d원\n", this.total);

	}

}
