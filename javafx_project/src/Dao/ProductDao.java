package Dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class ProductDao {
				// db 접근 객체 
	
	Connection connection ; // 클래스와 인터페이스[추상메소드] 차이~~~~~~
	
	private static ProductDao productDao = new ProductDao();
	
	public static ProductDao getprocutdao() {
		return productDao;
	}
	
	public ProductDao() {
		try {
		// DB 접근 
			// 1. 드라이버 호출 
			Class.forName("com.mysql.cj.jdbc.Driver");
			// 2. DB의 URL 연결 
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3307/javafx_2?serverTime=UTC","root","1234" );
		}catch (Exception e) { System.out.println("해당 드라이버가 없습니다");}
	}
	
	// 제품 등록 메소드 
	
	// 제품 목록 호출 메소드 
	
	// 제품 개별 호출 메소드 
	
	// 제품 수정 메소드 
	
	// 제품 삭제 메소드 
	
	
	
}
