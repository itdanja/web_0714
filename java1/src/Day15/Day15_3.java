package Day15;

public class Day15_3 {

	// �������� �켱���� 
		// �������� ������� �ü���κ��� �����ٸ�[ �ڿ��Ҵ� ���� ]�������� ���� 
	
	public static void main(String[] args) {
		
		for( int i = 0 ; i<10 ;i++) {
			
			Thread thread = new Print("�������ȣ"+i);
			
			// �켱����
			if( i !=9 ) {
				thread.setPriority( Thread.MIN_PRIORITY);
									// ���� �켱���� ���� 
			}else {
				thread.setPriority( Thread.MAX_PRIORITY );
									// ���� ������� ���� 
			}
			
			
			thread.start();
		}
	}

}
