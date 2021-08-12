package Day19;

import java.text.SimpleDateFormat;
import java.util.Date;
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
		
		public static int totalno = 0; // �Խù� ��ü ����
	
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

		// 1. ��� �Խù� ���  �޼ҵ� // ����Ʈ ��� ���  
	public void boardlist() { 
		System.out.println("[[ Ŀ�´�Ƽ ]] ");
		System.out.println("��ȣ\t����\t�ۼ���\t��ȸ��\t�ۼ���");
			for( Board board : Consoleprogram.boardlist ) {
				System.out.println(board.bno+"\t"+board.btitle+"\t"+board.bwriter+"\t"+board.bcount+"\t"+board.bdate);
			}
		}
	// 3. ���� �Խù� �޼ҵ�(�μ� : �α��ε�����  [ �Խù��� ��ȣ�� �Է¹޾� �ش� �Խù��� ��� ���� ��� ]
	public void boardview( Member login ) { 
		System.out.print("[[ �Խù���ȣ : ");	int bno = scanner.nextInt();
		for( Board board : Consoleprogram.boardlist ) {
			if( board.bno == bno ) {
				board.bcount++; // ��ȸ�� ���� 
				System.out.println("���� : " + board.btitle +" �ۼ��� : "+ board.bdate + "  ��ȸ�� : "+board.bcount);
				System.out.println("�ۼ��� : " + board.bwriter );
				System.out.println("���� : " + board.bcontents );
				
				Reply temp = new Reply();
				// �ش� �Խù��� ��۸� ��� 
				System.out.println("----------��۸��------------");
				temp.replylist(board.bno);
	
				// ��� ���� 
				System.out.println("0.��۾��� "); 
					if( board.bwriter.equals( login.getId() ) ) System.out.println("1.���� 2.����" ); 
				int ch = scanner.nextInt();
				if( ch == 0 ) {
					temp.replywrite( board.bno , login );
				}
				if( board.bwriter.equals( login.getId() ) ) {
					// �Խù��ۼ��� �� �α��ε������� ���̵� �����ϸ� 
					if( ch==1) {
						System.out.println(" [[�ش� �Խù� ����]] ");
							scanner.nextLine(); //������ : ������ next()�� �� �������
						System.out.print("[[ ���� : ");	board.btitle = scanner.nextLine();
						System.out.print("[[ ���� : ");	board.bcontents = scanner.nextLine();
						//����ó�� ( ������Ʈ )
						try {
							FileUtil.filesave(2, 0);
						}catch (Exception e) {}
						
						System.out.println(" [[ ���� �Ǿ����ϴ� ]]");
					}
					if( ch==2 ){
						System.out.println(" [[�ش� �Խù� ����]] ");
						Consoleprogram.boardlist.remove(board); // ���� �Խù��� ����Ʈ�� ���� 
						// ����ó�� ( ������Ʈ ) 
						try {
							FileUtil.filesave( 2 , 0 );
						}
						catch (Exception e) {}
						System.out.println(" [[ ���� �Ǿ����ϴ� ]]");
						return; // �޼ҵ� ���� 
					}
				}
			}
		}
	}
	
		// 4. �Խù� ��� �޼ҵ� 
	public void boardwrite( Member login) {
		
		// scanner.nextLine(); ������ : ������ next()�� �� �������
			//scanner.nextLine(); // ������ ����
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
		try {
			FileUtil.fileload(3);
		}
		catch (Exception e) {}
			Board board = new Board( totalno+1 , btitle , bcontents , bwriter , bdate , 0 );
			Consoleprogram.boardlist.add(board);
		// ����ó��
		try {
			FileUtil.filesave( 3 , board.getBno() );
			FileUtil.filesave( 2 , 0 );
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("[[ �Խù� ��� �Ϸ� ]] ");
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
