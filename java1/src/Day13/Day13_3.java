package Day13;

import java.io.IOException;

public class Day13_3 {

	
	public static void main(String[] args) throws IOException {
		
	//		���� �˻� ���α׷� 
	//		[������] : ������� �迭�� ���� 
	//		1. �ȴ�! ���̹� ���α�&����Ʈ
	//		2. ������ ��Ʈ ���� Ȱ�� ������
	//		3. Tucker�� Go ��� ���α׷���
	//		4. ȥ�� �����ϴ� C ���
		
//		1. �˻��� �Է¹޾� �˻��� �ܾ ���Ե� ������ ��� ����ϱ� 
//		2. �˻��� �ܾ ���ο� ��ü�� ���ڸ� �Է¹޾� ��ü �ϱ� 
		
		String[] ������� = {	
				"�ȴ�! ���̹� ���α�&����Ʈ",
				"������ ��Ʈ ���� Ȱ�� ������",
				"Tucker�� Go ��� ���α׷���",
				"ȥ�� �����ϴ� C ���"
		};
		
		byte[] ����Ʈ�迭 = new byte[100];
		System.out.print("�˻��� ������ : ");
		int count = System.in.read(����Ʈ�迭); //  ���� ����Ʈ ���� ���� 
		String �˻��� = new String(����Ʈ�迭 , 0 , count-2 ); // 0���� �о�� ����Ʈ ���������� -2[�ٹٲ�\n] ���� 
		
		// �˻��� �ش��ϴ� ���� ��� 
		for( int i = 0 ; i<�������.length ;i++ ) {
			if( �������[i].indexOf(�˻���) != -1 ) {
				System.out.println( �������[i] );
			}
		}
		// ��ü
		System.out.println("��ü �ܾ� : ");
		count = System.in.read(����Ʈ�迭);
		String ��ü�ܾ� = new String(����Ʈ�迭 , 0 , count-2 );
		System.out.println("���ο� �ܾ� : ");
		count = System.in.read(����Ʈ�迭);
		String ���ο�ܾ� = new String(����Ʈ�迭 , 0 , count-2 );

		for( int i = 0 ; i<�������.length ; i++  ) {
			if( �������[i].indexOf(�˻���) != -1 ) {
				�������[i] =�������[i].replace( ��ü�ܾ� , ���ο�ܾ� );
			}
		}
		// �˻��� �ش��ϴ� ���� ��� 
		for( int i = 0 ; i<�������.length ;i++ ) {
			if( �������[i].indexOf(���ο�ܾ�) != -1 ) {
				System.out.println( �������[i] );
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}