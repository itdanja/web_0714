package Day17;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

import com.sun.tools.jdeprscan.scan.Scan;

public class Day17_2 {
	
	
	// Set �÷��� : ��������� ���� [ �ߺ��Ұ� ] 
		// List : ��������� ���� [ �ߺ���� ] 
	
	public static void main(String[] args) {
		
		//Set �÷��� 
			// ���� : 1.HashSet 2.TreeSet
				// �޼ҵ� 
					//1. .add(��ü) 
					//2. .remove(��ü)
					//3. .size()
					//4. .iterator()
						// Iterator �������̽� 
							// .hasNext() : ���� ��Ұ� �ִ��� true / false
							// .next() : ���� ��� ȣ�� 
		// HashSet Ŭ���� 
		HashSet<String> hashSet = new HashSet<>();
			// �߰� 
			hashSet.add("java");
			hashSet.add("python");
			hashSet.add("database");
			hashSet.add("c���");
			hashSet.add("c++");
			hashSet.add("java"); // �ߺ� �Ұ� // �������X 
			
			// ���
			System.out.println(" hashset : " + hashSet );
			System.out.println(" hashset ��ü�� : " + hashSet.size() );
			System.out.println(" hashset ���� ");
			hashSet.remove("java");
			System.out.println(" hashset : " + hashSet );
			//System.out.println(" hashset ù��° ��� : " + hashSet.get);
			
			// ȣ�� 
			// �ݺ��� vs ��ȸ
			for( String string : hashSet ) {
				System.out.println( string ); // ��¼��� ����x 
			}
			
			Iterator<String> iterator = hashSet.iterator();
			
			while( iterator.hasNext() ) {
				System.out.println(" ��ü : " + iterator.next() );
			}
			
			//����2 
			Scanner scanner = new Scanner(System.in);
			HashSet<Integer> set = new HashSet<Integer>();
			
			for( int i = 0 ; i<6 ; i++ ) {
				
				int num = scanner.nextInt();
				
				if( set.contains(num) ) i--;
				
				set.add(num);
			}
			System.err.println("��� : "+ set );
			
			// �ؽ� : ������ �����ϰ� ��ȸ ���Ǵ� �˰��� 
				// int ���� = 3
				// 3[������] => �ؽ��ڵ� ��ȯ 
				// �ؽ��ڵ尪�� �޸� �ּҰ� => ������ ����
					// ���� �� �޸��ּ� : �ߺ��� x  �������x
				
		
	}
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
