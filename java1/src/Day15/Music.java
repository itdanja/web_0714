package Day15;

public class Music extends Thread {
	
	//�ʵ� : ������� ���� Ȯ��  
	static boolean msw = true;
	
	//�޼ҵ� : �������� �޼ҵ�  msw => false
	public static void Musicstop( boolean sw ) {
		msw = msw;
		if( msw ) { System.out.println("���� ����"); }
		else { System.out.println("���� ����"); }
	}

	@Override
	public void run() {
		
		while(msw) { 
				// while( �� ) : ���� true ���ѷ��� ����
			System.out.println("���������~~");
			try {
				Thread.sleep(2000);
			}catch (Exception e) {}
		}
	}
}
