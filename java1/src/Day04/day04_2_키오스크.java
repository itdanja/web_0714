package Day04;

import java.util.Scanner;

public class day04_2_키오스크 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// 문제2 : 키오스크 프로그램 
			// 0. 금액을 입력받아 제품 구매 => 장바구니 담기 => 결제
			// 1. 제품메뉴[반복] : 1.콜라[300] 2.환타[200] 3.사이다[100] 4.결제		
		
		int 콜라재고 = 10; 	int 환타재고 =10; 		int 사이다재고 =10; 	// 재고 변수 
		//제품들의 변수들 
		while(true) { // 자판기 무한루프 [ 종료조건 없음 ] 
			int 콜라구매수 = 0 ; 	int 환타구매수 = 0 ; 	int 사이다구매수 = 0; 	// 구매수 변수 
			int 총결제액 = 0;
			while(true) { // 사람마다 무한루프 [ while{ } : 괄호안 코드가 무한실행 ]
							// 종료 조건[결제했을경우(4) : break; : 반복문탈출( 가장가까운 반복문 괄호 나가기 )
				System.out.println("\n[[[[ 자판기 ]]]] ");
			
				if( 콜라재고 ==0 ) System.out.print("[[[ 1.콜라[제품준비중]");
				else  System.out.print("[[[ 1.콜라[300원]");
				
				if( 환타재고 == 0) System.out.print("2.환타[제품준비중]");
				else System.out.print("2.환타[200원]");
		
				if( 사이다재고 == 0 )  System.out.print("3.사이다[제품준비중]");
				else  System.out.print("3.사이다[100원]");
				
				System.out.println("4.결제");
				
				
				System.out.print("[[ 선택 : "); int 선택 = scanner.nextInt();
				if( 선택 == 1 ) {
					//1. 재고가 없을경우 구매 불가 
					if( 콜라재고 > 0 ) { // 재고가 있을경우 
						System.out.println("[[[ 콜라을 담았습니다 ]]]");
						콜라구매수++; // 콜라구매수 증가
						콜라재고--;	// 콜라재고 감소 
					}else {
						System.out.println("[[[ 콜라 재고가 없습니다 ]]]");
					}
				}
				if( 선택 == 2 ) {
					//1. 재고가 없을경우 구매 불가 
					if( 환타재고 > 0 ) { // 재고가 있을경우 
						System.out.println("[[[ 환타 담았습니다 ]]]");
						환타구매수++; // 콜라구매수 증가
						환타재고--;	// 콜라재고 감소 
					}else {
						System.out.println("[[[ 환타재고 가 없습니다 ]]]");
					}
				}
				if( 선택 == 3 ) {
					//1. 재고가 없을경우 구매 불가 
					if( 사이다재고 > 0 ) { // 재고가 있을경우 
						System.out.println("[[[ 사이다 재고 담았습니다 ]]]");
						사이다구매수++; // 콜라구매수 증가
						사이다재고--;	// 콜라재고 감소 
					}else {
						System.out.println("[[[ 사이다 재고가 없습니다 ]]]");
					}
				}
				if( 선택 == 4 ) { 
					System.out.println("[[[ 장바구니 ]]]");
					if( 콜라구매수==0 && 환타구매수==0 && 사이다구매수 ==0  ) { System.err.println("[[[ 구매 하신 제품이 없습니다 ]]]"); break;}
					else {
						if( 콜라구매수 !=0 ) System.out.println("콜라 구매수 : " + 콜라구매수 + " 결제액 : "+콜라구매수*300);
						if( 환타구매수 !=0 ) System.out.println("환타 구매수 : " + 환타구매수 + " 결제액 : "+환타구매수*200);
						if( 사이다구매수 !=0 ) System.out.println("사이다 구매수 : " + 사이다구매수 + " 결제액 : "+사이다구매수*100);
						
						총결제액 = (콜라구매수*300) + (환타구매수*200) + (사이다구매수*100);
						
						System.out.println("결제 하시겠습니까? 예[1] 아니요[0]"); int 선택2 = scanner.nextInt();
						if( 선택2 == 1 ) {
							System.out.println("[[[ 금액 투여 ]]] : "); int 금액 = scanner.nextInt();
							//1.총결제액보다 금액이 적은경우 결제x
							if( 금액 < 총결제액 ) {
								System.out.println("[[[ 금액 부족(초기화면) ]]] ");
								콜라재고+=콜라구매수;
								사이다재고+=사이다구매수;
								환타재고+=환타구매수;
								break;
							}else {
								금액 -= 총결제액;
								System.out.println("[[[ 결제완료 ]]] : 잔돈 : " + 금액);
								System.err.println("\n[[[결제완료]]] 이용해주셔서 감사합니다"); 
								break;
							}
						}
						if( 선택2 == 0 ) {
							System.out.println("[[[ 초기화면으로 이동 ]]]");
							콜라재고+=콜라구매수;
							사이다재고+=사이다구매수;
							환타재고+=환타구매수;
							break;
						}
						break; // while 종료 
					}
				}
			} // 두번째 무한루프 종료 지점 
		} // 첫번째 무한루프 종료 지점

		
	} // main end 
}
