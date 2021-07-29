package Day11;

public class 카페 implements 키오스크 {
	
	// 오버라이딩
	@Override
	public void 메뉴() {
		System.out.println("카페 메뉴 페이지 ");
		
	}
	@Override
	public void 장바구니() {
		System.out.println("카페 장바구니 페이지 ");
		
	}
	@Override
	public void 결제() {
		System.out.println("카페 결제 페이지 ");
		
	}
	

}
