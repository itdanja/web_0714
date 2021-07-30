package Day12;

public class 예외클래스 {
	
	
	public static void 예외함수() throws Exception {
		
		// 예외발생 
		
		// class.forname("클래스명") : 무조건 예외발생 => 클래스가 없을경우에 경우의수
		Class class1 = Class.forName("문자클래스");
	
	}

}
