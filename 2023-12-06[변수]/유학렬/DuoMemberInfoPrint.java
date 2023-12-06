
public class DuoMemberInfoPrint {

	public static void main(String[] args) {
   		
		int number,resident,resident2,marry;
		char gender,score;
		String name,smoke,image;
		double height;
		
		
   		number = 111111;
   		resident = 112345;
   		resident2 = 678901;
   		marry = 0;
   		gender = '남';
   		score = 'B';
   		name = "유학렬";
   		smoke = "true";
   		image = "하(하)";
   		height = 169.8;
   		
   		System.out.println("****************");
   		System.out.println();
   		System.out.println("회원번호 : "+number);
   		System.out.println("이    름 : "+name);
   		System.out.println("주민번호 : "+resident+" - "+resident2);
   		System.out.println("성    별 : "+gender);
   		System.out.println("결혼횟수 : "+marry);
   		System.out.println("흡연여부 : "+smoke);
   		System.out.println("키       : "+height);
   		System.out.println("학    점 : "+score);
   		System.out.println("용    모 : "+image);
   		System.out.println();
   		System.out.println("****************");
   		
   		System.out.println();
   		System.out.println();
   		
   		int number1 = 123456;
   		String subject = "Hello Java!";
   		String name1 = "유학렬";
   		int year = 2023;
   		int month = 12;
   		int day = 6;
   		int view = 0;
   		
   		System.out.println("******************************************");
   		System.out.println("  순번   제목    작성자  작성일    조회수");
   		System.out.println("******************************************");
   		System.out.println("  "+number1+" " + subject+" " + name1+" " + year + "." + month + "." + day+"   " + view);
   		System.out.printf("%d   %s  %s  %d  %d  %02d  %d  ",number1, subject, name1, year, month , day, view);
   		
   		System.out.println();
   		System.out.println();
   		
   		String made = "오뚜기";
   		String name2 = "오뚜기 맛있는 오뚜기밥";
   		String country = "한국";
   		int price = 20200;
   		int sale = 17600;
   		String delivery = "Free";
   		
   		System.out.println("*********************************");
   		System.out.println(made);
   		System.out.println(name2);
   		System.out.println("원산지 : "+country);
   		System.out.println("가  격 : "+price);
   		System.out.println("할인가 : "+sale);
   		System.out.println("배  송 : "+delivery);
		System.out.println("\t장바구니 담기"+" / "+"바로 구매");
		System.out.println("*********************************");
		
		System.out.println();
		System.out.println();
		
		String origin = "Coupang";
		String name3 = "장바구니";
		int a,b,c,d;
		a = 1; b = 2; c = 3; d = 4;
		String name4 = "일반구매";
		String name5 = "정기배송";
		String content = "장바구니에 담은 상품이 없습니다.";
		String content2 = "로그인을 하시면, 장바구니에 보관된 상품을 확인하실 수 있습니다.";
		String view1 = "오늘의 추천 상품보기 > ";
		
		System.out.println("*******************************************************************************************");
		System.out.println(origin);
		System.out.println("\t"+name3);
		System.out.println("\t"+"\t"+a+" "+"옵션선택"+" "+b+" "+"장바구니"+" "+c+" "+"주문/결제"+" "+d+" "+"주문완료");
		System.out.println("\t"+name4+"               "+name5);
		System.out.println("\t"+content);
		System.out.println(content2);
		System.out.println("\t"+view1);
		System.out.println("*******************************************************************************************");
		
				
		
		

	}

}
