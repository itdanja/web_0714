package Day11;

import java.util.Scanner;

public class Day11_2 {
	
	
	public static void main(String[] args) {
		
		// 1. 인터페이스 선언 
		키오스크 키오스크 = null ; // 초기값 null 
		// 2. 연결 대상 선택 
		Scanner scanner = new Scanner(System.in);
		System.out.println("1.롯데리아 2.카페");
		int 연결대상 = scanner.nextInt();
		
		if( 연결대상 == 1 ) 키오스크 = new 롯데리아();
		if( 연결대상 == 2 ) 키오스크 = new 카페();
		
		while(true) {
			System.out.println(" 키오스크 ");
			System.out.println("1.메뉴 2.장바구니 3.결제 4.종료");
			int 선택 = scanner.nextInt();
			
			if( 선택 == 1 ) 키오스크.메뉴();
			if( 선택 == 2 ) 키오스크.장바구니();
			if( 선택 == 3 ) 키오스크.결제();
			if( 선택 == 4 ) { 키오스크.종료(); break; }
			
			
		}
		
		
	}

}
