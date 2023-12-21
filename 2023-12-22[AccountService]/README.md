## AccountService객체사용 연습
   + AccountServiceMain에서 AccountService 객체사용
   + AccountServiceMain에서 AccountService 객체로 매개변수전달 
      + Account.java
      + AccountService.java
      + AccountServiceMain.java  

#### 1 . AccountService.java
```java
package com.itwill05.service.account;
/*
 * Account객체전체에관련된 업무를 실행할클래스
 * 		1.계좌객체들(Account[]) 을멤버변수로가진다.
 * 		2.계좌객체들을 사용해서 업무실행
 */
 
public class AccountService {
	
	public static final int SORT_BY_NO=1;
	public static final int SORT_BY_OWNER=2;
	public static final int SORT_BY_BALANCE=3;
	public static final int SORT_BY_IYUL=4;
	
	public static final int SORT_ASC=1;
	public static final int SORT_DESC=2;
	
	
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
	private Account[] accounts;
	public AccountService() {
		accounts=new Account[9];
		accounts[0]=new Account(1111, "KIM", 89000, 1.3);
		accounts[1]=new Account(2222, "AIM", 45000, 2.7);
		accounts[2]=new Account(3333, "FIM", 89000, 4.7);
		accounts[3]=new Account(4444, "XIM", 34000, 6.7);
		accounts[4]=new Account(5555, "hIM", 78000, 3.7);
		accounts[5]=new Account(6666, "KIM", 89000, 5.7);
		accounts[6]=new Account(7777, "KIM", 89000, 4.7);
		accounts[7]=new Account(8888, "qIM", 91000, 1.7);
		accounts[8]=new Account(9999, "mIM", 12000, 0.7);
	}
	/*
	  << 과제 아님 >>
	   0.계좌객체를 인자로받아서 Account[]에추가[OPTION]
	*/
	public void addAccount(Account newAccount) {
		/*
		 * 1.배열크기증가
		 *   - 기존배열보다큰배열생성
		 *   - 기존데이타 옮김
		 */
	}
	
	/*
	 * << 과제 아님 >>
	 * 0.계좌데이타를 인자로받아서 Account[]에추가[OPTION]
	*/
	public void addAccount(int no,String owner,int balance,double iyul) {
		/*
		 * 1.배열크기증가
		 *   - 기존배열보다큰배열생성
		 *   - 기존데이타 옮김
		 */
	}
	/*
	 1.은행계좌들 총계좌수출력메쏘드정의
	 */
	public void totAccountNumberPrint() {
		
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
	 * 3.은행계좌들 총잔고 출력메쏘드 정의
	 */
	public void totBalancePrint() {	}
	/*
	 4.계좌번호 인자로받아서 계좌한개출력
	 */
	public void findByNoPrint(int no) {
		for (int i = 0; i < accounts.length; i++) {
			if(accounts[i].getNo()==no) {
				accounts[i].print();
				break;
			}
		}
		
	}	
	/*
	 *  5.계좌잔고 인자로 받아서 잔고이상인 계좌들출력
	 */
	public void findByBalancePrint(int balance) {	}
	/*
	6.계좌이율 인자로 받아서 이율이상인 계좌들출력
	*/ 
	public void findByIyulPrint(double iyul) {	}
	/*
	7.계좌주이름 인자로 받아서 인자이름과동일한 계좌들출력
	 */ 
	public void findByNamePrint(String name) {	}
	/*
	8.계좌번호,입금할돈 인자로 받아서 입금
	 */ 
	public void ipGum(int no,int m) {
		/*
		 * 1.계좌번호로 계좌찾기
		 * 2.입금
		 */
	}
	/*
	9.계좌번호,출금할돈 인자로 받아서 출금
	 */ 
	public void chulGum(int no,int m) {}
	/*
	 << 과제 아님 >>
	 10.<< 정렬 >> 
	 * sortField --> 1:번호,2:이름,3:잔고,4:이율
	 * sortOrder --> 1:오르차순,2:내림차순
	 */
	public void sort(int sortField,int sortOrder) {
		
	}
	
	
	/*
	 10.계좌를 잔고순으로 오름차순정렬
	 */
	public void sortByBalanceAscending() {	}
	/*
	 11.계좌를 잔고순으로 내림차순정렬
	 */
	public void sortByBalanceDescending() {	}	
	/*
	 << 과제 아님 >>
	12.계좌객체를 인자로 받아서 이름,잔고,이율 수정(update)[OPTION]
	*/
	public void updateAccount(Account updateAccount) {}
	/*
	<< 과제 아님 >>
	13.번호,이름,잔고,이율 인자로받아서 계좌객체수정(update)[OPTION]
	*/
	public void updateAccount(int no,String owner,int balance,double iyul) {}
}
```
#### 2.AccountServiceMain.java
```java
package com.itwill05.service.account;
public class AccountServiceMain {
	public static void main(String[] args) {
		AccountService accountService=new AccountService();
		/*
		<<과제아님>>
		System.out.println("0.AccountService객체야 Account 객체줄께추가해줘(배열사이즈증가)[OPTION]");
		System.out.println("0.AccountService객체야 번호,이름,잔고,이율줄께 계좌객체추가해줘(배열사이즈증가)[OPTION]");
		*/
		System.out.println("1.AccountService객체야 은행계좌들 총계좌수출력해줘");
		System.out.println("2.AccountService객체야 은행계좌들 전체출력해줘");
		accountService.print();
		System.out.println("3.AccountService객체야 은행계좌들 총잔고 출력해줘");
		System.out.println("4.AccountService객체야 계좌번호줄께 계좌한개출력해줘");
		accountService.findByNoPrint(3333);
		accountService.findByNoPrint(7777);
		System.out.println("5.AccountService객체야 계좌잔고줄께 잔고이상인 계좌들출력해줘");
		System.out.println("6.AccountService객체야 계좌이율 인자로줄께 이율이상인 계좌들출력해줘");
		System.out.println("7.AccountService객체야 계좌주이름 인자로줄께 계좌주이름과일치하는 계좌들출력해줘");
		System.out.println("8.AccountService객체야 계좌번호,입금할돈 인자로줄께 입금해줘");
		System.out.println("9.AccountService객체야 계좌번호,출금할돈 인자로줄께 출금해줘");
		System.out.println("10.AccountService객체야 계좌를 잔고순으로 오름차순정렬해줘");
		System.out.println("11.AccountService객체야 계좌를 잔고순으로 내림차순정렬해줘");
		/*
		<<과제아님>>
		accountService.sort(AccountService.SORT_BY_NO, AccountService.SORT_ASC);
		System.out.println("12.AccountService객체야 계좌객체줄께 (이름,잔고,이율) 수정(update)해줘)[OPTION]");
		System.out.println("13.AccountService객체야 번호,이름,잔고,이율 계좌 데이타줄께 이름,잔고,이율 수정(update)해줘)[OPTION]");
		*/
	}
}

```
#### 3.AccountService객체그림

![AccountService객체그림](https://github.com/2022-11-JAVA-DEVELOPER/01.JAVA_FUNDMENTAL_PRACTICE/blob/master/2022-11-28%5BAccountService%5D/11.AccountService%EA%B0%9D%EC%B2%B4%EA%B7%B8%EB%A6%BC.png)

![AccountService객체그림&쓰레드](https://github.com/2022-11-JAVA-DEVELOPER/01.JAVA_FUNDMENTAL_PRACTICE/blob/master/2022-11-28%5BAccountService%5D/12.AccountService%EA%B0%9D%EC%B2%B4%EA%B7%B8%EB%A6%BC%26%EC%93%B0%EB%A0%88%EB%93%9C.png)

