package Day04;

import java.util.Scanner;

public class day04_1 {
	
	// main + ctrl+ �����̹� 
	public static void main(String[] args) {
		// ����1 : 4���� ���� �Է¹޾� �������� ��� 
		
		Scanner scanner = new Scanner(System.in);
		
		// syso + ctrl+�����̹�
		System.out.println("����1 : ");	int ����1 = scanner.nextInt();
		System.out.println("����2 : ");	int ����2 = scanner.nextInt();
		System.out.println("����3 : ");	int ����3 = scanner.nextInt();
		System.out.println("����4 : ");	int ����4 = scanner.nextInt();
		
		// ���� = ��ȯ 
		int temp; // ��ȯ�� ���Ǵ� �ӽú���
		// ����
			// 1. ù��° ������ �ٸ� ������ �� = 3��
		if( ����1 > ����2 ) { temp = ����1;	����1=����2;	����2=temp; }
		if( ����1 > ����3 ) { temp = ����1;	����1=����3;	����3=temp; }
		if( ����1 > ����4 ) { temp = ����1;	����1=����4;	����4=temp; }
			// 2. �ι�° ������ 3,4�� => 2�� 
		if( ����2 > ����3 ) { temp = ����2;	����2=����3;	����3=temp; }
		if( ����2 > ����4 ) { temp = ����2;	����2=����4;	����4=temp; }
			// 3. ����° ������ 4 �� => 1�� 
		if( ����3 > ����4 ) { temp = ����3;	����3=����4;	����4=temp; }
		
		System.out.println(" �������� : " + ����1 + ����2 + ����3 + ����4 );
		
		
		// ����1 
		System.out.println("[[[ �α��� ������ ]]]");	
		System.out.println("[[ ȸ�� ���̵� : ");		String id = scanner.next();
		System.out.println("[[ ȸ�� ��й�ȣ : ");		int password = scanner.nextInt();
		// �α��� ó�� 
		if( id.equals("admin") ) { // ���ڿ�[Ŭ����]�� �񱳿����� ����Ҽ� ���� 
								// String Ŭ���� �� �޼ҵ� : ���ڿ�.equals("�񱳴��") =>���: true / false
			// ���̵� �����Ѱ��
			if( password == 1234 ) System.out.println("[[����]] �α��μ��� ");
				// ��й�ȣ�� �����Ѱ��
			else System.out.println("[[����]] ��й�ȣ ������ �ٸ��ϴ�");
			
		// ���̵� Ʋ�������
		}else System.out.println("[[����]] ���̵� ������ �����ϴ�");
		

	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
