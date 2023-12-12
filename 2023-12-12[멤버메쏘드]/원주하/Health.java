package com.itwill001.Field;

public class Health {

	int height;
	int weight;
	String name;
	String lecture;
	int age;

	
	public void height1(int height) {
		this.height=height;
		
	}
	public void weight1(int weight) {
		this.weight=weight;
	}
	public void name1(String name) {
		this.name= name;
	}
	public void lecture1(String lecture) {
		this.lecture= lecture;
	}
	public void age1(int age) {
		this.age=age;
	}
	
	public void headerprint() {
		System.out.printf("=========================================================\n");
		System.out.printf("%s %s %3s %s %s \n", "이름", "키", "무게", "수업", "나이");
	}
	public void print() {
		System.out.printf("=========================================================\n");
		System.out.printf("%s %d %d %s %d \n", this.name, this.height, this.weight, this.lecture, this.age);
	}
}
