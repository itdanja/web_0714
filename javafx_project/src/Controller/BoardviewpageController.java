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
		
		// �޼ҵ� �ȿ��� ����� ������ �޼ҵ� ������ ������
		boardDto = CommuntypageController.getinstance().getboard();
		
		lblbwrier.setText("�ۼ��� : "+ boardDto.getBwriter() );
		lblbcount.setText("��ȸ�� : "+ boardDto.getBcount() );
		lblbdate.setText("�ۼ��� : "+boardDto.getBdate() );
		txttitle.setText( boardDto.getBtitle() );
		txtcontents.setText( boardDto.getBcountents() );
		
		// ����Խù��� �ۼ��ڿ� �α��ε� ���̵�� ���� ������� ���� , ���� ��ư ����� 
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
    	alert.setContentText(" �ش� �Խù��� ���� �����Ͻðڽ��ϱ�?" );
    	alert.setTitle(" �޽��� " );
    	alert.setHeaderText(" �Խù� ���� ");
    	// Optional : null ���� ��ü 
    	Optional<ButtonType> optional = alert.showAndWait();
    	
    	if( optional.get() == ButtonType.OK ) {
    		// 1. ���� ����
    		BoardDao boardDao = BoardDao.getboarddao();
    		boardDao.boarddelete( boardDto.getBno() );
    		// 2. ������ �̵�
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
