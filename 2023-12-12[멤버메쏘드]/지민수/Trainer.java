package com.itwill01.method;


public class Trainer {
	
	int height, weight, age;
	String name, gender, res;
	
	public void data(String name, String gender, int height,
			int weight, int age, String res) {
		this.name = name;
		this.gender = gender;
		this.height = height;
		this.weight = weight;
		this.age = age;
		this.res = res;
		
	}
	public void headerprint() {
		System.out.println("--------------헬스장 강사---------------");
		System.out.println("이름  성별  키 몸무게 나이 담당업무");
	}
	public void print() {
		System.out.printf("%s %s %d %4d %5d %6s\n",name,gender,height,weight,age,res);
	}
	
	
}
