package Controller;

import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

import Dao.BoardDao;
import Domain.BoardDto;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class BoardviewpageController implements Initializable {

	BoardDto boardDto = null;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		// 메소드 안에서 선언된 변수는 메소드 밖으로 못나감
		boardDto = CommuntypageController.getinstance().getboard();
		
		lblbwrier.setText("작성자 : "+ boardDto.getBwriter() );
		lblbcount.setText("조회수 : "+ boardDto.getBcount() );
		lblbdate.setText("작성일 : "+boardDto.getBdate() );
		txttitle.setText( boardDto.getBtitle() );
		txtcontents.setText( boardDto.getBcountents() );
		
		// 현재게시물의 작성자와 로그인된 아이디와 같지 않을경우 수정 , 삭제 버튼 숨기기 
		if( !boardDto.getBwriter().equals( LoginController.getinstance().getloginid() ) ) {
			btnboarddelete.setVisible(false);
			btnboardupdate.setVisible(false);
		}
		
	}
	
    @FXML
    private Button btnboardlist;

    @FXML
    private TextField txttitle;

    @FXML
    private TextArea txtcontents;

    @FXML
    private Button btnboardupdate;

    @FXML
    private Button btnboarddelete;

    @FXML
    private Label lblbwrier;

    @FXML
    private Label lblbdate;

    @FXML
    private Label lblbcount;

    @FXML
    void boarddelete(ActionEvent event) {
    	
    	Alert alert = new Alert(AlertType.CONFIRMATION );
    	alert.setContentText(" 해당 게시물을 정말 삭제하시겠습니까?" );
    	alert.setTitle(" 메시지 " );
    	alert.setHeaderText(" 게시물 삭제 ");
    	// Optional : null 포함 객체 
    	Optional<ButtonType> optional = alert.showAndWait();
    	
    	if( optional.get() == ButtonType.OK ) {
    		// 1. 삭제 실행
    		BoardDao boardDao = BoardDao.getboarddao();
    		boardDao.boarddelete( boardDto.getBno() );
    		// 2. 페이지 이동
    		MainpageController.getinstance().loadpage("communtypage");
    	}
    	
    }

    @FXML
    void boardlist(ActionEvent event) {
    	MainpageController.getinstance().loadpage("communtypage");
    }

    @FXML
    void boardupdate(ActionEvent event) {
    	MainpageController.getinstance().loadpage("boardupdatepage");		
    }

	
}
