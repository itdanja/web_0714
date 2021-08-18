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
							// Initializable : fxml 실행시 초기값 설정 인터페이스 
	@Override // 초기 메소드 재정의  // fxml파일이 열렸을때 초기 메소드 
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		lblconfirm.setText(""); // 컨트롤명.setText() : 해당 컨트롤에 텍스트 설정 
		imgloading.setVisible(false); // 컨트롤.setVisible() : 해당 컨트롤 표시 여부 
		
	}
	// 씬빌더에 정한 fx:id 가져오기 
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
    	System.out.println( "[[ 아이디 찾기 페이지로 이동 ]] ");
    }

    @FXML
    void findpassword(MouseEvent event) {
    	System.out.println( "[[ 비밀번호 찾기 페이지로 이동 ]] ");
    }

    @FXML
    void login(MouseEvent event) {	

    	if( txtid.getText().equals("") ) {
    		lblconfirm.setText(" - 아이디를 입력해주세요 - ");
    		return;
    	}
    	if( txtpassword.getText().equals("") ) {
    		lblconfirm.setText(" - 비밀번호를 입력해주세요 - ");
    		return;
    	}
    	
    	if( txtid.getText().equals("admin") &&
    			txtpassword.getText().equals("1234") ) {
    		lblconfirm.setText(" - 로그인 성공 - ");
    		return;
    	}
    	
    	lblconfirm.setText(" - 올바른 회원정보가 아닙니다 -");
    	
    }

    @FXML
    void signup(MouseEvent event) {
    	System.out.println(" [[ 회원가입 페이지 이동 ]]");
    }	


}
