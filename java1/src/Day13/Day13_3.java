package Day13;

import java.io.IOException;

public class Day13_3 {

	
	public static void main(String[] args) throws IOException {
		
	//		도서 검색 프로그램 
	//		[도서명] : 도서목록 배열에 선언 
	//		1. 된다! 네이버 블로그&포스트
	//		2. 스프링 부트 실전 활용 마스터
	//		3. Tucker의 Go 언어 프로그래밍
	//		4. 혼자 공부하는 C 언어
		
//		1. 검색을 입력받아 검색한 단어가 포함된 도서를 모두 출력하기 
//		2. 검색한 단어를 새로운 교체할 문자를 입력받아 교체 하기 
		
		String[] 도서목록 = {	
				"된다! 네이버 블로그&포스트",
				"스프링 부트 실전 활용 마스터",
				"Tucker의 Go 언어 프로그래밍",
				"혼자 공부하는 C 언어"
		};
		
		byte[] 바이트배열 = new byte[100];
		System.out.print("검색할 도서명 : ");
		int count = System.in.read(바이트배열); //  읽은 바이트 개수 세기 
		String 검색어 = new String(바이트배열 , 0 , count-2 ); // 0부터 읽어온 바이트 개수까지만 -2[줄바꿈\n] 제거 
		
		// 검색에 해당하는 도서 출력 
		for( int i = 0 ; i<도서목록.length ;i++ ) {
			if( 도서목록[i].indexOf(검색어) != -1 ) {
				System.out.println( 도서목록[i] );
			}
		}
		// 교체
		System.out.println("교체 단어 : ");
		count = System.in.read(바이트배열);
		String 교체단어 = new String(바이트배열 , 0 , count-2 );
		System.out.println("새로운 단어 : ");
		count = System.in.read(바이트배열);
		String 새로운단어 = new String(바이트배열 , 0 , count-2 );

		for( int i = 0 ; i<도서목록.length ; i++  ) {
			if( 도서목록[i].indexOf(검색어) != -1 ) {
				도서목록[i] =도서목록[i].replace( 교체단어 , 새로운단어 );
			}
		}
		// 검색에 해당하는 도서 출력 
		for( int i = 0 ; i<도서목록.length ;i++ ) {
			if( 도서목록[i].indexOf(새로운단어) != -1 ) {
				System.out.println( 도서목록[i] );
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
