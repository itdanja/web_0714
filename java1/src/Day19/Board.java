package Day19;

import java.util.Scanner;

public class Board {
	
	// �ʵ�
		private int bno; // 1.�Խù���ȣ
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
			if( ch == 1 ) {}
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
	public void boardwrite() {
		
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
