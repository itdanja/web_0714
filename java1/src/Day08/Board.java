package Day08;

import java.util.Scanner;

public class Board {
	// �Խù� Ŭ���� 
	
	// 1. �ʵ�
		int bno;			// 1. ��ȣ 
		String btitle;		// 2. ���� 
		String bcontents;	// 3. ����
		String bwriter;		// 4. �ۼ��� 
		String bdate;		// 5. �ۼ���
		int bcount;			// 6. ��ȸ��
	// 2. ������
		// [ �����ڸ� == Ŭ������ ����]
		// 1. ������� [ ctrl+�����̹� ]
		public Board() {} 
		// 2. ��� �ʵ带 �޴� ������[ ������Ŭ�� => source =>  generated constructor ] 
		public Board(int bno, String btitle, String bcontents,
				String bwriter, String bdate, int bcount) {
			
			this.bno = bno;
			this.btitle = btitle;
			this.bcontents = bcontents;
			this.bwriter = bwriter;
			this.bdate = bdate;
			this.bcount = bcount;
		}
		// 3. ��Ÿ ������ ���
	// 3. �޼ҵ� : 
		// 1. �۾��� 
		public void bwrite() {
			Scanner scanner = new Scanner(System.in);
			System.out.println("[[[ �۾��� ������ ]]]");
			System.out.println("������ : "); String btitle =  scanner.nextLine(); 
			System.out.println("�۳��� : "); String bcontents =  scanner.nextLine(); 
			System.out.println("�ۼ��� : "); String bwriter=  scanner.next();
			
			// 1. ��ü ���� 
			int bno = 1;
			String bdate = "2021-07-26";
			int bcount = 1;
			
			Board board = new Board(bno, btitle, bcontents, bwriter, bdate, bcount);
			
			// 2. ������ ��ü ������ �޸�??(�ֱ����ġ) [ �迭 , ����Ʈ �� ]
			Day08_2_Start.boardlist[0] = board;
			// 3. ���α׷� ����� ����Ǵ� �޸�(���������ġ) [ ����ó�� , datedate �� ] 
				// ���� 
			
		}
		// 2. �۸�� 
		public void blist() {
			if( Day08_2_Start.boardlist[0] == null ) return; // �޼ҵ� ������ 
			System.out.println("[[[[ Ŀ�´�Ƽ ]]]]");
			System.out.println("��ȣ\t����\t\t�ۼ���\t��ȸ��\t�ۼ���");
			System.out.print(Day08_2_Start.boardlist[0].bno + "\t");
			System.out.print(Day08_2_Start.boardlist[0].btitle + "\t\t");
			System.out.print(Day08_2_Start.boardlist[0].bwriter + "\t");
			System.out.print(Day08_2_Start.boardlist[0].bcount + "\t");
			System.out.print(Day08_2_Start.boardlist[0].bdate + "\t" );
			System.out.println();
			
		}
		// 3. �ۼ��� 
		public void bupdate() {
			System.out.println("[[[ �ۼ��� ������ ]]]");
		}
		// 4. �ۻ��� 
		public void bdelete() {
			System.out.println("[[[ �ۻ��� ������ ]]]");
		}
		// 5. ��ȸ������ 
		public void bcount() {
			System.out.println("[[[ ��ȸ������ ������ ]]]");
		}
		// 6. �� ��������
		public void bview( int ch2 ) { // �μ�o
			System.out.println("[[[ �������� ������ ]]]");
		}
		
}
