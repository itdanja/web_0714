package Day15;

public class Print extends Thread {

	//[생성자] 스레드이름 부여
	public Print(String name) {
		setName(name); // setName 메소드 <= Thread 클래스
	}
	@Override
	public void run() {
		for( int i = 0 ; i<200000000 ; i++) {
		}
		System.out.println( getName() );
	}
	
}
