package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class BoardDao {
	
	// 1. Connection �������̽� 
	Connection connection;
	// 2. ResultSet �������̽�  
	ResultSet resultSet;	
	// 3. ���� Ŭ������ DB��ü 
	private static BoardDao boardDao = new BoardDao(); // DB �� ���� ��ü 
	// 4. DB��ü ȣ�� 
	public static BoardDao getboarddao() {
		return boardDao;
	}
	public BoardDao() {
		try {
			// 1. mysql ����̹� �������� 
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3307/javafx_2?serverTime=UTC","root","1234");
			System.out.println("board db ���� ");
		}
		catch (Exception e) {}
	}

		// CRUD : �����б�������� [ insert select update , delete ] 
		
	// 1. �۾��� �޼ҵ� 
	// 2. �۸��[ ��� �� ȣ�� ] �޼ҵ� 
	// 3. �ۻ�[ Ư�� �� ȣ�� ] �޼ҵ� 
	// 4. �ۼ���[ Ư�� �� ���� ] �޼ҵ� 
	// 5. �ۻ���[ Ư�� �� ���� ] �޼ҵ� 
	// 6. ��ȸ������ �޼ҵ� 
	
}
