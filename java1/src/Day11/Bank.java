package Day11;

public class Bank implements Atm {
	
	@Override
	public void menu() {
		System.out.println(" �޴� ������ ");
	}
	@Override
	public void create() {
		System.out.println(" ���� ������ ");
	}
	@Override
	public void deposit() {
		System.out.println(" ���� ������ ");
	}
	@Override
	public void withdraw() {
		System.out.println(" ��� ������ ");
	}
	@Override
	public void transfer() {
		System.out.println(" ��ü ������ ");
	}
	@Override
	public void balance() {
		System.out.println(" �ܰ� ������ ");
	}
	

}
