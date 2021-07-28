package Day10;

import java.util.Scanner;

// 슈퍼클래스로 사용되는 계좌 클래스 
public class Account {
			//클래스 첫글자는 대문자
	
	// 필드 
	private String account_number; // -포함O String  -포함x int 가능
	private String account_password;
	private int account_money;
	
	// 생성자 
	public Account() {
	}

	public Account(String account_number, String account_password, int account_money) {
		this.account_number = account_number;
		this.account_password = account_password;
		this.account_money = account_money;
	}
	// 메소드
	// 1. 계좌생성 
	public void create() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("[[ 계좌번호 : "  );	String number = scanner.next();
		System.out.print("[[ 비밀번호 : "  );	String password = scanner.next();
		System.out.print("[[ 초기예금액 : "  );	int money = scanner.nextInt();
		
		// 객체화 
		Account account = new Account(number, password, money);
		
		// 배열 
		for( int i = 0 ; i<Day10_3.accounts.length ; i++ ) {
			if( Day10_3.accounts[i] == null) {
				Day10_3.accounts[i] = account;
				System.out.println("[[[ 계좌 생성 완료 ]]] ");
				return; // 메소드 종료 
			}
		}
		System.out.println("[[[ 계좌 생성 불가 : 관리자에게 문의 바랍니다 ]]] ");
	}
	// 2. 입금 [ 계좌번호 와 입금액 받아 입금처리 ] 
	public void deposit() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("[[ 계좌번호 : "  );		String number = scanner.next();
		System.out.print("[[ 예금액 : "  );		int money = scanner.nextInt();
		
		int result =  findaccount(number);
		if( result == -1 )return;
		
		Day10_3.accounts[result].account_money += money;
		System.out.println("[[[ 예금 완료 : 예금후 금액 :"+
						Day10_3.accounts[result].account_money +" ]]");
	}
	// 3. 출금 [ 계좌번호 와 비밀번호 입력받아 동일하면 출금처리 ] 
	public void withdraw() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("[[ 계좌번호 : "  );		String number = scanner.next();
		System.out.print("[[ 출금액 : "  );		int money = scanner.nextInt();
		
		int result =  findaccount(number);
		if( result == -1 )return;
		// 제어
		if(Day10_3.accounts[result].account_money < money  ) {
			System.out.println("[[[ 예금액이 부족합니다 ]]]");
			return;
		}
		Day10_3.accounts[result].account_money -= money;
		System.out.println("[[[ 출금 완료 : 출금후 금액 :"+
						Day10_3.accounts[result].account_money +" ]]");
	}
	// 4. 이체 [ 계좌번호 와 비밀번호  입력받아 동일하면 이체액을 받아 받는사람의 계좌번호 ] 
	public void transfer() {
		
	}
	
	// 5. 계좌찾기
	public int findaccount( String number  ) {
		// 메소드 
		// 1. 반환타입 : int => 메소드 종료되면서 int형 데이터 return 
		// 2. 인수 : String => 메소드 시작되면서 메소드로 들어오는 데이터 [ 계좌를 찾기위한 검사대상 ]
		
		for( int i = 0 ; i<Day10_3.accounts.length ; i++ ) {
			if( Day10_3.accounts[i] != null &&
					Day10_3.accounts[i].account_number.equals(number)) {
				// 동일한 계좌번호가 있으면 인덱스위치 리턴
				return i; 		
			}
		}
		System.out.println("[[[ 동일한 계좌번호가 존재하지 않습니다 ]]]");
		return -1;
	}
	
	public String getAccount_number() {
		return account_number;
	}

	public void setAccount_number(String account_number) {
		this.account_number = account_number;
	}

	public String getAccount_password() {
		return account_password;
	}

	public void setAccount_password(String account_password) {
		this.account_password = account_password;
	}

	public int getAccount_money() {
		return account_money;
	}

	public void setAccount_money(int account_money) {
		this.account_money = account_money;
	}

	

}
