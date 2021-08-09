package Day18;

import java.util.HashMap;
import java.util.Iterator;

public class Day18_1 {
	
	public static void main(String[] args) {
		
		// Map : 
			// 1.HashMap : ����ȭx  [ ���Ͻ����� ���� ]
			// 2.HashTable : ����ȭo [ ��Ƽ������ ���� ]
				// �޼ҵ� 
					// 1. .put( Ű , �� ) : Ű�� �� => ��Ʈ�� [ Ű���� �ߺ��Ұ� ] 
					// 2. .get( Ű ) : Ű�� �ش��ϴ� �� 
					// 3. .keyset() : ��� Ű ��� 
					// 4. .values() : ��� �� ��� 
					// 5. .size() : ��Ʈ�� ��ü �� 
					// 6. .remove(Ű) : Ű�� �ش��ϴ� ��Ʈ�� ���� 
					// 7. .clear() : ��� ��Ʈ�� ���� 
					
		HashMap< String , Integer > hashMap = new HashMap<>();
			// ��Ƽ���׸� [ k : Ű  / v : �� ] : ��ü�� �Ű�Ÿ��[�ڷ���] 
		// ���� 
		hashMap.put("���缮", 80 );
		hashMap.put("��ȣ��", 70 );
		hashMap.put("�ŵ���", 60 );
		hashMap.put("���缮", 80 ); // key => �ؽ�[ ������=>�ּҰ� ]
		hashMap.put("������", 80 ); // value => �ߺ��� ��� 
		
		// ��� 
		System.out.println(" hashmap : " + hashMap );
		// ȣ�� 
		System.out.println(" hashmap key : " + hashMap.get("���缮"));
		// Ű ȣ�� 
		System.out.println(" hashmap total key : " + hashMap.keySet() );
		// �� ȣ�� 
		System.out.println(" hashmap total value : " + hashMap.values() );
		// ��Ʈ��(Ű,��)
		System.out.println(" hashmap size : " + hashMap.size() );
		// ����( Ű ) 
		System.out.println(" hashmap remove : " + hashMap.remove("���缮") );
		
		// ��ü ��� 
		for( String key : hashMap.keySet() ) {
			System.out.println( hashMap.get(key) );
		}
		// ��ü ��� [ Iterator �������̽� : �÷��� �޸� ��ȸ ] 
		Iterator< String > iterator = hashMap.keySet().iterator();
		while( iterator.hasNext() ) {
			String key = iterator.next();
			System.out.println( key +"/"+ hashMap.get( key ));
		}
		// ��ü ���� 
		hashMap.clear();
		System.out.println(" hashmap : " + hashMap );
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
