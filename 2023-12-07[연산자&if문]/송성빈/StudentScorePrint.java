public class StudentScorePrint {

	public static void main(String[] args) {
		int 학번1, 학번2;
		String 이름1, 이름2;
		int 국어1, 국어2;
		int 영어1, 영어2;
		int 수학1, 수학2;
		int 총점1, 총점2;
		double 평균1, 평균2;
		char 평점1, 평점2;
		int 석차1, 석차2;

		학번1 = 1;
		이름1 = "김경호";
		국어1 = 42;
		영어1 = 56;
		수학1 = 78;
		총점1 = 국어1 + 영어1 + 수학1;
		평균1 = 총점1 / 3.0;

		학번2 = 2;
		이름2 = "김경수";
		국어2 = 45;
		영어2 = 53;
		수학2 = 76;
		총점2 = 국어2 + 영어2 + 수학2;
		평균2 = 총점2 / 3.0;

		if (평균1 > 평균2) {
			석차1 = 1;
			석차2 = 2;
		} else {
			석차1 = 2;
			석차2 = 1;
		}

		if (평균1 >= 90) {
			평점1 = 'A';
		} else if (평균1 >= 80) {
			평점1 = 'B';
		} else if (평균1 >= 70) {
			평점1 = 'C';
		} else if (평균1 >= 60) {
			평점1 = 'D';
		} else {
			평점1 = 'F';
		}

		if (평균2 >= 90) {
			평점2 = 'A';
		} else if (평균2 >= 80) {
			평점2 = 'B';
		} else if (평균2 >= 70) {
			평점2 = 'C';
		} else if (평균2 >= 60) {
			평점2 = 'D';
		} else {
			평점2 = 'F';
		}

		/*
		if (국어1 < 0 || 국어1 > 100) {
			System.out.println("유효하지 않은 점수입니다.");
			return;
		} else if (국어2 < 0 || 국어2 > 100) {
			System.out.println("유효하지 않은 점수입니다.");
			return;
		} else if (영어1 < 0 || 영어1 > 100) {
			System.out.println("유효하지 않은 점수입니다.");
			return;
		} else if (영어2 < 0 || 영어2 > 100) {
			System.out.println("유효하지 않은 점수입니다.");
			return;
		} else if (수학1 < 0 || 수학2 > 100) {
			System.out.println("유효하지 않은 점수입니다.");
			return;
		} else if (수학2 < 0 || 수학2 > 100) {
			System.out.println("유효하지 않은 점수입니다.");
			return;
		}
		*/
		
		int [] 점수 = {국어1, 국어2, 영어1, 영어2, 수학1, 수학2};
		
		for (int i = 0; i < 점수.length; i++) {
			int 유효성 = 점수[i];
			if(유효성 < 0 || 유효성 > 100) {
				System.out.println("유효하지 않는 점수입니다.");
				return;
			}
		}

		System.out.println("--------------학생 성적출력-------------------");
		System.out.println("학번  이름   국어 영어 수학 총점 평균 평점 석차");
		System.out.printf("%2d %5s %4d %4d %4d %4d %5.1f %3s %4d \n", 학번1, 이름1, 국어1, 영어1, 수학1, 총점1, 평균1, 평점1, 석차1);
		System.out.printf("%2d %5s %4d %4d %4d %4d %5.1f %3s %4d \n", 학번2, 이름2, 국어2, 영어2, 수학2, 총점2, 평균2, 평점2, 석차2);

	}
}
