
public class DuoMemberInfoPrint {
	public static void main(String[] args) {
		
		int mmnumber;
		String name;
		String regNo;
		char gender;
		int marriage;
		String smoking;
		double height;
		char score;
		String look;
		String duoInfo;
		
		mmnumber=8818;
		name="김하은";
		regNo="950609-1234567";
		gender='W';
		marriage=0;
		smoking="false";
		height=163.4;
		score='A';
		look="중";
		duoInfo=mmnumber+"       "+name+"   "+regNo+"  "+gender+"      "+marriage+"          "+smoking+"      "+height+"    "+score+"      "+look;
		
		System.out.println("***************************************************************************************");
		System.out.println("회원번호   이름     주민번호        성별   결혼횟수   흡연여부   키       학점   용모");
		System.out.println("***************************************************************************************");
		System.out.println(duoInfo);
		
	}
	
}