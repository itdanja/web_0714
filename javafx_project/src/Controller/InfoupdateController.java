package Controller;

import java.net.URL;
import java.util.ResourceBundle;

import Dao.FileUtil;
import Dao.MemberDao;
import Domain.List;
import Domain.Member;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class InfoupdateController implements Initializable {
	
	private String loginid;
	
	private Member member = null;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// 1.�α��ε� ���̵� ��������
		loginid = LoginController.getinstance().getloginid();
	
		// dbó�� 
		MemberDao memberDao = MemberDao.getMemberDao();
		 member = memberDao.getmember(loginid);
		
		txtname.setText( member.getName() );
		txtemail.setText( member.getEmail() );
		txtphone.setText( member.getPhone() );
		
		// 2. �α��ε� ȸ���� �̸�,�̸���,����ó ǥ��

//		for( Member member : List.members ) {
//			if( member.getId().equals(loginid) ) {
//				txtname.setText( member.getName() );
//				txtemail.setText( member.getEmail() );
//				txtphone.setText( member.getPhone() );
//			}
//		}
	}
	
    @FXML
    private Button btnupdate;

    @FXML
    private TextField txtname;

    @FXML
    private TextField txtemail;

    @FXML
    private TextField txtphone;

    @FXML
    private PasswordField txtpassword;

    @FXML
    private PasswordField txtnewpassword;

    @FXML
    void update(ActionEvent event) throws Exception {
    	
    	//1. ������й�ȣ�� �Է¹޾� �����Ѱ�쿡�� ���� 
    	String password = txtpassword.getText();
    	
    	if( !member.getPassword().equals(password) ) {
			Alert alert = new Alert( AlertType.ERROR );
			alert.setContentText("���� ��й�ȣ�� ��ġ���� �ʽ��ϴ�" );
			alert.setHeaderText("���� ����");
			alert.showAndWait();
			return;
		}
    	// 2. ������й�ȣ�� ������ ��� ������Ʈ ó��
    		member.setName( txtname.getText() );
			member.setEmail( txtemail.getText() );
			member.setPhone( txtphone.getText() );
			// 2. ���ο� ��й�ȣ�� ������� [ ���� ��й�ȣ ��� ] 
			if( !txtnewpassword.getText().equals("") ) {
				member.setPassword( txtnewpassword.getText() );
			}
			// db ������Ʈ ó�� 
			MemberDao memberDao = MemberDao.getMemberDao();
			boolean result =  memberDao.memberupdate(member);
			
			if( result ) {
				// ������Ʈ ������ 
				// ������Ʈ ���� �޽��� => �α׾ƿ�
				Alert alert = new Alert( AlertType.INFORMATION );
				alert.setContentText("ȸ�������� ���� �Ǿ����ϴ�. �α׾ƿ� ó���� �ٽ� �α��� ���ּ���" );
				alert.setHeaderText("ȸ������ ���� ����");
				alert.showAndWait();
				// ���� �������� �ݱ� 
				btnupdate.getScene().getWindow().hide();
				
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
				return;
				
			}
			
	
    	
    	
    	
//    	for( Member member : List.members ) {
//    		
//    		if( !member.getPassword().equals(password) ) {
//    			Alert alert = new Alert( AlertType.ERROR );
//    			alert.setContentText("���� ��й�ȣ�� ��ġ���� �ʽ��ϴ�" );
//    			alert.setHeaderText("���� ����");
//    			alert.showAndWait();
//    			return;
//    		}
//    	}
//    	// 2. ������й�ȣ�� ������ ��� ������Ʈ ó�� 
//    	for( Member member : List.members ) {
//    		
//    		if( member.getId().equals(loginid) ) {
//    			member.setName( txtname.getText() );
//    			member.setEmail( txtemail.getText() );
//    			member.setPhone( txtphone.getText() );
//    			// 2. ���ο� ��й�ȣ�� ������� [ ���� ��й�ȣ ��� ] 
//    			if( !txtnewpassword.getText().equals("") ) {
//    				member.setPassword( txtnewpassword.getText() );
//    			}
//    			// ����ó�� 
//    			FileUtil.filesave();
//    			// ������Ʈ ���� �޽��� => �α׾ƿ�
//    			Alert alert = new Alert( AlertType.INFORMATION );
//    			alert.setContentText("ȸ�������� ���� �Ǿ����ϴ�. �α׾ƿ� ó���� �ٽ� �α��� ���ּ���" );
//    			alert.setHeaderText("ȸ������ ���� ����");
//    			alert.showAndWait();
//    			// ���� �������� �ݱ� 
//    			btnupdate.getScene().getWindow().hide();
//    			
//    			//2. �α��� �������� ���� 
//    	    	Stage stage = new Stage();
//    			// 2. fxml ���� ��üȭ									// ���� Ŭ������ ��Ű���� �ٸ��� ������ [ ��� ���� ] 
//    			Parent parent = FXMLLoader.load(getClass().getResource("/FXML/login.fxml"));
//    			// 3. �� ���� fxml���� �ֱ� 
//    			Scene scene = new Scene(parent);
//    			// 4. ���������� �� �ֱ� 
//    			stage.setScene(scene);
//    			// 5. �������� ���� �� ���� 
//    			stage.setResizable(false); // �������� ũ�⺯��Ұ� 
//    			stage.setTitle("adidas sports"); // �������� Ÿ��Ʋ 
//    			// �������� ������ 
//    				// 1.�̹��� �ҷ����� 
//    				Image image = new Image("file:C:/Users/User/Desktop/H/web0714/javafx_project/src/FXML/icon.jpg");
//    				stage.getIcons().add(image);
//    			stage.show();
//    			return;
//    		}
//    	}
//    	
    	
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
