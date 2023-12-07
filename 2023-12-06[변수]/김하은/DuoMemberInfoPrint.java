
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
		duoInfo=mmnumber+"\t\t"+name+"\t\t"+regNo+"\t\t"+gender+"\t"+marriage+"\t\t"+smoking+"\t\t"+height+"\t"+score+"\t"+look;
		
		System.out.println("*************************************************************************************************************************");
		System.out.println("회원번호\t이름\t\t주민번호\t\t성별\t결혼횟수\t흡연여부\t키\t학점\t용모");
		System.out.println("*************************************************************************************************************************");
		System.out.println(duoInfo);
		
	}
	
}