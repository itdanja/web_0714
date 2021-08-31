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
		
		// 열[필드/컬럼]
		TableColumn tc = tableview.getColumns().get(0);
		tc.setCellValueFactory( new PropertyValueFactory<>("pno") ); // 첫번째 필드에 연결할 필드명
		
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
		
		tableview.setItems(productDtos); // 테이블에 리스트 연결 
		
		// 테이블에 행을 클릭했을때
		tableview.setOnMouseClicked( ( event ) -> {
			
			if( event.getButton().equals( MouseButton.PRIMARY ) ) {
				
				ProductDto productdto = tableview.getSelectionModel().getSelectedItem();
				
				// 클릭한 아이템의 이미지 
				Image image = new Image(productdto.getPimage());
				productimg.setImage( image );
				// 클릭한 아잍템의 제목 / 설명 / 상태 출력
				lblproductname.setText( productdto.getPname() );
				lblproductcontents.setText( "제품 설명 : "+ productdto.getPcontents() );
				
				if( productdto.getPactivation() == 0	) { lblproductactivation.setText( "제품 상태 : "+"판매준비중" ); }
				if( productdto.getPactivation() == 1	) { lblproductactivation.setText( "제품 상태 : "+"판매중" ); }
				if( productdto.getPactivation() == 2	) { lblproductactivation.setText( "제품 상태 : "+"품절" ); }
				
			
			}
			
			
		});
		
	}
	
	
	@FXML
    private TableView<ProductDto> tableview; // fx테이블 연결하는 리스트 인터페이스 => ObservableList

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
