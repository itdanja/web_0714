package Day16;

import java.util.Arrays;
import java.util.Scanner;

public class Day16_3 {
	//	����1 :��� ���α׷�
	//	�޴�[���ѷ���]
	//		1. ����߰�
	//		2. ������ 
	// 
	//	[����1] �̸� , ���� �Է¹޾� �Ʒ����ǿ� ���� ��� ��� 
	//	[����2]
	//							���̰� 8�� �̸� ���� ��� ��� 
	//	���Ŭ����		���[super]	���̰� 20�� �̸� û�ҳ� ��� ��� 
	//							���̰� �׿ܴ� ���� ��� ��� 
	//	[����3] ��ܺ� �ο����� ��� �̸� ��� 
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Member<Child> childlist = new Member<>("���Ƹ��");
		Member<Student> sudentlist = new Member<>("û�ҳ���");
		Member<Adult> adultlist = new Member<>("���θ��");
		
		while(true) {
			System.out.println("[[[ ��� ���� ]]]");
			System.out.println("1.��ܵ�� 2.������");
			int ch = scanner.nextInt();
			
			if( ch ==1 ) {
				System.out.println("�̸� : "); 	String name = scanner.next();
				System.out.println("���� : ");	int age = scanner.nextInt(); 
				if( age < 8 ) {
					childlist.add( new Child(name, age));
				}else if( age <20 ) {
					sudentlist.add( new Student(name, age));
				}else {
					adultlist.add( new Adult(name, age));
				}
			}
			if( ch ==2 ) {
				memberprint(childlist);
				memberprint(sudentlist);
				memberprint(adultlist);
			}
		}
	} // main end 
	
	public static void memberprint( Member<?> member ) {
		System.out.println( member.getMembername() +"��� ��� : "+
				Arrays.toString( member.getMemberlist() ) );
	} 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
