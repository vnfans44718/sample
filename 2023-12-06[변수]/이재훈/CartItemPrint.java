
public class CartItemPrint {

	public static void main(String[] args) {
		int a=236514, c1=201212, c2=3495039;
		char b1='남',b2='\u0030',b3='\u0041';
		String str1="홍길동",str2="상(중)";
		boolean e=true;
		double f=178.3;
		
		System.out.println("***********************************************************************************************");
		System.out.println("회원번호   이름 	주민번호	성별	결혼횟수   흡연여부	 키	  학점	 용모");
		System.out.println("***********************************************************************************************");
		System.out.println(a+"	  "+str1+"     "+c1+"-"+c2+"      "+b1+"        "+b2+"         "+e+"       "+f+"      "+b3+"    "+str2);

	}

}
