package Day11;

public class 롯데리아 implements 키오스크 {
	
	// 오버라이딩 
	@Override
	public void 메뉴() {
		System.out.println("롯데리아 메뉴 페이지 ");
	}
	@Override
	public void 장바구니() {
		System.out.println("롯데리아 장바구니 페이지 ");
	}
	@Override
	public void 결제() {
		System.out.println("롯데리아 결제 페이지 ");
		
	}

}
