package Day11;

public class Bank implements Atm {
	
	@Override
	public void menu() {
		System.out.println(" 메뉴 페이지 ");
	}
	@Override
	public void create() {
		System.out.println(" 생성 페이지 ");
	}
	@Override
	public void deposit() {
		System.out.println(" 예금 페이지 ");
	}
	@Override
	public void withdraw() {
		System.out.println(" 출금 페이지 ");
	}
	@Override
	public void transfer() {
		System.out.println(" 이체 페이지 ");
	}
	@Override
	public void balance() {
		System.out.println(" 잔고 페이지 ");
	}
	

}
