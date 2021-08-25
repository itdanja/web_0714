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
    	// 1. �Է¹��� �� �������� 
    	String btitle = txttitle.getText();
    	String bcontents = txtcontents.getText();
    	String bwriter = LoginController.getinstance().getloginid();
    	// 2. dto ��ü ���� 
    	BoardDto boardDto = new BoardDto(btitle, bcontents, bwriter);
    	// 3. dao �ҷ����� 
    	BoardDao boardDao = BoardDao.getboarddao();
    	boolean result =  boardDao.boardwrite(boardDto);
    	
    	// 4. ���
    	if( result ) { // �۾��� ���� 
    		Alert alert = new Alert( AlertType.INFORMATION );
    		alert.setContentText("�� ����� �Ǿ����ϴ�");
    		alert.setHeaderText(" [ �� ��� ] ");
    		alert.setTitle("�˸� �޽���");
    		alert.showAndWait();
    		// ������ ��ȯ 
    		MainpageController.getinstance().loadpage("communtypage");
    		return;
    	}else { // �۾��� ���� 
    		Alert alert = new Alert( AlertType.INFORMATION );
    		alert.setContentText("�� ���� [ �����ڿ��� ���� ]");
    		alert.setHeaderText(" [ �� ���� ] ");
    		alert.setTitle("�˸� �޽���");
    		alert.showAndWait();
    	}
    	
    }
	
    
    
}











