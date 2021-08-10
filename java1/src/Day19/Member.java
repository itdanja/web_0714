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
		// 1. 회원가입
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
