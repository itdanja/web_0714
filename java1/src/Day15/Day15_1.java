package Day15;

import java.awt.Toolkit;

public class Day15_1 {
	
	// 스레드 : 프로세스내에서 실행되는 흐름의단위 
		// 프로세스 : 연속적으로 실행중인 프로그램
			// 프로그램 : 작업을 수행하는 명령어[코드]집합
	// 멀티스레드 
		// Thread 클래스 
			// .run() : 멀티 스레드의 실행코드 정의 
			// .start() : 멀티 스레드 시작[ run 실행 ]
			// .getname() : 해당 스레드의 스레드이름
			// .sleep() : 스레드 일시정지 // 밀리초 1000 => 1초
			// .currentThread() : 현재 스레드의 정보 
		// 우선순위 
	
		// 동기화 
	
		// Runnable 인터페이스 
			// run 추상메소드 
				// 상속 vs 인터페이스 
				// extends 하나의 클래스명
				// implements 여러개의 인터페이스 
		
				
		// 병행처리 [ 컴퓨터 : 병행처리x] 
			// 운영체제가 cpu로부터 자원을 할당받아 스레드에게 분배 [ 스케줄링 ]

	public static void main(String[] args) {
		// main 메소드 : Main Thread 포함 [ 단일 스레드 ]
		
		// 1. 단일 스레드 
		// 소리
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for( int i = 0 ; i<5 ; i++) {
			toolkit.beep(); // 경고음 [ 소리내는속도보다 반복문 빠름 ] 
			try {
				Thread.sleep(1000);  // 무조건 예외처리 발생
			}
			catch (Exception e) {
				// TODO: handle exception
			}
		}
		// 출력 
		for( int i = 0 ; i<5 ; i++ ) {
			System.out.println("띵");
			try {
				Thread.sleep(1000); // 스레드 일시정지 [ 밀리초 1000 => 1초 ]
			}
			catch (Exception e) {
				// TODO: handle exception
			}
		}
System.out.println("------------- 멀티스레드 클래스 시작 ----------- ");
		// 2. 멀티 스레드 [ 소리와 출력 동시 실행 ] 
		Thread thread = new Sound();
		thread.start();		
		
		// 출력2 
		for( int i = 0 ; i<5 ; i++ ) {
			System.out.println("띵");
			try {
				Thread.sleep(1000);
			}
			catch (Exception e) {
				// TODO: handle exception
			}
		}
System.out.println(" ------------- 멀티스레드 인터페이스 시작 ----------------");
		// 3. 멀티 스레드
		Runnable runnable = new Sound2();
			// runnable : start 메소드 없음 
		Thread thread2 = new Thread(runnable);
			// 해당 쓰레드클래스에 스레드인터페이스 넣기 
		thread2.start();
		
		// 출력3 
		for( int i = 0 ; i<5 ; i++ ) {
			System.out.println("띵");
			try {
				Thread.sleep(1000);
			}
			catch (Exception e) {
				// TODO: handle exception
			}
		}
System.out.println(" ------------- 멀티스레드 인터페이스 시작 ----------------");	
		// 4. 멀티 스레드 
		Thread thread3 = new Thread( new Runnable() {
			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for( int i = 0 ; i<5 ;i++ ) {
					toolkit.beep();
					try {
						Thread.sleep(1000);
					}
					catch (Exception e) {
						// TODO: handle exception
					}
				}
			}
		} );
		
		thread3.start();
		
		// 출력3 
		for( int i = 0 ; i<5 ; i++ ) {
			System.out.println("띵");
			try {
				Thread.sleep(1000);
			}
			catch (Exception e) {
				// TODO: handle exception
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
		
	

}
