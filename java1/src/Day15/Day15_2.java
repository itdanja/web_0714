package Day15;

public class Day15_2 {
	//문제1 : 3개 스레드 선언하여 3개의 출력을 동시에 출력
		// 1. 강아지소리 출력 [ 1초간격으로 5번 ] 
		// 2. 고양이소리 출력 [ 1초간격으로 5번 ] 
		// 3. 호랑이소리 출력 [ 1초간격으로 5번 ] 
	
	public static void main(String[] args) {
		// 1. 강아지소리 출력 스레드 
		Thread thread1 = new Thread( new Runnable() {
			@Override
			public void run() {
				for( int i = 0 ; i<5; i++ ) {
					System.out.println("강아지소리" + i);
					System.out.println( );
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		} );
		// 2. 고양이소리 출력 스레드 
		Thread thread2 = new Thread( new Runnable() {
			@Override
			public void run() {
				for( int i = 0 ; i<5; i++ ) {
					System.out.println("고양이소리" + i);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		});
		// 3. 호랑이소리 출력 스레드 
		Thread thread3 = new Thread( new Runnable() {
			@Override
			public void run() {
				for( int i = 0 ; i<5; i++ ) {
					System.out.println("호랑이소리" + i);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		});
		Thread mainThread = Thread.currentThread();
		System.out.println(" main쓰레드 이름 : " + mainThread.getName() );
		
		thread1.start();
		thread2.start();
		thread3.start();
		
		System.out.println(" 스레드1 이름 " + thread1.getName() );
		System.out.println(" 스레드2 이름 " + thread2.getName() );
		System.out.println(" 스레드3 이름 " + thread3.getName() );
		
	}
	
	
	
}
