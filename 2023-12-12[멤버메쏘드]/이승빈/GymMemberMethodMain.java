package com.itwill01.method;

public class GymMemberMethodMain {

	public static void main(String[] args) {
		// 트레이너 객체 생성
		Gym trainer1 = new Gym();
		Gym trainer2 = new Gym();

		// 트레이너 기본데이타(키, 몸무게, 성별, 이름, 나이, 보직) 입력메쏘드 호출
		trainer1.trainerInfoData(180, 70, "남", "Tomas", 37, "PT담당");
		trainer2.trainerInfoData(170, 50, "여", "Alice", 26, "요가담당");

		// 트레이너 데이타 출력메쏘드 호출
		trainer1.headerPrint();
		trainer1.trainerInfoPrint();
		trainer2.trainerInfoPrint();
	}

}
