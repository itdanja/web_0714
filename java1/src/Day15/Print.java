package Day15;

public class Print extends Thread {

	//[������] �������̸� �ο�
	public Print(String name) {
		setName(name); // setName �޼ҵ� <= Thread Ŭ����
	}
	@Override
	public void run() {
		for( int i = 0 ; i<200000000 ; i++) {
		}
		System.out.println( getName() );
	}
	
}
