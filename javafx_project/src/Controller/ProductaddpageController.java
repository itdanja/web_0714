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
// ���� ���� ���� Ŭ���� �������� 
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
    	
    	// ������ư ���������� �� ���� 
    	if( opt_1.isSelected() ) { pcategory ="����"; }
    			// ���� 
    	if( opt_2.isSelected() ) { pcategory ="����"; }
    	if( opt_3.isSelected() ) { pcategory ="�Ź�"; }
    	if( opt_4.isSelected() ) { pcategory ="����"; }
    	if( opt_5.isSelected() ) { pcategory ="ACC"; }
    	
    	// ��ü ����� 
    	ProductDto productDto = new ProductDto(pname,pimage,pcontents,pcategory,pprice,pstock,0);
    	
    	// DB �ֱ� 
    	
    	
    }

    @FXML
    void productcancel(ActionEvent event) {

    }

    // ÷������ ȭ�� �������� 
    private Stage filestage;
    private String pimage;
    
    @FXML
    void upload(ActionEvent event) { // ���ε� ��ư �������� 
    	
    	// ���� ���� Ŭ���� [ ���õ� �̹����� ��θ� DB ���� ] 
    	FileChooser fileChooser = new FileChooser();
    	
    	fileChooser.getExtensionFilters().addAll( 
    			new ExtensionFilter("�׸����� : Image File" , "*.png","*.jpg","*.gif") );
    								// ������ ������ Ȯ���� 
    		// import javafx.stage.FileChooser.ExtensionFilter;
    	
    	// ������ ������ ����Ŭ���� ��ü�� �ֱ� 
    	File file = fileChooser.showOpenDialog(filestage);
    	
    	if( file !=null ) { // ������ ���� �Ǿ����� 
    		lblpath.setText("���� ��� : " + file.getPath() ); // �ش� ������ ���
    		// �̹����信 �̹��� �ֱ� 
    			//System.out.println( file.getPath());
    			//System.out.println( file.toURI().toString() );
    		pimage = file.toURI().toString(); // ������ ��� ���� [ \ -> / ]
    				// ȭ�� ǥ�õǴ� ������ ��� ���� : \ 
    				// ������ ��� �ۼ��� : /
    		Image image = new Image( pimage );
    		uploadimg.setImage(image);
    	}
    }
	
    
    
    
    
    
    
    
    
    
	
}
