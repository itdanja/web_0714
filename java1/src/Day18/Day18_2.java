package Day18;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

import com.sun.tools.jdeprscan.scan.Scan;

public class Day18_2 {
	
	public static void main(String[] args) {
	
		// �÷��� ��ø 
		// ��1) List �÷��� => map 
		ArrayList< HashMap<String, Integer> > arrayList = new ArrayList<>();
					// ���׸��� �÷��� ���� 	
			HashMap<String, Integer> map = new HashMap<>();
			HashMap<String, Integer> map2 = new HashMap<>();
			// 2���� ���� ����Ʈ�� ��� 
			arrayList.add(map);		map.put("���缮", 90);
			arrayList.add(map2);	map2.put("���缮", 100 );
			
		System.out.println(" arraylist 2���� map : " + arrayList );
		
		// ��2 ) map => list �÷��� [*] : �ټ��� ����Ʈ ������ 
		HashMap< String , ArrayList<String> > map3 = new HashMap<>();
		
			ArrayList<String> list = new ArrayList<>();
			
		map3.put("1", list );
		System.out.println( map3 );
		
		// ��3) set�÷��� => map
		HashSet< HashMap<String, Integer> > set = new HashSet<>();
		
			HashMap<String, Integer >map4 = new HashMap<>();
			
		set.add(map4);
		
		System.out.println( set );
		
		
		/*
		 * ����1 : ��ǰ���[��ǰ��,���] ����
				[����1] �з� : �Ƿ� , ���� => 2���� map
				[����2] map key:��ǰ�� value:���
				[����3] 2���� map�� �����ϴ� �����Ʈ ���� 
		 * 
		 */
		// 0.����
		HashMap<String, Integer> clothingmap = new HashMap<>();
			clothingmap.put("����Ű����", 20);
			clothingmap.put("����Ű����", 10 );
		HashMap<String, Integer> bagmap = new HashMap<>();
			bagmap.put("����Ű����", 5 );
			bagmap.put("�Ƶ�ٽ�����", 10 );
		
		ArrayList< HashMap<String, Integer> > productlist = new ArrayList<>();
		productlist.add(clothingmap);
		productlist.add(bagmap);
		
		Scanner scanner = new Scanner(System.in);
		while( true ) {
			System.out.println("����Ʈ��� : 0.�Ƿ� 1.����");
			int ch = scanner.nextInt();
			if( ch== 0 ) {
				System.out.println("��ü���: " + productlist.get(ch) );
				System.out.println("��ü��ǰ�� : " + productlist.get(ch).keySet() );
				System.out.println("����Ű���� ��� : " + productlist.get(ch).get("����Ű����"));
			}
			if( ch== 1 ) {
				System.out.println( productlist.get(1) );
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
