package Day11;

public interface 키오스크 {
	// 상수 
	// 추상메소드 
	public void 메뉴();
	public void 장바구니();
	public void 결제();
	// 디폴트메소드 
	public default void 종료() {
		System.out.println(" 키오스크 종료 ");
	}
	
	
}
