
public class StudentScorePrint {

	public static void main(String[] args) {

		/*
		 * 성적관리에서 학생2명 데이타를 담을 변수선언 - 번호, 이름, 국어, 영어, 수학, 총점, 평균,
		 * 평점(A(90~100),B(80~89),C(70~79),D(60~69),F(0~59)), 석차
		 */

		int num1;
		String name1;
		double kor1;
		double eng1;
		double math1;
		double total1;
		double avg1;
		char score1;
		int rank1;
		
		int num2;
		String name2;
		double kor2;
		double eng2;
		double math2;
		double total2;
		double avg2;
		char score2;
		int rank2;

		/*
		 * 학생 2명의 기본데이터(번호, 이름, 국어, 영어, 수학) 입력
		 */

		num1 = 1;
		name1 = "김경호";
		kor1 = 42;
		eng1 = 56;
		math1 = 78;
		

		num2 = 2;
		name2 = "김경수";
		kor2 = 45;
		eng2 = 53;
		math2 = 76;
		

		/*
		 * 학생2명의 국어, 영어, 수학점수의 유효성체크 - 100점이 넘는 수나 음수가 입력되면 메세지를 출력하고 return(프로그램종료)한다.
		 */


		if (!((kor1 >= 0 && kor1 <= 100) && (eng1 >= 0 && eng1 <= 100) && (math1 >= 0 && math1 <= 100))) {
			System.out.println(name1 +"님의 점수 중에 유효하지 않은 값이 있으니 확인해주세요!");
			return;}
			
		if (!((kor2 >= 0 && kor2 <= 100) && (eng2 >= 0 && eng2 <= 100) && (math2 >= 0 && math2 <= 100))) {
				System.out.println(name2 + "님의 점수 중에 유효하지 않은 값이 있으니 확인해주세요!");
				return;
		}

		/*
		 * 학생 2명의 기본데이터(번호, 이름, 국어, 영어, 수학)를 이용해서 총점, 평균, 평점, 계산 후 대입 (석차는 0을 대입)
		 */
		
		total1 = kor1 + eng1 + math1;
		avg1 = (total1) / 3;
		
		if (avg1 >= 90) {
			score1='A';
		}else if (avg1 >=80) {
			score1='B';
		}else if (avg1 >=70) {
			score1='C';
		}else if (avg1 >=60) {
			score1='D';
		}else{
			score1='F';
		}
		
		rank1 = 3;
		
		total2 = kor2 + eng2 + math2;
		avg2 = (total2) / 3;
		if (avg2 >= 90) {
			score2='A';
		}else if (avg2 >=80) {
			score2='B';
		}else if (avg2 >=70) {
			score2='C';
		}else if (avg2 >=60) {
			score2='D';
		}else{
			score2='F';
		}
		rank2 = 2;

		/*
		 * - 출력포맷 
		 * - 평균은 소수점이하 첫째자리까지출력(반올림) 
		 * - 석차는 구하지마세요 
		 * --------------학생 성적출력------------------- 
		 * 학번 이름 국어 영어 수학 총점 평균 평점 석차
		 * ----------------------------------------------- 
		 * 1 김경호 42 56 78 334 34.8 A 3 
		 * 2 김경수 45 53 76 334 34.8 A 2 
		 * -----------------------------------------------
		 */
		
		System.out.println("--------------학생 성적출력------------------- ");
		System.out.println("학번 이름 국어 영어 수학 총점 평균 평점 석차");
		System.out.println("----------------------------------------------- ");
		System.out.printf("%2d %4s %2.0f %4.0f %4.0f %4.0f %5.1f %3c \t %d \n",num1,name1,kor1,eng1,math1,total1,avg1,score1,rank1);
		System.out.printf("%2d %4s %2.0f %4.0f %4.0f %4.0f %5.1f %3c \t %d \n",num2,name2,kor2,eng2,math2,total2,avg2,score2,rank2);
		System.out.println("----------------------------------------------- ");

	}

}
