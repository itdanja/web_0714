package Day09;

public class Character {
	
	//1. �ʵ� 
	public String name; 	// �̸�
	protected int lv;	// ���� 
	int ex;  				// ����ġ
	private int power;		// ���ݷ�
	final String code = "10"; 
	
	//2. ������ 
	
	
	//3. �޼ҵ�
		// set , get �޼ҵ� 
	public void setpower( int power ) {
		this.power = power;
	}
	public int getpower() {
		return power;
	}
	
	public void setlv( int lv ) {
		this.lv = lv;
	}
	public int getlv() {
		return lv;
	}
	public int getEx() {
		return ex;
	}
	public void setEx(int ex) {
		this.ex = ex;
	}
	public int getPower() {
		return power;
	}
	public void setPower(int power) {
		this.power = power;
	}
	
	
	
	
	
	
	

}
