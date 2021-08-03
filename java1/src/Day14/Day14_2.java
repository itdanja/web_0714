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
	
	// 외부 API : java mail
	// 메일 : SMTP : Simple Mail Transfer Protocol
		//  Protocol : 통신 규약
	
	// 1. 메일 관련 라이브러리 다운로드 
		// 1. activation.jar
		// 2. mail-1.4.7.jar
	// 2. 외부 라이브러리를 현재 프로젝트 추가 
		// 1. 현재 프로젝트 오른쪽클릭
		// 2. build path => configure build path 
		// 3. 탭[메뉴]에서 libraries => add external jars
		// 4. 다운로드 받은 2개 라이브러리 추가 
			// ** jdk11 버전 이상
			// 1. 탭[메뉴]에서 libraries => modulepath선택 => add external jars
			// 2.  module-info 파일에 아래 추가 
	//				requires activation; 
	//				requires mail;
	//				
	//				//opens 라이브러리를 사용할패키지명 to activation , mail;
	//					opens day05 to activation , mail;
	
		// 5. 네이버 메일 설정
				/// 1. 네이버 메일 환경설정
				// 2. POP3/IMAP 설정
				// 3. IMAP/SMTP 설정
				// 4. 사용함  => 확인 
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("받는사람 이메일 : ");	String toemail = scanner.next();		// .next() : 공백x 
		// .nextLine() : 앞에 next() 있는경우 오류 발생 
			// 대처 방법1 : 사이에 scanner.nextLine(); 추가 
		scanner.nextLine();
		System.out.print("메일 제목 : ");		String title = scanner.nextLine();		// .nextLine() : 공백o
		System.out.print("메일 내용 : ");		String contents = scanner.nextLine();	
		
		sendmail(toemail, title, contents);
		
	}
	
	public static void sendmail( String toemail , String title , String contents ) {
								// 인수 : 받는사람메일 , 제목 , 내용 
		//1. 설정 
		String fromemail="보내는사람이메일@naver.com";
		String frompassword = "패스워드";
		
		Properties properties = new Properties(); 	// 설정관련 [ map 컬렉션 ] 
		properties.put("mail.smtp.host", "smtp.naver.com");		// host : 메일회사 호스트[ 통신이름] // 메일회사 호스트명[ 해당 사이트내에서 확인가능 ] 
		properties.put("mail.smtp.port", 587);		// port : 메일회사 호스트 smtp port[통신번호]
		properties.put("mail.smtp.auth", "true");	// 인증받기 
		
		// 2. 인증 
		//Session session = Session.getDefaultInstance( properties , new Authenticator() { } );
		Session session = Session.getDefaultInstance( properties , new Authenticator(){ 
			
			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(fromemail, frompassword);
			}
			
		} );
		
		// 3. 메일보내기 
		try {
			MimeMessage message = new MimeMessage( session ); // 메시지에 인증 처리 
			message.setFrom( new InternetAddress( fromemail )); // 보내는사람 // 예외발생 무조건 발생 
			message.addRecipient( Message.RecipientType.TO , new InternetAddress(toemail ) );
			
			message.setSubject(title); // 메일 제목 
			message.setText(contents); // 메일 내용
			
			Transport.send(message); // 메일전송
			
			System.out.println("[[[메일전송 완료 ]]] : " + toemail );
			
		}
		catch (Exception e) {
			System.out.println("[[[메일전송 실패 ]]] : " + toemail );
		}
			
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
