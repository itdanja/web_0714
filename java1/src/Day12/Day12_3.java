package Day12;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Day12_3 {

	// �޸�[����,�迭] => ���α׷� ����Ǹ� �� �޸� �ʱ�ȭ
		// �ֱ����ġ : ���� �������� ���α׷�[��ɾ�] ���
			// ����X����X => �ֹ߼�
			// ���� , ��ü , �迭 ��� 
		// ���������ġ[����,DB��]
			// ����X����O => ���ֹ߼�
			// ���� , DB �� 
	
		// ����ó�� 
			// Ű����[����] -------��Ʈ��(�������帧)---------> ���
				// �������帧 : ����Ʈ���� [ ��Ʈ : 1bit => 0 Ȥ�� 1 ] [ ����Ʈ : 8bit => 1byte ]
	
	public static void main(String[] args) throws Exception{
											// ���� ������
	
		// FileOutputStream fileOutputStream = new FileOutputStream("C:/java/test1.txt");																											
		FileOutputStream fileOutputStream = new FileOutputStream("C:/Users/User/git/web_0714/java1/src/Day12/test1.txt"); // ������ ����ó���߻� : ���࿡ ������ �������
			// FileOutputStream : ���� ������ִ� Ŭ���� 									// ���� ��Ű�� ��� 
				// new : ��ü �޸� �Ҵ� 
					// FileOutputStream( ���ϰ�� Ȯ���� );
		String ���ڿ� = "��Ŭ�������� �ۼ��߽��ϴ�";
			// ��Ʈ���� ���ڿ� ��ü�� ����Ҽ� ����
		fileOutputStream.write( ���ڿ�.getBytes() );
			// 1. ���ڿ� => ����Ʈ ��ȯ [ ���ڿ�.getBytes() : ����Ʈ ��ȯ�޼ҵ� ]
			// 2. ��Ʈ����.write( ����Ʈ�� ) : ����Ʈ ���

	/////////////////////////////////////////////////////////////////////////////////
		
		FileInputStream fileInputStream = new FileInputStream("C:/Users/User/git/web_0714/java1/src/Day12/test1.txt"); // ������ ����ó���߻� : ���࿡ ������ �������

		// 1. ��Ʈ������ ����Ʈ�� �����´� 
		byte[] ����Ʈ�迭 = new byte[1024]; // 1024byte => 1kbyte => 1024kb => 1mb
		fileInputStream.read( ����Ʈ�迭 );
			// ��Ʈ����.read( ����Ʈ�迭�� ) : ����Ʈ �о���� => �迭�� ���� 

		// 2. ������ ����Ʈ�� ���ڿ� ��ȯ 
		String ���ڿ�2 = new String(����Ʈ�迭);	// �����ڿ� ����Ʈ�迭 �ֱ� => ���ڿ� ��ȯ 
		
		System.out.println("���� ������ ������ : " + ���ڿ�2 );

	/////////////////////////////////////////////////////////////////////////////////////
		// Ű���忡 �Էµ� ������ �޸��忡 ��� �������� ����
		
		Scanner scanner = new Scanner(System.in);
		
		while( true ) {
			System.out.print("�޸��忡 �Է��� �ؽ�Ʈ �Է� : ");
			String ���ڿ�3 = scanner.next();
			String ��¹��ڿ� = ���ڿ�3 +"\n";
			fileOutputStream.write( ��¹��ڿ�.getBytes() );
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
