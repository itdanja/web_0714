package Day19;

import java.util.ArrayList;
import java.util.Scanner;

public class Consoleprogram {
	
	// �ʵ�( ���� , ��ü , �迭 �� )
		// 1. �÷��� �����ӿ�ũ [ ȸ��,�Խù�,��� ��� ]
		static ArrayList<Member> memberlist = new ArrayList<>();
		static ArrayList<Board> boardlist = new ArrayList<>();
		static ArrayList<Reply> replylist = new ArrayList<>(); 
		
		// 2. �Է� ��ü 
		static Scanner scanner = new Scanner(System.in);
			// System.in[ Ű���� ] ----> (��Ʈ��)����Ʈ ---> ����Ʈ scanner ��ü�� ���� 
				// .next() : ��ü�� ����� ����Ʈ�� String ��ȯ�ؼ� ��������
	// ������
	
	// �޼ҵ� 
		// 1. Start : ���α׷��� ���� 
	// ���α׷��� ���ϵ� ���� �ٸ� ��Ű������ ȣ��  => public
	//static void programstart() {
	void programstart() {
		
		try {
			FileUtil.fileload(1); // ���Ͽ��� ȸ���ҷ����� 
			FileUtil.fileload(2); // ���Ͽ��� �Խù� �ҷ�����
			FileUtil.fileload(4); // ���Ͽ��� ��� �ҷ����� 
		} 
		catch (Exception e) {System.out.println("[[����ó�� ���� ]] : �����ڿ��� ���� "+ e);}
		
		while(true) {
			System.out.println("\n[[[ ȸ���� Ŀ�´�Ƽ ]]]");
			System.out.print("[[[ 1.�α��� 2.ȸ������ 3.���̵�ã�� 4.��й�ȣã�� ���� : ");
			try {
				int ch = scanner.nextInt();
					Member temp = new Member(); // ȸ���� �޼ҵ� ȣ��� ��ü
					Board temp2 = new Board(); // �Խ��� �޼ҵ� ȣ��� ��ü 
				if( ch == 1 ) { 
				
					Member login =  temp.login(); 
					// �α��� �޼ҵ� ȣ��ǰ� ��ȯ : �α��μ����� ��ü / ���н� null
					if( login !=null ) {
						
						while( true ) {
							// �Խù� �Խù� ��� 
							temp2.boardlist();
							System.out.println("[[[ 1.�Խù���� 2.�Խù���ȸ 3.ȸ������[����/Ż��] 4.�α׾ƿ� ]] ");
							int ch2 = scanner.nextInt();
							if( ch2 == 1 ) { temp2.boardwrite( login ); }
							if( ch2 == 2 ) { temp2.boardview( login ); }
							if( ch2 == 3 ) {}
							if( ch2 == 4 ) { 
								System.out.println("[[[ �α׾ƿ� �Ǿ����ϴ� ]]]");
								login = null; // �α��ε����� null �ٲٱ� 
								break; // �ݺ��� Ż��
							}
						}
						
					}else {
						System.out.println(" �α��� ���� ");
					}
				}
				if( ch == 2 ) { temp.signup(); }
				if( ch == 3 ) { temp.findid(); }
				if( ch == 4 ) { temp.findpassword(); }
				if( ch <=0  || ch >4 ) {
					System.out.println("\t[[�˸� : 1,2,3,4 �޴� �� ���� �����մϴ� ]]");
				}
			}
			catch (Exception e) {
				System.out.println("\t[[�˸� : �˼� ���� �ൿ�Դϴ� ]]");
				scanner = new Scanner(System.in);
			}
 		}
	}

}
