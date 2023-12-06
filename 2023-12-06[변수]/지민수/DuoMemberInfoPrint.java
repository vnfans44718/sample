
public class DuoMemberInfoPrint {

	public static void main(String[] args) {
		
		int number;
		int marNumber;
		double height;
		boolean smoke;
		char gender;
		char grade;
		String name;
		String perNumber;
		String star;
		String que;
		String myInfo;
				
		 number = 149;
		 name = "지민수";
		 perNumber = "123456-7890123";
		 gender = 'M';
		 marNumber = 0;
		 smoke = true;
		 height = 177;
		 grade ='Z';
		 star = "**************************************************************************************************************";
		 que = " 기수		이름		주민번호		성별	결혼횟수	흡연여부	키	학점";
		 myInfo = "  "+number+" 		"+name+"		"+perNumber+"		  "+gender+"	    "+marNumber+"		"+smoke+"		"+height+"	  "+grade;
				
		 System.out.println("출력1");
		 System.out.println("********************************");
		 System.out.println("기    수 : "+number);
		 System.out.println("이    름 : "+name);
		 System.out.println("주민번호 : "+perNumber);
		 System.out.println("성    별 : "+gender);
		 System.out.println("결혼횟수 : "+marNumber);
		 System.out.println("흡연여부 : "+smoke);
		 System.out.println("키       : "+height);
		 System.out.println("학    점 : "+grade);
		 System.out.println("********************************");
		 
		 System.out.println("");	 
		 System.out.println("");	 
		 
		 System.out.println("출력2");
		 System.out.println(star);
		 System.out.println(que);
		 System.out.println(star);
		 System.out.println(myInfo);
		 System.out.println(star);
		 
		 
		 
		 
	}

}
