package Day15;

import java.awt.Toolkit;

public class Day15_1 {
	
	// ������ : ���μ��������� ����Ǵ� �帧�Ǵ��� 
		// ���μ��� : ���������� �������� ���α׷�
			// ���α׷� : �۾��� �����ϴ� ��ɾ�[�ڵ�]����
	// ��Ƽ������ 
		// Thread Ŭ���� 
			// run �޼ҵ� : ��Ƽ �������� �����ڵ� ���� 
			// start �޼ҵ� : ��Ƽ ������ ����[ run ���� ]
		// ����ó�� [ ��ǻ�� : ����ó��x] 
			// �ü���� cpu�κ��� �ڿ��� �Ҵ�޾� �����忡�� �й� [ �����ٸ� ]

	public static void main(String[] args) {
		// main �޼ҵ� : Main Thread ���� [ ���� ������ ]
		
		// 1. ���� ������ 
		// �Ҹ�
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for( int i = 0 ; i<5 ; i++) {
			toolkit.beep(); // ����� [ �Ҹ����¼ӵ����� �ݺ��� ���� ] 
			try {
				Thread.sleep(1000);  // ������ ����ó�� �߻�
			}
			catch (Exception e) {
				// TODO: handle exception
			}
		}
		// ��� 
		for( int i = 0 ; i<5 ; i++ ) {
			System.out.println("��");
			try {
				Thread.sleep(1000); // ������ �Ͻ����� [ �и��� 1000 => 1�� ]
			}
			catch (Exception e) {
				// TODO: handle exception
			}
		}
System.out.println("------------- ��Ƽ������ Ŭ���� ���� ----------- ");
		// 2. ��Ƽ ������ [ �Ҹ��� ��� ���� ���� ] 
		Thread thread = new Sound();
		thread.start();		
		
		// ���2 
		for( int i = 0 ; i<5 ; i++ ) {
			System.out.println("��");
			try {
				Thread.sleep(1000);
			}
			catch (Exception e) {
				// TODO: handle exception
			}
		}
System.out.println(" ------------- ��Ƽ������ �������̽� ���� ----------------");
		// 3. ��Ƽ ������
		Runnable runnable = new Sound2();
			// runnable : start �޼ҵ� ���� 
		Thread thread2 = new Thread(runnable);
			// �ش� ������Ŭ������ �������������̽� �ֱ� 
		thread2.start();
		
		// ���3 
		for( int i = 0 ; i<5 ; i++ ) {
			System.out.println("��");
			try {
				Thread.sleep(1000);
			}
			catch (Exception e) {
				// TODO: handle exception
			}
		}
	

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
		
	

}
