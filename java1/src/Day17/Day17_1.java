package Day17;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Vector;


public class Day17_1 {
	
	// 하드웨어 
		// 1. 주기억장치 : [RAM] : 현재 실행중인 명령어 [ 휘발성 ]
		// 2. 보조기억장치 : [C드라이브,USB,CD등] 파일처리 , DB처리 등
	// 메모리[주기억장치] 관리 방법 
		// 1. 변수 : [기본 자료형]메모리 할당 
		// 2. 객체 : [클래스] 메모리 할당
		// 3. 배열 : 변수/객체의 동일한 자료형의 여러개 메모리 할당 
			// 메모리 효율성 저하
		// 4. 리스트 :
	
	// 컬렉션 프레임워크 : 메모리 관리 클래스 들 
		// 컬렉션 : 수집 
		// [미리 만들어진 명령어들] 프레임워크[소프트웨어] vs 라이브러리[함수집합] vs API[인터페이스]

	public static void main(String[] args) {
		
		// 리스트 : List 컬렉션 
			// 종류 : 1.ArrayList 2.Vector , 3.LinkedList
				// 메소드 
					// 1. .add(객체) : 객체 추가
						// add( 인덱스번호 , 객체 ) 
					// 2. .get(인덱스번호) : 해당 번호의 객체 호출 
						// 인덱스 : 리스트에 저장되는 순서번호 [ 0 ~ ]
					// 3. .remove(인덱스번호) : 해당 번호의 객체 삭제 
					// 4. .size() : 리스트내 객체수 
					// 5. .contains(객체) : 리스트내 해당 객체 유무 확인 
					// 6. .indexOf(객체) : 리스트내 해당 객체 위치
					// 7. .clear() : 리스트내 모든 요소 삭제
					// 8. .isEmpty() : 리스트가 비어있는지 확인 true / false
					
		// 1. ArrayList 클래스  
		// string 객체 여러개를 담을수 있는 리스트객체 선언  
		ArrayList<String> arrayList = new ArrayList<>();
			// 제네릭 리스트에 담을 자료형
		// 추가 
		arrayList.add("java");
		arrayList.add("python");
		arrayList.add("database");
		arrayList.add("c언어");
		arrayList.add("c++언어");
		arrayList.add("java");
		
		// 출력 
		System.out.println( " arraylist : " + arrayList );
		// 호출 
		System.out.println(" arraylist 첫번째 요소 : " + arrayList.get(0));
		// 삭제
		System.out.println(" arraylist 두번째 요소 삭제");
			arrayList.remove(1); 
		System.out.println(" arraylist 삭제후 : " + arrayList );
		// 리스트내 객체수 
		System.out.println(" arraylist 객체수 : " + arrayList.size() );
		// 리스트와 반복문 1
		for( int i = 0 ; i<arrayList.size() ; i++ ) {
			System.out.println( arrayList.get(i) );
		}
		// 리스트와 반복문 2 
		for( String string : arrayList ) {
			// 리스트내 모든 요소4들을 하나씩 임시객체에 대입
			System.out.println(string);
		}
		// 특정 위치에 추가 
		arrayList.add(1, "js");
		System.out.println(" 특정 위치에 추가 : " + arrayList );
		// 객체 검색 
		System.out.println(" arraylist java객체가 있는지 : " 
						+ arrayList.contains("java"));
		System.out.println(" arraylist java객체의 위치 : " + arrayList.indexOf("java") );
		
		// 리스트내 모든 요소 삭제 
		arrayList.clear();
		System.out.println(" arraylist : " + arrayList );
		
		
		// 2. Vector 클래스 
			// 차이점 : Vector메소드 vs Arraylist메소드
					// 동기화O	vs  동기화x 
					// 멀티스레드 	vs  단일스레드
					// 메소드들의 synchronized 차이
		Vector<String> vector = new Vector<>();
		vector.add("java");
		
		// 3. LinkedList 클래스 
			// 차이점
				// Arraylist : 검색용이 
				// LinkedList : 삽입,삭제 용이 
		
		ArrayList<String> arrayList2 = new ArrayList<>();
		LinkedList<String> linkedList = new LinkedList<>();
		
		Long start;
		Long end;
		
		start =System.nanoTime(); // 현재 시간[나노] 메소드 
		for( int i = 0 ; i<10000 ;i++ ) {
			arrayList2.add( 0 , String.valueOf(i) );
		}
		end = System.nanoTime();
		
		System.out.println(" arraylist 10000개 삽입하는 걸리는시간 : " + (end-start) );
		
		start =System.nanoTime();
		for( int i = 0 ; i<10000 ;i++ ) {
			linkedList.add( 0 , String.valueOf(i) );
		}
		end = System.nanoTime();
		
		System.out.println("linkedList 10000개 삽입하는데 걸리는시간 :" +(end-start) );
		
		
	
		LinkedList< Integer > 대기명단 = new LinkedList<Integer>();		
		Scanner scanner = new Scanner(System.in);
			
		while(true) {
			System.out.println(" --- 대기 명단 관리 ---- ");
			System.out.println("\t대기번호 \t인원수  현재 대기소요시간 : " + 대기명단.size()*5 +"분");
			for( int i = 0 ; i<대기명단.size() ; i++ ) {
				System.out.println("\t"+(i+1)+"\t"+대기명단.get(i) );
			}
			System.out.println("1.대기추가 2.대기취소 3.대기입장");  int ch = scanner.nextInt();
			
			if( ch == 1 ) {
				System.out.println(" 인원수 : "); int count = scanner.nextInt();
				대기명단.add(count);
				System.out.println("대기번호 : " + 대기명단.size() );
			}
			if( ch == 2  ) {
				System.out.println("취소할 대기번호 : "); int delete = scanner.nextInt();
				대기명단.remove(delete-1); // 번호-1 => 인덱스 
				System.out.println("취소 되었습니다");
			}
			if( ch == 3 ) {
				if( 대기명단.isEmpty() ) {
					System.out.println(" 대기 명단이 없습니다 ");
				}else {
					System.out.println("1번 입장 ~~~ ");
					대기명단.remove(0);	
				}
				
			}
		}
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
