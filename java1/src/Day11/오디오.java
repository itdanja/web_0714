package Day11;

public class 오디오 implements 리모컨 {
	
	int 소음 = 0 ; 

	@Override
	public void 실행() {
		System.out.println("오디오 실행");
	}
	@Override
	public void 종료() {
		System.out.println("오디오 종료");
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
