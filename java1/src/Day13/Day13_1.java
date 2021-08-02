package Day13;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class Day13_1 {
	
	public static void main(String[] args){
	
		// API Ŭ���� : �̸� ������� Ŭ������ 
			
		// 1. String Ŭ���� : ����Ʈ => ���ڿ� 
			// Ű���� �Էµ� ������ ����Ʈ���� �̵� 
				// �ƽ�Ű�ڵ� : 
		byte[] ����Ʈ�迭 = { 92 , 72 , 101 ,  34 , 59 , 84 };
		String ���ڿ� = new String(����Ʈ�迭);
		System.out.println(" ��ȯ�� : " + ���ڿ� );
	
		byte[] ����Ʈ�迭2 = {  104 ,  93 , 82 , 126 , 32 };
		String ���ڿ�2 = new String(����Ʈ�迭2);
		System.out.println(" ��ȯ�� : " + ���ڿ�2 );
		
		// 1. ����Ʈ �Է¹޾� �迭���� 
		byte[] ����Ʈ�迭3 = { 72 , 101 , 108 , 108 , 111 , 32 , 74 , 97 , 118 , 97 };
		// 2. ����Ʈ�� => String ��ȯ [ ������ ]
		String ���ڿ�3 = new String(����Ʈ�迭3 );
		System.out.println(" ��ȯ�� : " + ���ڿ�3 );
		
		String ���ڿ�4 = new String( ����Ʈ�迭3 , 6 , 4);
		System.out.println(" �Ϻ� ��ȯ�� : " + ���ڿ�4);
		
		// �Է¹ޱ� 
		byte[] ����Ʈ�迭4 = new byte[100];
		
		System.out.print(" �Է� : ");
	
		try {
			// System.in : Ű���� 
				// .read() : �Է°� �б� �޼ҵ� 
			System.in.read( ����Ʈ�迭4 );
			String ���ڿ�5 = new String(����Ʈ�迭4);
			System.out.println(" �Է°� : " + ���ڿ�5 );

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// ���� ���� [ charAt() ]
		String ���ڿ�6 = "�ڹ� ���α׷���";
		System.out.println(" ���� ���� : " + ���ڿ�6.charAt(3) );
	
			// �ֹε�Ϲ�ȣ �̿��� ���� �Ǻ� 
			String �ֹε�Ϲ�ȣ = "880420-2541144";
			char ���� = �ֹε�Ϲ�ȣ.charAt(7);
			
			switch( ���� ) {
				case '1' :
				case '3' :
					System.out.println("�����Դϴ�");
					break;
				case '2' :
				case '4' :
					System.out.println("�����Դϴ�");
					break;
			}
		
		// ���ڿ� �� [ equals() ] ��ȯ : true / false
		String ���ڿ�7 = new String("���缮");
		String ���ڿ�8 = "���缮";
			// ��ü ������ �޸� �Ҵ� ������ : new
				// ���� : �⺻�ڷ��� , String
		System.out.println( ���ڿ�7 + ���ڿ�8 );
		
		if( ���ڿ�7 == ���ڿ�8 ) { System.out.println("�� ���ڴ� == "); }
		
		if( ���ڿ�7.equals(���ڿ�8) ) { System.out.println("�� ���ڴ� equals");}
			// ���ڿ��� �񱳿����� �Ұ�  
		if( !���ڿ�7.equals(���ڿ�8) ) { System.out.println("�� ���ڴ� !equals"); }
		
		// ���ڿ� ----> ����Ʈ�迭 [ getBytes ]
		String ���ڿ�9 = "�ȳ��ϼ���";
						// ����,Ư������ : 1����Ʈ	�ѱ� :2����Ʈ
		byte[] ����Ʈ�迭5 = ���ڿ�9.getBytes();
		System.out.println(" ���� : " + ����Ʈ�迭5.length );
		String ���ڿ�10 = new String(����Ʈ�迭5);
		System.out.println(" ��ȯ : "+ ���ڿ�10 );
		
			// �ѱ� ���ڵ� : EUC-KR , UTF-8
			try {
				byte[] ����Ʈ�迭6 = ���ڿ�9.getBytes("EUC-KR"); //�ѱ� : 2����Ʈ
				System.out.println(" euc-kr ���� : " + ����Ʈ�迭6.length );
				
				byte[] ����Ʈ�迭7 = ���ڿ�9.getBytes("UTF-8"); // �ѱ� : 3����Ʈ 
				System.out.println(" UTF-8 ���� : " + ����Ʈ�迭7.length );
						
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	}
}
