package Day13;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class Day13_1 {
	
	public static void main(String[] args){
	
		// API 클래스 : 미리 만들어진 클래스들 
			
		// 1. String 클래스 : 바이트 => 문자열 
			// 키보드 입력된 단위는 바이트단위 이동 
				// 아스키코드 : 
		byte[] 바이트배열 = { 92 , 72 , 101 ,  34 , 59 , 84 };
		String 문자열 = new String(바이트배열);
		System.out.println(" 변환후 : " + 문자열 );
	
		byte[] 바이트배열2 = {  104 ,  93 , 82 , 126 , 32 };
		String 문자열2 = new String(바이트배열2);
		System.out.println(" 변환후 : " + 문자열2 );
		
		// 1. 바이트 입력받아 배열저장 
		byte[] 바이트배열3 = { 72 , 101 , 108 , 108 , 111 , 32 , 74 , 97 , 118 , 97 };
		// 2. 바이트열 => String 변환 [ 생성자 ]
		String 문자열3 = new String(바이트배열3 );
		System.out.println(" 변환후 : " + 문자열3 );
		
		String 문자열4 = new String( 바이트배열3 , 6 , 4);
		System.out.println(" 일부 변환후 : " + 문자열4);
		
		// 입력받기 
		byte[] 바이트배열4 = new byte[100];
		
		System.out.print(" 입력 : ");
	
		try {
			// System.in : 키보드 
				// .read() : 입력값 읽기 메소드 
			System.in.read( 바이트배열4 );
			String 문자열5 = new String(바이트배열4);
			System.out.println(" 입력값 : " + 문자열5 );

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// 문자 추출 [ charAt() ]
		String 문자열6 = "자바 프로그래밍";
		System.out.println(" 문자 추출 : " + 문자열6.charAt(3) );
	
			// 주민등록번호 이용한 남여 판별 
			String 주민등록번호 = "880420-2541144";
			char 성별 = 주민등록번호.charAt(7);
			
			switch( 성별 ) {
				case '1' :
				case '3' :
					System.out.println("남자입니다");
					break;
				case '2' :
				case '4' :
					System.out.println("여자입니다");
					break;
			}
		
		// 문자열 비교 [ equals() ] 반환 : true / false
		String 문자열7 = new String("유재석");
		String 문자열8 = "유재석";
			// 객체 생성시 메모리 할당 연산자 : new
				// 예외 : 기본자료형 , String
		System.out.println( 문자열7 + 문자열8 );
		
		if( 문자열7 == 문자열8 ) { System.out.println("두 문자는 == "); }
		
		if( 문자열7.equals(문자열8) ) { System.out.println("두 문자는 equals");}
			// 문자열은 비교연산자 불가  
		if( !문자열7.equals(문자열8) ) { System.out.println("두 문자는 !equals"); }
		
		// 문자열 ----> 바이트배열 [ getBytes ]
		String 문자열9 = "안녕하세요";
						// 영문,특수문자 : 1바이트	한글 :2바이트
		byte[] 바이트배열5 = 문자열9.getBytes();
		System.out.println(" 길이 : " + 바이트배열5.length );
		String 문자열10 = new String(바이트배열5);
		System.out.println(" 변환 : "+ 문자열10 );
		
			// 한글 인코딩 : EUC-KR , UTF-8
			try {
				byte[] 바이트배열6 = 문자열9.getBytes("EUC-KR"); //한글 : 2바이트
				System.out.println(" euc-kr 길이 : " + 바이트배열6.length );
				
				byte[] 바이트배열7 = 문자열9.getBytes("UTF-8"); // 한글 : 3바이트 
				System.out.println(" UTF-8 길이 : " + 바이트배열7.length );
						
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	}
}
