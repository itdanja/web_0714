package Day19;

import java.util.ArrayList;
import java.util.Scanner;

public class Consoleprogram {
	
	// �ʵ�( ���� , ��ü , �迭 �� )
		// 1. �÷��� �����ӿ�ũ [ ȸ��,�Խù�,��� ��� ]
		static ArrayList<Member> memberlist = new ArrayList<>();
		static ArrayList<Board> boardlist = new ArrayList<>();
		
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
		
		// ���Ͽ��� ȸ���ҷ����� 
		try {FileUtil.fileload(1);} 
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
						System.out.println(" �Խ��� ");
						// �Խ��� �޴� ȣ�� [ �μ�: login ]
						temp2.boardlist( login );
						login = null;
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
