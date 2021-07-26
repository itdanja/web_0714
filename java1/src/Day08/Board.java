package Day08;

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
			System.out.println("[[[ 글쓰기 페이지 ]]]");
		}
		// 2. 글목록 
		public void blist() {
			System.out.println("[[[[ 커뮤니티 ]]]]");
			
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
