package Day19;

import java.text.SimpleDateFormat;
import java.util.Date;
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
		
		public static int totalno = 0; // 게시물 전체 개수
	
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

		// 1. 모든 게시물 출력  메소드 // 리스트 모두 출력  
	public void boardlist() { 
		System.out.println("[[ 커뮤니티 ]] ");
		System.out.println("번호\t제목\t작성자\t조회수\t작성일");
			for( Board board : Consoleprogram.boardlist ) {
				System.out.println(board.bno+"\t"+board.btitle+"\t"+board.bwriter+"\t"+board.bcount+"\t"+board.bdate);
			}
		}
	// 3. 개별 게시물 메소드(인수 : 로그인된정보  [ 게시물의 번호를 입력받아 해당 게시물의 모든 정보 출력 ]
	public void boardview( Member login ) { 
		System.out.print("[[ 게시물번호 : ");	int bno = scanner.nextInt();
		for( Board board : Consoleprogram.boardlist ) {
			if( board.bno == bno ) {
				board.bcount++; // 조회수 증가 
				System.out.println("제목 : " + board.btitle +" 작성일 : "+ board.bdate + "  조회수 : "+board.bcount);
				System.out.println("작성자 : " + board.bwriter );
				System.out.println("내용 : " + board.bcontents );
				
				Reply temp = new Reply();
				// 해당 게시물의 댓글만 출력 
				System.out.println("----------댓글목록------------");
				temp.replylist(board.bno);
	
				// 댓글 쓰기 
				System.out.println("0.댓글쓰기 "); 
					if( board.bwriter.equals( login.getId() ) ) System.out.println("1.수정 2.삭제" ); 
				int ch = scanner.nextInt();
				if( ch == 0 ) {
					temp.replywrite( board.bno , login );
				}
				if( board.bwriter.equals( login.getId() ) ) {
					// 게시물작성자 와 로그인된정보의 아이디가 동일하면 
					if( ch==1) {
						System.out.println(" [[해당 게시물 수정]] ");
							scanner.nextLine(); //문제점 : 앞전에 next()등 이 있을경우
						System.out.print("[[ 제목 : ");	board.btitle = scanner.nextLine();
						System.out.print("[[ 내용 : ");	board.bcontents = scanner.nextLine();
						//파일처리 ( 업데이트 )
						try {
							FileUtil.filesave(2, 0);
						}catch (Exception e) {}
						
						System.out.println(" [[ 수정 되었습니다 ]]");
					}
					if( ch==2 ){
						System.out.println(" [[해당 게시물 삭제]] ");
						Consoleprogram.boardlist.remove(board); // 현재 게시물를 리스트에 삭제 
						// 파일처리 ( 업데이트 ) 
						try {
							FileUtil.filesave( 2 , 0 );
						}
						catch (Exception e) {}
						System.out.println(" [[ 삭제 되었습니다 ]]");
						return; // 메소드 종료 
					}
				}
			}
		}
	}
	
		// 4. 게시물 등록 메소드 
	public void boardwrite( Member login) {
		
		// scanner.nextLine(); 문제점 : 앞전에 next()등 이 있을경우
			//scanner.nextLine(); // 문제점 보완
		System.out.print("[[ 제목 : ");	String btitle = scanner.nextLine();
		System.out.print("[[ 내용 : ");	String bcontents = scanner.nextLine();
		String bwriter = login.getId(); // 로그인된 아이디
		
			// 1. 현재날짜/시간 클래스 
			Date date = new Date();
				// 2.형식 변환 클래스 
				SimpleDateFormat simpleDateFormat 
					= new SimpleDateFormat("yy-MM-dd hh:mm");
		String bdate = simpleDateFormat.format(date);
		
		// 객체 
		try {
			FileUtil.fileload(3);
		}
		catch (Exception e) {}
			Board board = new Board( totalno+1 , btitle , bcontents , bwriter , bdate , 0 );
			Consoleprogram.boardlist.add(board);
		// 파일처리
		try {
			FileUtil.filesave( 3 , board.getBno() );
			FileUtil.filesave( 2 , 0 );
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("[[ 게시물 등록 완료 ]] ");
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
