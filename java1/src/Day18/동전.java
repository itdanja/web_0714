package Day18;

public class 동전 {
	int money;
	
	public 동전( int money) {
		this.money = money;
	}
	
	@Override // toString => object
	public String toString() {
		return money+"";
	}
	
}
