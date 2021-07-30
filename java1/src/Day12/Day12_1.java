package Day12;

import java.util.Scanner;

public class Day12_1 {

	// ����ó�� : ����[����] �߻�������� ó�� �ڵ�
		// ���� : ���ܹ߻������� ���α׷����� ���� [ ���α׷� ����ȭ ]
		// �ڵ�� ������ �����Ϸ�[����] X
		// �ڵ�� ������ ������ ����� �Ŀ� ���α׷� ����� ���� 
		// ���� ó�����
			// 1. IF : �̹� �˰� �ִ� �����ϰ�� 
			// 2. try~catch : �پ��� ����� ������ ��� 
		// ���� 
			// try{  ���ܰ� �߻��ҰͰ��� �ڵ� }
			// catch( ����Ŭ���� ��ü�� ){ ���ܴ�ü�ڵ� }
			// finally{ ������ �����ڵ� }
		// ����Ŭ���� [ Exception ����Ŭ������ ����Ŭ���� ] 
			// 1. NullPointerException
			// 2. ArrayIndexOutOfBoundsException
			// 3. NumberFormatException
			// 4. ���� ����� ���ܹ߻� ��� Exception
	
	public static void main(String[] args) {
		
		// 1.��ü�� null �ΰ�� ��� , �������  
		try {
			// ���ܰ� �߻��ϸ� catch�� �̵� // �ƴϸ� �״�� ���� 
			String ���ڿ� = null; // ���� 
			System.out.println( ���ڿ� ); // ���� 
			System.out.println( ���ڿ�.toString() ); // ���ܹ߻�!!! => catch
		}
		catch( NullPointerException exception  ) {
			  // ����Ŭ������	��ü��(����)
			System.out.println("�����߻� ���� : " + exception );
			System.out.println("[[�����ڿ��Թ���]]");
		}
		
		// 2.�迭�� index�� �����Ѱ�� 
		try {
			// ���ܰ� �߻��ϸ� => catch �ƴϸ� �״�� ���� 
			String[] ���ڿ��迭 = new String[2];
				// String ��ü 2���� �����Ҽ� �ִ� �迭 
			���ڿ��迭[0] = "��ȣ��"; // �������� 
			���ڿ��迭[1] = "�ŵ���"; // �������� 
			���ڿ��迭[2] = "������"; // 3��° �ο��߰� // ���ܹ߻�!!! => catch
		}catch(ArrayIndexOutOfBoundsException exception ) {
			System.out.println("�����߻� ���� : " + exception);
			System.out.println("[[ ���̻� �ο��� �߰��Ҽ� �����ϴ� ]] ");
		}
		
		// 3. ���� => ���� ���� ���� // ���� => ���� ����
		
		try {
			String ���ڿ�2 = "100";
			String ���ڿ�3 = "��100";
			
			System.out.println( Integer.parseInt(���ڿ�2) );
						// Integer.paeseInt(���ڿ�) : ���ڿ� => ���� 
			System.out.println( Integer.parseInt(���ڿ�3) ); // ���ܹ߻�!! 
		}
		catch( NumberFormatException exception  ) {
			System.out.println("�����߻� ���� : " + exception);
			System.out.println("[[ ���ڰ� ���ԵǴ� ���ڿ��� ���ڿ� ��ȯ �Ұ� ]] ");
		}
		
		// 4. ����Ŭ������ �𸣴°�� 
		try {
			// 1. 
			String ���ڿ� = null; // ���� 
			System.out.println( ���ڿ� ); // ���� 
			System.out.println( ���ڿ�.toString() ); // ���ܹ߻�!!! => catch
		
			// 2. 
			String[] ���ڿ��迭 = new String[2];
			���ڿ��迭[0] = "��ȣ��"; // �������� 
			���ڿ��迭[1] = "�ŵ���"; // �������� 
			���ڿ��迭[2] = "������"; // 3��° �ο��߰� // ���ܹ߻�!!! => catch
			
			// 3. 
			String ���ڿ�2 = "100";
			String ���ڿ�3 = "��100";
			System.out.println( Integer.parseInt(���ڿ�2) );
			System.out.println( Integer.parseInt(���ڿ�3) ); // ���ܹ߻�!! 
		}catch( Exception exception ) {
			System.out.println("���ܹ߻� : " + exception );
		}finally {
			System.out.println("���� �ֵ� ���� ������ ����Ǵ� �ڸ�[finallly] ");
		}
		
		
		
		// 1. 
		/*
		 * ����1 : ����ó��
				1.���ѷ����� int�� ���� ��� �Է¹ޱ� 
				2. �����Է½� ����ó���߻�
				3. ����ó�� �ؼ� �ٽ� �Է¹ޱ� 
		 * 
		 */
		
		Scanner scanner = new Scanner(System.in); // �Է°�ü 
		
		while(true) {
			try {
				// ���ܰ� ����Ǵ°��� try { } ����
				System.out.println(" ���� �Է� : "); 
				int ���� = scanner.nextInt();
			}
			catch( Exception e) {
				System.out.println("[[���� �ԷºҰ�]]");
				scanner = new Scanner(System.in); // �Է°�ü 
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}
	
}
