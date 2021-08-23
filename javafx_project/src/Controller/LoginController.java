package Controller;

import java.net.URL;
import java.util.ResourceBundle;

import Dao.MemberDao;
import Domain.List;
import Domain.Member;
import javafx.animation.PauseTransition;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.util.Duration;

public class LoginController implements Initializable {	
							// Initializable : fxml ����� �ʱⰪ ���� �������̽� 
	
	// ���� Ŭ����[��Ʈ�ѷ�]�� ��ü 
	private static LoginController instance; // ����Ŭ������ ��ü 
	
	public LoginController() { // ����Ŭ������ �޸� �޾� ��ü �����ϴ� ������ 
		instance = this;
	}
	
	public static LoginController getinstance() { // ��ü�� ��ȯ���ִ� �޼ҵ� 
		return instance;
	}
	
	public String getloginid() { 		// �α��ν� �Էµ� ���̵� ��ȯ���ִ� �޼ҵ� 
		return txtid.getText();
	}
	
	@Override // �ʱ� �޼ҵ� ������  // fxml������ �������� �ʱ� �޼ҵ� 
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		lblconfirm.setText(""); // ��Ʈ�Ѹ�.setText() : �ش� ��Ʈ�ѿ� �ؽ�Ʈ ���� 
		imgloading.setVisible(false); // ��Ʈ��.setVisible() : �ش� ��Ʈ�� ǥ�� ���� 
		
	}
	
	// �������� ���� fx:id �������� 
	@FXML
    private TextField txtid;

    @FXML
    private PasswordField txtpassword;

    @FXML
    private Label btnlogin;

    @FXML
    private Label btnsignup;

    @FXML
    private Label btnfindpassword;

    @FXML
    private Label btnfindid;

    @FXML
    private Label lblconfirm;

    @FXML
    private ImageView imgloading;

    @FXML
    void findid(MouseEvent event) throws Exception {
    	Stage stage = new Stage();
    	Parent parent = FXMLLoader.load( getClass().getResource("/FXML/findid.fxml"));
    	Scene scene = new Scene(parent);
    	stage.setScene(scene);
    	stage.show();
    }

    @FXML
    void findpassword(MouseEvent event) throws Exception {
    	
    	Stage stage = new Stage();
    	Parent parent = FXMLLoader.load( getClass().getResource("/FXML/findpassword.fxml"));
    	Scene scene = new Scene(parent);
    	stage.setScene(scene);
    	stage.show();
    }

    @FXML
    void login(MouseEvent event) {	 // �α��� Ŭ���� 
    	
    	imgloading.setVisible(true); // �ε� �̹��� ǥ�� 
    	
    	if( txtid.getText().equals("") ) {
    		lblconfirm.setText(" - ���̵� �Է����ּ��� - ");
    		return;
    	}
    	if( txtpassword.getText().equals("") ) {
    		lblconfirm.setText(" - ��й�ȣ�� �Է����ּ��� - ");
    		return;
    	}
    	
    	// 2�ʰ� �Ͻ�����  [ PauseTransition : javafx ���� Ŭ���� 
    	PauseTransition pauseTransition = new PauseTransition(); // ��ü ���� 
    	pauseTransition.setDuration( Duration.seconds(2) );		// �Ͻ����� �ð� ���� 
    	//pauseTransition.setOnFinished( �μ� ->  {�����ڵ�} );
    		// �͸� �޼ҵ� [ ���ٽ� ] 
    			// �μ� -> {�����ڵ�} 
    	
    	pauseTransition.setOnFinished( �μ� ->  { 
    					// �Ͻ������� ������ ����Ǵ� �ڵ� 
    		imgloading.setVisible(false); // �ε� �̹��� ����� 
    		
    		// dbó�� 
    		MemberDao memberDao = MemberDao.getMemberDao();
    		boolean result =  memberDao.login( txtid.getText() , txtpassword.getText() );
    		
    		if( result ) {
    			// �α��� ���� 
    			Stage stage = new Stage();
        		try {
        			Parent parent = FXMLLoader.load(getClass().getResource("/FXML/mainpage.fxml"));
        			Scene scene = new Scene(parent);
        			stage.setScene(scene);
        			stage.setResizable(false); // �������� ũ�⺯��Ұ� 
        			stage.setTitle("adidas sports"); // �������� Ÿ��Ʋ 
        			// �������� ������ 
        				// 1.�̹��� �ҷ����� 
        				Image image = new Image("file:C:/Users/User/Desktop/H/web0714/javafx_project/src/FXML/icon.jpg");
        				stage.getIcons().add(image);
        			stage.show();
        			
        			
        		}
        		catch (Exception e) {}
        		// ���� �������� �ݱ� 
        		btnlogin.getScene().getWindow().hide();
        		return;
        		
    		}else {
    			// �α��� ����
    			lblconfirm.setText(" - �ùٸ� ȸ�������� �ƴմϴ� -");
    		}
    		
//			    		// [����ó��] �Է��� ������ ����Ʈ[ȸ�����]�� �����ϸ� 
//			    		for( Member member : List.members ) {
//				        	if( txtid.getText().equals( member.getId() ) &&
//				        			txtpassword.getText().equals( member.getPassword() ) ) {
//				        		lblconfirm.setText(" - �α��� ���� - ");
//				        		
//				        		// mainpage ���� 
//				        		Stage stage = new Stage();
//				        		try {
//				        			Parent parent = FXMLLoader.load(getClass().getResource("/FXML/mainpage.fxml"));
//				        			Scene scene = new Scene(parent);
//				        			stage.setScene(scene);
//				        			stage.setResizable(false); // �������� ũ�⺯��Ұ� 
//				        			stage.setTitle("adidas sports"); // �������� Ÿ��Ʋ 
//				        			// �������� ������ 
//				        				// 1.�̹��� �ҷ����� 
//				        				Image image = new Image("file:C:/Users/User/Desktop/H/web0714/javafx_project/src/FXML/icon.jpg");
//				        				stage.getIcons().add(image);
//				        			stage.show();
//				        			
//				        			
//				        		}
//				        		catch (Exception e) {}
//				        		
//				        		// ���� �������� �ݱ� 
//				        		btnlogin.getScene().getWindow().hide();
//				        		
//				        		return;
//				        	}
//			    		}
//        	lblconfirm.setText(" - �ùٸ� ȸ�������� �ƴմϴ� -");
    	} );
    	pauseTransition.play(); // ���� Ŭ���� ����
    }

    @FXML
    void signup(MouseEvent event) throws Exception { // ȸ������ �������� 
    								// throws : ���ܴ����� 
    	// 1. �������� ���� 
    	Stage stage = new Stage(); 
    	// 2. fxml �ҷ����� [ Parent Ŭ���� ]
    	Parent parent = FXMLLoader.load( getClass().getResource("/FXML/signup.fxml") ); // ������ ����
    	// 3. �� ���� [ ���� fxml �ֱ� ]
    	Scene scene = new Scene(parent);
    	// 4. �������� ���� [ ���������� �� �ֱ� ] 
    	stage.setScene(scene);
    	stage.show();
    	
    }	

    
    
    
    
    
    
    
    
    
    
    
    
    
    

}
