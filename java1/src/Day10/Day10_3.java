package Day10;

import java.util.Scanner;

			//����1 : ���� ���α׷�
			//1. ����Ŭ���� [ ����Ŭ���� ]
			//	�ʵ� : ���¹�ȣ , ��й�ȣ , ���ݾ�
			//	������ : 
			//	�޼ҵ� : ���»��� , �Ա� , ��� , ��ü
			//2. ��������Ŭ���� [ ����Ŭ���� ]
			//	�ʵ� : �����ڵ� [ final ]
			//	������ : super
			//	�޼ҵ� : �������̵�
			//3. ��������Ŭ���� [ ����Ŭ���� ] 
			//	�ʵ� : �����ڵ�  [ final ]
			//	������ : super
			//	�޼ҵ� : �������̵�

public class Day10_3 {
	// ATM Ŭ���� 
	
	// main �ۿ� �����ϴ� ���� : �ٸ� Ŭ������ �ٸ� ��Ű������ ȣ���ϱ����� 
	public static Account[] accounts = new Account[100];
		// ���°�ü 100���� �����Ҽ� �ִ� �迭 
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("1.�������� 2.��������");
			int bank = scanner.nextInt();
			while(true) {
				System.out.println("1.���»���");
				System.out.println("2.�����Ա�");
				System.out.println("3.�������");
				System.out.println("4.������ü");
				System.out.println("5.�ڷΰ���");
				int ch = scanner.nextInt();
				if( ch == 1 && bank ==1  ) {
					Sbank sbank = new Sbank();
					sbank.create();
				}
				if( ch == 2&& bank ==1  ) {
					Sbank sbank = new Sbank();
					
					sbank.deposit();
				}
				if( ch == 3 && bank ==1  ) {
					Sbank sbank = new Sbank();
					sbank.withdraw();
				}
				if( ch == 4  ) {}
				if( ch == 5  ) { break;}
			}
		}
	}
}
