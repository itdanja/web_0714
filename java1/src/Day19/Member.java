package Day19;

public class Member {
	
	// 필드 [ 회원번호 ,  아이디 , 비밀번호 , 성명 , 이메일 , 포인트 ]
	private int no;
	private String id;
	private String password;
	private String name;
	private String email;
	private int point;
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
			System.out.println("[[[ 아이디(4~10일자이내) : ");	String id = Consoleprogram.scanner.next();
			System.out.println("[[[ 비밀번호 : ");				String passowrd = Consoleprogram.scanner.next();
			System.out.println("[[[ 비밀번호 확인 : ");			String passowrdfirm = Consoleprogram.scanner.next();
			System.out.println("[[[ 성명 : ");				String name = Consoleprogram.scanner.next();
			System.out.println("[[[ 이메일(email형식) : ");		String email = Consoleprogram.scanner.next();
		
			// 유효성검사 
				// 1.중복체크 
				// 2.비밀번호 확인
				if(  !passowrd.equals(passowrdfirm) ) { System.out.println("[[알림 : 가입실패]] : 비밀번호가 일치하지 않습니다 "); return;}
				// 3.아이디는 10글자이내 // 비밀번호 5글자 //  성명 10글자이내
				if( id.length() < 3 || id.length() > 11 ) {System.out.println("[[알림 : 가입실패]] : 아이디 4~10글자 이내만 가능합니다 ");return;}
				if( passowrd.length() != 5 ) {System.out.println("[[알림 : 가입실패]] : 비밀번호 5글자만 가능합니다 ");return;}
				if( name.length() < 1 || id.length() > 11 ) {System.out.println("[[알림 : 가입실패]] : 이름은 2~10글자 이내만 가능합니다 ");return;}
				// 4.이메일형식
				if( !email.contains("@") ) {System.out.println("[[알림 : 가입실패]] : 이메일에 @ 포함하여 입력해주세요 ");return;}
				
			// 회원가입 성공 : 객체 => 리스트 => 파일처리 
				int totalno = 0; // 전체 회원수 [ 회원탈퇴시에 누적 ] 
					
				Member member = new Member( totalno+1 , id, passowrd, name, email, 0); // 객체 
				Consoleprogram.memberlist.add(member);//리스트담기
			// 파일처리
			try {
				FileUtil.filesave(0, member.getNo() );
				FileUtil.filesave(1 , 0);
			}catch (Exception e) {
				System.out.println("[[파일처리 오류 ]] : 관리자에게 문의 ");
			}
			System.out.println("[[ 회원가입 성공 ]] : 가입해주셔서 감사합니다");
		}
		// 2. 로그인
		// 3. 아이디찾기 
		// 4. 비밀번호찾기 
		// 5. 메일전송
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
