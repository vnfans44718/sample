## Collection 연습
### AccountServiceArrayList객체사용 
  + Account.java
  + AccountServiceArrayList.java
  + AccountServiceArrayListMain.java]     

##### 1.AccountServiceArrayList.java

```java
package com.itwill05.service.collection.account;



import java.util.ArrayList;


/*
 * 1.ArrayList<Account>(계좌객체들) 을멤버변수로가진다.
 * 2.Account객체전체에관련된 업무를 실행할클래스
 */
public class AccountServiceArrayList {
	private ArrayList<Account> accountList;

	public AccountServiceArrayList() {
		accountList = new ArrayList<Account>();
		accountList.add(new Account(1111, "KIM", 89000, 1.3));
		accountList.add(new Account(2222, "AIM", 45000, 2.7));
		accountList.add(new Account(3333, "FIM", 23000, 4.7));
		accountList.add(new Account(4444, "XIM", 34000, 6.7));
		accountList.add(new Account(5555, "HIM", 78000, 3.7));
		accountList.add(new Account(6666, "AIM", 99000, 5.7));
		accountList.add(new Account(7777, "PIM", 89000, 4.7));
		accountList.add(new Account(8888, "QIM", 91000, 1.7));
		accountList.add(new Account(9999, "MIM", 12000, 0.7));
	}
	/*
	private Account[] accounts= {
			new Account(1111, "KIM", 89000, 1.3),
			new Account(2222, "AIM", 45000, 2.7),
			new Account(3333, "FIM", 89000, 4.7),
			new Account(4444, "XIM", 34000, 6.7),
			new Account(5555, "hIM", 78000, 3.7),
			new Account(6666, "KIM", 89000, 5.7),
			new Account(7777, "KIM", 89000, 4.7),
			new Account(8888, "qIM", 91000, 1.7),
			new Account(9999, "mIM", 12000, 0.7),
	};
	*/
	/*
	 * 계좌전체반환
	 */
	public ArrayList<Account> getAccountList() {
		return accountList;
	}

	/*
	 * 계좌추가
	 */
	public boolean addAccount(Account account) {
		/*
		 * 번호중복체크후 
		 * 중복이면      호출한클래스에게 false
		 * 중복이 아니면 accountList에 add하고  호출한클래스에게 true 를 반환해줌[OPTION]
		 */
		//accountList.add(account);
		
		return true;
	}

	/*
	 * 1.은행계좌들 총계좌수반환메쏘드정의
	 */

	public int totAccountNumber() {
		return accountList.size();

	}

	/*
	 * 2.은행계좌들 전체출력메쏘드정의
	 */
	public void print() {
		Account.headerPrint();

		for (int i = 0; i < accountList.size(); i++) {
			Account tempAccount = accountList.get(i);
			tempAccount.print();
		}

		/*
		 * // enhanced for문 
		 * for(Account tempAccount:accountList) { 
		 * 	tempAccount.print();
		 * }
		 */

	}

	/*
	 * 3.은행계좌들 총잔고 반환메쏘드 정의
	 */
	public int totBalance() {
		int totBalance = 0;

		return totBalance;
	}

	/*
	 * 4.계좌번호 인자로받아서 번호와일치하는 계좌한개반환메쏘드정의
	 */
	public Account findByNo(int no) {
		Account findAccount = null;

		return findAccount;
	}

	/*
	 * 5.계좌잔고 인자로 받아서 잔고이상인 계좌들반환
	 */
	public ArrayList<Account> findByBalance(int balance) {
		ArrayList<Account> findAccountList = new ArrayList<Account>();

		return findAccountList;
	}

	/*
	 * 8.6666번계좌 4000원 입금한후 입금계좌 참조변수반환
	 */
	public  Account ipGum(int no, int m) {
		return null;
	}

	/*
	 * 9.1111번계좌 5000원 출금한후 출금계좌 참조변수반환
	 */
	public Account chulGum(int no, int m) {
		return null;
	}

	/*
	 * 7.은행계좌들 중에 계좌주이름이 AIM인 계좌들반환
	 */
	public ArrayList<Account> findByName(String owner) {
		ArrayList<Account> findAccountList = new ArrayList<Account>();

		return findAccountList;
	}

	/*
	 * 9.VIP계좌(잔고 70000원이상)들 반환
	 */
	public ArrayList<Account> findByVip(int balance) {
		ArrayList<Account> findAccountList = new ArrayList<Account>();

		return findAccountList;
	}

	/*
	 * 10.계좌를 잔고순으로 오름차순정렬
	 *  	Collections.sort();
	 */
	public void sortByBalanceAsc() {
		
	}

	/*
	 * 11.계좌를 잔고순으로 내림차순정렬
	 * 		Collections.sort();
	 */
	public void sortByBalanceDesc() {

	}

	/*
	 * 12.6666번계좌의 이름,잔고,이율 수정(update)후 수정된객체 반환
	 */
	public Account updateAccount(Account updateAccount) {
		return null;
	}

	/*
	 * 13.번호로 계좌삭제후 삭제된객체반환
	 */
	public Account deleteByNo(int no) {
		Account deleteAccount = null;

		return deleteAccount;
	}

}

```
##### 2.AccountServiceArrayListMain.java
```java
package com.itwill05.service.collection.account;

import java.util.ArrayList;

public class AccountServiceArrayListMain {

	public static void main(String[] args) {

		AccountServiceArrayList accountServiceArrayList = new AccountServiceArrayList();
		System.out.println("0.AccountServiceArrayList야 은행계좌추가해줘");
		Account addAccount = new Account(1000, "고소영", 89000, 0.5);
		
		boolean isAdd = accountServiceArrayList.addAccount(addAccount);
		if(isAdd) {
			System.out.println("account추가성공");
		}else {
			System.out.println("중복계좌입니다");
		}
		accountServiceArrayList.addAccount(new Account(1001, "이소라", 30000, 3.3));
		System.out.println("1.AccountServiceArrayList야 은행계좌들 총계좌수반환해줘");
		int accountCount = accountServiceArrayList.totAccountNumber();
		System.out.println("총계좌수[main]:" + accountCount);
		System.out.println("2.AccountServiceArrayList야 은행계좌들 전체출력해줘");
		accountServiceArrayList.print();
		
		System.out.println("3.AccountServiceArrayList야은행계좌들 총잔고 반환해줘");
		int totBalance = accountServiceArrayList.totBalance();
		System.out.println("총잔고[main]:" + totBalance);
		System.out.println("4.AccountServiceArrayList야 계좌번호줄께 계좌한개반환해줘");
		Account findAccount = accountServiceArrayList.findByNo(5555);
		System.out.println("계좌한개[main]");
		findAccount.print();
		System.out.println("5.AccountServiceArrayList야 계좌잔고줄께 잔고이상인 계좌들반환해줘[OPTION]");
		ArrayList<Account> findAccounts = accountServiceArrayList.findByBalance(50000);
		System.out.println(" 반환계좌수:" + findAccounts.size());
		
		System.out.println("7.AccountServiceArrayList야은행계좌들 중에 계좌주이름이 AIM인 계좌들반환해줘");
		findAccounts=accountServiceArrayList.findByName("AIM");
		/*
		 * 8.6666번계좌 4000원 입금해줘
		 */
		System.out.println("8.AccountServiceArrayList야1111번계좌 50000원 출금한후에 Account객체반환해줘");
		Account chulGumAccount=
			accountServiceArrayList.chulGum(1111, 50000);
		chulGumAccount.print();
		System.out.println(" 8.6666번계좌 4000원 입금한후 Account객체반환받음");
		Account ipGumAccount=
				accountServiceArrayList.ipGum(6666, 4000);
		ipGumAccount.print();
		System.out.println("9.VIP계좌(잔고 70000원이상)들 반환해줘");
		findAccounts=accountServiceArrayList.findByBalance(70000);
		System.out.println("10.계좌를 잔고순으로 오름차순정렬해줘");
		accountServiceArrayList.sortByBalanceAsc();
		accountServiceArrayList.print();
		System.out.println("11.계좌를 잔고순으로 내림차순정렬해줘");
		accountServiceArrayList.sortByBalanceDesc();
		accountServiceArrayList.print();
		
		System.out.println(" 12.6666번계좌의 이름,잔고,이율 수정(update)후 Account객체반환받음");
		Account updateAccount1 = new Account(6666, "YYY", 900000000, 0.4);
		Account updateAccount2 = accountServiceArrayList.updateAccount(updateAccount1);
		updateAccount2.print();
		System.out.println(" 12.8888번계좌삭제후 Account객체반환받음");
		Account deleteAccount = accountServiceArrayList.deleteByNo(8888);
		deleteAccount.print();
		System.out.println("-----------전체계좌 출력-------------");
		accountServiceArrayList.print();
	}

}


```


