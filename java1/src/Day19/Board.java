package Day19;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Board {
	
	// �ʵ�
		private static int bno = 0; // 1.�Խù���ȣ
		private String btitle; // 2.���� 
		private String bcontents; // 3.����
		private String bwriter; // 4.�ۼ���
		private String bdate; // 5.�ۼ���
		private int bcount; // 6.��ȸ�� 
		
		Scanner scanner = new Scanner(System.in);
	
	// ������
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
	// �޼ҵ� 
		// 1. �Խ��� �޴� [  ��� �Խù� �޼ҵ�  ]
	public void boardlist( Member login ) {
		while( true ) {
			System.out.println("[[[ 1.�Խù���� 2.�Խù���ȸ 3.ȸ������[����/Ż��] 4.�α׾ƿ� ]] ");
			int ch = scanner.nextInt();
			if( ch == 1 ) { boardwrite( login ); }
			if( ch == 2 ) {}
			if( ch == 3 ) {}
			if( ch == 4 ) { 
				System.out.println("[[[ �α׾ƿ� �Ǿ����ϴ� ]]]");
				return;
			}
		}
	}
		// 3. ���� �Խù� �޼ҵ� 
	public void boardview() {
		
	}
		// 4. �Խù� ��� �޼ҵ� 
	public void boardwrite( Member login) {
		
		// scanner.nextLine(); ������ 
		scanner.nextLine(); // ������ ����
		
		System.out.print("[[ ���� : ");	String btitle = scanner.nextLine();
		System.out.print("[[ ���� : ");	String bcontents = scanner.nextLine();
		String bwriter = login.getId(); // �α��ε� ���̵�
		
			// 1. ���糯¥/�ð� Ŭ���� 
			Date date = new Date();
				// 2.���� ��ȯ Ŭ���� 
				SimpleDateFormat simpleDateFormat 
					= new SimpleDateFormat("yy-MM-dd hh:mm");
		String bdate = simpleDateFormat.format(date);
		
		// ��ü 
		Board board = new Board( bno+1 , btitle , bcontents , bwriter , bdate , 0 );
		Consoleprogram.boardlist.add(board);
		// ����ó��
		try {
			FileUtil.filesave( 3 , board.getBno() );
			FileUtil.filesave( 2 , 0 );
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}
		// 5. �Խù� ��ȸ�� ���� �޼ҵ� 
		// 6. �Խù� ���� �޼ҵ� 
		// 7. �Խù� ���� �޼ҵ� 

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
