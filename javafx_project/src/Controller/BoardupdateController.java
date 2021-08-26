package Controller;

import java.net.URL;
import java.util.ResourceBundle;

import Dao.BoardDao;
import Domain.BoardDto;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class BoardupdateController implements Initializable {
	
	//
	private BoardDto boardDto = null;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		// 메소드 안에서 선언된 변수는 밖으로 못나감 => 지역변수 
		boardDto = CommuntypageController.getinstance().getboard();
		txttitle.setText( boardDto.getBtitle() );
		txtcontents.setText( boardDto.getBcountents() );
		
	}
	
    @FXML
    private Button btnboardupdate;

    @FXML
    private TextField txttitle;

    @FXML
    private TextArea txtcontents;

    @FXML
    private Button btnboardcancel;

    @FXML
    void boardcancel(ActionEvent event) {
    	// 2. 페이지 이동
		MainpageController.getinstance().loadpage("boardviewpage");
    }

    @FXML
    void boardupdate(ActionEvent event) {
    	
    	// 1. dao 
    	BoardDao boardDao = BoardDao.getboarddao();
    	boardDao.boardupdate( txttitle.getText() , txtcontents.getText() , boardDto.getBno() );
    	// 2. 결과 
    	Alert alert = new Alert( AlertType.INFORMATION  );
    	alert.setContentText(" 게시글이 수정 되었습니다" );
    	alert.setHeaderText(" 글 수정 ");
    	alert.showAndWait();
    	// 3. 페이지이동 
    	MainpageController.getinstance().loadpage("communtypage");
    	
    }
	
	
	
	
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
