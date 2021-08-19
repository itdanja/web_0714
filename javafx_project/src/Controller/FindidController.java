package Controller;

import java.net.URL;
import java.util.ResourceBundle;

import Domain.List;
import Domain.Member;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.input.MouseEvent;

public class FindidController implements Initializable {
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		lblconfirm.setText("");
	}

    @FXML
    private TextField txtname;

    @FXML
    private TextField txtemail;

    @FXML
    private Label lblconfirm;

    @FXML
    private Label btnfindid;

    @FXML
    void findid(MouseEvent event) { // 이름과 이메일이 동일한 경우 아이디를 메시지로 띄우기
    	for( Member member : List.members ) {
    		if( member.getName().equals( txtname.getText() ) && member.getEmail().equals( txtemail.getText() )) {
    			lblconfirm.setText(" 해당 정보의 아이디 찾기 성공 ");
    			// 메시지 
    			Alert alert = new Alert( AlertType.INFORMATION );
    			alert.setContentText(" 회원님의 아이디 : "+ member.getId()  );
    			alert.setHeaderText(" 아이디 찾기 성공 ");
    			alert.showAndWait();
    			btnfindid.getScene().getWindow().hide();
    			return;
    		}	
    	}
    	lblconfirm.setText(" 해당 정보의 아이디 가 없습니다. ");   	
    }

    
    
    

}
