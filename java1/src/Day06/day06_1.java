package Day06;


public class day06_1 {
	
	//제어문 : if[논리제어] , switch[값제어]
	//반복문 : for , while , do~while
		// break; continue;
	
	public static void main(String[] args) {
	
		// switch
			// 형태 : switch( key:검사대상 ){ case 검사 : 실행문 }
			// 1. (key) 에 해당하는 case 찾은후 아래 case 모두 실행 
			// 2. break; : switch 혹은 반복문 탈출 
			// 3. 경우의수가 정해져있는 switch
			// 	  경우의수가 알수없는경우 if
		// 예1)
		int 점수 = 80;
		switch( 점수 ) {
			case 90 : System.out.println("90점 입니다 "); break;
			case 80 : System.out.println("80점 입니다 "); break;
			case 70 : System.out.println("70점 입니다 "); break;
			default : System.out.println("탈락 입니다 "); break;
		}
	/////////////////////////////////////////////////////////////////
		if( 점수 == 90 ) System.out.println("90점 입니다if ");
		else if( 점수==80 ) System.out.println("80점 입니다if ");
		else if( 점수==70 ) System.out.println("70점 입니다if ");
		else System.out.println("탈락 입니다 ");
		
		// 예2)
		int 버튼 = 3 ;
		switch( 버튼 ) {
			case 1: System.out.println("1선택"); break;
			case 2: System.out.println("2선택"); break;
			case 3: System.out.println("3선택"); break;
			default :
		}
		
		// 예3) 세 점수의 평균이 90점이상이면 "A" 80점이상이면 "B" 나머지 탈락 
		int 국어 = 80 , 영어 = 80 , 수학 = 90;
		int 평균 =  (국어+영어+수학)/3;
				// 87 / 10 => 8.7
		switch( 평균/10 ) {		
			case 9 : System.out.println("A등급"); break;
			case 8 : System.out.println("B등급"); break;
			default : System.out.println("탈락");
		}
		
		// for : 조건에 따른 반복실행 
			//	for( 초기값 ; 조건문 ; 증감식 )
		for( int i = 0 ; i<10 ; i++ ) {
			if( i == 3) continue; // 가장 가까운 반복문 이동
			if( i == 6) break; // 가장 가까운 반복문 탈출 
			System.out.print( i +" ");
		}
System.out.println();
		// while : 조건에 따른 반복실행 = 무한루프 
			//초기값
			//while(조건문) {
			//	증감식
			//}
		int i = 0;
		while( i<10 ) {
			if( i == 3 ) continue;
			if( i == 6 ) break; // 가장 가까운 반복문 탈출
			System.out.print( i+" ");
			i++;
		}
	}
}
