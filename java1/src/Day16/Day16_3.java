package Day16;

import java.util.Arrays;
import java.util.Scanner;

public class Day16_3 {
	//	문제1 :명단 프로그램
	//	메뉴[무한루프]
	//		1. 명단추가
	//		2. 명단출력 
	// 
	//	[조건1] 이름 , 나이 입력받아 아래조건에 따라 명단 등록 
	//	[조건2]
	//							나이가 8세 미만 유아 명단 등록 
	//	명단클래스		사람[super]	나이가 20세 미만 청소년 명단 등록 
	//							나이가 그외는 성인 명단 등록 
	//	[조건3] 명단별 인원들의 모든 이름 출력 
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Member<Child> childlist = new Member<>("유아명단");
		Member<Student> sudentlist = new Member<>("청소년명단");
		Member<Adult> adultlist = new Member<>("성인명단");
		
		while(true) {
			System.out.println("[[[ 명단 관리 ]]]");
			System.out.println("1.명단등록 2.명단출력");
			int ch = scanner.nextInt();
			
			if( ch ==1 ) {
				System.out.println("이름 : "); 	String name = scanner.next();
				System.out.println("나이 : ");	int age = scanner.nextInt(); 
				if( age < 8 ) {
					childlist.add( new Child(name, age));
				}else if( age <20 ) {
					sudentlist.add( new Student(name, age));
				}else {
					adultlist.add( new Adult(name, age));
				}
			}
			if( ch ==2 ) {
				memberprint(childlist);
				memberprint(sudentlist);
				memberprint(adultlist);
			}
		}
	} // main end 
	
	public static void memberprint( Member<?> member ) {
		System.out.println( member.getMembername() +"명단 목록 : "+
				Arrays.toString( member.getMemberlist() ) );
	} 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
