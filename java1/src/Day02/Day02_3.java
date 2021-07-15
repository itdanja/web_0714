package Day02;

import java.util.Scanner;

public class Day02_3 {
	
	public static void main(String[] args) {
		
	/*
	 	//문제1 
		// 1. 입력객체 [ 키보드로부터 입력값 가져오는 역할 ] 
		Scanner 입력객체 = new Scanner(System.in);
			// 클래스명의 첫글자 => 대문자 입력 
		
		// 2. 입력객체에서 입력받은 값을 변수에 저장 [ 변수 선언 : 자료형 변수명 = 값 ] 
		System.out.print("학생1의 이름입력 : ");	String 학생1 = 입력객체.next();
		System.out.print("학생1의 1교시 : "); 	int 학생1_1교시 = 입력객체.nextInt();
		System.out.print("학생1의 2교시 : "); 	int 학생1_2교시 = 입력객체.nextInt();
		System.out.print("학생1의 3교시 : "); 	int 학생1_3교시 = 입력객체.nextInt();
		
		System.out.print("학생2의 이름입력 : "); String 학생2 = 입력객체.next();
		System.out.print("학생2의 1교시 : "); 	int 학생2_1교시 = 입력객체.nextInt();
		System.out.print("학생2의 2교시 : "); 	int 학생2_2교시 = 입력객체.nextInt();
		System.out.print("학생2의 3교시 : "); 	int 학생2_3교시 = 입력객체.nextInt();
		
		// 출력 	[ + : 연결연산자 ( 변수+문자 ) ] print
		System.out.println("\n========= 출석부 print ========= ");
		System.out.println("학생명\t1교시\t2교시\t3교시");
		System.out.println(학생1+"\t"+학생1_1교시+"\t"+학생1_2교시+"\t"+학생1_3교시 );
		System.out.println(학생2+"\t"+학생2_1교시+"\t"+학생2_2교시+"\t"+학생2_3교시 );
		System.out.println("============================== ");
		
		System.out.printf("\n========= 출석부 printf =========\n");
		System.out.printf("학생명\t1교시\t2교시\t3교시\n");
		System.out.printf("%s\t%d\t%d\t%d\n" , 학생1 , 학생1_1교시 , 학생1_2교시 , 학생1_3교시  );
		System.out.printf("%s\t%d\t%d\t%d\n" , 학생2 , 학생2_1교시 , 학생2_2교시 , 학생2_3교시  );
		System.out.printf("==============================\n");
	*/
	
		// 문제3
		//1 .입력객체 생성 
		Scanner 입력객체 = new Scanner(System.in);
		// 2. 입력객체 입력된 데이터를 변수에 저장 
		System.out.print(" 가입할 아이디 : "); 	String 아이디 = 입력객체.next();
		System.out.print(" 가입할 비밀번호 : "); short 비밀번호 = 입력객체.nextShort();
		System.out.print(" 가입할 성명 : ");  	String 성명 = 입력객체.next();
		System.out.print(" 가입할 이메일 : ");  String 이메일 = 입력객체.next();
		
		// 3. 출력 
		System.out.println(">>>>>>>>> 회원가입 완료 [ 아래 정보를 확인해주세요 ] >>>>>");
		System.out.println("아이디\t비밀번호\t성명\t이메일");
		System.out.println(아이디+"\t"+비밀번호+"\t"+성명+"\t"+이메일);
		
	
		
	}

}
