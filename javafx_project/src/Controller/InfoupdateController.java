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
		// 1.로그인된 아이디 가져오기
		loginid = LoginController.getinstance().getloginid();
	
		// db처리 
		MemberDao memberDao = MemberDao.getMemberDao();
		 member = memberDao.getmember(loginid);
		
		txtname.setText( member.getName() );
		txtemail.setText( member.getEmail() );
		txtphone.setText( member.getPhone() );
		
		// 2. 로그인된 회원의 이름,이메일,연락처 표시

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
    	
    	//1. 기존비밀번호를 입력받아 동일한경우에만 수정 
    	String password = txtpassword.getText();
    	
    	if( !member.getPassword().equals(password) ) {
			Alert alert = new Alert( AlertType.ERROR );
			alert.setContentText("기존 비밀번호가 일치하지 않습니다" );
			alert.setHeaderText("수정 실패");
			alert.showAndWait();
			return;
		}
    	// 2. 기존비밀번호와 동일한 경우 업데이트 처리
    		member.setName( txtname.getText() );
			member.setEmail( txtemail.getText() );
			member.setPhone( txtphone.getText() );
			// 2. 새로운 비밀번호가 없을경우 [ 기존 비밀번호 사용 ] 
			if( !txtnewpassword.getText().equals("") ) {
				member.setPassword( txtnewpassword.getText() );
			}
			// db 업데이트 처리 
			MemberDao memberDao = MemberDao.getMemberDao();
			boolean result =  memberDao.memberupdate(member);
			
			if( result ) {
				// 업데이트 성공시 
				// 업데이트 성공 메시지 => 로그아웃
				Alert alert = new Alert( AlertType.INFORMATION );
				alert.setContentText("회원정보가 수정 되었습니다. 로그아웃 처리후 다시 로그인 해주세요" );
				alert.setHeaderText("회원정보 수정 성공");
				alert.showAndWait();
				// 현재 스테이지 닫기 
				btnupdate.getScene().getWindow().hide();
				
				//2. 로그인 스테이지 열기 
		    	Stage stage = new Stage();
				// 2. fxml 파일 객체화									// 현재 클래스와 패키지가 다르기 때문에 [ 경로 설정 ] 
				Parent parent = FXMLLoader.load(getClass().getResource("/FXML/login.fxml"));
				// 3. 씬 만들어서 fxml파일 넣기 
				Scene scene = new Scene(parent);
				// 4. 스테이지에 씬 넣기 
				stage.setScene(scene);
				// 5. 스테이지 설정 및 실행 
				stage.setResizable(false); // 스테이지 크기변경불가 
				stage.setTitle("adidas sports"); // 스테이지 타이틀 
				// 스테이지 아이콘 
					// 1.이미지 불러오기 
					Image image = new Image("file:C:/Users/User/Desktop/H/web0714/javafx_project/src/FXML/icon.jpg");
					stage.getIcons().add(image);
				stage.show();
				return;
				
			}
			
	
    	
    	
    	
//    	for( Member member : List.members ) {
//    		
//    		if( !member.getPassword().equals(password) ) {
//    			Alert alert = new Alert( AlertType.ERROR );
//    			alert.setContentText("기존 비밀번호가 일치하지 않습니다" );
//    			alert.setHeaderText("수정 실패");
//    			alert.showAndWait();
//    			return;
//    		}
//    	}
//    	// 2. 기존비밀번호와 동일한 경우 업데이트 처리 
//    	for( Member member : List.members ) {
//    		
//    		if( member.getId().equals(loginid) ) {
//    			member.setName( txtname.getText() );
//    			member.setEmail( txtemail.getText() );
//    			member.setPhone( txtphone.getText() );
//    			// 2. 새로운 비밀번호가 없을경우 [ 기존 비밀번호 사용 ] 
//    			if( !txtnewpassword.getText().equals("") ) {
//    				member.setPassword( txtnewpassword.getText() );
//    			}
//    			// 파일처리 
//    			FileUtil.filesave();
//    			// 업데이트 성공 메시지 => 로그아웃
//    			Alert alert = new Alert( AlertType.INFORMATION );
//    			alert.setContentText("회원정보가 수정 되었습니다. 로그아웃 처리후 다시 로그인 해주세요" );
//    			alert.setHeaderText("회원정보 수정 성공");
//    			alert.showAndWait();
//    			// 현재 스테이지 닫기 
//    			btnupdate.getScene().getWindow().hide();
//    			
//    			//2. 로그인 스테이지 열기 
//    	    	Stage stage = new Stage();
//    			// 2. fxml 파일 객체화									// 현재 클래스와 패키지가 다르기 때문에 [ 경로 설정 ] 
//    			Parent parent = FXMLLoader.load(getClass().getResource("/FXML/login.fxml"));
//    			// 3. 씬 만들어서 fxml파일 넣기 
//    			Scene scene = new Scene(parent);
//    			// 4. 스테이지에 씬 넣기 
//    			stage.setScene(scene);
//    			// 5. 스테이지 설정 및 실행 
//    			stage.setResizable(false); // 스테이지 크기변경불가 
//    			stage.setTitle("adidas sports"); // 스테이지 타이틀 
//    			// 스테이지 아이콘 
//    				// 1.이미지 불러오기 
//    				Image image = new Image("file:C:/Users/User/Desktop/H/web0714/javafx_project/src/FXML/icon.jpg");
//    				stage.getIcons().add(image);
//    			stage.show();
//    			return;
//    		}
//    	}
//    	
    	
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
