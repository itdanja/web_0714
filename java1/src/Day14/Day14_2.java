package Day14;

import java.util.Properties;
import java.util.Scanner;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class Day14_2 {
	
	// �ܺ� API : java mail
	// ���� : SMTP : Simple Mail Transfer Protocol
		//  Protocol : ��� �Ծ�
	
	// 1. ���� ���� ���̺귯�� �ٿ�ε� 
		// 1. activation.jar
		// 2. mail-1.4.7.jar
	// 2. �ܺ� ���̺귯���� ���� ������Ʈ �߰� 
		// 1. ���� ������Ʈ ������Ŭ��
		// 2. build path => configure build path 
		// 3. ��[�޴�]���� libraries => add external jars
		// 4. �ٿ�ε� ���� 2�� ���̺귯�� �߰� 
			// ** jdk11 ���� �̻�
			// 1. ��[�޴�]���� libraries => modulepath���� => add external jars
			// 2.  module-info ���Ͽ� �Ʒ� �߰� 
	//				requires activation; 
	//				requires mail;
	//				
	//				//opens ���̺귯���� �������Ű���� to activation , mail;
	//					opens day05 to activation , mail;
	
		// 5. ���̹� ���� ����
				/// 1. ���̹� ���� ȯ�漳��
				// 2. POP3/IMAP ����
				// 3. IMAP/SMTP ����
				// 4. �����  => Ȯ�� 
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("�޴»�� �̸��� : ");	String toemail = scanner.next();		// .next() : ����x 
		// .nextLine() : �տ� next() �ִ°�� ���� �߻� 
			// ��ó ���1 : ���̿� scanner.nextLine(); �߰� 
		scanner.nextLine();
		System.out.print("���� ���� : ");		String title = scanner.nextLine();		// .nextLine() : ����o
		System.out.print("���� ���� : ");		String contents = scanner.nextLine();	
		
		sendmail(toemail, title, contents);
		
	}
	
	public static void sendmail( String toemail , String title , String contents ) {
								// �μ� : �޴»������ , ���� , ���� 
		//1. ���� 
		String fromemail="�����»���̸���@naver.com";
		String frompassword = "�н�����";
		
		Properties properties = new Properties(); 	// �������� [ map �÷��� ] 
		properties.put("mail.smtp.host", "smtp.naver.com");		// host : ����ȸ�� ȣ��Ʈ[ ����̸�] // ����ȸ�� ȣ��Ʈ��[ �ش� ����Ʈ������ Ȯ�ΰ��� ] 
		properties.put("mail.smtp.port", 587);		// port : ����ȸ�� ȣ��Ʈ smtp port[��Ź�ȣ]
		properties.put("mail.smtp.auth", "true");	// �����ޱ� 
		
		// 2. ���� 
		//Session session = Session.getDefaultInstance( properties , new Authenticator() { } );
		Session session = Session.getDefaultInstance( properties , new Authenticator(){ 
			
			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(fromemail, frompassword);
			}
			
		} );
		
		// 3. ���Ϻ����� 
		try {
			MimeMessage message = new MimeMessage( session ); // �޽����� ���� ó�� 
			message.setFrom( new InternetAddress( fromemail )); // �����»�� // ���ܹ߻� ������ �߻� 
			message.addRecipient( Message.RecipientType.TO , new InternetAddress(toemail ) );
			
			message.setSubject(title); // ���� ���� 
			message.setText(contents); // ���� ����
			
			Transport.send(message); // ��������
			
			System.out.println("[[[�������� �Ϸ� ]]] : " + toemail );
			
		}
		catch (Exception e) {
			System.out.println("[[[�������� ���� ]]] : " + toemail );
		}
			
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
