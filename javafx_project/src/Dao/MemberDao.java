package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import Domain.Member;

public class MemberDao {
				// Dao : 데이터베이스 접근 객체 
	// 필드 
	private Connection connection; // DB연결인터페이스 선언
	
	// dao 객체 
	private static MemberDao memberDao = new MemberDao(); // 현재 클래스의 객체  
	
	// dao 객체 반환 메소드 
	public static MemberDao getMemberDao() {
		return memberDao;
	}
	
	// 생성자 
	public MemberDao() {
		try {
			// 1. 해당 드라이브 가져오기 
			Class.forName("com.mysql.cj.jdbc.Driver");
			// 2. DB URL 연결
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3307/javafx_2?serverTime=UTC" , "root" , "1234");
			
			System.out.println(" DB 연동 성공 ");
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}

	// 1. 회원가입 메소드 [ 인수 : 회원가입정보 ] 
	public boolean signup( Member member) {
		
		//1. SQL 작성 
		String sql = "insert into member( m_id , m_password , m_name , m_email , m_phone , m_point ) values(?,?,?,?,?,?)";
		
		try {
			//2. SQL <--> DB 연결 [ PreparedStatement : SQL 관리 조작 ] 
			PreparedStatement preparedStatement = connection.prepareStatement(sql); // 예외처리 무조건 처리 
			
			//3. SQL 조작 [ ? 에 값 넣기 ]
			preparedStatement.setString(1, member.getId() ); // 첫번째 ? 에 아이디 넣기 
			preparedStatement.setString(2, member.getPassword()); // 두번째 ? 에 패스워드 넣기 
			preparedStatement.setString(3, member.getName() );// 세번째 ?
			preparedStatement.setString(4, member.getEmail() ); // 네번째 ?
			preparedStatement.setString(5, member.getPhone()); // 다섯번째 ? 
			preparedStatement.setInt(6, member.getPoint() ); // 여섯번째 ? 		
			//4. SQL 실행 
			preparedStatement.executeUpdate();
			//5. SQL 결과
			return true; // 회원가입 성공
		}
		catch (Exception e) {}

		return false; // 회원가입 실패시 false 반환 
		
	}
	// 2. 로그인 메소드 
	
	// 3. 아이디찾기 메소드 
	
	// 4. 비밀번호 찾기 메소드 
	
	// 5. 회원 수정 메소드 
	
	// 6. 회원 탈퇴 메소드 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
