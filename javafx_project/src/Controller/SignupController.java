package Controller;

import java.io.FileOutputStream;
import java.net.URL;
import java.util.ResourceBundle;

import Dao.FileUtil;
import Dao.MemberDao;
import Domain.List;
import Domain.Member;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.input.MouseEvent;

public class SignupController implements Initializable {
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		lblconfirm.setText("");
	}
	// fx:id 가져오기 
    @FXML
    private TextField txtid;

    @FXML
    private PasswordField txtpassword;

    @FXML
    private PasswordField txtpasswordconfirm;

    @FXML
    private TextField txtname;

    @FXML
    private TextField txtemail;

    @FXML
    private TextField txtphone;

    @FXML
    private Label lblconfirm;

    @FXML
    private Label btnsignup;

    @FXML
    void signup(MouseEvent event) {
    	// 유효성 검사 
    		// 0. 중복 아이디 체크
    		// 1. 아이디는 4~10글자이내 
    	if( txtid.getText().length() <= 3 || txtid.getText().length() > 10  ) {
    		lblconfirm.setText("아이디는 4~10글자이내만 가능합니다.");
    		return;
    	}
    		// 2. 비밀번호와 비밀번호 확인이 사로 다른경우 실패 
    	if( !txtpassword.getText().equals( txtpasswordconfirm.getText() ) ) {
    		lblconfirm.setText("패스워드가 서로 다릅니다. ");
    		return;
    	}
    		// 3. 비밀번호 8~15글자이내 
    	if( txtpassword.getText().length() <= 7  || txtpassword.getText().length() > 15) {
    		lblconfirm.setText("비밀번호는 8~15글자이내만 가능합니다.");
    		return;
    	}
    		// 4. 이메일 반드시 @ 포함되도록 
    	if( !txtemail.getText().contains("@") ) {
    		lblconfirm.setText("이메일 형식으로 입력해주세요.");
    		return;
    	}
    	
		/*
		 * try { // 연락처 문자를 입력했을경우에 예외 발생 Integer.parseInt( txtphone.getText() ) ;
		 * }catch (Exception e) { lblconfirm.setText("연락처는 -제외한 숫자 11 자리 ."); return; }
		 */
    	
    		// 5. 연락처 -제외한 11글자 
    	if( txtphone.getText().contains("-") || txtphone.getText().length() != 11 ) {
    		lblconfirm.setText("연락처는 -제외한 숫자 11 자리 .");
    		return;
    	}
    	
    	// 객체화
    	Member member = new Member( txtid.getText() , txtpassword.getText() 
    			, txtname.getText() , txtemail.getText() , txtphone.getText() , 100 );
    	// 리스트 담기 
    		//List.members.add(member);
    	// 파일처리
	    	// FileUtil.filesave();
    	
	    // DB처리
	    	MemberDao memberDao = MemberDao.getMemberDao();
	    	boolean result =  memberDao.signup(member);
	    	
	    	if( result ) {
	    	    // 회원가입 성공 [ 메시지 띄우고 해당 스테이지 닫기 ] 
	    		// 1. 메시지 객체 만들기 [ Alert 클래스 ]
		    	Alert alert = new Alert( AlertType.INFORMATION );
		    	// 2. 메시지 내용 넣기 
		    	alert.setContentText(" adidas sports 가입을 축하합니다 [ 축하 포인트 100 지급 ] ");
		    	alert.setHeaderText(" 회원가입 성공 " );	    	
		    	// 3. 메시지 실행 
		    	alert.showAndWait(); // 창열고 닫을때 까지 기다리기
		    	// 4. 현재 회원가입 스테이지 끄기 
		    	btnsignup.getScene().getWindow().hide();   	
		    	return;
	    	}else {
	    		// DB 오류이거나 아이디가 중복되어 있는경우 실패 
	    		lblconfirm.setText("동일한 아이디가 존재합니다");
	    		return;
	    	}
	    	
    }

    
}
