package Day13;

import java.util.Scanner;

public class Day13_2 {
	
	public static void main(String[] args) {
		
		// ���ڿ� ã�� [ indexof ] ��ȯ : ã�������� �ε�����ȣ 
		String ���ڿ�1 = "�ڹ� ���α׷���";
		int index = ���ڿ�1.indexOf("����");
		System.out.println("�˻��� ������ ��ġ : " + index);
		
			// �˻� Ȱ�� 
			String ���� = "����ִ� ���̽� �Թ�����";
			Scanner scanner = new Scanner(System.in);
			System.out.print("Ű���� : "); String �˻��� = scanner.next();
			
			if( ����.indexOf(�˻���) !=-1 ) {
				System.out.println("���̽� ���� �����Դϴ� : " + ���� );
			}else {
				System.out.println("���̽� ���� ������ �ƴմϴ�");
			}
		// ���ڿ� ���� [ length() ] ��ȯ : ���ڼ� 
			System.out.println("���ڿ�1 ���ڼ� : " + ���ڿ�1.length() );
			
			// ��ȿ���˻� 
			String �ֹε�Ϲ�ȣ = "8804202541255";
			if( �ֹε�Ϲ�ȣ.length() == 13 ) {
				System.out.println(" �� �Է��ϼ̽��ϴ� ");
			}
			else {
				System.out.println(" ���ڼ��� Ʋ�Ƚ��ϴ� ");
			}
			
		// ���ڿ� �߶󳻱� [ substring() ] : �ε���[��ġ] ���� 
		System.out.println( �ֹε�Ϲ�ȣ.substring(7) ); // 7 �ε��� ���� ��� 
		System.out.println( �ֹε�Ϲ�ȣ.substring(0, 6)); // 0 ~ 6 �ε��� ���� ��� 
		
		// ���ڿ� ���� [ split() ] : ���� ���� 
		String[] ���ع迭 = �ֹε�Ϲ�ȣ.split("2");
		System.out.println( ���ع迭[0] );
		System.out.println( ���ع迭[1] );
		System.out.println( ���ع迭[2] );
		System.out.println( ���ع迭[3] );
		
		// ���ڿ� ġȯ [ replace("��ü�ҹ���","���ο��") ] : 
		String ���ڿ�2 = "�ڹ� ���α׷���";
		String ��ü���� = ���ڿ�2.replace( "�ڹ�", "JAVA");
		System.out.println( ���ڿ�2 );
		System.out.println( ��ü���� );
		
		// ��ҹ��� ��ȯ [ toLowerCase() : �ҹ��ں�ȯ  toUpperCase() : �빮�ں�ȯ ]
		String ���ڿ�3 = "Java Programming";
		System.out.println( " �ҹ��� : " +  ���ڿ�3.toLowerCase() );
		System.out.println( " �빮�� : " +  ���ڿ�3.toUpperCase() );
		
		// ���� ���� [ trim() ] : �յ� ���� ���� 
		String ���ڿ�4 ="     �ڹ�          ���α׷���       ";
		System.out.println( " �������� : " + ���ڿ�4.trim() );
		
		// ���ڿ� ��ȯ [ valueOf() ] : ���ڿ��� ��ȯ
		String ���ڿ�5 = String.valueOf(10);	// ����[int] 10�� ���ڿ� 10���� ��ȯ 	
		System.out.println(" ���� -> ���� : " + ���ڿ�5 );
		
		String ���ڿ�6 = String.valueOf(10.5);// �Ҽ�[double] 10.5�� ���ڿ� 10.5���� ��ȯ 
		System.out.println(" �Ǽ� -> ���� : " + ���ڿ�6 );
		
		String ���ڿ�7 = String.valueOf(true);
		System.out.println(" �� -> ���� : " + ���ڿ�7 );
		
		
		
		
	}
	

}
