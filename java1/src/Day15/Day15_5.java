package Day15;

import java.util.Scanner;

public class Day15_5 {

		//	문제2
		// 	무한루프 메뉴 
		//		1. 음악재생 2.영화재생
		//		[조건1] 1번 선택시 1초간격으로 음악재생 출력 
		//		[조건2] 2번 선택시 1초간격으로 영화재생 출력 
		//		[조건3] 미리 실행중 번호를 다시 선택하면 재생종료[ 스레드 종료 ]
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		boolean sw = true;  // 1번실행시 => false => true 
		
		while(true) {
			System.out.println("1.음악 2.영화");
			int ch = scanner.nextInt();
			if( ch == 1 ) {
				
				Thread thread = new Music();
				
				if( sw ) {
					Music.Musicstop(sw);
					thread.start();
					//thread.stop(); // 권장x : 메모리 손실 [ 바로 종료 ]
					sw = false; // 스위치 변수를 이용한 종료 [ 안정하게 종료 ] 
				}
				else {
					Music.Musicstop(sw);
					sw = true;
				}
			}
		}
		
	}
	
}






