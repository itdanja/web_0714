package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import Domain.ProductDto;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class ProductDao {
				// db ���� ��ü 
	
	Connection connection ; // Ŭ������ �������̽�[�߻�޼ҵ�] ����~~~~~~
	ResultSet resultSet;
	
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
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/javafx_2?serverTimezone=UTC","root","1234" );
		}catch (Exception e) { System.out.println("�ش� ����̹��� �����ϴ�");}
	}
	
	// ��ǰ ��� �޼ҵ� 
	public boolean productadd( ProductDto productDto ) {
		String sql ="insert into product(pname,pimage,pcontents,pcategory,pprice,pstock,pactivation) values(?,?,?,?,?,?,?)";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, productDto.getPname() );
			preparedStatement.setString(2, productDto.getPimage() );
			preparedStatement.setString(3, productDto.getPcontents() );
			preparedStatement.setString(4, productDto.getPcategory() );
			preparedStatement.setInt(5, productDto.getPprice() );
			preparedStatement.setInt(6, productDto.getPstock() );
			preparedStatement.setInt(7, productDto.getPactivation() );
			preparedStatement.executeUpdate();
			return true; // ����
		}catch (Exception e) {}
		return false; // ���� 
	}
	// ��ǰ ��� ȣ�� �޼ҵ� 
	public ObservableList<ProductDto> productlist(){
		ObservableList< ProductDto > productDtos = FXCollections.observableArrayList();
		String sql = "select * from product";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				ProductDto productDto = new ProductDto(
						resultSet.getInt(1), 
						resultSet.getString(2),
						resultSet.getString(3), 
						resultSet.getString(4),
						resultSet.getString(5), 
						resultSet.getInt(6), 
						resultSet.getInt(7), 
						resultSet.getInt(8),
						resultSet.getInt(9));
				productDtos.add(productDto);
			}
			return productDtos;
		}catch (Exception e) {}
		return null;
	}
	// ��ǰ ���� ȣ�� �޼ҵ� 

	// ��ǰ ���� �޼ҵ� 
	public boolean productupdate(ProductDto productDto) {
		
		String sql = "update product set pname=? , pimage=?,pcontents=?,pcategory=?,pprice=?,pstock=?,pactivation=? where pno = ?";
		
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, productDto.getPname());
			preparedStatement.setString(2, productDto.getPimage());
			preparedStatement.setString(3, productDto.getPcontents());
			preparedStatement.setString(4, productDto.getPcategory());
			preparedStatement.setInt(5, productDto.getPprice());
			preparedStatement.setInt(6, productDto.getPstock());
			preparedStatement.setInt(7, productDto.getPactivation());
			preparedStatement.setInt(8, productDto.getPno() );
			
			preparedStatement.executeUpdate();
			return true;	
			
		}catch (Exception e) {}
		return false;
	}
	
	
	// ��ǰ ���� �޼ҵ� 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
