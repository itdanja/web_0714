package Controller;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

import Dao.ProductDao;
import Domain.ProductDto;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.stage.FileChooser.ExtensionFilter;

public class ProductupdateController implements Initializable {
	
	private ProductDto productdto = null;
	private int pactivation = 0;
	private Stage filestage ;
	private String pimage = null;
	
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		productdto = ProductpageController.getinstance().productdto;
		pactivation = productdto.getPactivation();
		pimage = productdto.getPimage();
		
		txtpname.setText( productdto.getPname() );
		txtpcontents.setText( productdto.getPcontents() );
		txtpprice.setText( productdto.getPprice() +"" );
		txtpstock.setText( productdto.getPstock() +"" );
		
		// 카테고리 
		if( productdto.getPcategory().equals("상의") ) { opt_1.setSelected(true);}
		if( productdto.getPcategory().equals("하의") ) { opt_2.setSelected(true);}
		if( productdto.getPcategory().equals("신발") ) { opt_3.setSelected(true);}
		if( productdto.getPcategory().equals("가방") ) { opt_4.setSelected(true);}
		if( productdto.getPcategory().equals("ACC") ) { opt_5.setSelected(true);}
		
		// 사진 
		lblpath.setText( pimage );
		Image image = new Image(productdto.getPimage() );
		uploadimg.setImage( image );
		
		// 제품상태
		if( productdto.getPactivation() == 0 ) btnactivation.setText("준비중");
		if( productdto.getPactivation() == 1 ) btnactivation.setText("판매중");
		if( productdto.getPactivation() == 2 ) btnactivation.setText("매진");
	}
	
    @FXML
    void activation(ActionEvent event) {
    	if( pactivation == 0 ) {btnactivation.setText("판매중"); pactivation = 1;}
    	else if( pactivation == 1 ) {btnactivation.setText("준비중"); pactivation = 0;}
    }
   
    @FXML
    void productupdate(ActionEvent event) {

    	productdto.setPname( txtpname.getText() ) ;
    	productdto.setPcontents(txtpcontents.getText());
    	productdto.setPprice( Integer.parseInt( txtpprice.getText() ));
    	productdto.setPstock( Integer.parseInt( txtpstock.getText() )) ;

    	// 라디오버튼 선택했을때 값 변경 

    	if( opt_1.isSelected() ) { productdto.setPcategory("상의"); }
    	if( opt_2.isSelected() ) { productdto.setPcategory("하의");  }
    	if( opt_3.isSelected() ) { productdto.setPcategory("신발");  }
    	if( opt_4.isSelected() ) { productdto.setPcategory("가방"); }
    	if( opt_5.isSelected() ) { productdto.setPcategory("ACC"); }	
    	
    	productdto.setPimage(pimage);
    	productdto.setPactivation(pactivation);
    	
    	//dao
    	ProductDao productDao = ProductDao.getprocutdao();
    	boolean reulst =  productDao.productupdate(productdto);
    	
    	if( reulst ) {
    		MainpageController.getinstance().loadpage("productpage");
    	}else {
    		
    	}
    	
    }

    
    @FXML
    void upload(ActionEvent event) { // 업로드 버튼 눌렀을때 
    	
    	// 파일 선택 클래스 [ 선택된 이미지의 경로를 DB 저장 ] 
    	FileChooser fileChooser = new FileChooser();
    	
    	fileChooser.getExtensionFilters().addAll( 
    			new ExtensionFilter("그림파일 : Image File" , "*.png","*.jpg","*.gif") );
    								// 선택할 파일의 확장자 
    		// import javafx.stage.FileChooser.ExtensionFilter;
    	
    	// 선택한 파일을 파일클래스 객체에 넣기 
    	File file = fileChooser.showOpenDialog(filestage);
    	
    	if( file !=null ) { // 사진이 선택 되었으면 
    		lblpath.setText("파일 경로 : " + file.getPath() ); // 해당 파일의 경로
    		// 이미지뷰에 이미지 넣기 
    			//System.out.println( file.getPath());
    			//System.out.println( file.toURI().toString() );
    		pimage = file.toURI().toString(); // 파일의 경로 변경 [ \ -> / ]
    				// 화면 표시되는 파일의 경로 구분 : \ 
    				// 파일의 경로 작성시 : /
    		Image image = new Image( pimage );
    		uploadimg.setImage(image);
    	}
    }


	

    @FXML
    private Button btnproductupdate;

    @FXML
    private Button btnproductcancel;

    @FXML
    private ImageView uploadimg;

    @FXML
    private TextField txtpname;

    @FXML
    private TextArea txtpcontents;

    @FXML
    private TextField txtpprice;

    @FXML
    private TextField txtpstock;

    @FXML
    private RadioButton opt_1;

    @FXML
    private ToggleGroup category;

    @FXML
    private RadioButton opt_2;

    @FXML
    private RadioButton opt_3;

    @FXML
    private RadioButton opt_4;

    @FXML
    private RadioButton opt_5;

    @FXML
    private Button btnupload;

    @FXML
    private Label lblpath;

    @FXML
    private Button btnactivation;


    @FXML
    void productcancel(ActionEvent event) {

    }

}
