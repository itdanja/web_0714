package Day18;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Day18_4 {
	
	/*
	 * 
	 * ����1 : 
			// Queue 4�� list 1��
					// 1. ��ö �о�� 
					// 2. �� : ������ -> ��� -> ���� -> ����
					// 3. ������ : ��ö 3���� ��ü 
					// 4. ��� ��ȣ�� �޾Ƽ� �ش翪���� ����ؼ� �������� ����
					// 5. ���� �ҿ�ð� 2��
			
				�޴�[���ѷ���]
					��ö ��� ��ȣ : 1.���� 2.��� 3.���� 4.����
	
	 * 
	 */
	
	// main �ۿ� ����Ǵ� ���� : ��� �޼ҵ忡�� ȣ�� �ϱ� ���� 
	public static Queue<��ö> ������ = new LinkedList<>();
	public static Queue<��ö> ��꿪 = new LinkedList<>();
	public static Queue<��ö> ���￪ = new LinkedList<>();
	public static Queue<��ö> ���ο� = new LinkedList<>();
	public static ArrayList< Queue<��ö> > ��ö��Ȳ = new ArrayList<>();
		
	public static void main(String[] args) {
			������.offer( new ��ö("A-1") );
			������.offer( new ��ö("B-2") );
			������.offer( new ��ö("C-3") );
			
			��ö��Ȳ.add(������);
			��ö��Ȳ.add(��꿪);
			��ö��Ȳ.add(���￪);
			��ö��Ȳ.add(���ο�);
			
			Scanner scanner = new Scanner(System.in);
			while(true) {
				��ö����Ȳ();
				System.out.println("��߽�ȣ : 0.���� 1.��� 2.���� 3.����");
				int ch = scanner.nextInt();
				if( ch == 0 ) { ��߽�ȣ(ch); }
				if( ch == 1 ) { ��߽�ȣ(ch);}
				if( ch == 2 ) { ��߽�ȣ(ch);}
				if( ch == 3 ) { ��߽�ȣ(ch);}
			}
	} // main �� 
	
	// ��ö ��� ��ȣ [ �޼ҵ�ȭ : ����ȣ�� ���� ��ö ��� �ڵ� ]
	public static void ��߽�ȣ( int ����ȣ ) {
	
		// 1. �ش翪�� ��ö�� ������� 
		if( ��ö��Ȳ.get(����ȣ).isEmpty() ) {
			System.out.println("[[ ���� ������� ��ö�� �����ϴ� ]] ");
			return;
		}
	
		// 2. �ش翪���� ��ö ���� 
		��ö temp =  ��ö��Ȳ.get(����ȣ).poll();
		System.out.println( "[[��� : " + temp.��ö��ȣ );
		System.out.println( "[[ �ҿ�ð� : 2�� ]]");
		
		// * 2�ʰ� ������ ���߱� 
		try {
			Thread.sleep(2000); // ������ ���ܹ߻�
		}catch (Exception e) { }
		
		// 3. �� ������ �� ��ö�� �������� �ֱ� 
			// 4. ���࿡ �������� ������ �������� ���� 
			if( ����ȣ+1 >=��ö��Ȳ.size() ) ��ö��Ȳ.get(0).offer(temp);
			else {
				��ö��Ȳ.get(����ȣ+1).offer(temp);
				System.out.println( "[[���� : " + temp.��ö��ȣ );
			}
			
	}
	
	// ��ö ��Ȳ �޼ҵ� 
	public static void ��ö����Ȳ() {
		System.out.println(" ���� �������� ��ö ��Ȳ : " + ��ö��Ȳ.get(0));
		System.out.println(" ���� ��꿪�� ��ö ��Ȳ : " + ��ö��Ȳ.get(1));
		System.out.println(" ���� ���￪�� ��ö ��Ȳ : " + ��ö��Ȳ.get(2));
		System.out.println(" ���� ���ο��� ��ö ��Ȳ : " + ��ö��Ȳ.get(3));
	}


	
	
	
	
	
	
}
