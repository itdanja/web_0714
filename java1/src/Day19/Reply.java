package Day19;

import java.util.Scanner;

public class Reply {
	
	// �ʵ� 
		private int rno; //  ��� ��ȣ 
		private int bno; // � �Խù��� ������� �ĺ���
		private String rcontents;
		private String rwriter;
		
		public static int totalno = 0; // ��� ��ü �� 
		
		Scanner scanner = new Scanner(System.in);
		
	// ������
		// 1.�������
		public Reply() {}
		// 2.����ʵ� ������
		public Reply(int rno, int bno, String rcontents, String rwriter) {
			this.rno = rno;
			this.bno = bno;
			this.rcontents = rcontents;
			this.rwriter = rwriter;
		}
	// �޼ҵ� 
		// 1. ��۾��� [ �μ� : �Խù���ȣ , �α��ε����� ] 
		public void replywrite( int bno , Member login ) {
			System.out.print("[[ ��� ���� : ");	String rcontents = scanner.nextLine();
			try {
				FileUtil.fileload(5);
			}
			catch (Exception e) {}
			//��ü 
			Reply reply = new Reply(totalno+1, bno, rcontents, login.getId() );
			// ����Ʈ�� �߰� 
			Consoleprogram.replylist.add(reply);
			//����ó�� 
			try {
				FileUtil.filesave( 4, 0);
				FileUtil.filesave( 5 , reply.getRno() );
			}catch (Exception e) {}			
			
		}
		// 2. ��� ��� [ �μ� : �Խù���ȣ ] :�ش� �Խù���ȣ�� ��ġ�ϴ� ��۸� ���  
		public void replylist( int bno ) {
			
			System.out.println("�ۼ���\t����");
			for(Reply reply : Consoleprogram.replylist  ) {
				
				if( reply.getBno() == bno ) {
					// ����� �Խù���ȣ�� ����Խù���ȣ�� �����ϸ� 
					System.out.println( reply.getRwriter()+"\t"+reply.getRcontents() );
				}
			}
		}
	
		// 3. ��� ����
		
		// 4. ��� ���� 
	
		// 5. get , set �޼ҵ� 
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
