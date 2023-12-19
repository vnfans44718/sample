package com.itwill01.method;
/*
   >> [Option] 객체 구현 및 출력
      1. 헬스장 강사 정보 객체 구현
 */
public class Gym {

	// 멤버변수 선언(키, 몸무게, 성별, 이름, 나이, 보직)
	int height;
	int weight;
	String sex;
	String name;
	int age;
	String part;

	// 인적사항정보메쏘드 선언
	public void trainerInfoData(int height, int weight, String sex, String name, int age, String part) {
		this.height = height;
		this.weight = weight;
		this.sex = sex;
		this.name = name;
		this.age = age;
		this.part = part;
	}

	// 출력메쏘드
	public void headerPrint() {
		System.out.printf("# ㅇㅇ헬스장 강사 정보\n");
		System.out.printf("\n");
	}

	public void trainerInfoPrint() {
		System.out.printf(" - 키가 %d 이고 몸무게가 %d 킬로인 %s성, 이름은 %s 이고 나이는 %d세이며 %s 입니다.\n",
				          this.height, this.weight, this.sex, this.name, this.age, this.part);
	}

}
