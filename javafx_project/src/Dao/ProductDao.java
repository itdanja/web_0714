package Dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class ProductDao {
				// db ���� ��ü 
	
	Connection connection ; // Ŭ������ �������̽�[�߻�޼ҵ�] ����~~~~~~
	
	private static ProductDao productDao = new ProductDao();
	
	public static ProductDao getprocutdao() {
		return productDao;
	}
	
	public ProductDao() {
		try {
		// DB ���� 
			// 1. ����̹� ȣ�� 
			Class.forName("com.mysql.cj.jdbc.Driver");
			// 2. DB�� URL ���� 
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3307/javafx_2?serverTime=UTC","root","1234" );
		}catch (Exception e) { System.out.println("�ش� ����̹��� �����ϴ�");}
	}
	
	// ��ǰ ��� �޼ҵ� 
	
	// ��ǰ ��� ȣ�� �޼ҵ� 
	
	// ��ǰ ���� ȣ�� �޼ҵ� 
	
	// ��ǰ ���� �޼ҵ� 
	
	// ��ǰ ���� �޼ҵ� 
	
	
	
}
