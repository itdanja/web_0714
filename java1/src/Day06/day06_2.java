package Day06;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class day06_2 {
	
	// 1. 출력 // 2.입력 // 3.변수 // 4.연산자 // 5.제어문 // 6.반복문
	
	// 변수 : 자료형 기반으로 선언된 메모리 
	// 객체 : 클래스 기반으로 선언된 메모리 
	
	// 배열 : 기준[인덱스]에 따른 나열 
		// 목적 : 동일한 자료형/클래스의 여러개 메모리 관리
		// 인덱스 : 메모리가 저장된 순서 번호[ 0번 시작 ~~ ]
		// 선언 : 
		// 메소드 : 배열명.length
		// 컴파일후 크기변경불가 [ 정해져있는 메모리 사용시 용이 ]
	
	// 변수 : 메모리[자원] 할당받아 데이터 저장하는 공간 1개
	
	public static void main(String[] args) {
		
		// 배열선언 
		int[] 정수배열1 = new int[3];	// int형 변수 3개를 저장할수는 메모리 할당받은 배열
		// 1. 자료형/클래스[ ]
			// 2. 배열명 ( 임의 )
				// 3. new : 메모리할당 연산자 
					// 4. int[배열의길이]
		// 배열 요소 호출 : [0] ~~ [2]		// 3개인덱스인경우 
		정수배열1[0] = 3;
		정수배열1[1] = 4;
		정수배열1[2] = 5;
		
		// 배연선언2 : 선언과 동시에 초기값(메모리 생성시 기본값)
		String[] 문자열배열2 = {"유재석","강호동","신동엽"}; 
							// String 클래스 객체 3개를 저장하는 메모리 할당받은 배열 
		// 배열 요소 호출 
		System.out.println(" 배열 값 : " + 문자열배열2 );	// 메모리 주소 = 첫번째 인덱스 주소값 = 배열 주소값 
		System.out.println(" 배열 0 번째 값은 : " + 문자열배열2[0] );
		System.out.println(" 배열 1 번째 값은 : " + 문자열배열2[1] );
		System.out.println(" 배열 2 번째 값은 : " + 문자열배열2[2] );
		System.out.println(" 배열의 길이 : " + 문자열배열2.length ); // 배열내 요소 개수 
		
		// 문제1 : 학생관리 프로그램 [ 배열 ] 
			// 1. 학생수를 입력받아 학생수만큼 배열의길이 할당 
			// 2. 메뉴 [ 1.학생수 2.점수입력 3.분석[등수,평균] 4.종료 ]  
		
		Scanner scanner = new Scanner(System.in);
		int end = 0;
		Integer[] 학생점수목록 = null;
		while( true ) { // 무한루프 [ 종료조건 : 4번 눌렀을때 break; ]
		
			System.out.println("1.학생수 2.점수입력 3.분석 4.종료");
			System.out.print("선택 : "); int ch = scanner.nextInt();
			
			switch( ch ) {
				case 1:
					System.out.print("학생수 입력 : ");
					int count = scanner.nextInt();
						// int[] 학생점수목록  : 동일한 이름으로 메모리 선언은 한번 
					학생점수목록 = new Integer[count];
					System.out.println(count+"만큼 목록 생성");
					break;
				case 2:
					// 학생수만큼 점수 입력 [ 반복문 ] 
					for( int i = 0 ; i<학생점수목록.length ; i++ ) {
						// i는 0부터 배열의 최대길이전까지 1씩증가하면서 반복
						System.out.print( i +"번째 학생의 점수 입력 : ");
						학생점수목록[i] = scanner.nextInt();
					}
					break;
				case 3:
					System.out.println("[[[분석:등수(내림차순) , 전체평균]]]");
					
					// 등수별 출력[ 내림차순 ]
					// 1. 직접코드작성 2.클래스이용[미리 만들어진 코드 ]
					
					// 4개 인덱스가 존재했을경우 [0] : 3번  [1] : 2번 [2] : 1번 [3] : 0번
					for( int i = 0 ; i<학생점수목록.length-1 ; i++ ) {
						for(int j = i+1 ; j <학생점수목록.length ; j++  ) {
							if( 학생점수목록[i] < 학생점수목록[j] ) {	// < 내림차순  >오름차순
								//스왑[교체]
								int temp = 학생점수목록[j];
								학생점수목록[j] = 학생점수목록[i];
								학생점수목록[i] = temp;
							}
						}
					}
					// i = 0 	j = 1	j = 1 2 3 	
					// i = 1	j = 2	j = 2 3 
					// i = 2  	j = 3	j = 3
					// i = 3	
				
					/*
					// 2. Arrays.sort(배열); // 오름차순 
					Arrays.sort(학생점수목록);
						// 내림차순 : 오름차순 반대 
					 	Arrays.sort( 학생점수목록 , Collections.reverseOrder() );
					 		// Collections.reverseOrder() : 배열의 자료형X 클래스O
					 */	
					int 합계 = 0 ;
					// 모든 배열내 요소들의 합계
					for( int i = 0 ; i<학생점수목록.length ; i++ ) {
						
						// 요소들의 값 출력 
						System.out.println(i+"등 점수 : " + 학생점수목록[i] );
						
						합계 += 학생점수목록[i];
						// 합계 = 합계 + 학생점수목록[i];
					}
					System.out.println("[[평균]] : " + (합계/학생점수목록.length) );
					
					break;
				case 4:
					System.out.println("[[종료]]"); end = 1;
					break;
				default:
					System.out.println("[[알수없는 번호입니다]]");
			}
			if( end == 1) break;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
	}
	
}
