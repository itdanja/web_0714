package Day15;

public class Account {

	private int money;
	// private : ���������� [���� Ŭ���������� ȣ�� ���� ]
		// get , set �޼ҵ� �ʿ�
	
	public int getmoney() {
		return money;
	}
	// public  void setmoney( int money) {
	public synchronized void setmoney( int money) {
			// synchronized:����ȭ
		this.money = money;
		try {
			Thread.sleep(2000);
		}
		catch (Exception e) {}
		
		System.out.println( Thread.currentThread().getName() 
				+ " : " + this.money);
	}
	
	
	
}
