package Day19;

import java.util.ArrayList;
import java.util.Scanner;

public class Consoleprogram {
	
	// �ʵ�( ���� , ��ü , �迭 �� )
		// 1. �÷��� �����ӿ�ũ [ ȸ��,�Խù�,��� ��� ]
		static ArrayList<Member> memberlist = new ArrayList<>();
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
		while(true) {
			System.out.println("\n[[[ ȸ���� Ŀ�´�Ƽ ]]]");
			System.out.print("[[[ 1.�α��� 2.ȸ������ 3.���̵�ã�� 4.��й�ȣã�� ���� : ");
			try {
				int ch = scanner.nextInt();
					Member temp = new Member(); // ȸ���� �޼ҵ� ȣ��� ��ü
				if( ch == 1 ) { }
				if( ch == 2 ) {temp.signup(); }
				if( ch == 3 ) {}
				if( ch == 4 ) {}
				if( ch <=0  || ch >=4 ) {
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
