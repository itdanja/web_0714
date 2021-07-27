package Day09;

public class Day09_1 {
	
	// 클래스 
		// 멤버 : 필드 , 생성자 , 메소드 
	
		// 접근제한자 : 
			// 목적 : 필드[메모리]의 데이터 보호를 위해 
			// public : 프로젝트내 모든 곳에서 호출 가능[사용가능]
			// protected : 현재 패키지내에서만 호출 가능
					// [ 단 : 상속받은 서브클래스는 슈퍼클래스가 있는 패키지로 접근 ]
			// default : 현재 패키지내에서만 호출 가능 
			// private : 현재 클래스내에서만 호출 가능
		
		// 자주 사용되는 키워드[ 미리 정의된 단어 ]
			// final : 메모리의 상수값 [ 고정값 ] 
				// 변수 <----> 상수 
			// static : 정적 변수 [ 고정변수 ] 
				// 프로그램 시작과 동시에 메모리할당 => static 
				// 프로그램 종료와 동시에 메모리초기화
					// 목적 : 프로그램 전반적인 곳에 사용되는 메모리 할당시 
				
		// java 메모리 구조 
			// heap : [변수/객체] 메모리 : new
			// stack : [메소드] 지역변수 : 메소드가 종료되면 메모리 초기화 
			// static : [static] 전역변수 
	

	public static void main(String[] args) {
		
		// 클래스명은 첫글자 대문자 
			// 객체는 클래스명의 소문자
		
		// 게임속의 캐릭터 == 객체
			// 동일한 패키지내
			Character character = new Character();
			character.name = "신촌it";
			character.lv = 1;
			character.ex = 0;
			//character.power = 10; // 접근불가 
				// priavate 멤버에 접근하는 방법1
				// set,get메소드 
			character.setpower(10);
			System.out.println("현재 공격력 : "+ character.getpower());
			
			System.out.println("1.final 없을경우 ");
			character.lv = 2; // 변경 가능 
			
			System.out.println("2.final 있을경우 ");
			// character.code = "30";			
			
			
			
			
			
			
			
			
			
			
			
			
	}
	
}
