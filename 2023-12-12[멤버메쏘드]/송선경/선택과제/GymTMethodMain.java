

public class GymTMethodMain {

	public static void main(String[] args) {

		// 2명의 강사 객체 생성 
			GymT t1 = new GymT();
			GymT t2 = new GymT();
		
		
			
		// 강사의 기본데이터 대입 메쏘드 호출 
			t1.setData (180,78,"남성","Tomas",37,"PT");
			t2.setData (170,50,"여성","Alice",26,"요가");
			
		
			
		// 강사 정보 출력 메소드 호출 
			t1.print();
			t2.print();
			
			
			
			
			
		/*
		 * 1. 헬스장 강사
키가 180 이고 몸무게가 78 킬로인 남성, 이름은 Tomas 이고 나이는 37세이며 PT담당 입니다.
키가 170 이고 몸무게가 50 킬로인 여성, 이름은 Alice 이고 나이는 26세이며 요가담당 입니다.	
		 */
	}

}
