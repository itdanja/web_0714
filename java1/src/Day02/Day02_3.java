package Day02;

import java.util.Scanner;

public class Day02_3 {
	
	public static void main(String[] args) {
		
	/*
	 	//����1 
		// 1. �Է°�ü [ Ű����κ��� �Է°� �������� ���� ] 
		Scanner �Է°�ü = new Scanner(System.in);
			// Ŭ�������� ù���� => �빮�� �Է� 
		
		// 2. �Է°�ü���� �Է¹��� ���� ������ ���� [ ���� ���� : �ڷ��� ������ = �� ] 
		System.out.print("�л�1�� �̸��Է� : ");	String �л�1 = �Է°�ü.next();
		System.out.print("�л�1�� 1���� : "); 	int �л�1_1���� = �Է°�ü.nextInt();
		System.out.print("�л�1�� 2���� : "); 	int �л�1_2���� = �Է°�ü.nextInt();
		System.out.print("�л�1�� 3���� : "); 	int �л�1_3���� = �Է°�ü.nextInt();
		
		System.out.print("�л�2�� �̸��Է� : "); String �л�2 = �Է°�ü.next();
		System.out.print("�л�2�� 1���� : "); 	int �л�2_1���� = �Է°�ü.nextInt();
		System.out.print("�л�2�� 2���� : "); 	int �л�2_2���� = �Է°�ü.nextInt();
		System.out.print("�л�2�� 3���� : "); 	int �л�2_3���� = �Է°�ü.nextInt();
		
		// ��� 	[ + : ���Ῥ���� ( ����+���� ) ] print
		System.out.println("\n========= �⼮�� print ========= ");
		System.out.println("�л���\t1����\t2����\t3����");
		System.out.println(�л�1+"\t"+�л�1_1����+"\t"+�л�1_2����+"\t"+�л�1_3���� );
		System.out.println(�л�2+"\t"+�л�2_1����+"\t"+�л�2_2����+"\t"+�л�2_3���� );
		System.out.println("============================== ");
		
		System.out.printf("\n========= �⼮�� printf =========\n");
		System.out.printf("�л���\t1����\t2����\t3����\n");
		System.out.printf("%s\t%d\t%d\t%d\n" , �л�1 , �л�1_1���� , �л�1_2���� , �л�1_3����  );
		System.out.printf("%s\t%d\t%d\t%d\n" , �л�2 , �л�2_1���� , �л�2_2���� , �л�2_3����  );
		System.out.printf("==============================\n");
	*/
	
		// ����3
		//1 .�Է°�ü ���� 
		Scanner �Է°�ü = new Scanner(System.in);
		// 2. �Է°�ü �Էµ� �����͸� ������ ���� 
		System.out.print(" ������ ���̵� : "); 	String ���̵� = �Է°�ü.next();
		System.out.print(" ������ ��й�ȣ : "); short ��й�ȣ = �Է°�ü.nextShort();
		System.out.print(" ������ ���� : ");  	String ���� = �Է°�ü.next();
		System.out.print(" ������ �̸��� : ");  String �̸��� = �Է°�ü.next();
		
		// 3. ��� 
		System.out.println(">>>>>>>>> ȸ������ �Ϸ� [ �Ʒ� ������ Ȯ�����ּ��� ] >>>>>");
		System.out.println("���̵�\t��й�ȣ\t����\t�̸���");
		System.out.println(���̵�+"\t"+��й�ȣ+"\t"+����+"\t"+�̸���);
		
	
		
	}

}
