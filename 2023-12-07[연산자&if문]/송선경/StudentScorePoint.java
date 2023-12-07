
public class StudentScorePoint {

	public static void main(String[] args) {

		// 변수입력
		int num1 = 1;
		String name1 = "김경호";
		int kor1 = 45;
		int eng1 = 56;
		int math1 = 78;
		int tot1;
		double avg1;
		char grade1;
		int rank1 = 3;

		int num2 = 2;
		String name2 = "김경수";
		int kor2 = 67;
		int eng2 = 99;
		int math2 = 88;
		int tot2;
		double avg2;
		char grade2;
		int rank2 = 2;

		// 총점, 평균, 평점 계산
		// 총점, 평균

		tot1 = (kor1 + eng1 + math1);
		tot2 = kor2 + eng2 + math2;
		avg1 = (kor1 + eng1 + math1) / 3.0;
		avg2 = (kor2 + eng2 + math2) / 3.0;

		// 평점

		
		if (avg1 >= 90) {
			
			grade1='A';
			
		} else if (avg1 >= 80) {
			grade1='B';
		} else if (avg1 >= 70) {
			grade1='C';
		} else {
			grade1='D';
		}
		
		
		if (avg2 >= 90) {
			
			grade2='A';
			
		} else if (avg2 >= 80) {
			grade2='B';
		} else if (avg2 >= 70) {
			grade2='C';
		} else {
			grade2='D';
		}

		// 유효성 체크


		if (!(kor1 >= 0 && kor1 <= 100)) {
			System.out.println(kor1 + "은 유효한 점수가 아닙니다.");
			return;
		}

		if (!(eng1 >= 0 && eng1 <= 100)) {
			System.out.println(eng1 + "은 유효한 점수가 아닙니다.");
			return;
		}

		if (!(math1 >= 0 && math1 <= 100)) {
			System.out.println(math1 + "은 유효한 점수가 아닙니다.");
			return;
		}

		if (!(kor2 >= 0 && kor2 <= 100)) {
			System.out.println(kor2 + "은 유효한 점수가 아닙니다.");
			return;
		}

		if (!(eng2 >= 0 && eng2 <= 100)) {
			System.out.println(eng2 + "은 유효한 점수가 아닙니다.");
			return;
		}

		if (!(math2 >= 0 && math2 <= 100)) {
			System.out.println(math2 + "은 유효한 점수가 아닙니다.");
			return;
		}

		System.out.println("---------------학생 성적출력-----------------------");
		System.out.println("학번  이름   국어 영어 수학 총점 평균   평점   석차");
		System.out.println("---------------------------------------------------");
		System.out.printf("%d %6s %4d %4d %4d %4d %5.1f %4s %5d \n", num1, name1, kor1, eng1, math1, tot1, avg1, grade1, rank1);
		System.out.printf("%d %6s %4d %4d %4d %4d %5.1f %4s %5d \n", num2, name2, kor2, eng2, math2, tot2, avg2, grade2, rank2);
		System.out.println("---------------------------------------------------");


	}

}
