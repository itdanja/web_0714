package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class BoardDao {
	
	// 1. Connection 인터페이스 
	Connection connection;
	// 2. ResultSet 인터페이스  
	ResultSet resultSet;	
	// 3. 현재 클래스의 DB객체 
	private static BoardDao boardDao = new BoardDao(); // DB 와 연결 객체 
	// 4. DB객체 호출 
	public static BoardDao getboarddao() {
		return boardDao;
	}
	public BoardDao() {
		try {
			// 1. mysql 드라이버 가져오기 
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3307/javafx_2?serverTime=UTC","root","1234");
			System.out.println("board db 연동 ");
		}
		catch (Exception e) {}
	}

		// CRUD : 쓰기읽기수정삭제 [ insert select update , delete ] 
		
	// 1. 글쓰기 메소드 
	// 2. 글목록[ 모든 글 호출 ] 메소드 
	// 3. 글상세[ 특정 글 호출 ] 메소드 
	// 4. 글수정[ 특정 글 수정 ] 메소드 
	// 5. 글삭제[ 특정 글 삭제 ] 메소드 
	// 6. 조회수증가 메소드 
	
}
