package Day05;

import java.util.Scanner;

public class day05_2 {
	
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		// for 으로 별찍기 
		// 별1) 입력받은 정수만큼 별 출력 
		System.out.print("별 개수 : "); int 별 = scanner.nextInt();
		for( int i = 1 ; i<=별 ; i++ ) { System.out.print("* "); }
	
System.out.println("\n------------------------------");
		// 별2) 입력받은 정수만큼 별 출력 [ * 5개마다 줄바꿈 ] 
		System.out.print("별2 개수 : "); int 별2 = scanner.nextInt();
		for( int i = 1 ; i<=별2 ; i++ ) {
			System.out.print("* ");
			// 5개마다 줄바꿈처리 [ 5배수 ]
			if( i%5 == 0 ) {System.out.println();}
		}
System.out.println("\n------------------------------");		
		// 별3) 
		System.out.print("줄3 개수 : "); int 줄3 = scanner.nextInt();
		for( int i = 1 ; i<=줄3; i++ ) {
			// 별찍기
			for( int s = 1; s<=i ; s++ ) {	System.out.print("*"); }
			// 줄바꿈 
			System.out.println();
		}
System.out.println("\n------------------------------");			
		//별4) 
		System.out.print("줄4 개수 : "); int 줄4 = scanner.nextInt();
		for( int i = 1 ; i<=줄4 ; i++ ) {
			// 별찍기
			for( int s = 1 ; s<=줄4-i+1 ; s++) { System.out.print("*");}
			// 줄바꿈
			System.out.println();
		}
System.out.println("\n------------------------------");		
		//별5)
		System.out.print("줄5 개수 : "); int 줄5 = scanner.nextInt();
		for( int i = 1 ; i<=줄5; i++ ) {
			// 공백찍기
			for( int b = 1 ; b<=줄5-i ; b++ ) {System.out.print(" "); }
			// 별찍기
			for( int s = 1 ; s<=i ; s++ ) {System.out.print("*");}
			//줄바꿈
			System.out.println();
		}
System.out.println("\n------------------------------");			
		//별6)
		System.out.print("줄6 개수 : "); int 줄6 = scanner.nextInt();
		for( int i = 1 ; i<=줄6 ; i++ ) {
			// 공백찍기
			for( int b = 1 ; b<=i-1; b++ ) { System.out.print(" "); }
			// 별찍기 
			for( int s = 1 ; s<=줄6-i+1 ; s++ )System.out.print("*");
			// 줄바꿈
			System.out.println();
			
		}
System.out.println("\n------------------------------");				
		System.out.print("줄7 개수 : "); int 줄7 = scanner.nextInt();
		for( int i = 1 ; i<=줄7 ; i++ ) {
			// 공백찍기
			for(int b = 1 ; b<=줄7-i; b++) {System.out.print(" ");}
			// 별찍기 
			for(int s = 1 ; s<=i*2-1; s++ ) {System.out.print("*");}
			// 줄바꿈
			System.out.println();
			
		}
System.out.println("\n------------------------------");				
		System.out.print("줄8 개수 : "); int 줄8 = scanner.nextInt();
		for( int i = 1 ; i<=줄8 ; i++ ) {
			// 공백찍기
			for(int b = 1 ; b<=줄8-i; b++) {System.out.print(" ");}
			// 별찍기 
			for(int s = 1 ; s<=i*2-1; s++ ) {System.out.print(i);}
			// 줄바꿈
			System.out.println();
			
		}		
System.out.println("\n------------------------------");				
	System.out.print("줄9 개수 : "); int 줄9 = scanner.nextInt();
	for( int i = 1 ; i<=줄9 ; i++ ) {
		// 공백찍기
		for(int b = 1 ; b<=i-1; b++) {System.out.print(" ");}
		// 별찍기 
		for(int s = 1 ; s<=줄9*2-(i*2-1); s++ ) {System.out.print("*");}
		// 줄바꿈
		System.out.println();
	}		

System.out.println("\n------------------------------");	
	System.out.print("줄11 개수 : "); int 줄11 = scanner.nextInt();
	for( int i = 1 ; i<=줄11 ; i++ ) { // i = 행 = 가로단위
		
		for( int j = 1 ; j<=줄11 ; j++ ) {
			// 조건1 : 행/열 만나는 지점 
			if( i == j )System.out.print("*");
			else if( (i+j) ==(줄11+1) ) System.out.print("*"); // 조건2 : 
			else System.out.print(" ");
		}
		// 줄바꿈
		System.out.println();
		
	}
	
			
		
		
		
		
		
		
		
		
		
		
		
	}

}
