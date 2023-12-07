
public class StudentScorePrint {

	public static void main(String[] args) {
		int number1, number2;
		number1 = 1;
		number2 = 2;
		String name1, name2;
		name1 = "김경호";
		name2 = "김경수";
		int kor1, kor2;
		kor1 = 42;
		kor2 = 45;
		int eng1, eng2;
		eng1 = 56;
		eng2 = 53;
		int math1, math2;
		math1 = 78;
		math2 = 76;
		int totalNumber1, totalNumber2;
		totalNumber1 = kor1+eng1+math1;
		totalNumber2 = kor2+eng2+math2;
		double average1, average2;
		average1 = (kor1+eng1+math1)/3.0;
		average2 = (kor2+eng2+math2)/3.0;
		char grade1, grade2;
		grade1 = 'F';
		grade2 = 'F';
		int sukcha1, sukcha2;
		sukcha1 = 0;
		sukcha2 = 0;
		
		
		if(!(kor1>=0 && kor1<=100)) {
			System.out.printf("%d는 유효하지 않은 점수입니다.\n", kor1);
			return;
		}
		if(!(kor2>=0 && kor2<=100)) {
			System.out.printf("%d는 유효하지 않은 점수입니다.\n", kor2);
			return;
		}
		if(!(eng1>=0 && eng1<=100)) {
			System.out.printf("%d는 유효하지 않은 점수입니다.\n", eng1);
			return;
		}
		if(!(eng2>=0 && eng2<=100)) {
			System.out.printf("%d는 유효하지 않은 점수입니다.\n", eng2);
			return;
		}
		if(!(math1>=0 && math1<=100)) {
			System.out.printf("%d는 유효하지 않은 점수입니다.\n", math1);
			return;
		}
		if(!(math2>=0 && math2<=100)) {
			System.out.printf("%d는 유효하지 않은 점수입니다.\n", math2);
			return;
		}
		
		
		
		if(average1>=90) {
			grade1 = 'A';
		}else if(average1>=80) {
			grade1 = 'B';
		}else if(average1>=70) {
			grade1 = 'C';
		}else if(average1>=60) {
			grade1 = 'D';
		}else {
			grade1 = 'F';
		}
		
		
		if(average2>=90) {
			grade2 = 'A';
		}else if(average2>=80) {
			grade2 = 'B';
		}else if(average2>=70) {
			grade2 = 'C';
		}else if(average2>=60) {
			grade2 = 'D';
		}else {
			grade2 = 'F';
		}
		
		}
		
		System.out.println("--------------------학생 성적출력--------------------");
		System.out.printf("%s  %s  %s  %s  %s  %s  %s  %s  %s  \n", "학번","이름","국어","영어","수학","총점","평균","평점","석차");
		System.out.println("-----------------------------------------------------");
		System.out.printf("%2d %5s %3d %5d %5d %6d %6.2f %3s %5d \n", number1, name1, kor1, eng1, math1, totalNumber1, average1, grade1, sukcha1);
		System.out.printf("%2d %5s %3d %5d %5d %6d %6.2f %3s %5d \n", number2, name2, kor2, eng2, math2, totalNumber2, average2, grade2, sukcha2);
		System.out.println("-----------------------------------------------------");
		
		
		
		
		
		
		
		
		
		
	}

}
