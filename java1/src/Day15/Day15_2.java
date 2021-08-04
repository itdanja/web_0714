package Day15;

public class Day15_2 {
	//����1 : 3�� ������ �����Ͽ� 3���� ����� ���ÿ� ���
		// 1. �������Ҹ� ��� [ 1�ʰ������� 5�� ] 
		// 2. ����̼Ҹ� ��� [ 1�ʰ������� 5�� ] 
		// 3. ȣ���̼Ҹ� ��� [ 1�ʰ������� 5�� ] 
	
	public static void main(String[] args) {
		// 1. �������Ҹ� ��� ������ 
		Thread thread1 = new Thread( new Runnable() {
			@Override
			public void run() {
				for( int i = 0 ; i<5; i++ ) {
					System.out.println("�������Ҹ�" + i);
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
		// 2. ����̼Ҹ� ��� ������ 
		Thread thread2 = new Thread( new Runnable() {
			@Override
			public void run() {
				for( int i = 0 ; i<5; i++ ) {
					System.out.println("����̼Ҹ�" + i);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		});
		// 3. ȣ���̼Ҹ� ��� ������ 
		Thread thread3 = new Thread( new Runnable() {
			@Override
			public void run() {
				for( int i = 0 ; i<5; i++ ) {
					System.out.println("ȣ���̼Ҹ�" + i);
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
		System.out.println(" main������ �̸� : " + mainThread.getName() );
		
		thread1.start();
		thread2.start();
		thread3.start();
		
		System.out.println(" ������1 �̸� " + thread1.getName() );
		System.out.println(" ������2 �̸� " + thread2.getName() );
		System.out.println(" ������3 �̸� " + thread3.getName() );
		
	}
	
	
	
}
