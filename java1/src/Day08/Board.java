package Day08;

import java.util.Date;
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
			System.out.print("������ : "); String btitle =  scanner.nextLine(); 
			System.out.print("�۳��� : "); String bcontents =  scanner.nextLine(); 
			System.out.print("�ۼ��� : "); String bwriter=  scanner.next();
			
			// 1. ��ü ���� 
			int bno = -1; // �ε��� -1 ���� 
				// �Խù���ȣ [ 1. �ڵ�[DB] 2. ���� ]
				for( int i = 0 ; i<Day08_2_Start.boardlist.length ; i++ ) {
					if( Day08_2_Start.boardlist[i] == null ) {
						
						// 1. ù��° �Խù��� ��� 1���� ���� 
						if( i == 0 )  {
							bno = 1; break;
						}
						// 2. ù��° �Խù��� �ƴѰ��� ������ �Խù��� +1
						else {
							bno = Day08_2_Start.boardlist[i-1].bno + 1 ; break; 
											// ������ �Խù��� ��ȣ +1
						}
					}
				}
				Date date = new Date(); // ���ó�¥/�ð� Ŭ����
			String bdate = date.toString(); // ��¥��ü�� ���� 
			int bcount = 1; // �Խù� �ۼ��� ��ȸ�� 1 ���� ���� 
			
			Board board = new Board(bno, btitle, bcontents, bwriter, bdate, bcount);
			
			// 2. ������ ��ü ������ �޸�??(�ֱ����ġ) [ �迭 , ����Ʈ �� ]
			for( int i = 0 ;i<Day08_2_Start.boardlist.length ; i ++ ) {
				if( Day08_2_Start.boardlist[i] == null ) {
					Day08_2_Start.boardlist[i] = board;
					break;
				}
			}
			
			// 3. ���α׷� ����� ����Ǵ� �޸�(���������ġ) [ ����ó�� , database �� ] 
				// ���� 
			
		}
		// 2. �۸�� 
		public void blist() {
			
			System.out.println("[[[[ Ŀ�´�Ƽ ]]]]");
			System.out.println("��ȣ\t����\t\t�ۼ���\t��ȸ��\t�ۼ���");
			
			for( int i = 0 ; i<Day08_2_Start.boardlist.length ; i++ ) {
				
				if( Day08_2_Start.boardlist[i] == null ) return; // �޼ҵ� ������ 
				System.out.print(Day08_2_Start.boardlist[i].bno + "\t");
				System.out.print(Day08_2_Start.boardlist[i].btitle + "\t\t");
				System.out.print(Day08_2_Start.boardlist[i].bwriter + "\t");
				System.out.print(Day08_2_Start.boardlist[i].bcount + "\t");
				System.out.print(Day08_2_Start.boardlist[i].bdate + "\t" );
				System.out.println();
			}
			
		}
		// 3. �ۼ��� 
		public void bupdate() {
			System.out.println("[[[ �ۼ��� ������ ]]]");
		}
		// 4. �ۻ��� 
		public void bdelete( int bno ) {
			// System.out.println("[[[ �ۻ��� ������ ]]]");
			System.out.println("[[ �ش� �Խù��� ���� �Ǿ����ϴ� ]] ");
			
			for( int i = 0 ; i<Day08_2_Start.boardlist.length ; i++ ) {
				if( Day08_2_Start.boardlist[i] !=null && Day08_2_Start.boardlist[i].bno == bno ) {
					
					// �ش� �Խù���ȣ�� ��ü ���� 
					Day08_2_Start.boardlist[i] = null;
					// ������ �Խù� �ڷ� ��ĭ�� ���� 
					for( int j = i ; j<Day08_2_Start.boardlist.length ; j++ ) {
						
						// ���� ��ü�� ������ 
						if( Day08_2_Start.boardlist[j+1] != null ) {
							Day08_2_Start.boardlist[j] = Day08_2_Start.boardlist[j+1];
						}else {
							Day08_2_Start.boardlist[j+1] = null;
							break;
						}
					}
				}
			}
		}
		// 5. ��ȸ������ 
		public void bcount() {
			//System.out.println("[[[ ��ȸ������ ������ ]]]");
			this.bcount++; // ��ȸ�� ����
		}
		// 6. �� ��������
		public void bview( int bno ) { // �μ�o
			
			Board board = null ;
			
			for( int i = 0 ; i<Day08_2_Start.boardlist.length ; i++  ) {	
				if( Day08_2_Start.boardlist[i] !=null && Day08_2_Start.boardlist[i].bno == bno ) {
						/// i��° �ε����� �迭���� ���� �ƴϸ鼭 i��° �ε����� �迭���� �Խù���ȣ�� ������ �Խù���ȣ�� ������ 
					
					board = Day08_2_Start.boardlist[i];
					board.bcount(); // ��ȸ�� ���� �޼ҵ� ȣ�� 
					break;
				}
			}
			
			if( board == null ) return;
			
			System.out.println("[[[ �������� ������ ]]]");
			System.out.println(" ���� : " + board.btitle );
			System.out.println(" �ۼ��� : "+board.bwriter+"  ��ȸ�� : "+board.bcount +" �ۼ��� : " + board.bdate);
			System.out.println(" ���� : " + board.bcontents );
			System.out.println(" 1.���� 2.���� 3.����ۼ� 4.�ڷΰ���");
			Scanner scanner = new Scanner(System.in);
			int ch = scanner.nextInt();
			if( ch == 1 ) {}
			if( ch == 2 ) { bdelete( bno ); return; }
			if( ch == 3 ) {}
			if( ch == 4 ) { 
				return; //�޼ҵ� ����
			}
		}
		
		
		
		
		
		
		
}
