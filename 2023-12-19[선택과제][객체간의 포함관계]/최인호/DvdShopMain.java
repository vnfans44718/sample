package com_12_19;

public class DvdShopMain {

	public static void main(String[] args) {

		DvdMember m1 = new DvdMember(1, "최인호", "010-1234-5678");
		Dvd[] d1 = { new Dvd(1, "바람과 함께 사라지다", "판타지"), new Dvd(2, "타짜", "액션") };

		m1.setRentDvd(d1);

		m1.print();

	}

}