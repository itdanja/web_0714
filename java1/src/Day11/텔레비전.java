package Day11;

public class 텔레비전 implements 리모컨 {
				// implements 인터페이스 
	// 멤버 : 필드 , 생성자 , 메소드 
	
	int 소음 = 0 ;
	
	// 추상메소드 코드 구현 => 오버라이딩
	@Override
	public void 실행() {
		System.out.println("텔레비전 실행");
	}
	@Override
	public void 종료() {
		System.out.println("텔레비전 종료");
	}
	@Override
	public void 소음설정(int 소음) {
		
		if( 소음 > 리모컨.최대소음 ) {
			소음 = 리모컨.최대소음;
		}else if( 소음 < 리모컨.최소소음 ) {
			소음 = 리모컨.최소소음;
		}else {
			this.소음 = 소음;
		}
		System.out.println("현재소음 : " + 소음);
	}
	

}
