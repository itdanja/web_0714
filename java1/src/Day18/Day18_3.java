package Day18;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Day18_3 {

	
	public static void main(String[] args) {
		
		// ���� : ���ⱸ �ѹ��� [ LIFO ] : ���߿� ���� �޸� ���� ���� 
			// ��) �������� , CTRL+Z[�ֱ� ��ɾ� �ǵ����� ] , ������Ʈ ��/�� ������
				// push , pop
			// StackŬ���� : Vector Ŭ���� ���
	
		// ť : ���ⱸ ����� [ FIFO ] : ���� ���� �޸� ������� 
			// ��) �ټ���� , �μ� , ����ö �� 
				// offer , poll
		
		// ���� 
		Stack<����> �������� = new Stack<>();
		
		��������.push( new ����(100) );
		��������.push( new ����(500) );
		��������.push( new ����(10) );
		
		// ���
		System.out.println( "�������� : " + ��������  );
		System.out.println( "���� ���� : " + ��������.size() );
		
		for( ���� temp : �������� ) {
			System.out.println( temp );
		}
		// ����
		��������.pop(); //���� [ �������� �߰��� 10���� ���� ] 
		System.out.println(" ���� �ϳ� ����  : " + ��������  );
		
		// ���� ��� ���� 
		while( !��������.isEmpty() ) {
			// �޸𸮰� ��� ������ / !������
			System.out.println( ��������.pop() );
		}
		
		// ť 
			// �������̽� : ȥ�ڼ� �޸� �Ҵ� x 
				// �߻�޼ҵ� <= Ŭ�������� �������̵�[����]
		Queue< ���� > ��������2 = new LinkedList<>();
		
		��������2.offer( new ����(100) );
		��������2.offer( new ����(500) );
		��������2.offer( new ����(10) );
		
		System.out.println(" ��������2 : " + ��������2 );
		System.out.println(" ���� ");
		
		��������2.poll(); // ���� [ ���� ���� 100���� ���� ]
		
		System.out.println(" ��������2 : " + ��������2 );
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
