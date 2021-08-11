package Day19;

public class Start {
	
	public static void main(String[] args) {
		// 다른 클래스의 메소드 호출 방법
		// 1. static : 정적변수 [ 모든 프로그램내 메모리 사용 ]
			// Consoleprogram.programstart();
		// 2. Consoleprogram => new 메모리 주기 
		Consoleprogram consoleprogram = new Consoleprogram();
		consoleprogram.programstart();
	}
}
