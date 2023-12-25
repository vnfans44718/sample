package com.itwill05.serivce.account;
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
	 *  0. 계좌객체를 인자로 받아서 Account[]에 추가 [OPTION]
	 */
	public void addAccount1(Account newAccount) {
		Account[] temps = new Account[accounts.length+1];
		for (int i=0; i<accounts.length; i++) {
			temps[i] = accounts[i];
		}
		temps[temps.length-1] = newAccount;
		accounts = temps;
	}
	
	/*
	 * << 과제 아님 >>
	 * 0. 계좌데이터를 인자로 받아서 Account[]에 추가 [OPTION]
	 */
	public void addAccount2(int no, String owner, int balance, double iyul) {
		Account[] temps = new Account[accounts.length+1];
		for (int i=0; i<accounts.length; i++) {
			temps[i] = accounts[i];
		}
		temps[temps.length-1] = new Account(no, owner, balance, iyul);
		accounts = temps;
	}
	
	/*
	 1. 은행계좌들 총계좌수 출력메쏘드 정의
	 */
	public void totAccountNumberPrint() {
		System.out.println("총 계좌 갯수 출력: " + accounts.length + "개");
	}
	
	/*
	 * 2. 은행계좌들 전체 출력메쏘드 정의
	 */
	public void print() {
		Account.headerPrint();
		for (int i=0; i<accounts.length; i++) {
			accounts[i].print();
		}
	}
	
	/*
	 * 3. 은행계좌들 총잔고 출력메쏘드 정의  
	 */
	public void totBalancePrint() {	
		for (Account totBal : accounts) {
			System.out.println(totBal.getBalance());
		}
	}
	
	/*
	 4. 계좌번호 인자로 받아서 계좌 한 개 출력
	 */
	public void findByNoPrint(int no) {
		for (Account findbyNo : accounts) {
			if (findbyNo.getNo() == no) {
				findbyNo.print();
				break;
			}
		}
	}
	
	/*
	 *  5. 계좌잔고 인자로 받아서 잔고이상인 계좌들 출력
	 */
	public void findByBalancePrint(int balance) {	
		for (Account findbyBal : accounts) {
			if (findbyBal.getBalance() >= balance) {
				findbyBal.print();
			}
		}
	}
	
	/*
	6.계좌이율 인자로 받아서 이율이상인 계좌들 출력
	*/ 
	public void findByIyulPrint(double iyul) {	
		for (Account findbyIyul : accounts) {
			if (findbyIyul.getIyul() >= iyul) {
				findbyIyul.print();
			}
		}
	}
	
	/*
	7.계좌주이름 인자로 받아서 인자이름과 동일한 계좌들 출력
	 */ 
	public void findByNamePrint(String name) {	
		for (Account findbyName : accounts) {
			if (findbyName.getOwner().equals(name)) {
				findbyName.print();
			}
		}
	} 
	
	/*
	8.계좌번호,입금할돈 인자로 받아서 입금
	 */ 
	public void ipGum(int no, int m) {
		for (Account ipgum : accounts) {
			if (ipgum.getNo() == no) {
				ipgum.deposit(m);
			}
		}
	}
	
	/*
	9.계좌번호,출금할돈 인자로 받아서 출금
	 */ 
	public void chulGum(int no,int m) {
		for (Account chulgum : accounts) {
			if (chulgum.getNo() == no) {
				chulgum.withDraw(m);
			}
		}
	}
	
	/*
	 << 과제 아님 >>
	 10.<< 정렬 >> 
	 * sortField --> 1:번호,2:이름,3:잔고,4:이율
	 * sortOrder --> 1:오르차순,2:내림차순
	 *
	public void sort(int sortField, int sortOrder) {
		for (int i=0; i<accounts.length-1; i++) {
			for (int j=0; j<accounts.length-1-i; j++) {
				if ((sortField == 1) && (sortOrder == 1)) {
					if (accounts[j].getNo() > accounts[j+1].getNo()) {
						Account temp = accounts[j];
						accounts[j] = accounts[j+1];
						accounts[j+1] = temp;
					}
				}else if ((sortField == 1) && (sortOrder ==2)) {
					if (accounts[j].getNo() < accounts[j+1].getNo()) {
						Account temp = accounts[j];
						accounts[j] = accounts[j+1];
						accounts[j+1] = temp;
					}
				}else if ((sortField == 2) && (sortOrder == 1)) {
					if (accounts[j].getOwner().compareTo(accounts[j+1].getOwner()) > 0) {
						Account temp = accounts[j];
						accounts[j] = accounts[j+1];
						accounts[j+1] = temp;
					}
				}else if ((sortField == 2) && (sortOrder == 2)) {
					if (accounts[j].getOwner().compareTo(accounts[j+1].getOwner()) < 0) {
						Account temp = accounts[j];
						accounts[j] = accounts[j+1];
						accounts[j+1] = temp;
					}
				}else if ((sortField == 3) && (sortOrder == 1)) {
					if (accounts[j].getBalance() > accounts[j+1].getBalance()) {
						Account temp = accounts[j];
						accounts[j] = accounts[j+1];
						accounts[j+1] = temp;
					}
				}else if ((sortField == 3 && sortOrder == 2)) {
					if (accounts[j].getBalance() < accounts[j+1].getBalance()) {
						Account temp = accounts[j];
						accounts[j] = accounts[j+1];
						accounts[j+1] = temp;
					}
				}else if ((sortField == 4) && (sortOrder == 1)) {
					if (accounts[j].getIyul() > accounts[j+1].getIyul()) {
						Account temp = accounts[j];
						accounts[j] = accounts[j+1];
						accounts[j+1] = temp;
					}
				}else {
					if (accounts[j].getIyul() < accounts[j+1].getIyul()) {
						Account temp = accounts[j];
						accounts[j] = accounts[j+1];
						accounts[j+1] = temp;
					}
				}
			}
		}
	}
	*/
	/*
	public void sort(int sortField, int sortOrder) {
		for (int i=0; i<accounts.length-1; i++) {
			for (int j=0; j<accounts.length-1-i; j++) {
				if (sortField == 1) {
					if (sortOrder == 1) {
						if (accounts[j].getNo() > accounts[j+1].getNo()) {
							Account temp = accounts[j];
							accounts[j] = accounts[j+1];
							accounts[j+1] = temp;
						}
					}
					else {
						if (accounts[j].getNo() < accounts[j+1].getNo()) {
							Account temp = accounts[j];
							accounts[j] = accounts[j+1];
							accounts[j+1] = temp;
						}
					}
				}
				
				if (sortField == 2) {
					if (sortOrder == 1) {
						if (accounts[j].getOwner().compareTo(accounts[j+1].getOwner()) > 0) {
							Account temp = accounts[j];
							accounts[j] = accounts[j+1];
							accounts[j+1] = temp;
						}
					}
					else {
						if (accounts[j].getOwner().compareTo(accounts[j+1].getOwner()) < 0) {
							Account temp = accounts[j];
							accounts[j] = accounts[j+1];
							accounts[j+1] = temp;
						}
					}
				}
				
				if (sortField == 3) {
					if (sortOrder == 1) {
						if (accounts[j].getBalance() > accounts[j+1].getBalance()) {
							Account temp = accounts[j];
							accounts[j] = accounts[j+1];
							accounts[j+1] = temp;
						}	
					}
					else {
						if (accounts[j].getBalance() < accounts[j+1].getBalance()) {
							Account temp = accounts[j];
							accounts[j] = accounts[j+1];
							accounts[j+1] = temp;
						}
					}
				}
				
				if (sortField == 4) {
					if (sortOrder == 1) {
						if (accounts[j].getIyul() > accounts[j+1].getIyul()) {
							Account temp = accounts[j];
							accounts[j] = accounts[j+1];
							accounts[j+1] = temp;
						}
						
					}
					else {
						if (accounts[j].getIyul() < accounts[j+1].getIyul()) {
							Account temp = accounts[j];
							accounts[j] = accounts[j+1];
							accounts[j+1] = temp;
						}
					}
				}
			}
		}
	}
	*/
	public void sort(int sortField, int sortOrder) {
		for (int i=0; i<accounts.length-1; i++) {
			for (int j=0; j<accounts.length-1-i; j++) {
				
				switch (sortField) {
					case 1:
						if (sortOrder == 1) {
							if (accounts[j].getNo() > accounts[j+1].getNo()) {
								Account temp = accounts[j];
								accounts[j] = accounts[j+1];
								accounts[j+1] = temp;
							}
						}	
						else {
							if (accounts[j].getNo() < accounts[j+1].getNo()) {
								Account temp = accounts[j];
								accounts[j] = accounts[j+1];
								accounts[j+1] = temp;
							}
						}
						break;
						
					case 2:	
						if (sortOrder == 1) {
							if (accounts[j].getOwner().compareTo(accounts[j+1].getOwner()) > 0) {
								Account temp = accounts[j];
								accounts[j] = accounts[j+1];
								accounts[j+1] = temp;
							}
						}
						else {
							if (accounts[j].getOwner().compareTo(accounts[j+1].getOwner()) < 0) {
								Account temp = accounts[j];
								accounts[j] = accounts[j+1];
								accounts[j+1] = temp;
							}
						}
						break;
						
					case 3:
						if (sortOrder == 1) {
							if (accounts[j].getBalance() > accounts[j+1].getBalance()) {
								Account temp = accounts[j];
								accounts[j] = accounts[j+1];
								accounts[j+1] = temp;
							}	
						}
						else {
							if (accounts[j].getBalance() < accounts[j+1].getBalance()) {
								Account temp = accounts[j];
								accounts[j] = accounts[j+1];
								accounts[j+1] = temp;
							}
						}
						break;
						
					case 4:
						if (sortOrder == 1) {
							if (accounts[j].getIyul() > accounts[j+1].getIyul()) {
								Account temp = accounts[j];
								accounts[j] = accounts[j+1];
								accounts[j+1] = temp;
							}
							
						}
						else {
							if (accounts[j].getIyul() < accounts[j+1].getIyul()) {
								Account temp = accounts[j];
								accounts[j] = accounts[j+1];
								accounts[j+1] = temp;
							}
						}
						break;
						
					default :
						break;
				}
			}	
		}
	}
	
	/*
	 10.계좌를 잔고순으로 오름차순 정렬
	 */
	public void sortByBalanceAscending() {	
		for (int i=0; i<accounts.length-1; i++) {
			for (int j=0; j< accounts.length-1-i; j++) {
				if (accounts[j].getBalance() > accounts[j+1].getBalance()) {
					Account temp = accounts[j];
					accounts[j] = accounts[j+1];
					accounts[j+1] = temp;
				}
			}
		}
	}
	
	/*
	 11.계좌를 잔고순으로 내림차순 정렬
	 */
	public void sortByBalanceDescending() {	
		for (int i=0; i<accounts.length-1; i++) {
			for (int j=0; j<accounts.length-1-i; j++) {
				if (accounts[j].getBalance() < accounts[j+1].getBalance()) {
					Account temp = accounts[j];
					accounts[j] = accounts[j+1];
					accounts[j+1] = temp;
				}
			}
		} 
	}	
	
	/*
	 << 과제 아님 >>
	12.계좌객체를 인자로 받아서 이름,잔고,이율 수정(update) [OPTION]
	*/
	public void updateAccount(Account updateAccount) {
		for (Account temp : accounts) {
			if (temp.getNo() == updateAccount.getNo()) {
				temp.setOwner(updateAccount.getOwner());
				temp.setBalance(updateAccount.getBalance());
				temp.setIyul(updateAccount.getIyul()); 
			}
		}
	}
	
	/*
	<< 과제 아님 >>
	13.번호,이름,잔고,이율을 인자로 받아서 계좌객체 수정(update) [OPTION]
	*/
	public void updateAccount(int no,String owner,int balance,double iyul) {
		for (Account temp : accounts) {
			if (temp.getNo() == no) {
				temp.setOwner(owner);
				temp.setBalance(balance);
				temp.setIyul(iyul);
			}
		}
	}
}

