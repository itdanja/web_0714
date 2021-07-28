package Day10;

// 계좌클래스로부터 상속받아 은행 설계
public class Sbank extends Account  {

	private final String bankcode = "101"; // 은행식별용 코드 
	
	public Sbank() {}

	public Sbank(String account_number, String account_password, int account_money) {
		super(account_number, account_password, account_money);
	}
	@Override
	public void create() {
		System.out.println("[[ 신한은행 계좌 생성 페이지 ]]] ");
		super.create();
	}
	@Override
	public void deposit() {
		System.out.println("[[ 신한은행 계좌 입금 페이지 ]]] ");
		super.deposit();
	}
	@Override
	public void withdraw() {
		System.out.println("[[ 신한은행 계좌 출금 페이지 ]]] ");
		super.withdraw();
	}
	@Override
	public void transfer() {
		System.out.println("[[ 신한은행 계좌 이체 페이지 ]]] ");
		super.transfer();
	}
	
	
	
	
}
