package Day10;

public class Member {

	private String id;
	private String password;
	
//	public void 확인() {
//		this.getgrade(); // 서브클래스 멤버 사용불가
//	}
	
	public Member() {
	}

	public Member(String id, String password) {
		this.id = id;
		this.password = password;
	}
	
	public void info() {
		System.out.println(" id : " + id);
		System.out.println(" passowrd : " + password);
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
}
