package com.itwill05.service.collection.account;

public class Account {
	
	
	private int no;//계좌번호
	private String owner;//계좌주
	private int balance;//잔고
	private double iyul;//이율
	
	
	public Account() {}
	


	public Account(int no, String owner, int balance, double iyul) {
		this.no = no;
		this.owner = owner;
		this.balance = balance;
		this.iyul = iyul;
	}



	public void setAccount(int no, String owner, int balance, double iyul) {
		this.no = no;
		this.owner = owner;
		this.balance = balance;
		this.iyul = iyul;
	}


	public int getNo() {
		return no;
	}


	public void setNo(int no) {
		this.no = no;
	}


	public String getOwner() {
		return owner;
	}


	public void setOwner(String owner) {
		this.owner = owner;
	}


	public int getBalance() {
		return balance;
	}


	public void setBalance(int balance) {
		this.balance = balance;
	}


	public double getIyul() {
		return iyul;
	}


	public void setIyul(double iyul) {
		this.iyul = iyul;
	}
		
	//입금
	public void deposit(int m) {
			this.balance=this.balance+m;
	}
	
	
	//출금
	public void withDraw(int m) {
		this.balance=this.balance-m;
	}
	//계좌헤더출력
	public static void headerPrint() {
		System.out.printf("%s\n","---------------------------");
		System.out.printf("%s %5s %4s %4s\n","번호","이름","잔고","이율");
		System.out.printf("%s\n","---------------------------");
	}
	//계좌객체의 정보출력
	public void print() {
		System.out.printf("%d %6s %8d %5.1f \n",this.no,this.owner,this.balance,this.iyul);
	}
	
	
}
