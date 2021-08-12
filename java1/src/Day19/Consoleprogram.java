package Day19;

import java.util.ArrayList;
import java.util.Scanner;

public class Consoleprogram {
	
	// 필드( 변수 , 객체 , 배열 등 )
		// 1. 컬렉션 프레임워크 [ 회원,게시물,댓글 목록 ]
		static ArrayList<Member> memberlist = new ArrayList<>();
		static ArrayList<Board> boardlist = new ArrayList<>();
		static ArrayList<Reply> replylist = new ArrayList<>(); 
		
		// 2. 입력 객체 
		static Scanner scanner = new Scanner(System.in);
			// System.in[ 키보드 ] ----> (스트림)바이트 ---> 바이트 scanner 객체에 저장 
				// .next() : 객체에 저장된 바이트를 String 변환해서 가져오기
	// 생성자
	
	// 메소드 
		// 1. Start : 프로그램의 시작 
	// 프로그램내 파일들 간의 다른 패키지에서 호출  => public
	//static void programstart() {
	void programstart() {
		
		try {
			FileUtil.fileload(1); // 파일에서 회원불러오기 
			FileUtil.fileload(2); // 파일에서 게시물 불러오기
			FileUtil.fileload(4); // 파일에서 댓글 불러오기 
		} 
		catch (Exception e) {System.out.println("[[파일처리 오류 ]] : 관리자에게 문의 "+ e);}
		
		while(true) {
			System.out.println("\n[[[ 회원제 커뮤니티 ]]]");
			System.out.print("[[[ 1.로그인 2.회원가입 3.아이디찾기 4.비밀번호찾기 선택 : ");
			try {
				int ch = scanner.nextInt();
					Member temp = new Member(); // 회원용 메소드 호출용 객체
					Board temp2 = new Board(); // 게시판 메소드 호출용 객체 
				if( ch == 1 ) { 
				
					Member login =  temp.login(); 
					// 로그인 메소드 호출되고 반환 : 로그인성공시 객체 / 실패시 null
					if( login !=null ) {
						
						while( true ) {
							// 게시물 게시물 출력 
							temp2.boardlist();
							System.out.println("[[[ 1.게시물등록 2.게시물조회 3.회원정보[수정/탈퇴] 4.로그아웃 ]] ");
							int ch2 = scanner.nextInt();
							if( ch2 == 1 ) { temp2.boardwrite( login ); }
							if( ch2 == 2 ) { temp2.boardview( login ); }
							if( ch2 == 3 ) {}
							if( ch2 == 4 ) { 
								System.out.println("[[[ 로그아웃 되었습니다 ]]]");
								login = null; // 로그인된정보 null 바꾸기 
								break; // 반복문 탈출
							}
						}
						
					}else {
						System.out.println(" 로그인 실패 ");
					}
				}
				if( ch == 2 ) { temp.signup(); }
				if( ch == 3 ) { temp.findid(); }
				if( ch == 4 ) { temp.findpassword(); }
				if( ch <=0  || ch >4 ) {
					System.out.println("\t[[알림 : 1,2,3,4 메뉴 중 선택 가능합니다 ]]");
				}
			}
			catch (Exception e) {
				System.out.println("\t[[알림 : 알수 없는 행동입니다 ]]");
				scanner = new Scanner(System.in);
			}
 		}
	}

}
