package com.itwill05.service.array.account;
/*
 * Account객체전체에관련된 업무를 실행할클래스
 * 		1.계좌객체들(Account[]) 을멤버변수로가진다.
 * 		2.계좌객체들을 사용해서 업무실행
 */
public class AccountService {
	private Account[] accounts;
	public AccountService() {
		accounts = new Account[9];
		accounts[0] = new Account(1111, "KIM", 89000, 1.3);
		accounts[1] = new Account(2222, "AIM", 45000, 2.7);
		accounts[2] = new Account(3333, "FIM", 89000, 4.7);
		accounts[3] = new Account(4444, "XIM", 34000, 6.7);
		accounts[4] = new Account(5555, "hIM", 78000, 3.7);
		accounts[5] = new Account(6666, "KIM", 89000, 5.7);
		accounts[6] = new Account(7777, "KIM", 89000, 4.7);
		accounts[7] = new Account(8888, "qIM", 91000, 1.7);
		accounts[8] = new Account(9999, "mIM", 12000, 0.7);
	}
	
	/*
	 * << 과제 아님 >>
	 * 0.계좌객체를 인자로받아서 Account[]에추가[OPTION]
	 */
	public void addAccount(Account newAccount) {
		Account[] newAccounts = new Account[accounts.length + 1];
		for (int i = 0; i < accounts.length; i++) {
			newAccounts[i] = accounts[i];
		}
		newAccounts[accounts.length] = newAccount;
		this.accounts = newAccounts;
	}
	
	/*
	 * << 과제 아님 >>
	 * 0.계좌데이타를 인자로받아서 Account[]에추가[OPTION]
	 */
	public void addByAccountData(int no, String owner, int balance, double iyul) {
		Account newAccount = new Account(no, owner, balance, iyul);
		this.accounts = accounts;
		
		Account[] newAccounts = new Account[accounts.length + 1];
		for (int i = 0; i < accounts.length; i++) {
			newAccounts[i] = accounts[i];
		}
		newAccounts[accounts.length] = newAccount;
		this.accounts = newAccounts;
	}
	
	/*
	 1.은행계좌들 총계좌수출력메쏘드정의
	 */
	public void totAccountNumberPrint() {
		System.out.println(">>은행계좌들 총계좌수: " + this.accounts.length);
	}
	
	/*
	 * 2.은행계좌들 전체출력메쏘드 정의
	 */
	public void print() {
		Account.headerPrint();
		for (Account account : accounts) {
			account.print();
		}
	}
	
	/*
	 * 3.은행계좌들 총잔고 출력메쏘드 정의
	 */
	public void totalBalancePrint() {
		int totalBalance = 0;
		for (Account account : accounts) {
			totalBalance += account.getBalance();
		}
		System.out.println(">>은행계좌들 총잔고: " + totalBalance);
	}
	
	/*
	 4.계좌번호 인자로받아서 계좌한개출력
	 */
	public void findByNoPrint(int no) {
		for (Account account : accounts) {
			if(account.getNo() == no) {
				account.print();
				break;
			}
		}
	}
	
	/*
	 *  5.계좌잔고 인자로 받아서 잔고이상인 계좌들출력
	 */
	public void findByBalancePrint(int balance) {
		for (Account account : accounts) {
			if (account.getBalance() >= balance) {
				account.print();
			}
		}
	}
	
	/*
	6.계좌이율 인자로 받아서 이율이상인 계좌들출력
	*/
	public void findByIyulPrint(double iyul) {
		for (Account account : accounts) {
			if (account.getIyul() >= iyul) {
				account.print();
			}
		}
	}
	
	/*
	7.계좌주이름 인자로 받아서 인자이름과동일한 계좌들출력
	 */
	public void findByOwnerPrint(String owner) {
		for (Account account : accounts) {
			if (account.getOwner() == owner) {
				account.print();
			}
		}
		
	}
	
	/*
	8.계좌번호,입금할돈 인자로 받아서 입금
	 */
	public void depositByNoAndMoneyPrint(int no, int money) {
		for (Account account : accounts) {
			if (account.getNo() == no) {
				account.deposit(money);
				account.print();
			}
		}
	}
	
	/*
	9.계좌번호,출금할돈 인자로 받아서 출금
	 */
	public void withDrawByNoAndMoneyPrint(int no, int money) {
		for (Account account : accounts) {
			if (account.getNo() == no) {
				account.withDraw(money);
				account.print();
			}
		}
	}
	
	/*
	 10.계좌를 잔고순으로 오름차순정렬
	 */
	public void sortUpByBalance()	{
		for (int i = 0; i < accounts.length - 1; i++) {
			for (int j = 0; j < accounts.length - 1 - i; j++) {
				if (accounts[j].getBalance() > accounts[j + 1].getBalance()) {
					Account tempUp = accounts[j];
					accounts[j] = accounts[j + 1];
					accounts[j + 1] = tempUp;
				}
			}
		}
		for (Account account : accounts) {
			account.print();
		}
	}
	
	/*
	 11.계좌를 잔고순으로 내림차순정렬
	 */
	public void sortDownByBalance()	{
		for (int i = 0; i < accounts.length - 1; i++) {
			for (int j = 0; j < accounts.length - 1 - i; j++) {
				if (accounts[j].getBalance() < accounts[j + 1].getBalance()) {
					Account tempDown = accounts[j];
					accounts[j] = accounts[j + 1];
					accounts[j + 1] = tempDown;
				}
			}
		}
		for (Account account : accounts) {
			account.print();
		}
	}
	
	/*
	 << 과제 아님 >>
	12.계좌객체를 인자로 받아서 이름,잔고,이율 수정(update)[OPTION]
	*/
	
	/*
	<< 과제 아님 >>
	13.번호,이름,잔고,이율 인자로받아서 계좌객체수정(update)[OPTION]
	*/
	
}