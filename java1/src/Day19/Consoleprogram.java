package Day19;

import java.util.Scanner;

public class Consoleprogram {
	
	// �ʵ�( ���� , ��ü , �迭 �� )
		// 1. �÷��� �����ӿ�ũ [ ȸ��,�Խù�,��� ��� ]
		// 2. �Է� ��ü 
		Scanner scanner = new Scanner(System.in);
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
				if( ch == 1 ) {}
				if( ch == 2 ) {}
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
