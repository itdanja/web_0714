package Day03;

import java.util.Scanner;

public class Day03_4 {
	
	public static void main(String[] args) {
		
		// ��ǻ��[0,1] : ���� 
		// ��� : if[ ������ ]  , switch[ ���������� ]
			// ���� : ����Ǽ� �� ���� �ڵ� ó�� 
			// if : true , false �� ���� ���� 
				// ���� : if( �� ) ���๮;
				// ����2 : if( �� ) ���๮[true];
				//		  else ���๮[false]
				// ����3 : ���๮[ ; ]�� 2�� �̻��̸�  { } ���� ó�� 
				//		if( ��1 ){
				//			���๮1;
				//			���๮2;
				// 		}
				// ����4 : ����Ǽ��� �ټ��ϰ�쿡�� 
				// 		if( ��1 ) ~ 
				// 		else if( ��2 ) ~ 
				// 		else if( ��3 ) ~ 
				// 		else
		
		//��1) true�̸� ���๮ ���� 
		if( 3 > 1) System.out.println("3��ũ��.1");
		
		//��2) false�̸� ���๮ ����X
		if( 3 > 5 ) System.out.println("3��ũ��.2");
		
		//��4) 
		if( 3 > 5 ) System.out.println("3��ũ��.3");
		else System.out.println("5��ũ��.3");
		
		//��4)
		if( 3 > 2 ) {
			System.out.println("true�̸� ����Ǵ��ڸ�");
			System.out.println("3��ũ��.4");
		}
		else { 
			System.out.println("false�̸� ����Ǵ��ڸ�");
			System.err.println("2��ũ��.4");
		}
		//��5)  ���� ���� 
		if( 3 > 5 ) System.out.println("3��ũ��.5");
		else if( 3 > 4 ) System.out.println("3��ũ��.6");
		else if( 3 > 3 ) System.out.println("3��ũ��.7");
		else if( 3 > 2 ) System.out.println("3��ũ��.8");
		else System.out.println("true�� ����");
		
		//��6) �ϳ��� ������ �Է¹޾� 80�� �̻��̸� �հ���� �ƴϸ� Ż�� 
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("�����Է� : ");	int ���� = scanner.nextInt();
		if( ���� >= 80 ) System.out.println("�հ�");
		else System.out.println("Ż��");
		
		//��7) �ϳ��� ������ �Է¹޾� 
				// 90���̻��̸� "A���" 
				// 80���̻��̸� "B���" 
				// 70���̻��̸� "C���" 
				// �׿� Ż��
		System.out.print("����2�Է� : ");	int ����2 = scanner.nextInt();
		if( ����2>=90 ) System.out.println("A���");
		else if( ����2>=80 ) System.out.println("B���");
		else if( ����2>=70 ) System.out.println("C���");
		else System.out.println("Ż��");
		
		//����1 : 2���� ������ �Է¹޾� �� ū�� ���
		System.out.print("����1�Է� : ");	int ����1 = scanner.nextInt();
		System.out.print("����2�Է� : ");	int ����2 = scanner.nextInt();
		if( ����1 > ����2 ) System.out.println(" �� ū���� : " + ����1 );
		else if( ����1 < ����2 ) System.out.println(" �� ū���� " + ����2 );
		else System.out.println(" �� ������ ���� ");
		
		//����2 : 3���� ������ �Է¹޾� �� ū�� ���
		System.out.print("����1�Է� : ");	int ����3 = scanner.nextInt();
		System.out.print("����2�Է� : ");	int ����4 = scanner.nextInt();
		System.out.print("����3�Է� : ");	int ����5 = scanner.nextInt();
		if( ����3 > ����4 && ����3 > ����5 ) System.out.println(" ���� ū���� : "+����3);
		else if( ����4 > ����3 && ����4 > ����5 ) System.out.println(" ���� ū���� : "+����4);
		else if( ����5 > ����3 && ����5 > ����4 ) System.out.println(" ���� ū���� : "+����5);
		else System.out.println(" �� ������ ���� ");
		
		//����3 : 4���� ������ �Է¹޾� �� ū�� ��� 
		System.out.print("����1�Է� : ");	int ����6 = scanner.nextInt();
		System.out.print("����2�Է� : ");	int ����7 = scanner.nextInt();
		System.out.print("����3�Է� : ");	int ����8 = scanner.nextInt();
		System.out.print("����4�Է� : ");	int ����9 = scanner.nextInt();
		int �ִ� = ����6; // ù��° ���� �ִ񰪺����� ���� 
		if( �ִ� < ����7 ) �ִ� = ����7;
		if( �ִ� < ����8 ) �ִ� = ����8;
		if( �ִ� < ����9 ) �ִ� = ����9;
		System.out.println(" ���� ū���� : " + �ִ� );
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	}

}
