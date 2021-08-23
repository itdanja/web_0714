package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import Domain.Member;

public class MemberDao {
				// Dao : �����ͺ��̽� ���� ��ü
	
	// JDBC �ֿ� �������̽� 
		// 1. connection :  DB���� �������̽�
		// 2. PreparedStatement : DB������ SQL ���� / ���� �������̽�  
		// 3. resultSet : ���� ���� �������̽� 
	
	// �ʵ� 
	private Connection connection; // DB�����������̽� ����
	
	private ResultSet resultSet; // �˻��� ���[ SQL������ ��� = ���� ] ���� 
	
	// dao ��ü 
	private static MemberDao memberDao = new MemberDao(); // ���� Ŭ������ ��ü  
	
	// dao ��ü ��ȯ �޼ҵ� 
	public static MemberDao getMemberDao() {
		return memberDao;
	}
	
	// ������ 
	public MemberDao() {
		try {
			// 1. �ش� ����̺� �������� 
			Class.forName("com.mysql.cj.jdbc.Driver");
			// 2. DB URL ����
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3307/javafx_2?serverTime=UTC" , "root" , "1234");
			
			System.out.println(" DB ���� ���� ");
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}

	// 1. ȸ������ �޼ҵ� [ �μ� : ȸ���������� ] 
	public boolean signup( Member member) {
		
		//1. SQL �ۼ� 
		String sql = "insert into member( m_id , m_password , m_name , m_email , m_phone , m_point ) values(?,?,?,?,?,?)";
		
		try {
			//2. SQL <--> DB ���� [ PreparedStatement : SQL ���� ���� ] 
			PreparedStatement preparedStatement = connection.prepareStatement(sql); // ����ó�� ������ ó�� 
			
			//3. SQL ���� [ ? �� �� �ֱ� ]
			preparedStatement.setString(1, member.getId() ); // ù��° ? �� ���̵� �ֱ� 
			preparedStatement.setString(2, member.getPassword()); // �ι�° ? �� �н����� �ֱ� 
			preparedStatement.setString(3, member.getName() );// ����° ?
			preparedStatement.setString(4, member.getEmail() ); // �׹�° ?
			preparedStatement.setString(5, member.getPhone()); // �ټ���° ? 
			preparedStatement.setInt(6, member.getPoint() ); // ������° ? 		
			//4. SQL ���� 
			preparedStatement.executeUpdate();
			//5. SQL ���
			return true; // ȸ������ ����
		}
		catch (Exception e) {}

		return false; // ȸ������ ���н� false ��ȯ  db ���� 
		
	}
	// 2. �α��� �޼ҵ� 
	public boolean login( String id , String password ) {
		
		// 1.SQL�ۼ�
		String sql = "select * from member where m_id =? and m_password =?";
		
		try {
			// 2. 
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			// 3. 
			preparedStatement.setString(1, id);
			preparedStatement.setString(2, password);
			// 4. ���� 
			resultSet =  preparedStatement.executeQuery();
			// 5. ��� [ resultset �ʱⰪ�� null -> ���1���ڵ� -> ���2���ڵ� -> ���3���ڵ�
			if( resultSet.next() ) {
				// sql ����� �����ϸ� 
				return true; // �����ϴ� ȸ��
			}
			return false; // �������� �ʴ� ȸ��
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		return false; // �α��� ���� Ȥ�� db ���� 
	}
	// 3. ���̵�ã�� �޼ҵ� 
	
	// 4. ��й�ȣ ã�� �޼ҵ� 
	
	// 5. ȸ�� ���� �޼ҵ� 
	
	// 6. ȸ�� Ż�� �޼ҵ� 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
