package Controller;

import java.net.URL;
import java.util.ResourceBundle;

import Dao.BoardDao;
import Domain.BoardDto;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class BoardwritepageController implements Initializable {
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
    @FXML
    private Button btnboardwrite;

    @FXML
    private TextField txttitle;

    @FXML
    private TextArea txtcontents;

    @FXML
    private Button btnboardcancel;

    @FXML
    void boardcancel(ActionEvent event) {
    	MainpageController.getinstance().loadpage("communtypage");
    }

    @FXML
    void boardwrite(ActionEvent event) {
    	// 1. 입력받은 값 가져오기 
    	String btitle = txttitle.getText();
    	String bcontents = txtcontents.getText();
    	String bwriter = LoginController.getinstance().getloginid();
    	// 2. dto 객체 선언 
    	BoardDto boardDto = new BoardDto(btitle, bcontents, bwriter);
    	// 3. dao 불러내기 
    	BoardDao boardDao = BoardDao.getboarddao();
    	boolean result =  boardDao.boardwrite(boardDto);
    	
    	// 4. 결과
    	if( result ) { // 글쓰기 성공 
    		Alert alert = new Alert( AlertType.INFORMATION );
    		alert.setContentText("글 등록이 되었습니다");
    		alert.setHeaderText(" [ 글 등록 ] ");
    		alert.setTitle("알림 메시지");
    		alert.showAndWait();
    		// 페이지 전환 
    		MainpageController.getinstance().loadpage("communtypage");
    		return;
    	}else { // 글쓰기 실패 
    		Alert alert = new Alert( AlertType.INFORMATION );
    		alert.setContentText("글 실패 [ 관리자에게 문의 ]");
    		alert.setHeaderText(" [ 글 실패 ] ");
    		alert.setTitle("알림 메시지");
    		alert.showAndWait();
    	}
    	
    }
	
    
    
}











