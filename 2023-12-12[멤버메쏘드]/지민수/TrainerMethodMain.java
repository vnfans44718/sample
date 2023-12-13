/*
 * 헬스장 강사

키가 180 이고 몸무게가 78 킬로인 남성 이름은 Tomas 이고 나이는 PT 담당이며 37세입니다.
키가 170 이고 몸무게가 50 킬로인 여성 이름은 Alice 이고 나이는 요가담당이며 26세입니다.
 */
package com.itwill01.method;

public class TrainerMethodMain {

	public static void main(String[] args) {
		Trainer tra1 = new Trainer();
		Trainer tra2 = new Trainer();
		
		tra1.data("Tomas", "남자", 180, 78, 37, "PT 담당");
		tra2.data("Alice", "여자", 170, 50, 26, "요가 담당");
		
		tra1.headerprint();
		tra1.print();
		tra2.print();
	}
	
}
