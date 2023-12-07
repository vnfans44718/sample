
public class StudentScorePrint {
	
	public static void main(String[] args) {
		
		int num1,kor1,eng1,math1,tot1,rank1;
		int num2,kor2,eng2,math2,tot2,rank2;
		String name1,name2;
		double avg1,avg2;
		char grade1, grade2;
		
		
		num1=1;
		name1="김경호";
		kor1=42;
		eng1=56;
		math1=78;
		rank1=0;
		
		num2=2;
		name2="김경수";
		kor2=45;
		eng2=53;
		math2=76;
		rank2=0;
		
		if (!((kor1>=0 && kor1<=100) && (eng1>=0 && eng1<=100) && (math1>=0 && math1<=100))){
			System.out.println("유효한 점수가 아닙니다");
			return;
		}
		
		if (!((kor2>=0 && kor2<=100) && (eng2>=0 && eng2<=100) && (math2>=0 && math2<=100))){
			System.out.println("유효한 점수가 아닙니다");
			return;
		}
		
		tot1=kor1+eng1+math1;
		tot2=kor2+eng2+math2;
		avg1=tot1/3.0;
		avg2=tot2/3.0;
		
		grade1= 'F'; 
		grade2= 'F'; 
		
		if (avg1>=90)  {
			grade1='A'; 
		}else if (avg1>=80) {
			grade1='B'; 
		}else if (avg1>=70) {
			grade1='C'; 
		}else if (avg1>=60) {
			grade1='D';
		}else {
			grade1='F'; 
		}
		
		if (avg2>=90)  {
			grade1='A'; 
		}else if (avg2>=80) {
			grade1='B'; 
		}else if (avg2>=70) {
			grade1='C'; 
		}else if (avg2>=60) {
			grade1='D';
		}else {
			grade1='F'; 
		}
		
		
		System.out.println("-----------------학생 성적출력-------------------");
		System.out.printf("%s %s %3s %3s %3s %3s %3s %3s %3s\n","학번","이름","국어","영어","수학","총점","평균","평점","석차");
		System.out.println("-------------------------------------------------");
		System.out.printf("%2d %4s %3d %4d %5d %5d %6.2f %3s %4s\n",num1,name1,kor1,eng1,math1,tot1,avg1,grade1,rank1);
		System.out.printf("%2d %4s %3d %4d %5d %5d %6.2f %3s %4s\n",num2,name2,kor2,eng2,math2,tot2,avg2,grade2,rank2);
		System.out.println("-------------------------------------------------");

		
		
		
		
		

	
		
	}

}


