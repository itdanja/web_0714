package Day02;

import java.util.Scanner;
	// import : �ٸ����Ͽ� �ִ� ���̺귯��[Ŭ����] �������� 
	// import ��Ű����.Ŭ����
public class Day02_2 {
	
	// �Է¹ޱ� 
	public static void main(String[] args) {
		
		// 1. Scanner Ŭ���� : �Է°��� Ŭ���� 
		Scanner �Է°�ü = new Scanner(System.in);		
		// Scanner Ŭ������ �Է°�ü�� �����ϱ�
			// 1. Scanner : �Է°��õ� �޼ҵ� ���� 
				// 2. �Է°�ü : ��ü�� �̸�[ �����ǰ� ] 
					// 3. new : ��ü�� �޸� �Ҵ� ������ 
						// 4. Scanner() : Ŭ������ ������ 
							// 5. System.in : �Է���ġ [ Ű���� ] 
		System.out.println(" ���� �Է� : ");
		// 1. ���� ���� 
		int �Է����� ;
		// 2. ������ �Է°� ���� 
		�Է����� = �Է°�ü.nextInt();		// �Է°�ü���� ������ ������ 
		// 3. ���� ��� 
		System.out.println("���� �Է��� ������ : " + �Է�����);
		
		System.out.println(" ���ڿ� �Է� : ");
		// 1. ���ڿ���ü ���� 
		String ���ڿ� = �Է°�ü.next();	// �Է°�ü���� ���ڿ� ������ 
		System.out.println("���� �Է��� ���ڿ��� : " + ���ڿ� );
		
		�Է°�ü.nextLine(); // nextLine() : ������ ���� 
		System.out.println(" �������� �Է� : ");
		String ���ڿ�2 = �Է°�ü.nextLine();
		System.out.println("���� �Է��� ���ڿ��� : " + ���ڿ�2 );
		
		
		
		
		
		
		
		
		
	}
}
