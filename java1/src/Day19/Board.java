package Day19;

import java.util.Scanner;

public class Board {
	
	// 필드
		private int bno; // 1.게시물번호
		private String btitle; // 2.제목 
		private String bcontents; // 3.내용
		private String bwriter; // 4.작성자
		private String bdate; // 5.작성일
		private int bcount; // 6.조회수 
		
		Scanner scanner = new Scanner(System.in);
	
	// 생성자
	public Board() {
		// TODO Auto-generated constructor stub
	}
	public Board(int bno, String btitle, String bcontents, String bwriter, String bdate, int bcount) {
		this.bno = bno;
		this.btitle = btitle;
		this.bcontents = bcontents;
		this.bwriter = bwriter;
		this.bdate = bdate;
		this.bcount = bcount;
	}
	// 메소드 
		// 1. 게시판 메뉴 [  모든 게시물 메소드  ]
	public void boardlist( Member login ) {
		while( true ) {
			System.out.println("[[[ 1.게시물등록 2.게시물조회 3.회원정보[수정/탈퇴] 4.로그아웃 ]] ");
			int ch = scanner.nextInt();
			if( ch == 1 ) {}
			if( ch == 2 ) {}
			if( ch == 3 ) {}
			if( ch == 4 ) { 
				System.out.println("[[[ 로그아웃 되었습니다 ]]]");
				return;
			}
		}
	}
		// 3. 개별 게시물 메소드 
	public void boardview() {
		
	}
		// 4. 게시물 등록 메소드 
	public void boardwrite() {
		
	}
		// 5. 게시물 조회수 증가 메소드 
		// 6. 게시물 수정 메소드 
		// 7. 게시물 삭제 메소드 

	public int getBno() {
		return bno;
	}
	public void setBno(int bno) {
		this.bno = bno;
	}
	public String getBtitle() {
		return btitle;
	}
	public void setBtitle(String btitle) {
		this.btitle = btitle;
	}
	public String getBcontents() {
		return bcontents;
	}
	public void setBcontents(String bcontents) {
		this.bcontents = bcontents;
	}
	public String getBwriter() {
		return bwriter;
	}
	public void setBwriter(String bwriter) {
		this.bwriter = bwriter;
	}
	public String getBdate() {
		return bdate;
	}
	public void setBdate(String bdate) {
		this.bdate = bdate;
	}
	public int getBcount() {
		return bcount;
	}
	public void setBcount(int bcount) {
		this.bcount = bcount;
	}
	
	

}
