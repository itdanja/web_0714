package Controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class LoginController implements Initializable {	
							// Initializable : fxml ����� �ʱⰪ ���� �������̽� 
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
    void findid(MouseEvent event) {
    	System.out.println( "[[ ���̵� ã�� �������� �̵� ]] ");
    }

    @FXML
    void findpassword(MouseEvent event) {
    	System.out.println( "[[ ��й�ȣ ã�� �������� �̵� ]] ");
    }

    @FXML
    void login(MouseEvent event) {	

    	if( txtid.getText().equals("") ) {
    		lblconfirm.setText(" - ���̵� �Է����ּ��� - ");
    		return;
    	}
    	if( txtpassword.getText().equals("") ) {
    		lblconfirm.setText(" - ��й�ȣ�� �Է����ּ��� - ");
    		return;
    	}
    	
    	if( txtid.getText().equals("admin") &&
    			txtpassword.getText().equals("1234") ) {
    		lblconfirm.setText(" - �α��� ���� - ");
    		return;
    	}
    	
    	lblconfirm.setText(" - �ùٸ� ȸ�������� �ƴմϴ� -");
    	
    }

    @FXML
    void signup(MouseEvent event) {
    	System.out.println(" [[ ȸ������ ������ �̵� ]]");
    }	


}
