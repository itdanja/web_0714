package Day01;

public class Day01_2 { // c s 
	
	// main => ctrl+스페이바
	public static void main(String[] args) { // m s
	
		// tab : 들여쓰기
		
		// syso => ctrl+스페이바
		System.out.println("콘솔에 출력되는문자");
		
		// 출력 
		// 예1
		System.out.println(123);		// 숫자
		System.out.println("java");		// 문자
		//System.out.println(java);		// 문자 
		System.out.println("java123");	// 문자+숫자
			// " " 처리 하는 이유 
				// 컴퓨터 모르는단어[ 정의되지 않은 문자 ]
				// 미리정의된[키워드] 혹은 숫자에는 문자처리 X
				// 문자+숫자 => 문자
		// 예)
		//System.out.println();	// 출력후 자동 줄바꿈처리 
			System.out.println("단어출력1");
		//System.out.print();		// 출력만[줄바꿈x]
			System.out.print("단어출력2\n");
		//System.out.printf();	// 형식[format] : 출력물 꾸미기 
			System.out.printf("%s" , "단어출력3\n");
			
			System.out.println(" 현재 나이는"+40+"입니다 그리고 좋아하는수는 "+7+" 입니다"); 
					// + : 연결연산자
			System.out.printf(" 현재 나이는 %d 입니다 그리고 좋아하는수는 %d 입니다\n" , 40 , 7);
			System.out.printf(" 현재 실수는 %f\n" , 10.5 );
			System.out.printf(" 현재 문자는 %c\n" , 'A');
					// " " : 문자열   ' ' : 문자
			System.out.printf(" 현재 문자열 %s\n" , "안녕하세요");
		
			System.out.println("\\");

			// 형식 문자 :
				// %d : 정수
				// %f : 실수
				// %s : 문자열
				// %c : 문자 
			//  제어문자 : 
				//  \n : 줄바꿈
				//  \t : 들여쓰기 
				//	\r : 다음줄의 첫칸으로 이동 
					// 	\\		\"		\'
		// 예제3 
		System.out.println("\t[[[ 출석부 ]]]");
		System.out.println("이름\t1교시\t2교시\t3교시");
		System.out.println("유재석\t출석\t결석\t출석");
		System.out.println("강호동\t결석\t출석\t출석");
		System.out.println("------------------------------");
		
		/*
		// 과제1
					\    /\
					 )  ( ')
					(  /  )
					 \(__)|
		
		// 과제2
					 |\_/|
					 |q p|   /}
					 ( 0 )"""\
					 |"^"`    |
					 ||_/=\\__|
		*/
			
			
		
		
		
		
		
	} // m e 
	
} // c e
