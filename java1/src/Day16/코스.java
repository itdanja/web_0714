package Day16;

public class 코스<매개클래스> {

	// 필드 
	private String 과정명;
	private 매개클래스[] 회원목록;
			// 외부로부터 현재클래스로 들어온 자료형/클래스 으로 배열 선언 
	// 생성자 
	public 코스( String 과정명 , int 인원수 ) {
		this.과정명 = 과정명;
		// this.현재클래스멤버
		this.회원목록 = (매개클래스[])new Object[인원수]; //인원수만큼 배열의 크기 할당 
				// 제네릭 타입으로 메모리할당 X
	}
	// 배열에 요소 추가하는 메소드 [ 코스에 인원 추가 ]
	public void 추가( 매개클래스 매개객체 ) {
		// private vs public : 접근제한자 
		
		for( int i = 0 ; i<회원목록.length ; i++  ) {
			// i는 0부터 배열의크기 전까지 1씩 증가 
			if( 회원목록[i] == null ) {
				회원목록[i] =  매개객체;
				break;
			}
		}
	}
	// get , set 
	public String get과정명() {
		return 과정명;
	}
	public void set과정명(String 과정명) {
		this.과정명 = 과정명;
	}
	public 매개클래스[] get회원목록() {
		return 회원목록;
	}
	public void set회원목록(매개클래스[] 회원목록) {
		this.회원목록 = 회원목록;
	}
	
	
	
	
	
	
	

}
