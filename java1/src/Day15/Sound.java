package Day15;

import java.awt.Toolkit;

public class Sound extends Thread {
				// extends Ŭ������ : ��� 
	
	@Override
	public void run() { // ��Ƽ������ �޼ҵ� 
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
	
}
