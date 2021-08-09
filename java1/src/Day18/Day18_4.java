package Day18;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Day18_4 {
	
	/*
	 * 
	 * 문제1 : 
			// Queue 4개 list 1개
					// 1. 전철 밀어내기 
					// 2. 역 : 종점역 -> 용산 -> 서울 -> 구로
					// 3. 종점역 : 전철 3개의 객체 
					// 4. 출발 신호를 받아서 해당역에서 출발해서 다음역에 도착
					// 5. 역당 소요시간 2초
			
				메뉴[무한루프]
					전철 출발 신호 : 1.종점 2.용산 3.서울 4.구로
	
	 * 
	 */
	
	// main 밖에 선언되는 이유 : 모든 메소드에서 호출 하기 위해 
	public static Queue<전철> 종점역 = new LinkedList<>();
	public static Queue<전철> 용산역 = new LinkedList<>();
	public static Queue<전철> 서울역 = new LinkedList<>();
	public static Queue<전철> 구로역 = new LinkedList<>();
	public static ArrayList< Queue<전철> > 전철현황 = new ArrayList<>();
		
	public static void main(String[] args) {
			종점역.offer( new 전철("A-1") );
			종점역.offer( new 전철("B-2") );
			종점역.offer( new 전철("C-3") );
			
			전철현황.add(종점역);
			전철현황.add(용산역);
			전철현황.add(서울역);
			전철현황.add(구로역);
			
			Scanner scanner = new Scanner(System.in);
			while(true) {
				전철역현황();
				System.out.println("출발신호 : 0.종점 1.용산 2.서울 3.구로");
				int ch = scanner.nextInt();
				if( ch == 0 ) { 출발신호(ch); }
				if( ch == 1 ) { 출발신호(ch);}
				if( ch == 2 ) { 출발신호(ch);}
				if( ch == 3 ) { 출발신호(ch);}
			}
	} // main 끝 
	
	// 전철 출발 신호 [ 메소드화 : 역번호에 따른 전철 출발 코드 ]
	public static void 출발신호( int 역번호 ) {
	
		// 1. 해당역에 전철이 없을경우 
		if( 전철현황.get(역번호).isEmpty() ) {
			System.out.println("[[ 현재 대기중인 전철이 없습니다 ]] ");
			return;
		}
	
		// 2. 해당역에서 전철 빼기 
		전철 temp =  전철현황.get(역번호).poll();
		System.out.println( "[[출발 : " + temp.전철번호 );
		System.out.println( "[[ 소요시간 : 2초 ]]");
		
		// * 2초간 스레드 멈추기 
		try {
			Thread.sleep(2000); // 무조건 예외발생
		}catch (Exception e) { }
		
		// 3. 전 역에서 뺀 전철을 다음역에 넣기 
			// 4. 만약에 다음역이 없으면 종점으로 오기 
			if( 역번호+1 >=전철현황.size() ) 전철현황.get(0).offer(temp);
			else {
				전철현황.get(역번호+1).offer(temp);
				System.out.println( "[[도착 : " + temp.전철번호 );
			}
			
	}
	
	// 전철 현황 메소드 
	public static void 전철역현황() {
		System.out.println(" 현재 종점역의 전철 현황 : " + 전철현황.get(0));
		System.out.println(" 현재 용산역의 전철 현황 : " + 전철현황.get(1));
		System.out.println(" 현재 서울역의 전철 현황 : " + 전철현황.get(2));
		System.out.println(" 현재 구로역의 전철 현황 : " + 전철현황.get(3));
	}


	
	
	
	
	
	
}
