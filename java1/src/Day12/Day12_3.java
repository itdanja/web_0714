package Day12;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Day12_3 {

	// 메모리[변수,배열] => 프로그램 종료되면 다 메모리 초기화
		// 주기억장치 : 현재 실행중인 프로그램[명령어] 기억
			// 전기X저장X => 휘발성
			// 변수 , 객체 , 배열 등등 
		// 보조기억장치[파일,DB등]
			// 전기X저장O => 비휘발성
			// 파일 , DB 등 
	
		// 파일처리 
			// 키보드[파일] -------스트림(데이터흐름)---------> 출력
				// 데이터흐름 : 바이트단위 [ 비트 : 1bit => 0 혹은 1 ] [ 바이트 : 8bit => 1byte ]
	
	public static void main(String[] args) throws Exception{
											// 예외 던지긴
	
		// FileOutputStream fileOutputStream = new FileOutputStream("C:/java/test1.txt");																											
		FileOutputStream fileOutputStream = new FileOutputStream("C:/Users/User/git/web_0714/java1/src/Day12/test1.txt"); // 무조건 예외처리발생 : 만약에 파일이 없을경우
			// FileOutputStream : 파일 출력해주는 클래스 									// 현재 패키지 경로 
				// new : 객체 메모리 할당 
					// FileOutputStream( 파일경로 확장자 );
		String 문자열 = "이클립스에서 작성했습니다";
			// 스트림은 문자열 자체를 출력할수 없음
		fileOutputStream.write( 문자열.getBytes() );
			// 1. 문자열 => 바이트 변환 [ 문자열.getBytes() : 바이트 변환메소드 ]
			// 2. 스트림명.write( 바이트열 ) : 바이트 출력

	/////////////////////////////////////////////////////////////////////////////////
		
		FileInputStream fileInputStream = new FileInputStream("C:/Users/User/git/web_0714/java1/src/Day12/test1.txt"); // 무조건 예외처리발생 : 만약에 파일이 없을경우

		// 1. 스트림에서 바이트열 가져온다 
		byte[] 바이트배열 = new byte[1024]; // 1024byte => 1kbyte => 1024kb => 1mb
		fileInputStream.read( 바이트배열 );
			// 스트림명.read( 바이트배열명 ) : 바이트 읽어오기 => 배열에 저장 

		// 2. 가져온 바이트열 문자열 변환 
		String 문자열2 = new String(바이트배열);	// 생성자에 바이트배열 넣기 => 문자열 변환 
		
		System.out.println("현재 파일의 내용은 : " + 문자열2 );

	/////////////////////////////////////////////////////////////////////////////////////
		// 키보드에 입력된 변수를 메모장에 계속 누적으로 쓰기
		
		Scanner scanner = new Scanner(System.in);
		
		while( true ) {
			System.out.print("메모장에 입력할 텍스트 입력 : ");
			String 문자열3 = scanner.next();
			String 출력문자열 = 문자열3 +"\n";
			fileOutputStream.write( 출력문자열.getBytes() );
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
