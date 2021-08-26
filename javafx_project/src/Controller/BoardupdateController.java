package Controller;

import java.net.URL;
import java.util.ResourceBundle;

import Domain.BoardDto;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

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
    	
    	
    }
	
	
	
	
}
