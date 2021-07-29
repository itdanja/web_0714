package Day11;

public interface 리모컨 {

	// 멤버 : 상수 , 추상메소드 , default 메소드
	
	// 필드 
	int 최대소음 = 10;
	int 최소소음 = 0;
	
	// 추상메소드 : 선언o 정의x 
	public abstract void 실행();
	public void 종료();
	public void 소음설정(int 소음);
	
	// default 메소드 : 선언o 정의 o
	public default void 채널변경() {
		System.out.println("채널변경");
	}
	
}
