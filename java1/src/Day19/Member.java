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
	
	// 필드 [ 회원번호 ,  아이디 , 비밀번호 , 성명 , 이메일 , 포인트 ]
	private int no;
	private String id;
	private String password;
	private String name;
	private String email;
	private int point;
	// 전체 회원수 
	static int totalno = 0;
		// private : 현재 클래스내에서만 호출 가능
	// 생성자 => new 생성자()
		// 1. 빈생성자   2.풀생성자 
	public Member() {}
	
	public Member(int no, String id, String password, String name, String email, int point) {
		this.no = no;
		this.id = id;
		this.password = password;
		this.name = name;
		this.email = email;
		this.point = point;
	}
	// 메소드 
		// 1. 회원가입 [ 입력받기 => 필드저장 => 객체 => 리스트 담기 ]
		public void signup() {
			System.out.print("[[[ 아이디(4~10일자이내) : ");	String id = Consoleprogram.scanner.next();
			System.out.print("[[[ 비밀번호 : ");				String passowrd = Consoleprogram.scanner.next();
			System.out.print("[[[ 비밀번호 확인 : ");			String passowrdfirm = Consoleprogram.scanner.next();
			System.out.print("[[[ 성명 : ");				String name = Consoleprogram.scanner.next();
			System.out.print("[[[ 이메일(email형식) : ");		String email = Consoleprogram.scanner.next();
		
			// 유효성검사 
				// 1.중복체크 [ 입력한 아이디가 회원목록 리스트에 존재하면 X ] 
				for( Member temp : Consoleprogram.memberlist ) {
					if( temp.id.equals(id) ) {System.out.println("[[알림 : 가입실패]] : 동일한 아이디가 존재합니다. "); return;}
				}
				// 2.비밀번호 확인
				if(  !passowrd.equals(passowrdfirm) ) { System.out.println("[[알림 : 가입실패]] : 비밀번호가 일치하지 않습니다 "); return;}
				// 3.아이디는 10글자이내 // 비밀번호 5글자 //  성명 10글자이내
				if( id.length() < 3 || id.length() > 11 ) {System.out.println("[[알림 : 가입실패]] : 아이디 4~10글자 이내만 가능합니다 ");return;}
				if( passowrd.length() != 5 ) {System.out.println("[[알림 : 가입실패]] : 비밀번호 5글자만 가능합니다 ");return;}
				if( name.length() < 1 || id.length() > 11 ) {System.out.println("[[알림 : 가입실패]] : 이름은 2~10글자 이내만 가능합니다 ");return;}
				// 4.이메일형식
				if( !email.contains("@") ) {System.out.println("[[알림 : 가입실패]] : 이메일에 @ 포함하여 입력해주세요 ");return;}
			
			// 파일처리
			try {	
				// 회원가입 성공 : 객체 => 리스트 => 파일처리 
				FileUtil.fileload(0);
					Member member = new Member( totalno+1 , id, passowrd, name, email, 0); // 객체 
					Consoleprogram.memberlist.add(member);//리스트담기
			
				FileUtil.filesave(0, member.getNo() );
				
				FileUtil.filesave(1 , 0);
				
			}catch (Exception e) {
				System.out.println("[[파일처리 오류 ]] : 관리자에게 문의 ");
			}
			System.out.println("[[ 회원가입 성공 ]] : 가입해주셔서 감사합니다");
		}
		// 2. 로그인
		public Member login() {
			
			System.out.print("[[[ 아이디 : ");	String id = Consoleprogram.scanner.next();
			System.out.print("[[[ 비밀번호 : ");	String passowrd = Consoleprogram.scanner.next();
			
			for( Member member : Consoleprogram.memberlist ) {
				if( member.id.equals(id) && member.password.equals(passowrd) ) {
					System.out.println(" [[ 안녕하세요 " + member.name +"님 ]]]");
					// 로그인 성공시 다른 페이지[게시판클래스]에서 로그인된 정보로 활동을 하기위해 성공한 객체 반환하기 
					return member;  // 반환타입 : 로그인된 회원정보 객체 전달
				}
			}
			System.out.println("[[[ 동일한 회원정보가 없습니다 ]]] ");
			return null; // 로그인 실패시 null
		}
		// 3. 아이디찾기 [ 이름 과 이메일 동일한경우 => 아이디 출력 ] 
		public void findid() {
			System.out.print("[[[ 이름 : ");		String name = Consoleprogram.scanner.next();
			System.out.print("[[[ 이메일 : ");	String email = Consoleprogram.scanner.next();
			
			for( Member member : Consoleprogram.memberlist ) {
				if( member.name.equals(name) && member.email.equals(email) ) {
					System.out.println(" [[ 회원님의 아이디 : " +  member.id);
					return;
				}
			}
			System.out.println("[[[ 동일한 회원정보가 없습니다 ]]] ");
		}
		// 4. 비밀번호찾기 [ 아이디와 이메일 동일한경우 => 비밀번호 : 메일 전송 ]
		public void findpassword() {
			System.out.print("[[[ 아이디 : ");		String id = Consoleprogram.scanner.next();
			System.out.print("[[[ 이메일 : ");		String email = Consoleprogram.scanner.next();
			
			for( Member member : Consoleprogram.memberlist ) {
				if( member.id.equals(id) && member.email.equals(email) ) {
					System.out.println(" [[ 회원님의 이메일로 비밀번호를 전송했습니다 ]]");
					sendemail( member.email , 1 , member.password ); // type = 1  비밀번호찾기 메일전송
					return;
				}
			}
			System.out.println("[[[ 동일한 회원정보가 없습니다 ]]] ");
		}
		// 5. 메일전송
		public void sendemail(  String toemail , int type , String contents ) {
			
			// 1. API 다운로드  [ activation.jar , mail.jar ]
			// 2. 라이브러리 추가  [ javase11 => module-info ]
			// 0.설정
			String fromemail="보내는사람이메일@naver.com";
			String frompassword = "패스워드";
			// 설정관련 map( 키 , 값 )  컬렉션 
			Properties properties = new Properties();
			properties.put("mail.smtp.host", "smtp.naver.com");
			properties.put("mail.smtp.port", 587 );
			properties.put("mail.smtp.auth", true );
			// 1. 인증 
			Session session = Session.getDefaultInstance( properties , new Authenticator() {
				@Override // 패스워드 인증 메소드 => 재정의
				protected PasswordAuthentication getPasswordAuthentication() {
					// TODO Auto-generated method stub
					return new PasswordAuthentication(fromemail, frompassword);
				}
			});
			// 2. 메일보내기 
			try {
				MimeMessage message = new MimeMessage(session);
				message.setFrom( new InternetAddress( fromemail) ); // 무조건 예외처리 발생
				message.addRecipient(Message.RecipientType.TO ,  new InternetAddress(toemail));
				
				if( type == 1 ) {
					message.setSubject(" java console 커뮤니티 " );
					message.setText(" 회원님의 비밀번호 : "+ contents);
				}
				Transport.send(message);
			}catch (Exception e) { System.out.println("[[ 메일전송 실패 ]] : 관리자에게 문의 "); }
		}
		
	// 메소드 [ get , set 메소드 ]
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
