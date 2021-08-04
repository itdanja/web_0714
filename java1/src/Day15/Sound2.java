package Day15;

import java.awt.Toolkit;

public class Sound2 implements Runnable  {
				// implements 인터페이스 [ 추상메소드 ] 
	
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
}
