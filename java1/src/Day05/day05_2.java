package Day05;

import java.util.Scanner;

public class day05_2 {
	
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		// for ���� ����� 
		// ��1) �Է¹��� ������ŭ �� ��� 
		System.out.print("�� ���� : "); int �� = scanner.nextInt();
		for( int i = 1 ; i<=�� ; i++ ) { System.out.print("* "); }
	
System.out.println("\n------------------------------");
		// ��2) �Է¹��� ������ŭ �� ��� [ * 5������ �ٹٲ� ] 
		System.out.print("��2 ���� : "); int ��2 = scanner.nextInt();
		for( int i = 1 ; i<=��2 ; i++ ) {
			System.out.print("* ");
			// 5������ �ٹٲ�ó�� [ 5��� ]
			if( i%5 == 0 ) {System.out.println();}
		}
System.out.println("\n------------------------------");		
		// ��3) 
		System.out.print("��3 ���� : "); int ��3 = scanner.nextInt();
		for( int i = 1 ; i<=��3; i++ ) {
			// �����
			for( int s = 1; s<=i ; s++ ) {	System.out.print("*"); }
			// �ٹٲ� 
			System.out.println();
		}
System.out.println("\n------------------------------");			
		//��4) 
		System.out.print("��4 ���� : "); int ��4 = scanner.nextInt();
		for( int i = 1 ; i<=��4 ; i++ ) {
			// �����
			for( int s = 1 ; s<=��4-i+1 ; s++) { System.out.print("*");}
			// �ٹٲ�
			System.out.println();
		}
System.out.println("\n------------------------------");		
		//��5)
		System.out.print("��5 ���� : "); int ��5 = scanner.nextInt();
		for( int i = 1 ; i<=��5; i++ ) {
			// �������
			for( int b = 1 ; b<=��5-i ; b++ ) {System.out.print(" "); }
			// �����
			for( int s = 1 ; s<=i ; s++ ) {System.out.print("*");}
			//�ٹٲ�
			System.out.println();
		}
System.out.println("\n------------------------------");			
		//��6)
		System.out.print("��6 ���� : "); int ��6 = scanner.nextInt();
		for( int i = 1 ; i<=��6 ; i++ ) {
			// �������
			for( int b = 1 ; b<=i-1; b++ ) { System.out.print(" "); }
			// ����� 
			for( int s = 1 ; s<=��6-i+1 ; s++ )System.out.print("*");
			// �ٹٲ�
			System.out.println();
			
		}
System.out.println("\n------------------------------");				
		System.out.print("��7 ���� : "); int ��7 = scanner.nextInt();
		for( int i = 1 ; i<=��7 ; i++ ) {
			// �������
			for(int b = 1 ; b<=��7-i; b++) {System.out.print(" ");}
			// ����� 
			for(int s = 1 ; s<=i*2-1; s++ ) {System.out.print("*");}
			// �ٹٲ�
			System.out.println();
			
		}
System.out.println("\n------------------------------");				
		System.out.print("��8 ���� : "); int ��8 = scanner.nextInt();
		for( int i = 1 ; i<=��8 ; i++ ) {
			// �������
			for(int b = 1 ; b<=��8-i; b++) {System.out.print(" ");}
			// ����� 
			for(int s = 1 ; s<=i*2-1; s++ ) {System.out.print(i);}
			// �ٹٲ�
			System.out.println();
			
		}		
System.out.println("\n------------------------------");				
	System.out.print("��9 ���� : "); int ��9 = scanner.nextInt();
	for( int i = 1 ; i<=��9 ; i++ ) {
		// �������
		for(int b = 1 ; b<=i-1; b++) {System.out.print(" ");}
		// ����� 
		for(int s = 1 ; s<=��9*2-(i*2-1); s++ ) {System.out.print("*");}
		// �ٹٲ�
		System.out.println();
	}		

System.out.println("\n------------------------------");	
	System.out.print("��11 ���� : "); int ��11 = scanner.nextInt();
	for( int i = 1 ; i<=��11 ; i++ ) { // i = �� = ���δ���
		
		for( int j = 1 ; j<=��11 ; j++ ) {
			// ����1 : ��/�� ������ ���� 
			if( i == j )System.out.print("*");
			else if( (i+j) ==(��11+1) ) System.out.print("*"); // ����2 : 
			else System.out.print(" ");
		}
		// �ٹٲ�
		System.out.println();
		
	}
	
			
		
		
		
		
		
		
		
		
		
		
		
	}

}
