package com.itwill01.method;

public class Health {

		int height;
		int weigh;
		String gender;
		String name;
		int age;
		String Manager;
		
		public void data(int height,int weigh,String gender,String name,int age,String Manager) {
		this.height=height;
		this.weigh=weigh;
		this.gender=gender;
		this.name=name;
		this.age=age;
		this.Manager=Manager;
		}
		
		public void print() {
			System.out.printf("키가 "+"%d"+" 이고 몸무게가 "+
					"%d"+" 킬로인 "+"%s"+", 이름은 "+"%s"+" 이고 나이는 "+
					"%d"+"세이며 "+"%s"+" 입니다."+"\n",
					this.height,this.weigh,this.gender,this.name,this.age,this.Manager);
		}
		

}
