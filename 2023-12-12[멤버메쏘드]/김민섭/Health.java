package com.itwill01.Method;

public class Health {
	int height, weight, age;
	String sex, name, part;

	public void teacherInfo(int height, int weight, String sex, String name, int age, String part) {
		this.height = height;
		this.weight = weight;
		this.age = age;
		this.sex = sex;
		this.name = name;
		this.part = part;
		System.out.printf("키가 %d 이고 몸무게가 %d 킬로인 %s, 이름은 %s 이고 나이는 %d 세이며 %s 입니다.\n", this.height, this.weight, this.sex,
				this.name, this.age, this.part);
	}
}
