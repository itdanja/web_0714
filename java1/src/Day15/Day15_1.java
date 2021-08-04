package Day15;

import java.awt.Toolkit;

public class Day15_1 {
	
	// 스레드 : 프로세스내에서 실행되는 흐름의단위 
		// 프로세스 : 연속적으로 실행중인 프로그램
			// 프로그램 : 작업을 수행하는 명령어[코드]집합
	
	public static void main(String[] args) {
		// main 메소드 : Main Thread 포함 [ 단일 스레드 ]
		
		// 1. 단일 스레드 
		
		// 소리
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		for( int i = 0 ; i<5 ; i++) {
			
			toolkit.beep(); // 경고음 
			
			Thread.sleep(1000);
			
		}
		
		// 출력 
		for( int i = 0 ; i<5 ; i++ ) {
			System.out.println("띵");
			
			Thread.sleep(1000); // 스레드 일시정지 [ 밀리초 1000 => 1초 ]
			
		}
		
	}
		
	

}
