package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import Domain.BoardDto;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

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
		
	// 1. �۾��� �޼ҵ� [ �μ� : BoardDto ( ȭ�鿡 �Է¹��� ���� ��Ʈ�ѿ��� dao�� �ѱ�� ) ]  
	public boolean boardwrite( BoardDto boardDto ) {
		
		//1. SQL �ۼ� => SQL <-- DB ���� => SQL ���� -> SQL ���� => SQL ��� 
		String sql = "insert into board( btitle , bcountents , bwriter ) values(?,?,?)";
		try {
		
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			// ? �� �����ϴ� �� �ֱ� 
			preparedStatement.setString( 1 , boardDto.getBtitle() );
			preparedStatement.setString( 2 , boardDto.getBcountents() );
			preparedStatement.setString( 3 , boardDto.getBwriter() );
			preparedStatement.executeUpdate(); // insert , update , delete
			return true;
			
		}catch (Exception e) {}
		return false; 
	}
	
	// 2. �۸��[ ��� �� ȣ�� ] �޼ҵ� 
	public ObservableList<BoardDto> boardlist(){
		
		ObservableList< BoardDto > boardDtos = FXCollections.observableArrayList();
		// 1. SQL �ۼ� 
		String sql = "select * from board";
		
		try {
			// 2. SQL ���� 
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			// 3. SQL ������ [ ���� = �˻� ��� ]
			// 3. ��� ���� 
			resultSet = preparedStatement.executeQuery();
			
			// ����� �ټ��ϰ�� �ݺ��� 
			while( resultSet.next() ) {
				// resultSet.next() : ���� ���ڵ�
				// 1. dto ��ü ����
				BoardDto boardDto = new BoardDto(resultSet.getInt(1) 
						, resultSet.getString(2), resultSet.getString(3)
						, resultSet.getString(4), resultSet.getString(5), resultSet.getInt(6));
						// resultSet.get�ڷ���( �ʵ������ȣ )
				
				// 2. dto ��ü�� ����Ʈ ����
				boardDtos.add(boardDto);
			} // �ݺ��� ���� 
			return boardDtos;
			
		}catch (Exception e) {}
		return null;
	}
	// 3. �ۻ�[ Ư�� �� ȣ�� ] �޼ҵ� 
	
	// 4. �ۼ���[ Ư�� �� ���� ] �޼ҵ� 
	// 5. �ۻ���[ Ư�� �� ���� ] �޼ҵ� 
	// 6. ��ȸ������ �޼ҵ� 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
