package Day16;

public class Day16_1 {
	
	public static void main(String[] args) {
		
		// 제네릭 : 하나의 값이 여러 다른 데이터 타입들을 가질 수 있는 기술
			// 자료형/클래스 => 매개값
			// 목적 : 하나의 객체가 여러개의 자료형으로 변경되는 경우 
				// Integer 객체 -> String 객체 -> Char 객체
			// 내부 클래스로 외부로부터 매개타입[자료형] 받기 
		
		
		// 1. 제네릭 없는 경우
		Box box1 = new Box();
		box1.setobject("사과"); // String 
			// Object 클래스 = String 클래스 
		String name1 = (String)box1.getobject();
			// String 클래스 = Object 클래스[X]
				//  (String)Object 강제형변환
		System.out.println(name1);
		
		box1.setobject( new Apple() );
			// Object 클래스 = 정의된 클래스 
		Apple apple = (Apple)box1.getobject();
			// Apple 클래스 = Object 클래스[X]
				//  (Apple)Object 강제형변환
		System.out.println( apple );
		
		// 2. 제네릭 있는 경우 
		Box2<String> box2 = new Box2<>();
		box2.set제네릭객체("사과");
		String name2 = box2.get제네릭객체();
		System.out.println(name2);
		
		Box2<Integer> box3 = new Box2<>();
		box3.set제네릭객체(30);
		int count = box3.get제네릭객체();
		System.out.println(count);
		
		Box2<Apple> box4 = new Box2<>();
		box4.set제네릭객체(new Apple() );
		Apple apple2 = box4.get제네릭객체();
		System.out.println( apple2 );
		
		// 3. 멀티 제네릭
		Product<Television, String> product1 = new Product<>();
		product1.setKind( new Television() );
		product1.setModel("스마트텔레비전");
		
		System.out.println("제품1 : " + product1.getKind() + product1.getModel() );
		
		
		Product<Car, String> product2 = new Product<Car, String>();
													// 뒤부분 제네릭 생략 가능 
		product2.setKind( new Car() );
		product2.setModel("디젤자동차");
		
		System.out.println("제품2 : " + product2.getKind() + product2.getModel() );
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
