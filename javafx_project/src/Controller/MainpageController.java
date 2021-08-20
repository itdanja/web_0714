package Controller;

import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MainpageController implements Initializable  {
	
	// ���� Ŭ����[��Ʈ�ѷ�]�� ��ü 
	private static MainpageController instance;
	
	public MainpageController() {
		instance = this;
	}
	
	public static MainpageController getinstance() {
		return instance;
	}

	private String loginid;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
	
		loginid = LoginController.getinstance().getloginid();
		// �α��� ��Ʈ�ѿ��� �α��ε� ���̵� �������� 
		lblloginid.setText( loginid );
		
	}

	// fx:id �������� 
    @FXML
    private BorderPane boarderpane;

    @FXML
    private AnchorPane cp;

    @FXML
    private AnchorPane lp;

    @FXML
    private Label lblloginid;

    @FXML
    private Button btnlogout;

    @FXML
    private Label btncommunty;

    @FXML
    private Label btninfo;

    @FXML
    private Label btnproduct;

    @FXML
    private Label btnchatting;


    @FXML
    void logout(ActionEvent event) throws Exception { // �α׾ƿ� Ŭ�������� 
    	
    	// 0. �޽����� ���� [ Ȯ�� / ��� ] 
    	Alert alert = new Alert(AlertType.CONFIRMATION );
    	alert.setContentText(" �α׾ƿ� �Ͻðڽ��ϱ�?" );
    	alert.setHeaderText("�α׾ƿ�");
    	
    		// �ش� �޽������� ������ ��ư �������� 
    		Optional<ButtonType> optional = alert.showAndWait();
    			// null ������ ��� ��ü �� ���� 
    		
    		if( optional.get() == ButtonType.OK ) { // Ȯ�� ��ư�� �������� 
    			//1. ���� �������� �ݱ� [ ������Ʈ�Ѹ�.getScene().getWindow().hide();
    	    	btnlogout.getScene().getWindow().hide();
    	    	//2. �α��� �������� ���� 
	    	    	Stage stage = new Stage();
	    			// 2. fxml ���� ��üȭ									// ���� Ŭ������ ��Ű���� �ٸ��� ������ [ ��� ���� ] 
	    			Parent parent = FXMLLoader.load(getClass().getResource("/FXML/login.fxml"));
	    			// 3. �� ���� fxml���� �ֱ� 
	    			Scene scene = new Scene(parent);
	    			// 4. ���������� �� �ֱ� 
	    			stage.setScene(scene);
	    			// 5. �������� ���� �� ���� 
	    			stage.setResizable(false); // �������� ũ�⺯��Ұ� 
	    			stage.setTitle("adidas sports"); // �������� Ÿ��Ʋ 
	    			// �������� ������ 
	    				// 1.�̹��� �ҷ����� 
	    				Image image = new Image("file:C:/Users/User/Desktop/H/web0714/javafx_project/src/FXML/icon.jpg");
	    				stage.getIcons().add(image);
	    			stage.show();
    	    	
    		}
    }

    @FXML
    void product(MouseEvent event) {
    		loadpage("productpage");
    }
    
    @FXML
    void chatting(MouseEvent event) {
    		loadpage("chattingpage");
    }

    @FXML
    void communty(MouseEvent event) {
    		loadpage("communtypage");
    }

    @FXML
    void info(MouseEvent event) {
    		loadpage("infopage");
    }
	
    ////////////// ������ ��ȯ �޼ҵ�[ cp�� ǥ���� fxml ��ȯ ] //////////////
    public void loadpage( String page ) {
    	
    	try {
    		Parent parent = FXMLLoader.load(getClass().getResource("/FXML/"+page+".fxml"));
    		boarderpane.setCenter(parent);
    	}
    	catch (Exception e) {}
    	
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
