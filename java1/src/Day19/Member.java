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
		// 1. ȸ������ [ �Է¹ޱ� => �ʵ����� => ��ü => ����Ʈ ��� ]
		public void signup() {
			System.out.println("[[[ ���̵�(4~10�����̳�) : ");	String id = Consoleprogram.scanner.next();
			System.out.println("[[[ ��й�ȣ : ");				String passowrd = Consoleprogram.scanner.next();
			System.out.println("[[[ ��й�ȣ Ȯ�� : ");			String passowrdfirm = Consoleprogram.scanner.next();
			System.out.println("[[[ ���� : ");				String name = Consoleprogram.scanner.next();
			System.out.println("[[[ �̸���(email����) : ");		String email = Consoleprogram.scanner.next();
		
			// ��ȿ���˻� 
				// 1.�ߺ�üũ 
				// 2.��й�ȣ Ȯ��
				if(  !passowrd.equals(passowrdfirm) ) { System.out.println("[[�˸� : ���Խ���]] : ��й�ȣ�� ��ġ���� �ʽ��ϴ� "); return;}
				// 3.���̵�� 10�����̳� // ��й�ȣ 5���� //  ���� 10�����̳�
				if( id.length() < 3 || id.length() > 11 ) {System.out.println("[[�˸� : ���Խ���]] : ���̵� 4~10���� �̳��� �����մϴ� ");return;}
				if( passowrd.length() != 5 ) {System.out.println("[[�˸� : ���Խ���]] : ��й�ȣ 5���ڸ� �����մϴ� ");return;}
				if( name.length() < 1 || id.length() > 11 ) {System.out.println("[[�˸� : ���Խ���]] : �̸��� 2~10���� �̳��� �����մϴ� ");return;}
				// 4.�̸�������
				if( !email.contains("@") ) {System.out.println("[[�˸� : ���Խ���]] : �̸��Ͽ� @ �����Ͽ� �Է����ּ��� ");return;}
				
			// ȸ������ ���� : ��ü => ����Ʈ => ����ó�� 
				int totalno = 0; // ��ü ȸ���� [ ȸ��Ż��ÿ� ���� ] 
					
				Member member = new Member( totalno+1 , id, passowrd, name, email, 0); // ��ü 
				Consoleprogram.memberlist.add(member);//����Ʈ���
			// ����ó��
			try {
				FileUtil.filesave(0, member.getNo() );
				FileUtil.filesave(1 , 0);
			}catch (Exception e) {
				System.out.println("[[����ó�� ���� ]] : �����ڿ��� ���� ");
			}
			System.out.println("[[ ȸ������ ���� ]] : �������ּż� �����մϴ�");
		}
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
