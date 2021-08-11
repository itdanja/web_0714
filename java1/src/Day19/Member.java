package Day19;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class Member {
	
	// �ʵ� [ ȸ����ȣ ,  ���̵� , ��й�ȣ , ���� , �̸��� , ����Ʈ ]
	private int no;
	private String id;
	private String password;
	private String name;
	private String email;
	private int point;
	// ��ü ȸ���� 
	static int totalno = 0;
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
			System.out.print("[[[ ���̵�(4~10�����̳�) : ");	String id = Consoleprogram.scanner.next();
			System.out.print("[[[ ��й�ȣ : ");				String passowrd = Consoleprogram.scanner.next();
			System.out.print("[[[ ��й�ȣ Ȯ�� : ");			String passowrdfirm = Consoleprogram.scanner.next();
			System.out.print("[[[ ���� : ");				String name = Consoleprogram.scanner.next();
			System.out.print("[[[ �̸���(email����) : ");		String email = Consoleprogram.scanner.next();
		
			// ��ȿ���˻� 
				// 1.�ߺ�üũ [ �Է��� ���̵� ȸ����� ����Ʈ�� �����ϸ� X ] 
				for( Member temp : Consoleprogram.memberlist ) {
					if( temp.id.equals(id) ) {System.out.println("[[�˸� : ���Խ���]] : ������ ���̵� �����մϴ�. "); return;}
				}
				// 2.��й�ȣ Ȯ��
				if(  !passowrd.equals(passowrdfirm) ) { System.out.println("[[�˸� : ���Խ���]] : ��й�ȣ�� ��ġ���� �ʽ��ϴ� "); return;}
				// 3.���̵�� 10�����̳� // ��й�ȣ 5���� //  ���� 10�����̳�
				if( id.length() < 3 || id.length() > 11 ) {System.out.println("[[�˸� : ���Խ���]] : ���̵� 4~10���� �̳��� �����մϴ� ");return;}
				if( passowrd.length() != 5 ) {System.out.println("[[�˸� : ���Խ���]] : ��й�ȣ 5���ڸ� �����մϴ� ");return;}
				if( name.length() < 1 || id.length() > 11 ) {System.out.println("[[�˸� : ���Խ���]] : �̸��� 2~10���� �̳��� �����մϴ� ");return;}
				// 4.�̸�������
				if( !email.contains("@") ) {System.out.println("[[�˸� : ���Խ���]] : �̸��Ͽ� @ �����Ͽ� �Է����ּ��� ");return;}
			
			// ����ó��
			try {	
				// ȸ������ ���� : ��ü => ����Ʈ => ����ó�� 
				FileUtil.fileload(0);
					Member member = new Member( totalno+1 , id, passowrd, name, email, 0); // ��ü 
					Consoleprogram.memberlist.add(member);//����Ʈ���
			
				FileUtil.filesave(0, member.getNo() );
				
				FileUtil.filesave(1 , 0);
				
			}catch (Exception e) {
				System.out.println("[[����ó�� ���� ]] : �����ڿ��� ���� ");
			}
			System.out.println("[[ ȸ������ ���� ]] : �������ּż� �����մϴ�");
		}
		// 2. �α���
		public Member login() {
			
			System.out.print("[[[ ���̵� : ");	String id = Consoleprogram.scanner.next();
			System.out.print("[[[ ��й�ȣ : ");	String passowrd = Consoleprogram.scanner.next();
			
			for( Member member : Consoleprogram.memberlist ) {
				if( member.id.equals(id) && member.password.equals(passowrd) ) {
					System.out.println(" [[ �ȳ��ϼ��� " + member.name +"�� ]]]");
					// �α��� ������ �ٸ� ������[�Խ���Ŭ����]���� �α��ε� ������ Ȱ���� �ϱ����� ������ ��ü ��ȯ�ϱ� 
					return member;  // ��ȯŸ�� : �α��ε� ȸ������ ��ü ����
				}
			}
			System.out.println("[[[ ������ ȸ�������� �����ϴ� ]]] ");
			return null; // �α��� ���н� null
		}
		// 3. ���̵�ã�� [ �̸� �� �̸��� �����Ѱ�� => ���̵� ��� ] 
		public void findid() {
			System.out.print("[[[ �̸� : ");		String name = Consoleprogram.scanner.next();
			System.out.print("[[[ �̸��� : ");	String email = Consoleprogram.scanner.next();
			
			for( Member member : Consoleprogram.memberlist ) {
				if( member.name.equals(name) && member.email.equals(email) ) {
					System.out.println(" [[ ȸ������ ���̵� : " +  member.id);
					return;
				}
			}
			System.out.println("[[[ ������ ȸ�������� �����ϴ� ]]] ");
		}
		// 4. ��й�ȣã�� [ ���̵�� �̸��� �����Ѱ�� => ��й�ȣ : ���� ���� ]
		public void findpassword() {
			System.out.print("[[[ ���̵� : ");		String id = Consoleprogram.scanner.next();
			System.out.print("[[[ �̸��� : ");		String email = Consoleprogram.scanner.next();
			
			for( Member member : Consoleprogram.memberlist ) {
				if( member.id.equals(id) && member.email.equals(email) ) {
					System.out.println(" [[ ȸ������ �̸��Ϸ� ��й�ȣ�� �����߽��ϴ� ]]");
					sendemail( member.email , 1 , member.password ); // type = 1  ��й�ȣã�� ��������
					return;
				}
			}
			System.out.println("[[[ ������ ȸ�������� �����ϴ� ]]] ");
		}
		// 5. ��������
		public void sendemail(  String toemail , int type , String contents ) {
			
			// 1. API �ٿ�ε�  [ activation.jar , mail.jar ]
			// 2. ���̺귯�� �߰�  [ javase11 => module-info ]
			// 0.����
			String fromemail="�����»���̸���@naver.com";
			String frompassword = "�н�����";
			// �������� map( Ű , �� )  �÷��� 
			Properties properties = new Properties();
			properties.put("mail.smtp.host", "smtp.naver.com");
			properties.put("mail.smtp.port", 587 );
			properties.put("mail.smtp.auth", true );
			// 1. ���� 
			Session session = Session.getDefaultInstance( properties , new Authenticator() {
				@Override // �н����� ���� �޼ҵ� => ������
				protected PasswordAuthentication getPasswordAuthentication() {
					// TODO Auto-generated method stub
					return new PasswordAuthentication(fromemail, frompassword);
				}
			});
			// 2. ���Ϻ����� 
			try {
				MimeMessage message = new MimeMessage(session);
				message.setFrom( new InternetAddress( fromemail) ); // ������ ����ó�� �߻�
				message.addRecipient(Message.RecipientType.TO ,  new InternetAddress(toemail));
				
				if( type == 1 ) {
					message.setSubject(" java console Ŀ�´�Ƽ " );
					message.setText(" ȸ������ ��й�ȣ : "+ contents);
				}
				Transport.send(message);
			}catch (Exception e) { System.out.println("[[ �������� ���� ]] : �����ڿ��� ���� "); }
		}
		
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
