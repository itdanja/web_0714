package Day08;

public class Member {
	
	// 1. �ʵ� : ����[ �޸� ]
	String id;
	String nickname;
	int password;
	String name;
	String email;
	
	// 2. ������  [ ��ü ����� �ʱⰪ ] 
		// �����ڸ� == Ŭ������ 
		// �������
	public Member() {
	}
		// ��� �ʵ带 �޴� ������ 
	public Member( String id , String nickname , int passowrd , String name , String email){
		this.id = id;
		this.password = passowrd;
		this.nickname = nickname;
		this.name = name;
		this.email = email;
		// this.��� : ����Ŭ������ ��� 
			// ������ �̸��� ����������� ��� 
	}
		// Ư�� �ʵ常 �޴� ������ 
	public Member( String id , int password ) {
		this.id = id;
		this.password = password;
	}
	
	// 3. �޼ҵ� : �Լ� 
	
		// 1. �޼ҵ� ���� 
	public void info() { // �μ�x ��ȯx
		// void : ��ȯ Ÿ�� ���� 
			// �޼ҵ��[����] : �ƹ��ų� 
				// ( ) : �μ��� ���� 
		System.out.println( id );
	}
	
		// 
	public String getemail() { // �μ�x ��ȯo [ String ] 
		// ��ȯŸ�� : String ��ȯ 
			// �μ� : x 
		return email;
	}
		// 
	public String setname( String name ) { // �μ�o ��ȯo
		this.name = name;
		return "�̸��� ���� �Ǿ����ϴ�";
	}
	
	public void setemail( String email ) {
		this.email = email;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
