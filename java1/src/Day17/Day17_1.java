package Day17;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Vector;


public class Day17_1 {
	
	// �ϵ���� 
		// 1. �ֱ����ġ : [RAM] : ���� �������� ��ɾ� [ �ֹ߼� ]
		// 2. ���������ġ : [C����̺�,USB,CD��] ����ó�� , DBó�� ��
	// �޸�[�ֱ����ġ] ���� ��� 
		// 1. ���� : [�⺻ �ڷ���]�޸� �Ҵ� 
		// 2. ��ü : [Ŭ����] �޸� �Ҵ�
		// 3. �迭 : ����/��ü�� ������ �ڷ����� ������ �޸� �Ҵ� 
			// �޸� ȿ���� ����
		// 4. ����Ʈ :
	
	// �÷��� �����ӿ�ũ : �޸� ���� Ŭ���� �� 
		// �÷��� : ���� 
		// [�̸� ������� ��ɾ��] �����ӿ�ũ[����Ʈ����] vs ���̺귯��[�Լ�����] vs API[�������̽�]

	public static void main(String[] args) {
		
		// ����Ʈ : List �÷��� 
			// ���� : 1.ArrayList 2.Vector , 3.LinkedList
				// �޼ҵ� 
					// 1. .add(��ü) : ��ü �߰�
						// add( �ε�����ȣ , ��ü ) 
					// 2. .get(�ε�����ȣ) : �ش� ��ȣ�� ��ü ȣ�� 
						// �ε��� : ����Ʈ�� ����Ǵ� ������ȣ [ 0 ~ ]
					// 3. .remove(�ε�����ȣ) : �ش� ��ȣ�� ��ü ���� 
					// 4. .size() : ����Ʈ�� ��ü�� 
					// 5. .contains(��ü) : ����Ʈ�� �ش� ��ü ���� Ȯ�� 
					// 6. .indexOf(��ü) : ����Ʈ�� �ش� ��ü ��ġ
					// 7. .clear() : ����Ʈ�� ��� ��� ����
					// 8. .isEmpty() : ����Ʈ�� ����ִ��� Ȯ�� true / false
					
		// 1. ArrayList Ŭ����  
		// string ��ü �������� ������ �ִ� ����Ʈ��ü ����  
		ArrayList<String> arrayList = new ArrayList<>();
			// ���׸� ����Ʈ�� ���� �ڷ���
		// �߰� 
		arrayList.add("java");
		arrayList.add("python");
		arrayList.add("database");
		arrayList.add("c���");
		arrayList.add("c++���");
		
		// ��� 
		System.out.println( " arraylist : " + arrayList );
		// ȣ�� 
		System.out.println(" arraylist ù��° ��� : " + arrayList.get(0));
		// ����
		System.out.println(" arraylist �ι�° ��� ����");
			arrayList.remove(1); 
		System.out.println(" arraylist ������ : " + arrayList );
		// ����Ʈ�� ��ü�� 
		System.out.println(" arraylist ��ü�� : " + arrayList.size() );
		// ����Ʈ�� �ݺ��� 1
		for( int i = 0 ; i<arrayList.size() ; i++ ) {
			System.out.println( arrayList.get(i) );
		}
		// ����Ʈ�� �ݺ��� 2 
		for( String string : arrayList ) {
			// ����Ʈ�� ��� ���4���� �ϳ��� �ӽð�ü�� ����
			System.out.println(string);
		}
		// Ư�� ��ġ�� �߰� 
		arrayList.add(1, "js");
		System.out.println(" Ư�� ��ġ�� �߰� : " + arrayList );
		// ��ü �˻� 
		System.out.println(" arraylist java��ü�� �ִ��� : " 
						+ arrayList.contains("java"));
		System.out.println(" arraylist java��ü�� ��ġ : " + arrayList.indexOf("java") );
		
		// ����Ʈ�� ��� ��� ���� 
		arrayList.clear();
		System.out.println(" arraylist : " + arrayList );
		
		
		// 2. Vector Ŭ���� 
			// ������ : Vector�޼ҵ� vs Arraylist�޼ҵ�
					// ����ȭO	vs  ����ȭx 
					// ��Ƽ������ 	vs  ���Ͻ�����
					// �޼ҵ���� synchronized ����
		Vector<String> vector = new Vector<>();
		vector.add("java");
		
		// 3. LinkedList Ŭ���� 
			// ������
				// Arraylist : �˻����� 
				// LinkedList : ����,���� ���� 
		
		ArrayList<String> arrayList2 = new ArrayList<>();
		LinkedList<String> linkedList = new LinkedList<>();
		
		Long start;
		Long end;
		
		start =System.nanoTime(); // ���� �ð�[����] �޼ҵ� 
		for( int i = 0 ; i<10000 ;i++ ) {
			arrayList2.add( 0 , String.valueOf(i) );
		}
		end = System.nanoTime();
		
		System.out.println(" arraylist 10000�� �����ϴ� �ɸ��½ð� : " + (end-start) );
		
		start =System.nanoTime();
		for( int i = 0 ; i<10000 ;i++ ) {
			linkedList.add( 0 , String.valueOf(i) );
		}
		end = System.nanoTime();
		
		System.out.println("linkedList 10000�� �����ϴµ� �ɸ��½ð� :" +(end-start) );
		
		
	
		LinkedList< Integer > ����� = new LinkedList<Integer>();		
		Scanner scanner = new Scanner(System.in);
			
		while(true) {
			System.out.println(" --- ��� ��� ���� ---- ");
			System.out.println("\t����ȣ \t�ο���  ���� ���ҿ�ð� : " + �����.size()*5 +"��");
			for( int i = 0 ; i<�����.size() ; i++ ) {
				System.out.println("\t"+(i+1)+"\t"+�����.get(i) );
			}
			System.out.println("1.����߰� 2.������ 3.�������");  int ch = scanner.nextInt();
			
			if( ch == 1 ) {
				System.out.println(" �ο��� : "); int count = scanner.nextInt();
				�����.add(count);
				System.out.println("����ȣ : " + �����.size() );
			}
			if( ch == 2  ) {
				System.out.println("����� ����ȣ : "); int delete = scanner.nextInt();
				�����.remove(delete-1); // ��ȣ-1 => �ε��� 
				System.out.println("��� �Ǿ����ϴ�");
			}
			if( ch == 3 ) {
				if( �����.isEmpty() ) {
					System.out.println(" ��� ����� �����ϴ� ");
				}else {
					System.out.println("1�� ���� ~~~ ");
					�����.remove(0);	
				}
				
			}
		}
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
