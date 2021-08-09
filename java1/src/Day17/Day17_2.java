package Day17;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

import com.sun.tools.jdeprscan.scan.Scan;

public class Day17_2 {
	
	
	// Set 컬렉션 : 저장순서가 없음 [ 중복불가 ] 
		// List : 저장순서가 존재 [ 중복허용 ] 
	
	public static void main(String[] args) {
		
		//Set 컬렉션 
			// 종류 : 1.HashSet 2.TreeSet
				// 메소드 
					//1. .add(객체) 
					//2. .remove(객체)
					//3. .size()
					//4. .iterator()
						// Iterator 인터페이스 
							// .hasNext() : 다음 요소가 있는지 true / false
							// .next() : 다음 요소 호출 
		// HashSet 클래스 
		HashSet<String> hashSet = new HashSet<>();
			// 추가 
			hashSet.add("java");
			hashSet.add("python");
			hashSet.add("database");
			hashSet.add("c언어");
			hashSet.add("c++");
			hashSet.add("java"); // 중복 불가 // 저장순서X 
			
			// 출력
			System.out.println(" hashset : " + hashSet );
			System.out.println(" hashset 객체수 : " + hashSet.size() );
			System.out.println(" hashset 삭제 ");
			hashSet.remove("java");
			System.out.println(" hashset : " + hashSet );
			//System.out.println(" hashset 첫번째 요소 : " + hashSet.get);
			
			// 호출 
			// 반복문 vs 순회
			for( String string : hashSet ) {
				System.out.println( string ); // 출력순서 보장x 
			}
			
			Iterator<String> iterator = hashSet.iterator();
			
			while( iterator.hasNext() ) {
				System.out.println(" 객체 : " + iterator.next() );
			}
			
			//문제2 
			Scanner scanner = new Scanner(System.in);
			HashSet<Integer> set = new HashSet<Integer>();
			
			for( int i = 0 ; i<6 ; i++ ) {
				
				int num = scanner.nextInt();
				
				if( set.contains(num) ) i--;
				
				set.add(num);
			}
			System.err.println("출력 : "+ set );
			
			// 해시 : 데이터 저장하고 조회 사용되는 알고리즘 
				// int 정수 = 3
				// 3[데이터] => 해시코드 변환 
				// 해시코드값이 메모리 주소값 => 데이터 저장
					// 값이 즉 메모리주소 : 중복값 x  저장순서x
				
		
	}
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
