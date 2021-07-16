package Day03;

import java.util.Scanner;

public class Day03_4 {
	
	public static void main(String[] args) {
		
		// 컴퓨터[0,1] : 기계어 
		// 제어문 : if[ 논리제어 ]  , switch[ 데이터제어 ]
			// 목적 : 경우의수 에 따른 코드 처리 
			// if : true , false 만 제어 가능 
				// 형태 : if( 논리 ) 실행문;
				// 형태2 : if( 논리 ) 실행문[true];
				//		  else 실행문[false]
				// 형태3 : 실행문[ ; ]이 2줄 이상이면  { } 묶음 처리 
				//		if( 논리1 ){
				//			실행문1;
				//			실행문2;
				// 		}
				// 형태4 : 경우의수가 다수일경우에는 
				// 		if( 논리1 ) ~ 
				// 		else if( 논리2 ) ~ 
				// 		else if( 논리3 ) ~ 
				// 		else
		
		//예1) true이면 실행문 실행 
		if( 3 > 1) System.out.println("3이크다.1");
		
		//예2) false이면 실행문 실행X
		if( 3 > 5 ) System.out.println("3이크다.2");
		
		//예4) 
		if( 3 > 5 ) System.out.println("3이크다.3");
		else System.out.println("5가크다.3");
		
		//에4)
		if( 3 > 2 ) {
			System.out.println("true이면 실행되는자리");
			System.out.println("3이크다.4");
		}
		else { 
			System.out.println("false이면 실행되는자리");
			System.err.println("2가크다.4");
		}
		//예5)  다중 조건 
		if( 3 > 5 ) System.out.println("3이크다.5");
		else if( 3 > 4 ) System.out.println("3이크다.6");
		else if( 3 > 3 ) System.out.println("3이크다.7");
		else if( 3 > 2 ) System.out.println("3이크다.8");
		else System.out.println("true가 없다");
		
		//예6) 하나의 점수를 입력받아 80점 이상이면 합격출력 아니면 탈락 
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("점수입력 : ");	int 점수 = scanner.nextInt();
		if( 점수 >= 80 ) System.out.println("합격");
		else System.out.println("탈락");
		
		//예7) 하나의 점수를 입력받아 
				// 90점이상이면 "A등급" 
				// 80점이상이면 "B등급" 
				// 70점이상이면 "C등급" 
				// 그외 탈락
		System.out.print("점수2입력 : ");	int 점수2 = scanner.nextInt();
		if( 점수2>=90 ) System.out.println("A등급");
		else if( 점수2>=80 ) System.out.println("B등급");
		else if( 점수2>=70 ) System.out.println("C등급");
		else System.out.println("탈락");
		
		//문제1 : 2개의 정수를 입력받아 더 큰수 출력
		System.out.print("정수1입력 : ");	int 정수1 = scanner.nextInt();
		System.out.print("정수2입력 : ");	int 정수2 = scanner.nextInt();
		if( 정수1 > 정수2 ) System.out.println(" 더 큰값은 : " + 정수1 );
		else if( 정수1 < 정수2 ) System.out.println(" 더 큰값은 " + 정수2 );
		else System.out.println(" 두 정수는 같다 ");
		
		//문제2 : 3개의 정수를 입력받아 더 큰수 출력
		System.out.print("정수1입력 : ");	int 정수3 = scanner.nextInt();
		System.out.print("정수2입력 : ");	int 정수4 = scanner.nextInt();
		System.out.print("정수3입력 : ");	int 정수5 = scanner.nextInt();
		if( 정수3 > 정수4 && 정수3 > 정수5 ) System.out.println(" 가장 큰수는 : "+정수3);
		else if( 정수4 > 정수3 && 정수4 > 정수5 ) System.out.println(" 가장 큰수는 : "+정수4);
		else if( 정수5 > 정수3 && 정수5 > 정수4 ) System.out.println(" 가장 큰수는 : "+정수5);
		else System.out.println(" 세 정수는 같다 ");
		
		//문제3 : 4개의 정수를 입력받아 더 큰수 출력 
		System.out.print("정수1입력 : ");	int 정수6 = scanner.nextInt();
		System.out.print("정수2입력 : ");	int 정수7 = scanner.nextInt();
		System.out.print("정수3입력 : ");	int 정수8 = scanner.nextInt();
		System.out.print("정수4입력 : ");	int 정수9 = scanner.nextInt();
		int 최댓값 = 정수6; // 첫번째 값을 최댓값변수에 저장 
		if( 최댓값 < 정수7 ) 최댓값 = 정수7;
		if( 최댓값 < 정수8 ) 최댓값 = 정수8;
		if( 최댓값 < 정수9 ) 최댓값 = 정수9;
		System.out.println(" 가장 큰수는 : " + 최댓값 );
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	}

}
