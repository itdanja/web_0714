package Day15;

import java.awt.Toolkit;

public class Day15_1 {
	
	// ������ : ���μ��������� ����Ǵ� �帧�Ǵ��� 
		// ���μ��� : ���������� �������� ���α׷�
			// ���α׷� : �۾��� �����ϴ� ��ɾ�[�ڵ�]����
	
	public static void main(String[] args) {
		// main �޼ҵ� : Main Thread ���� [ ���� ������ ]
		
		// 1. ���� ������ 
		
		// �Ҹ�
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		for( int i = 0 ; i<5 ; i++) {
			
			toolkit.beep(); // ����� 
			
			Thread.sleep(1000);
			
		}
		
		// ��� 
		for( int i = 0 ; i<5 ; i++ ) {
			System.out.println("��");
			
			Thread.sleep(1000); // ������ �Ͻ����� [ �и��� 1000 => 1�� ]
			
		}
		
	}
		
	

}
