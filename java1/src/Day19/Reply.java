package Day19;

import java.util.Scanner;

public class Reply {
	
	// 필드 
		private int rno;
		private int bno; // 어떤 게시물의 댓글인지 식별용
		private String rcontents;
		private String rwriter;
		
		Scanner scanner = new Scanner(System.in);
		
	// 생성자
		// 1.빈생성자
		public Reply() {}
		// 2.모든필드 생성자
		public Reply(int rno, int bno, String rcontents, String rwriter) {
			this.rno = rno;
			this.bno = bno;
			this.rcontents = rcontents;
			this.rwriter = rwriter;
		}
	// 메소드 
		// 1. 댓글쓰기 [ 인수 : 게시물번호 , 로그인된정보 ] 
		public void replywrite( int bno , Member login ) {
			System.out.print("[[ 댓글 내용 : ");	String rcontents = scanner.nextLine();
			//객체 
			Reply reply = new Reply(bno, bno, rcontents, login.getId() );
			//파일처리 
			
		}
		// 2. 댓글 출력 
	
		// 3. 댓글 삭제
		
		// 4. 댓글 수정 
	
		// 5. get , set 메소드 
		public int getRno() {
			return rno;
		}
		public void setRno(int rno) {
			this.rno = rno;
		}
		public int getBno() {
			return bno;
		}
		public void setBno(int bno) {
			this.bno = bno;
		}
		public String getRcontents() {
			return rcontents;
		}
		public void setRcontents(String rcontents) {
			this.rcontents = rcontents;
		}
		public String getRwriter() {
			return rwriter;
		}
		public void setRwriter(String rwriter) {
			this.rwriter = rwriter;
		}
		
		
		

}
