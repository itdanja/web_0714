package Day12;

public class Day12_2 {

	
	public static void main(String[] args) {
		
		
		// 예외 던지기 
			// 목적 : 특정 위치에서 예외 한번에 처리 
			// 형태 : 메소드명() throws Exception
				// 메소드 호출했던 곳으로 예외 전달 
		try {
			예외클래스.예외함수();
			// . : 접근연산자 [ 클래스내 멤버(필드,메소드 등) 접근 ]
		}
		catch( Exception exception ) {
			System.out.println("[[예외발생]]");
		}
		
	}
	
}

