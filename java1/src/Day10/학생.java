package Day10;

public class 학생 extends 사람 {
			// 상속[연장하기] 슈퍼클래스
	
	// 이름,나이는 슈퍼클래스로부터 상속받았기 때문에 사용가능
	private int 학년;

	public 학생() {
		super();
	}

	public 학생(String 이름, int 나이 , int 학년) {
		super(이름, 나이);
		this.학년 = 학년;
	}

	public int get학년() {
		return 학년;
	}

	public void set학년(int 학년) {
		this.학년 = 학년;
	}
	
	@Override // 슈퍼클래스내 동일한 멤버를 재정의
	public void 정보() {
		super.정보();
		System.out.println("학년 : " + 학년);
	}
	
	
}
