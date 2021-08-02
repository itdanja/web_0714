package Day13;

import java.util.Scanner;

public class Day13_2 {
	
	public static void main(String[] args) {
		
		// 문자열 찾기 [ indexof ] 반환 : 찾은문자의 인덱스번호 
		String 문자열1 = "자바 프로그래밍";
		int index = 문자열1.indexOf("ㅁㄴ");
		System.out.println("검색한 문자의 위치 : " + index);
		
			// 검색 활용 
			String 교재 = "재미있는 파이썬 입문기초";
			Scanner scanner = new Scanner(System.in);
			System.out.print("키워드 : "); String 검색어 = scanner.next();
			
			if( 교재.indexOf(검색어) !=-1 ) {
				System.out.println("파이썬 관련 서적입니다 : " + 교재 );
			}else {
				System.out.println("파이썬 관련 서적이 아닙니다");
			}
		// 문자열 길이 [ length() ] 반환 : 문자수 
			System.out.println("문자열1 글자수 : " + 문자열1.length() );
			
			// 유효성검사 
			String 주민등록번호 = "8804202541255";
			if( 주민등록번호.length() == 13 ) {
				System.out.println(" 잘 입력하셨습니다 ");
			}
			else {
				System.out.println(" 글자수가 틀렸습니다 ");
			}
			
		// 문자열 잘라내기 [ substring() ] : 인덱스[위치] 기준 
		System.out.println( 주민등록번호.substring(7) ); // 7 인덱스 부터 출력 
		System.out.println( 주민등록번호.substring(0, 6)); // 0 ~ 6 인덱스 까지 출력 
		
		// 문자열 분해 [ split() ] : 문자 기준 
		String[] 분해배열 = 주민등록번호.split("2");
		System.out.println( 분해배열[0] );
		System.out.println( 분해배열[1] );
		System.out.println( 분해배열[2] );
		System.out.println( 분해배열[3] );
		
		// 문자열 치환 [ replace("교체할문자","새로운문자") ] : 
		String 문자열2 = "자바 프로그래밍";
		String 교체문자 = 문자열2.replace( "자바", "JAVA");
		System.out.println( 문자열2 );
		System.out.println( 교체문자 );
		
		// 대소문자 변환 [ toLowerCase() : 소문자변환  toUpperCase() : 대문자변환 ]
		String 문자열3 = "Java Programming";
		System.out.println( " 소문자 : " +  문자열3.toLowerCase() );
		System.out.println( " 대문자 : " +  문자열3.toUpperCase() );
		
		// 공백 제거 [ trim() ] : 앞뒤 공백 제거 
		String 문자열4 ="     자바          프로그래밍       ";
		System.out.println( " 공백제거 : " + 문자열4.trim() );
		
		// 문자열 변환 [ valueOf() ] : 문자열로 변환
		String 문자열5 = String.valueOf(10);	// 숫자[int] 10을 문자열 10으로 변환 	
		System.out.println(" 숫자 -> 문자 : " + 문자열5 );
		
		String 문자열6 = String.valueOf(10.5);// 소수[double] 10.5을 문자열 10.5으로 변환 
		System.out.println(" 실수 -> 문자 : " + 문자열6 );
		
		String 문자열7 = String.valueOf(true);
		System.out.println(" 논리 -> 문자 : " + 문자열7 );
		
		
		
		
	}
	

}
