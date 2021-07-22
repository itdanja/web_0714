package Day07;

public class Day07_1 {
	
	// 배열 : 동일한 자료형/클래스의 여러개 메모리 할당
		// 인덱스 : [ ] 대괄호
	// 1차원배열 
	
	// 2차원배열 
	
	public static void main(String[] args) {
		
		// 예1 ) 반복을 이용한 0~99까지 int형 배열에 각 인덱스 저장하고 출력 
			// 1. 배열 선언 
		int[] 배열1 = new int[100];	// 100개 int형 배열 선언
			// 2. 반복문을 이용한 각 인덱스에 값 대입 
		for( int i = 0 ; i<100 ; i++ ) {
			배열1[i] = i;
		}
			// 3. 반복문을 이용한 호출 
		for( int i = 0 ; i<100 ; i++ ) {
			System.out.print( 배열1[i] + " " );
		}
		System.out.println();
			// 3. 반복문과 배열의 활용
		for( int temp : 배열1 ) {
			// for( 임시변수 : 배열/리스트 ) 
				// 배열/리스트내 모든 요소를 하나씩 임시변수에 대입
			System.out.print( temp + " " );
		}
		System.out.println();
		
		// 2차원 배열
			// 행 = 가로 = row
			// 열 = 세로 = column
		int[][] 배열2 = new int[2][3];
						// 2행 3열 => 2*3 => 6칸
		int[][] 배열3 = { {20,30,40} , {40,50,60} };
						//   1행         2행  
						// { {열1,열2} , {열1,열2} , {열1,열2} } 
						// 3행 2열 
		배열2[0][0] = 80;	
		배열2[0][1] = 90;
		배열2[0][2] = 100;
		배열2[1][0] = 40;
		배열2[1][1] = 50;
		배열2[1][2] = 60;
		System.out.println(" 2차원 배열 호출 : "+ 배열2);
		System.out.println(" 2차원 배열 [1행,1열] " + 배열2[0][0]);
		System.out.println(" 2차원 배열 [1행,2열] " + 배열2[0][1]);
		System.out.println(" 2차원 배열 [1행,3열] " + 배열2[0][2]);
		
		System.out.println(" 2차원 배열 [2행,1열] " + 배열2[1][0]);
		System.out.println(" 2차원 배열 [2행,2열] " + 배열2[1][1]);
		System.out.println(" 2차원 배열 [2행,3열] " + 배열2[1][2]);
		
		// 문제1 : 0~49 까지 첫번째 행에 저장  
				// 50~99 까지는 두번째 행에 저장하는 2차원배열 선언하고 출력 
		
		int[][] 배열4 = new int[2][50];
		
		for( int i = 0 ; i<100 ;i++) {
			if( i<50 ) 배열4[0][i] = i ; // 0~49
			else 배열4[1][i-50] = i;		// 50~99
		}
		for( int i = 0 ; i<100 ; i++ ) {
			if( i<50 ) System.out.print( 배열4[0][i]+" ");
			else System.out.print( 배열4[1][i-50]+" ");
			
			if( i ==49 ) System.out.println();
		}
		
		// 3차원 
		int[][][] 배열5 = new int[2][3][3];
						// [가로][세로][높이] = 2*3*3 = 18칸
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
