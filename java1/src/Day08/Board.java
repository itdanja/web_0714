package Day08;

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
			System.out.println("[[[ �۾��� ������ ]]]");
		}
		// 2. �۸�� 
		public void blist() {
			System.out.println("[[[[ Ŀ�´�Ƽ ]]]]");
			
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
