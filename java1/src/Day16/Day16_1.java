package Day16;

public class Day16_1 {
	
	public static void main(String[] args) {
		
		// ���׸� : �ϳ��� ���� ���� �ٸ� ������ Ÿ�Ե��� ���� �� �ִ� ���
			// �ڷ���/Ŭ���� => �Ű���
			// ���� : �ϳ��� ��ü�� �������� �ڷ������� ����Ǵ� ��� 
				// Integer ��ü -> String ��ü -> Char ��ü
			// ���� Ŭ������ �ܺηκ��� �Ű�Ÿ��[�ڷ���] �ޱ� 
		
		
		// 1. ���׸� ���� ���
		Box box1 = new Box();
		box1.setobject("���"); // String 
			// Object Ŭ���� = String Ŭ���� 
		String name1 = (String)box1.getobject();
			// String Ŭ���� = Object Ŭ����[X]
				//  (String)Object ��������ȯ
		System.out.println(name1);
		
		box1.setobject( new Apple() );
			// Object Ŭ���� = ���ǵ� Ŭ���� 
		Apple apple = (Apple)box1.getobject();
			// Apple Ŭ���� = Object Ŭ����[X]
				//  (Apple)Object ��������ȯ
		System.out.println( apple );
		
		// 2. ���׸� �ִ� ��� 
		Box2<String> box2 = new Box2<>();
		box2.set���׸���ü("���");
		String name2 = box2.get���׸���ü();
		System.out.println(name2);
		
		Box2<Integer> box3 = new Box2<>();
		box3.set���׸���ü(30);
		int count = box3.get���׸���ü();
		System.out.println(count);
		
		Box2<Apple> box4 = new Box2<>();
		box4.set���׸���ü(new Apple() );
		Apple apple2 = box4.get���׸���ü();
		System.out.println( apple2 );
		
		// 3. ��Ƽ ���׸�
		Product<Television, String> product1 = new Product<>();
		product1.setKind( new Television() );
		product1.setModel("����Ʈ�ڷ�����");
		
		System.out.println("��ǰ1 : " + product1.getKind() + product1.getModel() );
		
		
		Product<Car, String> product2 = new Product<Car, String>();
													// �ںκ� ���׸� ���� ���� 
		product2.setKind( new Car() );
		product2.setModel("�����ڵ���");
		
		System.out.println("��ǰ2 : " + product2.getKind() + product2.getModel() );
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
