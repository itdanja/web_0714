package Day11;

import java.util.Scanner;

public class Day11_3 {
	
	/*
	 * ����1 : ATM �������̽� 
		// �߻�޼ҵ� 
			�޴� , ���µ�� , ���� , ��� , ��ü , �ܰ�
		1. ����[ ����Ŭ���� ] implements
			�ʵ� : ���¹�ȣ , ���ݾ� 
			
		2. �������� [ ����Ŭ���� ]
			
		2. �������� [ ����Ŭ���� ] 
	 */
	
	public static void main(String[] args) {
		
		// 1. �������̽� ���� 
		Atm atm;
		// 2. ���� 
		atm = new Bank();
		
		
		while( true ) {
			
			System.out.println("1.���� 2.����");
			Scanner scanner = new Scanner(System.in);
			
			int ch = scanner.nextInt();
			
			if( ch == 1 ) {
				atm = new Sbank(); // 
				// ����Ŭ������ ����� �������̽��� ����Ŭ������������ ��� ���� 
				
				atm.menu();
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
		
	}

}
