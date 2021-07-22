package Day07;

import java.util.Random;
import java.util.Scanner;

public class Day07_로또판별기 {
	
	// 로또판별기 [ 1차원 배열] 
		// 1. 사용자가 1~45 사이의 숫자를 6개 입력받기 
			// 1. 중복값 없음 2.1~45사이만 가능
		// 2. 추첨번호 난수생성 1~45 사이의 숫자 6개 생성 
	
		// 3. 두 배열의 동일한 수의 개수 체크
	
	public static void main(String[] args) {
		
		// 0. 설정
		Scanner scanner = new Scanner(System.in);
		Random random = new Random(); // 난수[랜덤] 생성 객체 
		
		// 1. 배열선언 
		int[] 번호 = new int[6];
		int[] 추첨번호 = new int[6];
		
		// 2. 입력받기
		for( int i = 0 ; i<6 ; i++ ) {
			System.out.print("[[선택]] 1~45 수 입력 : "); int 선택 = scanner.nextInt();
			// 1. 1~45 사이인지 체크 
			if( 선택 <= 0 || 선택>45 ) { 
				System.out.println("[[경고]] : 1~45사이만 입력[다시입력] "); 
				i--; // 정상적인 입력x 입력횟수 증가x
			}else {
				// 2. 이미 배열에 존재하는지 체크
				boolean 중복체크 = true;
				for( int temp : 번호 ) {
					//  for( 임시변수 : 배열 ) => 배열내 모든 요소를 하나씩 변수 대입
					if( temp == 선택 ) {
						System.out.println("[[경고]] 이미 선택한 번호 입니다[다시입력]");
						i--; // 정상적인 입력x 입력횟수 증가x
						중복체크 = false;
						break; // 가장가까운 반복문 탈출 
					} // if end 
				} // for end 
				if( 중복체크 ) 번호[i] = 선택;
			}  // else end 
		} // for end 
		
		// 2-1 입력값 확인 
		System.out.print("\n선택하신 번호는 : ");
		for( int temp : 번호 ) {
			System.out.print( temp +" ");
		}
		// 3. 추첨번호 생성 
		for( int i = 0 ; i<6 ;i++) {
			// 1. 난수 생성 
			int 추첨 = random.nextInt(45)+1; // 0~44 +1 => 1~45
			// 2. 중복 제어 
			boolean 중복체크 = true;
			for( int temp : 추첨번호 ) {
				if( temp == 추첨 ) {
					i--; 
					중복체크 = false;
					break;
				}
			}
			if( 중복체크 ) 추첨번호[i] = 추첨;
		}
		// 3-1 난수값 확인 
		System.out.print("\n추첨결과 번호는 : ");
		for( int temp : 추첨번호 ) {
			System.out.print( temp +" ");
		}
		
		
		// 4. 추첨결과[ 두 배열 비교 ] 
		int 당첨개수 = 0;
		for( int temp : 번호 ) {
			for( int temp2 : 추첨번호 ) {
				if( temp == temp2) 당첨개수++;
			}
		}
		System.out.println("\n당첨개수 : " + 당첨개수);
	
		// 과제1 : 2차원 배열 으로 변경 
			// 1. 게임수 입력받기 
			// 2. 입력받은 게임수만큼 번호 선택 
				// 만약에 게임수 3 입력했을때
					// 1게임 : 1 2 3 4 5 6
					// 2게임 : 1 2 35 7 8 9
					// 3게임 : 9 20 35 24 31 21
			// 3. 게임당 당첨개수를 출력 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
		
		
	}

}
