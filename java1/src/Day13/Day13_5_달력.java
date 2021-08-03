package Day13;

import java.util.Calendar;
import java.util.Scanner;

public class Day13_5_달력 {
	
	// 콘솔에 달력 출력하기 
	
	public static void main(String[] args) {
		

		// 과제1 : 
			// 입력받은 연도와 월의 해당하는 달력 표시 
		// 과제2 :
			// 입력받은 시작연도/월  ~ 끝연도/월 : 범위 달력 출력 
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("연도 : ");  int year = scanner.nextInt();
		System.out.print("월 : ");  int month = scanner.nextInt();
		달력메소드( year , month );
		
	}
	
	public static void 달력메소드( int year , int month ) {
		
		// 1. 캘린더 객체 선언 
		Calendar calendar = Calendar.getInstance();
		
		// 2. 캘린더에서 연도 , 월 , 일  가져오기
				//int year = calendar.get(calendar.YEAR);
				//int month = calendar.get(calendar.MONTH)+1; // 0:1월 ~~ 
				//int today = calendar.get( calendar.DAY_OF_MONTH);
		
		// ** : 해당 월의 1일 요일찾기 
		calendar.set(year, month-1 , 1 ); // calendar.set( 연 , 월 , 일 ) 날짜 사용자설정 
		int sday = calendar.get( calendar.DAY_OF_WEEK ); // 시작 요일 
		int eday = calendar.getActualMaximum( Calendar.DAY_OF_MONTH ); // 해당월의 마지막 날 
	
		// 3. 달력 출력 
		System.out.println("======================"+year+"년" + month+"월 =====================");
		System.out.println(" 일\t월\t화\t수\t목\t금\t토");
		
		// 4. 현 월의 1일의 위치 앞에 공백 채우기 
		for( int i = 1 ; i<sday ; i++ ) {
			System.out.print(" \t");
		}
		
		int ssday = sday; // 요일 시작 변수 [ 토요일마다 줄바꿈 ]
			
		// 5. 각 요일에 날짜 표시 
		for( int i = 1 ; i<=eday ; i++ ) {
			
			System.out.print(+i+"\t");
			
			//6. 토요일 뒤로 줄바꿈 처리 [ 7의배수마다 ] 
			if( ssday % 7 ==0 ) System.out.println();
				// 요일이 토요일이면 
			
			ssday++; // 요일 증가
		}
	}

}
