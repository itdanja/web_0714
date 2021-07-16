package Day03;

public class Day03_1 { // c s 

	public static void main(String[] args) { // m s 
		
		// 연산자 [ 연산시 사용되는 기호 ]
		//1. 산술연산자 [ + - * / % ]
			//예1)
			int 정수1 = 10; int 정수2 = 20;
			System.out.println("더하기 : " + 정수1+정수2 );		// + : 연결연산자 
			System.out.println("더하기 : " + (정수1+정수2) );	// + : 더하기
			System.out.println("빼기 : " + (정수1-정수2) );	// - : 빼기 
			System.out.println("곱하기 : " + (정수1*정수2) );	// * : 곱하기 
			System.out.println("나누기 : " + (정수1/정수2) );	// / : 나누기
			System.out.println("나머지 : " + (정수1%정수2) );	// % : 나머지
			
		//2. 비교연산자 [ >=이상 <=이하 >초과 <미만 ==같다 !=같지않다 ]
				// 결과 => true / false
			//예2)
			System.out.println("이상 : " + (정수1>=정수2) );	// 10>=20 => false 
			System.out.println("이하 : " + (정수1<=정수2) ); 	// 10<=20 => true
			System.out.println("초과 : " + (정수1>정수2) );		// 10>20 => false 
			System.out.println("미만 : " + (정수1<정수2) ); 	// 10<20 => true 
			System.out.println("같다 : " + (정수1==정수2) ); 	// 10==20 => false 
			System.out.println("같지않다 : "+ (정수1!=정수2) ); 	// 10!=20 => true
			
		//3. 논리[관계]연산자 : 비교연산자 2개이상일때 [ and : &&   or : ||    not : ! ]
											// shift+7	  shift+엔터위에 원화기호
			int 정수3 = 30; int 정수4 = 40;
			System.out.println("and : " + (정수1>=정수2 && 정수4>=정수3) );	// 논리가 모두 t => 결과 t
				// and && : 이면서 면서 이고 모두 그리고 범위논리[80~90]
					//  80<=정수<=100 =>   정수>=80 && 정수<=100
			System.out.println("or : " + (정수1>=정수2 || 정수4>=정수3 ));	// 논리가 하나라도 t => 결과 t
			System.out.println("not : " + !(정수1>=정수2 || 정수4>=정수3) );	// !true => false

		//4. 대입연산자 [ 오른쪽데이터가 왼쪽으로 데이터 넣기 ] 
			//  =  대입    +=	(오른쪽데이터가 왼쪽 데이터에 더하기후에 왼쪽데이터 대입)	
			//				-=	*=	/=	%=
			정수1 = 정수1 + 1 ; 정수1 += 1;
			System.out.println("정수1 값은 : " + 정수1);

		//5. 증감연산자 [ 1씩 증가 혹은 1씩 감소 ] 
			//  ++변수 : 선위증가		변수++ : 후위증가  
			//	--변수 : 선위감소		변수-- : 후위증가
			정수1 += 1;  정수1++;
			System.out.println("정수1 값은 : " + 정수1);	// 14 
			System.out.println(" 선위증가 : "  + (++정수1) ); // 15
			System.out.println(" 후위증가 : "  + (정수1++) ); // 15 => print 후 => 16
			System.out.println(" 확인 : "  + (정수1) ); // 16
			
			System.out.println("선위감소 : " + (--정수1) ); // 15 
			System.out.println("후위감소 : " + (정수1--) ); // 15
			System.out.println(" 확인 : "  + (정수1) ); // 14
	
	} // m e 
} // c e
