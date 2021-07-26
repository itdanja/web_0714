package Day08;

public class Member {
	
	// 1. 필드 : 상태[ 메모리 ]
	String id;
	String nickname;
	int password;
	String name;
	String email;
	
	// 2. 생성자  [ 객체 선언시 초기값 ] 
		// 생성자명 == 클래스명 
		// 빈생성자
	public Member() {
	}
		// 모든 필드를 받는 생성자 
	public Member( String id , String nickname , int passowrd , String name , String email){
		this.id = id;
		this.password = passowrd;
		this.nickname = nickname;
		this.name = name;
		this.email = email;
		// this.멤버 : 현재클래스의 멤버 
			// 동일한 이름이 존재했을경우 사용 
	}
		// 특정 필드만 받는 생성자 
	public Member( String id , int password ) {
		this.id = id;
		this.password = password;
	}
	
	// 3. 메소드 : 함수 
	
		// 1. 메소드 선언 
	public void info() { // 인수x 반환x
		// void : 반환 타입 없음 
			// 메소드명[임의] : 아무거나 
				// ( ) : 인수가 없음 
		System.out.println( id );
	}
	
		// 
	public String getemail() { // 인수x 반환o [ String ] 
		// 반환타입 : String 반환 
			// 인수 : x 
		return email;
	}
		// 
	public String setname( String name ) { // 인수o 반환o
		this.name = name;
		return "이름이 변경 되었습니다";
	}
	
	public void setemail( String email ) {
		this.email = email;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
