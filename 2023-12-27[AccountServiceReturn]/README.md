## 연습3
### AccountServiceReturn객체사용 
  + Account.java
  + AccountServiceReturn.java
  + AccountServiceReturnMain.java
#### return 연습

##### 1.AccountServiceReturn.java
```java
package com.itwill05.service.account;

/*
 * 1.계좌객체들(Account[]) 을멤버변수로가진다.
 * 2.계좌객체들을 사용해서 업무실행
 */
public class AccountServiceReturn {

	public static final int SORT_BY_NO=1;
	public static final int SORT_BY_OWNER=2;
	public static final int SORT_BY_BALANCE=3;
	public static final int SORT_BY_IYUL=4;
	
	public static final int SORT_ASC=1;
	public static final int SORT_DESC=2;

	private Account[] accounts = { 
			new Account(1111, "KIM", 85000, 5.9), 
			new Account(2222, "JIM", 77000, 4.2),
			new Account(3333, "FIM", 56000, 1.2), 
			new Account(4444, "SIM", 77000, 0.2),
			new Account(5555, "GIM", 94000, 3.2), 
			new Account(6666, "AIM", 56000, 6.2),
			new Account(7777, "XIM", 33000, 7.2), 
			new Account(8888, "QIM", 77000, 5.2),
			new Account(9999, "AIM", 80000, 1.2) };
	/*
	 * 0.계좌객체를 인자로받아서 Account[]에추가[OPTION]
	 */
	public void addAccount(Account newAccount) {
		/*
		 * 1.배열크기증가 
		 * 	- 기존배열보다큰배열생성 
		 * 	- 기존데이타 옮김
		 */
		Account[] newAccounts = new Account[accounts.length + 1];
		for (int i = 0; i < accounts.length; i++) {
			newAccounts[i] = accounts[i];
		}
		newAccounts[accounts.length] = newAccount;
		this.accounts = newAccounts;
	}
	/*
	 * 0.계좌데이타를 인자로받아서 Account[]에추가[OPTION]
	 */
	public void addAccount(int no, String owner, int balance, double iyul) {
		Account newAccount = new Account(no, owner, balance, iyul);
		/*
		 * 1.배열크기증가 
		 * 	- 기존배열보다큰배열생성 
		 * 	- 기존데이타 옮김
		 */
		Account[] newAccounts = new Account[accounts.length + 1];
		for (int i = 0; i < accounts.length; i++) {
			newAccounts[i] = accounts[i];
		}
		newAccounts[accounts.length] = newAccount;
		this.accounts = newAccounts;
	}
	/*
	 * 1.은행계좌들 총계좌수 반환메써드
	 */
	public int getTotAccountNumber() {
		return 0;
	}

	/*
	 * 2.은행계좌들 전체출력메쏘드 정의
	 */
	public void print() {
		Account.headerPrint();
		for (int i = 0; i < accounts.length; i++) {
			accounts[i].print();
		}
	}

	/*
	 * 3.은행계좌들 총잔고를 반환하는 메쏘드
	 */
	public int getAccountTotBalance() {
		return 0;
	}

	/*
	 * 4.계좌번호를 인자로받아서 계좌객체주소 한개반환
	 */
	public Account findByNo(int no) {
		return null;
	}

	/*
	 * 5.계좌잔고 인자로받아서 잔고이상인 계좌배열객체 참조변수반환
	 */
	public Account[] findByBalance(int balance) {
		/*
		 * A. 만족하는 객체의갯수구하기 - 예를들어 3개라면
		 */
		/*
		 * B. Account객체배열생성 
		 * 	- findAccounts=new Account[3];
		 */
		/*
		 * C. 만족하는Account객체들 Account배열에담기
		 */
		return null;
	}
	/*
	 * 6.계좌이율인자로받아서 인자이상인 계좌들배열객체 참조변수반환
	 */
	public Account[] findByIyul(double iyul) {
		return null;
	}

	/*
	 * 7.계좌주이름 인자로받아서 이름과일치하는계좌들배열객체 참조변수반환
	 */
	public Account[] findByName(String name) {
		/*
		 * A. 만족하는 객체의갯수구하기 - 예를들어 3개라면
		 */
		/*
		 * B. Account객체배열생성 
		 * 	- findAccounts=new Account[3];
		 */
		/*
		 * C. 만족하는Account객체들 Account배열에담기
		 */
		return null;
	}

	/*
	 * 8.계좌번호,입금할돈 인자로 받아서 입금한후 입금계좌 참조변수반환
	 */
	public Account ipGum(int no, int m) {
		/*
		 * 1.계좌번호로 계좌찾기 
		 * 2.입금
		 * 3.입금계좌 참조변수반환
		 */
		
		return null;

	}

	/*
	 * 9.계좌번호,출금할돈 인자로 받아서 출금
	 */
	public Account chulGum(int no, int m) {
		
		return null;
	}

	/*
	 * 10,11 정렬  standard --> 1:번호,2:이름,3:잔고,4:이율 
	 *             order    --> 1:오름차순,2:내림차순
	 */
	public void sort(int standard, int order) {
		
	}

	/*
	 * 12.계좌객체를 인자로 받아서 이름,잔고,이율 수정(update)[OPTION]
	 */
	public void updateAccount(Account updateAccount) {
		
	}

	/*
	 * 13.번호,이름,잔고,이율 인자로받아서 계좌객체수정(update)[OPTION]
	 */
	public void updateAccount(int no, String owner, int balance, double iyul) {
		
	}
	/*
	 * 14.계좌번호 인자로받아서 삭제해줘[OPTION] 
	 * 	A. 배열에서 Account객체삭제 
	 * 	B. 배열사이즈감소
	 *  C. 삭제한계좌객체반환
	 *  
	 */
	public Account deleteByNo(int no) {
		
		return null;
	}
	
}
```
##### 2.AccountServiceReturnMain.java
```java
package com.itwill05.service.account;
public class AccountServiceReturnMain {
	public static void main(String[] args) {
		AccountServiceReturn accountServiceReturn = new AccountServiceReturn();
		System.out.println("0.AccountServiceReturn객체야 은행계좌객체인자로줄께 추가해줘");
		accountServiceReturn.addAccount(1112,"JAN",10000,1.0);
		accountServiceReturn.addAccount(new Account(1113, "HON", 89890, 8.9));
		System.out.println("1.AccountServiceReturn객체야 은행계좌 총계좌수를 반환해줘");
		int totAccountNumber=accountServiceReturn.getTotAccountNumber();
		System.out.println(">>은행총계좌수:"+totAccountNumber);
		System.out.println("2.AccountServiceReturn객체야 은행계좌들 전체출력해줘");
		accountServiceReturn.print();
		System.out.println("3.AccountServiceReturn객체야 은행계좌들 총잔고를 반환해줘");
		int totBalance=accountServiceReturn.getAccountTotBalance();
		System.out.println(">>은행총계좌잔고:"+totBalance);
		System.out.println("4.AccountServiceReturn객체야 계좌번호를인자로 넣어줄께 계좌한개참조변수를 반환해줘");
		Account findAccount=accountServiceReturn.findByNo(1111);
		findAccount.print();
		findAccount=accountServiceReturn.findByNo(1113);
		findAccount.print();
		System.out.println("5.AccountServiceReturn객체야 계좌잔고를 인자로줄께 잔고이상인 계좌객체배열 참조변수반환해줘");
		System.out.println("6.AccountServiceReturn객체야 계좌이율(5.0)을 인자로줄께 이율이상인 계좌객체배열 참조변수 반환해줘");
		System.out.println("7.AccountServiceReturn객체야 계좌주이름(AIM)을 인자로줄께 계좌객체배열 참조변수 반환해줘");
		Account[] accounts=accountServiceReturn.findByName("AIM");
		for (int i = 0; i < accounts.length; i++) {
			accounts[i].print();
		}
		System.out.println("8.AccountServiceReturn객체야 계좌번호(6666번)와 입금할돈(4000원)줄께 입금해줘");
		Account ipGumAccount=accountServiceReturn.ipGum(6666, 4444);
		ipGumAccount.print();
		System.out.println("9.AccountServiceReturn객체야 계좌번호(1111번)와 출금할돈(500원)줄께 출금해줘");
		/*
		정렬기준(standard) --> 1:번호,2:이름,3:잔고,4:이율 
	    	정렬방법(order)    --> 1:오름차순,2:내림차순
		 */
		System.out.println("10.AccountServiceReturn객체야 계좌를 잔고순으로 오름차순정렬해줘");
		accountServiceReturn.sort(3, 1);
		System.out.println("11.AccountServiceReturn객체야 계좌를 잔고순으로 내림차순정렬해줘");
		accountServiceReturn.sort(3, 2);
		System.out.println("12.AccountServiceReturn야 계좌객체줄께 이름,잔고,이율 수정(update)해줘");
		System.out.println("13.AccountServiceReturn야 계좌데이타줄께 이름,잔고,이율 수정(update)해줘");
		System.out.println("14.AccountServiceReturn객체야 계좌번호줄께 계좌삭제한후 삭제한계좌객체반환해줘[OPTION]");
	}
}
```


