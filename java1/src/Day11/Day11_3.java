package Day11;

import java.util.Scanner;

public class Day11_3 {
	
	/*
	 * 문제1 : ATM 인터페이스 
		// 추상메소드 
			메뉴 , 계좌등록 , 예금 , 출금 , 이체 , 잔고
		1. 은행[ 슈퍼클래스 ] implements
			필드 : 계좌번호 , 예금액 
			
		2. 국민은행 [ 서브클래스 ]
			
		2. 신한은행 [ 서브클래스 ] 
	 */
	
	public static void main(String[] args) {
		
		// 1. 인터페이스 선언 
		Atm atm;
		// 2. 연결 
		atm = new Bank();
		
		
		while( true ) {
			
			System.out.println("1.신한 2.국민");
			Scanner scanner = new Scanner(System.in);
			
			int ch = scanner.nextInt();
			
			if( ch == 1 ) {
				atm = new Sbank(); // 
				// 슈퍼클래스에 연결된 인터페이스는 서브클래스내에서도 사용 가능 
				
				atm.menu();
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
		
	}

}
