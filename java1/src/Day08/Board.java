package Day08;

import java.util.Scanner;

public class Board {
	// 게시물 클래스 
	
	// 1. 필드
		int bno;			// 1. 번호 
		String btitle;		// 2. 제목 
		String bcontents;	// 3. 내용
		String bwriter;		// 4. 작성자 
		String bdate;		// 5. 작성일
		int bcount;			// 6. 조회수
	// 2. 생성자
		// [ 생성자명 == 클래스명 동일]
		// 1. 빈생성자 [ ctrl+스페이바 ]
		public Board() {} 
		// 2. 모든 필드를 받는 생성자[ 오른쪽클릭 => source =>  generated constructor ] 
		public Board(int bno, String btitle, String bcontents,
				String bwriter, String bdate, int bcount) {
			
			this.bno = bno;
			this.btitle = btitle;
			this.bcontents = bcontents;
			this.bwriter = bwriter;
			this.bdate = bdate;
			this.bcount = bcount;
		}
		// 3. 기타 생성자 등등
	// 3. 메소드 : 
		// 1. 글쓰기 
		public void bwrite() {
			Scanner scanner = new Scanner(System.in);
			System.out.println("[[[ 글쓰기 페이지 ]]]");
			System.out.println("글제목 : "); String btitle =  scanner.nextLine(); 
			System.out.println("글내용 : "); String bcontents =  scanner.nextLine(); 
			System.out.println("작성자 : "); String bwriter=  scanner.next();
			
			// 1. 객체 생성 
			int bno = 1;
			String bdate = "2021-07-26";
			int bcount = 1;
			
			Board board = new Board(bno, btitle, bcontents, bwriter, bdate, bcount);
			
			// 2. 여러개 객체 저장할 메모리??(주기억장치) [ 배열 , 리스트 등 ]
			Day08_2_Start.boardlist[0] = board;
			// 3. 프로그램 종료시 저장되는 메모리(보조기억장치) [ 파일처리 , datedate 등 ] 
				// 생략 
			
		}
		// 2. 글목록 
		public void blist() {
			if( Day08_2_Start.boardlist[0] == null ) return; // 메소드 끝내기 
			System.out.println("[[[[ 커뮤니티 ]]]]");
			System.out.println("번호\t제목\t\t작성자\t조회수\t작성일");
			System.out.print(Day08_2_Start.boardlist[0].bno + "\t");
			System.out.print(Day08_2_Start.boardlist[0].btitle + "\t\t");
			System.out.print(Day08_2_Start.boardlist[0].bwriter + "\t");
			System.out.print(Day08_2_Start.boardlist[0].bcount + "\t");
			System.out.print(Day08_2_Start.boardlist[0].bdate + "\t" );
			System.out.println();
			
		}
		// 3. 글수정 
		public void bupdate() {
			System.out.println("[[[ 글수정 페이지 ]]]");
		}
		// 4. 글삭제 
		public void bdelete() {
			System.out.println("[[[ 글삭제 페이지 ]]]");
		}
		// 5. 조회수증가 
		public void bcount() {
			System.out.println("[[[ 조회수증가 페이지 ]]]");
		}
		// 6. 글 상세페이지
		public void bview( int ch2 ) { // 인수o
			System.out.println("[[[ 상세페이지 페이지 ]]]");
		}
		
}
