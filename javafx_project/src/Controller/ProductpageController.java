package Controller;

import java.net.URL;
import java.util.ResourceBundle;

import Dao.ProductDao;
import Domain.ProductDto;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseButton;

public class ProductpageController implements Initializable {
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
	
		ProductDao productDao = ProductDao.getprocutdao();
		
		ObservableList<ProductDto> productDtos = productDao.productlist();
		
		// ��[�ʵ�/�÷�]
		TableColumn tc = tableview.getColumns().get(0);
		tc.setCellValueFactory( new PropertyValueFactory<>("pno") ); // ù��° �ʵ忡 ������ �ʵ��
		
		tc = tableview.getColumns().get(1);
		tc.setCellValueFactory( new PropertyValueFactory<>("pname") );
		
		tc = tableview.getColumns().get(2);
		tc.setCellValueFactory( new PropertyValueFactory<>("pcategory") );
		
		tc = tableview.getColumns().get(3);
		tc.setCellValueFactory( new PropertyValueFactory<>("pprice") );
		
		tc = tableview.getColumns().get(4);
		tc.setCellValueFactory( new PropertyValueFactory<>("pstock") );
		
		tc = tableview.getColumns().get(5);
		tc.setCellValueFactory( new PropertyValueFactory<>("pquantity") );
		
		tableview.setItems(productDtos); // ���̺� ����Ʈ ���� 
		
		// ���̺� ���� Ŭ��������
		tableview.setOnMouseClicked( ( event ) -> {
			
			if( event.getButton().equals( MouseButton.PRIMARY ) ) {
				
				ProductDto productdto = tableview.getSelectionModel().getSelectedItem();
				
				// Ŭ���� �������� �̹��� 
				Image image = new Image(productdto.getPimage());
				productimg.setImage( image );
				// Ŭ���� �Ɵ����� ���� / ���� / ���� ���
				lblproductname.setText( productdto.getPname() );
				lblproductcontents.setText( "��ǰ ���� : "+ productdto.getPcontents() );
				
				if( productdto.getPactivation() == 0	) { lblproductactivation.setText( "��ǰ ���� : "+"�Ǹ��غ���" ); }
				if( productdto.getPactivation() == 1	) { lblproductactivation.setText( "��ǰ ���� : "+"�Ǹ���" ); }
				if( productdto.getPactivation() == 2	) { lblproductactivation.setText( "��ǰ ���� : "+"ǰ��" ); }
				
			
			}
			
			
		});
		
	}
	
	
	@FXML
    private TableView<ProductDto> tableview; // fx���̺� �����ϴ� ����Ʈ �������̽� => ObservableList

    @FXML
    private Button btnproductadd;

    @FXML
    private Button btnproductsum;

    @FXML
    private ImageView productimg;

    @FXML
    private Label lblproductcontents;

    @FXML
    private Label lblproductactivation;

    @FXML
    private Label lblproductname;

    @FXML
    void productadd(ActionEvent event) {
    	MainpageController.getinstance().loadpage("productaddpage");
    }

    @FXML
    void productsum(ActionEvent event) {

    }
	
    
    
    
    
    
    
    
    
    
    
    
    
	
}
