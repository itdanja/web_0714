package Day19;

public class Member {
	
	// �ʵ� [ ȸ����ȣ ,  ���̵� , ��й�ȣ , ���� , �̸��� , ����Ʈ ]
	private int no;
	private String id;
	private String password;
	private String name;
	private String email;
	private int point;
		// private : ���� Ŭ������������ ȣ�� ����
	
	// ������ => new ������()
		// 1. �������   2.Ǯ������ 
	public Member() {}
	
	public Member(int no, String id, String password, String name, String email, int point) {
		this.no = no;
		this.id = id;
		this.password = password;
		this.name = name;
		this.email = email;
		this.point = point;
	}
	// �޼ҵ� 
		// 1. ȸ������
		// 2. �α���
		// 3. ���̵�ã�� 
		// 4. ��й�ȣã�� 
		// 5. ��������
	// �޼ҵ� [ get , set �޼ҵ� ]
	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	
	
	

}
