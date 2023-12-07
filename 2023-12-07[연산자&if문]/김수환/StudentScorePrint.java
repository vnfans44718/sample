public class StudentScorePrint {

	public static void main(String[] args) {
		/*
		 * 성적관리에서 학생2명 데이타를 담을 변수선언 
		 * - 번호, 이름, 국어, 영어, 수학, 총점, 평균, 평점(A(90~100),B(80~89),C(70~79),D(60~69),F(0~59)), 석차
		 */
		int student1OfNumber;
		String student1OfName;
		int student1OfKor;
		int student1OfEng;
		int student1OfMath;
		int student1OfTotalScore;
		double student1OfAvg;
		char student1OfGrade;
		int student1OfLevel;

		int student2OfNumber;
		String student2OfName;
		int student2OfKor;
		int student2OfEng;
		int student2OfMath;
		int student2OfTotalScore;
		double student2OfAvg;
		char student2OfGrade;
		int student2OfLevel;

		/*
		 * 학생 2명의 기본데이터(번호, 이름, 국어, 영어, 수학) 입력
		 */
		student1OfNumber = 1;
		student1OfName = "임꺽정";
		student1OfKor = 92;
		student1OfEng = 88;
		student1OfMath = 67;

		student2OfNumber = 2;
		student2OfName = "홍길동";
		student2OfKor = 42;
		student2OfEng = 38;
		student2OfMath = 27;

		/*
		 * 학생2명의 국어, 영어, 수학점수의 유효성체크 
		 * - 100점이 넘는 수나 음수가 입력되면 메세지를 출력하고 return(프로그램종료)한다.
		 */
		if (!(student1OfKor >= 0 && student1OfKor <= 100)) {
			System.out.println(student1OfName + "의 국어 점수 " + student1OfKor + " 은 유효하지 않은 점수입니다.");
			return;
		}
		if (!(student1OfEng >= 0 && student1OfEng <= 100)) {
			System.out.println(student1OfName + "의 영어 점수 " + student1OfEng + " 은 유효하지 않은 점수입니다.");
			return;
		}
		if (!(student1OfMath >= 0 && student1OfMath <= 100)) {
			System.out.println(student1OfName + "의 수학 점수 " + student1OfMath + " 은 유효하지 않은 점수입니다.");
			return;
		}

		if (!(student2OfKor >= 0 && student2OfKor <= 100)) {
			System.out.println(student1OfName + "의 국어 점수 " + student2OfKor + " 은 유효하지 않은 점수입니다.");
			return;
		}
		if (!(student2OfEng >= 0 && student2OfEng <= 100)) {
			System.out.println(student2OfName + "의 영어 점수 " + student2OfEng + " 은 유효하지 않은 점수입니다.");
			return;
		}
		if (!(student2OfMath >= 0 && student2OfMath <= 100)) {
			System.out.println(student2OfName + "의 수학 점수 " + student2OfMath + " 은 유효하지 않은 점수입니다.");
			return;
		}
		/*
		 * 학생 2명의 기본데이터(번호, 이름, 국어, 영어, 수학)를 이용해서 총점, 평균, 평점, 계산 후 대입 
		 * (석차는 0을 대입)
		 */
		student1OfTotalScore = student1OfKor + student1OfEng + student1OfMath;
		student1OfAvg = student1OfTotalScore / 3.0;
		student1OfGrade = 'F';
		if (student1OfAvg >= 90) {
			student1OfGrade = 'A';
		} else if (student1OfAvg >= 80) {
			student1OfGrade = 'B';
		} else if (student1OfAvg >= 70) {
			student1OfGrade = 'C';
		} else if (student1OfAvg >= 60) {
			student1OfGrade = 'D';
		}
		student1OfLevel = 0;

		student2OfTotalScore = student2OfKor + student2OfEng + student2OfMath;
		student2OfAvg = student2OfTotalScore / 3.0;
		student2OfGrade = 'F';
		if (student2OfAvg >= 90) {
			student2OfGrade = 'A';
		} else if (student2OfAvg >= 80) {
			student2OfGrade = 'B';
		} else if (student2OfAvg >= 70) {
			student2OfGrade = 'C';
		} else if (student2OfAvg >= 60) {
			student2OfGrade = 'D';
		}
		student2OfLevel = 0;
		/*
		 * - 출력포맷 - 평균은 소수점이하 첫째자리까지출력(반올림) 
		 * - 석차는 구하지마세요
		 * --------------학생성적출력------------------- 
		 * 학번 이름 국어 영어 수학 총점 평균 평점 석차
		 * ----------------------------------------------- 
		 * 1 김경호 42 56 78 334 34.8 A 3 
		 * 2 김경수 45 53 76 334 34.8 A 2 
		 * -----------------------------------------------
		 */
		System.out.println("--------------학생성적출력-------------------");
		System.out.println("학번 이름 국어 영어 수학 총점 평균 평점 석차");
		System.out.println("----------------------------------------------- ");
		System.out.printf("%2d %4s %4d %4d %4d %4d %5.1f %3c %3d\n", student1OfNumber, student1OfName, student1OfKor,
				student1OfEng, student1OfMath, student1OfTotalScore, student1OfAvg, student1OfGrade, student1OfLevel);
		System.out.printf("%2d %4s %4d %4d %4d %4d %5.1f %3c %3d\n", student2OfNumber, student2OfName, student2OfKor,
				student2OfEng, student2OfMath, student2OfTotalScore, student2OfAvg, student2OfGrade, student2OfLevel);
		System.out.println("----------------------------------------------- ");
	}

}