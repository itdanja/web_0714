package Day10;

public class Member {

	private String id;
	private String password;
	
//	public void Ȯ��() {
//		this.getgrade(); // ����Ŭ���� ��� ���Ұ�
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
