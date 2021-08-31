package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import Domain.Member;

public class MemberDao {
				// Dao : �����ͺ��̽� ���� ��ü
	
	// JDBC �ֿ� �������̽� 
		// 1. connection :  DB���� �������̽� [ DriverManager Ŭ���� ] 
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
			System.out.println(" DB ���� ����1 ");
			// 2. DB URL ����1
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/javafx_2?serverTimezone=UTC" , "root" , "1234");
			
			System.out.println(" DB ���� ����2 ");
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}

	// 1. ȸ������ �޼ҵ� [ �μ� : ȸ���������� ] 
	public boolean signup( Member member) {
		
		//1. SQL �ۼ� 
		String sql = "insert into member( m_id , m_password , m_name , m_email , m_phone , m_point ) values(?,?,?,?,?,?)";
					// "insert into member values(?,?,?,?,?,?)"; // ��� �ʵ忡 �� ���Խ� �ʵ�� ���� ���� 
		
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
	public String findid( String email , String name) {
		
		String sql = "select * from member where m_email =? and m_name=?";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, email);
			preparedStatement.setString(2, name);
			
			resultSet = preparedStatement.executeQuery(); // �˻� ��� => ����
			if( resultSet.next() ) {
				// ��� ���� [ resultset = null ] 
					// .next() : ���� ���ڵ� 
				return resultSet.getString(1); // .getString(�ʵ������ȣ)
			}
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		return null; // ������ ������ ���ų� DB ���� 
	}
	// 4. ��й�ȣ ã�� �޼ҵ� 
	public String findpassword( String id , String email) {
		
		String sql ="select * from member where m_id =? and m_email =?";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, id);
			preparedStatement.setString(2, email);
			
			resultSet =  preparedStatement.executeQuery();
			
			if( resultSet.next() ) {
				return resultSet.getString(2); // ������� ���ڵ忡�� 2��° �ʵ� �����ͼ� ��ȯ 
			}
		}catch (Exception e) {}
		return null; //
	}
	
	// 5. ȸ�� ���� ȣ�� �޼ҵ� [ ���̵� �ش��ϴ� ȸ�� ���� ȣ�� ]
	public Member getmember(String id) {
		
		String sql = "select * from member where m_id = ?";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, id);
			
			resultSet =  preparedStatement.executeQuery();
			
			if( resultSet.next() ) {
				// ������ �����ϸ� 
					// ȸ�� ��ü�� ���� ��ȯ�ϱ� 
				Member member = new Member( resultSet.getString(1) ,
						resultSet.getString(2) , resultSet.getString(3) ,
						resultSet.getString(4) , resultSet.getString(5) ,
						resultSet.getInt(6) ) ;
				return member; // �ش��ϴ� ���̵��� ������ ��ȯ 
			}
		}catch (Exception e) {}
		return null;
	}
	// 7. ȸ�� Ż�� �޼ҵ� [ ���̵� �ش��ϴ� ȸ�� ���ڵ� ���� ]
	public boolean memberdelete( String id ) {
		
		String sql = "delete from member where m_id =?";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, id);
			preparedStatement.executeUpdate();
			return true; // ���� ���� 
		}catch (Exception e) {}
		return false;// ���� 
	}
	
	// 6. ȸ�� ���� �޼ҵ� 
	public boolean memberupdate( Member member ) {
		
		String sql = "update member set m_password = ? , m_name=? , m_email=? , m_phone=? where m_id=? ";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, member.getPassword() );
			preparedStatement.setString(2, member.getName() );
			preparedStatement.setString(3, member.getEmail() );
			preparedStatement.setString(4, member.getPhone());
			preparedStatement.setString(5, member.getId() );
			
			preparedStatement.executeUpdate();
			return true;
			
		}catch (Exception e) {}
		return false;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
