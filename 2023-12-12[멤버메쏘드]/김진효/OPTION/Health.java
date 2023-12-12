/*
헬스장 강사

키가 180 이고 몸무게가 78 킬로인 남성, 이름은 Tomas 이고 나이는 37세이며 PT담당 입니다.
키가 170 이고 몸무게가 50 킬로인 여성, 이름은 Alice 이고 나이는 26세이며 요가담당 입니다. 

 ***** 정보 소개를 위해 필요한 헬스장 강사 객체을 위한 클래스
 */

package com.itwill01.option;

public class Health {

	/*
	 * << 속성(멤버변수)   >> 키, 몸무게, 성별, 이름, 나이, 담당직무
	 * << 기능(멤버메쏘드) >> 기본데이타입력, 출력
	 */

	// 멤버 변수 선언
	int height;
	int weight;
	String gender;
	String name;
	int age;
	String responsibility;

	// 멤버메쏘드 선언

	/*
	 * 기본데이터 메쏘드 
	 */
	public void basicData(int height, int weight, String gender, String name, int age, String responsibility) {
		this.height = height;
		this.weight = weight;
		this.gender = gender;
		this.name = name;
		this.age = age;
		this.responsibility = responsibility;
	}
	
	/*
	 * 출력 메쏘드 
	 */
	public void headerPrint() {
		System.out.printf("헬스장 강사\n");
	}
	
	public void infoPrint() {
		System.out.printf("%2s %3d %7s %2d %3s %2s %s %5s %s %d %s %s %s \n","키가",this.height,"이고 몸무게가",this.weight,"킬로인",this.gender,", 이름은",this.name,"이고 나이는",this.age,"이며",this.responsibility,"담당 입니다.");
	}
}
