package Day10;

// ����Ŭ�����κ��� ��ӹ޾� ���� ����
public class Sbank extends Account  {

	private final String bankcode = "101"; // ����ĺ��� �ڵ� 
	
	public Sbank() {}

	public Sbank(String account_number, String account_password, int account_money) {
		super(account_number, account_password, account_money);
	}
	@Override
	public void create() {
		System.out.println("[[ �������� ���� ���� ������ ]]] ");
		super.create();
	}
	@Override
	public void deposit() {
		System.out.println("[[ �������� ���� �Ա� ������ ]]] ");
		super.deposit();
	}
	@Override
	public void withdraw() {
		System.out.println("[[ �������� ���� ��� ������ ]]] ");
		super.withdraw();
	}
	@Override
	public void transfer() {
		System.out.println("[[ �������� ���� ��ü ������ ]]] ");
		super.transfer();
	}
	
	
	
	
}
