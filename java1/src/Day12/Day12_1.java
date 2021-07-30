package Day12;

import java.util.Scanner;

public class Day12_1 {

	// 예외처리 : 예외[오류] 발생했을경우 처리 코드
		// 목적 : 예외발생했을때 프로그램종료 방지 [ 프로그램 정상화 ]
		// 코드상 오류는 컴파일러[실행] X
		// 코드상 문제는 없지만 실행된 후에 프로그램 실행시 예외 
		// 오류 처리방법
			// 1. IF : 이미 알고 있는 예외일경우 
			// 2. try~catch : 다양한 경우의 예외일 경우 
		// 형태 
			// try{  예외가 발생할것같은 코드 }
			// catch( 예외클래스 객체명 ){ 예외대체코드 }
			// finally{ 무조건 실행코드 }
		// 예외클래스 [ Exception 예외클래스중 슈퍼클래스 ] 
			// 1. NullPointerException
			// 2. ArrayIndexOutOfBoundsException
			// 3. NumberFormatException
			// 4. 여러 경우의 예외발생 경우 Exception
	
	public static void main(String[] args) {
		
		// 1.객체가 null 인경우 출력 , 정보출력  
		try {
			// 예외가 발생하면 catch로 이동 // 아니면 그대로 실행 
			String 문자열 = null; // 실행 
			System.out.println( 문자열 ); // 실행 
			System.out.println( 문자열.toString() ); // 예외발생!!! => catch
		}
		catch( NullPointerException exception  ) {
			  // 예외클래스명	객체명(임의)
			System.out.println("오류발생 사유 : " + exception );
			System.out.println("[[관리자에게문의]]");
		}
		
		// 2.배열에 index가 부족한경우 
		try {
			// 예외가 발생하면 => catch 아니면 그대로 실행 
			String[] 문자열배열 = new String[2];
				// String 객체 2개를 저장할수 있는 배열 
			문자열배열[0] = "강호동"; // 문제없음 
			문자열배열[1] = "신동엽"; // 문제없음 
			문자열배열[2] = "서장훈"; // 3번째 인원추가 // 예외발생!!! => catch
		}catch(ArrayIndexOutOfBoundsException exception ) {
			System.out.println("오류발생 사유 : " + exception);
			System.out.println("[[ 더이상 인원을 추가할수 없습니다 ]] ");
		}
		
		// 3. 숫자 => 문자 변경 가능 // 문자 => 숫자 변경
		
		try {
			String 문자열2 = "100";
			String 문자열3 = "김100";
			
			System.out.println( Integer.parseInt(문자열2) );
						// Integer.paeseInt(문자열) : 문자열 => 정수 
			System.out.println( Integer.parseInt(문자열3) ); // 예외발생!! 
		}
		catch( NumberFormatException exception  ) {
			System.out.println("오류발생 사유 : " + exception);
			System.out.println("[[ 문자가 포함되는 문자열은 숫자열 변환 불가 ]] ");
		}
		
		// 4. 예외클래스를 모르는경우 
		try {
			// 1. 
			String 문자열 = null; // 실행 
			System.out.println( 문자열 ); // 실행 
			System.out.println( 문자열.toString() ); // 예외발생!!! => catch
		
			// 2. 
			String[] 문자열배열 = new String[2];
			문자열배열[0] = "강호동"; // 문제없음 
			문자열배열[1] = "신동엽"; // 문제없음 
			문자열배열[2] = "서장훈"; // 3번째 인원추가 // 예외발생!!! => catch
			
			// 3. 
			String 문자열2 = "100";
			String 문자열3 = "김100";
			System.out.println( Integer.parseInt(문자열2) );
			System.out.println( Integer.parseInt(문자열3) ); // 예외발생!! 
		}catch( Exception exception ) {
			System.out.println("예외발생 : " + exception );
		}finally {
			System.out.println("예외 있든 없든 무조건 실행되는 자리[finallly] ");
		}
		
		
		
		// 1. 
		/*
		 * 문제1 : 예외처리
				1.무한루프로 int형 숫자 계속 입력받기 
				2. 문자입력시 예외처리발생
				3. 예외처리 해서 다시 입력받기 
		 * 
		 */
		
		Scanner scanner = new Scanner(System.in); // 입력객체 
		
		while(true) {
			try {
				// 예외가 예상되는곳에 try { } 묶음
				System.out.println(" 정수 입력 : "); 
				int 정수 = scanner.nextInt();
			}
			catch( Exception e) {
				System.out.println("[[문자 입력불가]]");
				scanner = new Scanner(System.in); // 입력객체 
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}
	
}
