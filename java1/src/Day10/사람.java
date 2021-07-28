package Day10;

public class 사람 {

	private String 이름;
	private int 나이;

	public 사람() {
	}

	public 사람(String 이름, int 나이) {
		this.이름 = 이름;
		this.나이 = 나이;
	}
	
	// 메소드
	public void 정보() {
		System.out.println("이름 : "+이름);
		System.out.println("이름 : "+나이);
	}

	public String get이름() {
		return 이름;
	}

	public void set이름(String 이름) {
		this.이름 = 이름;
	}

	public int get나이() {
		return 나이;
	}

	public void set나이(int 나이) {
		this.나이 = 나이;
	}

	
}
