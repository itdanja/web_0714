package Day19;

import java.util.Scanner;

public class Reply {
	
	// �ʵ� 
		private int rno;
		private int bno; // � �Խù��� ������� �ĺ���
		private String rcontents;
		private String rwriter;
		
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
			//��ü 
			Reply reply = new Reply(bno, bno, rcontents, login.getId() );
			//����ó�� 
			
		}
		// 2. ��� ��� 
	
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
