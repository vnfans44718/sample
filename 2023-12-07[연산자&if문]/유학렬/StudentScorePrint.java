
public class StudentScorePrint {

	public static void main(String[] args) {

		// ***************김경호 학생의 데이타
		int number = 1;
		String name = "김경호";
		int kor = 42;
		int eng = 56;
		int math = 78;
		int tot = kor + eng + math;
		double avg = tot / 3.0;
		int rank = 0;
		int grade = (kor + eng + math) / 3;
		
		// **************김경수 학생의 데이타
		int number2 = 2;
		String name2 = "김경수";
		int kor2 = 45;
		int eng2 = 53;
		int math2 = 76;
		int tot2 = kor2 + eng2 + math2;
		double avg2 = tot2 / 3.0;
		int rank2 = 0;
		int grade2 = (kor2 + eng2 + math2) / 3;
		
		// ****************김경호 학생의 유효성체크
		if (!(grade >= 0 && grade <= 100)) {
			System.out.println(grade + "는 유효하지 않은 평점입니다.");
			return;
		}
		char hakjum = 'F';
		if (grade >= 90) {
			hakjum = 'A';
		} else if (grade >= 80) {
			hakjum = 'B';
		} else if (grade >= 70) {
			hakjum = 'C';
		} else if (grade > 60) {
			hakjum = 'D';
		} else {
			hakjum = 'F';
		}

		// *****************김경수 학생의 유효성체크
		if (!(grade2 >= 0 && grade2 <= 100)) {
			System.out.println(grade2 + "는 유효하지 않은 평점입니다.");
			return;
		}
		char hakjum2 = 'F';
		if (grade2 >= 90) {
			hakjum2 = 'A';
		} else if (grade2 >= 80) {
			hakjum2 = 'B';
		} else if (grade2 >= 70) {
			hakjum2 = 'C';
		} else if (grade2 > 60) {
			hakjum2 = 'D';
		} else {
			hakjum2 = 'F';
		}
		System.out.println("------------------학생 성적 출력-----------------------------");
		System.out.println("학번 이름 국어 영어 수학 총점 평균 평점 석차");
		System.out.println("-------------------------------------------------------------");
		System.out.printf("%2d  %3s  %2d  %2d   %2d  %3d  %5.1f  %2c  %2d \n", number, name, kor, eng, math, tot, avg, hakjum,
				rank);
		System.out.printf("%2d  %3s  %2d  %2d   %2d  %3d  %5.1f  %2c  %2d \n", number2, name2, kor2, eng2, math2, tot2, avg2,
				hakjum2, rank2);
		System.out.println("-------------------------------------------------------------");

	}

}
