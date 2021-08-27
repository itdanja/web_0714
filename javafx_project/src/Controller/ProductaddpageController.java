package Controller;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

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
// 파일 선택 관련 클래스 가져오기 
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.stage.Stage;

public class ProductaddpageController implements Initializable {

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
	
	// fx : id 
	@FXML
    private Button btnproductadd;

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
    void productadd(ActionEvent event) {
    	String pname = txtpname.getText();
    	String pcontents = txtpname.getText();
    	int pprice = Integer.parseInt( txtpname.getText() );
    	int pstock = Integer.parseInt( txtpname.getText() );
    	
    	String pcategory = "";
    	
    	// 라디오버튼 선택했을때 값 변경 
    	if( opt_1.isSelected() ) { pcategory ="상의"; }
    			// 선택 
    	if( opt_2.isSelected() ) { pcategory ="하의"; }
    	if( opt_3.isSelected() ) { pcategory ="신발"; }
    	if( opt_4.isSelected() ) { pcategory ="가방"; }
    	if( opt_5.isSelected() ) { pcategory ="ACC"; }
    	
    	// 객체 만들기 
    	ProductDto productDto = new ProductDto(pname,pimage,pcontents,pcategory,pprice,pstock,0);
    	
    	// DB 넣기 
    	
    	
    }

    @FXML
    void productcancel(ActionEvent event) {

    }

    // 첨부파일 화면 스테이지 
    private Stage filestage;
    private String pimage;
    
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
	
    
    
    
    
    
    
    
    
    
	
}
