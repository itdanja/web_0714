package Controller;

import java.net.URL;
import java.util.ResourceBundle;

import Dao.MemberDao;
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
    void findid(MouseEvent event) { // �̸��� �̸����� ������ ��� ���̵� �޽����� ����
    	
    	//1.DAO ��ü ����
    	MemberDao memberDao = MemberDao.getMemberDao();
    	//2.DAO �޼ҵ� ȣ�� 
    	String result = memberDao.findid( txtemail.getText() , txtname.getText() ) ;
    	if( result != null ) {
    		lblconfirm.setText(" �ش� ������ ���̵� ã�� ���� ");
    		Alert alert = new Alert(AlertType.INFORMATION ); 
    		alert.setContentText(" ȸ������ ���̵� : "+ result ); 
    		alert.setHeaderText(" ���̵� ã�� ���� "); 
    		alert.showAndWait();
    		btnfindid.getScene().getWindow().hide(); 
    		return; 
    	}
    	lblconfirm.setText(" �ش� ������ ���̵� �� �����ϴ�. ");
  
		/*// ����ó��
		 * for( Member member : List.members ) { if( member.getName().equals(
		 * txtname.getText() ) && member.getEmail().equals( txtemail.getText() )) {
		 * lblconfirm.setText(" �ش� ������ ���̵� ã�� ���� "); // �޽��� Alert alert = new Alert(
		 * AlertType.INFORMATION ); alert.setContentText(" ȸ������ ���̵� : "+ member.getId()
		 * ); alert.setHeaderText(" ���̵� ã�� ���� "); alert.showAndWait();
		 * btnfindid.getScene().getWindow().hide(); return; } }
		 * lblconfirm.setText(" �ش� ������ ���̵� �� �����ϴ�. ");
		 */
    }

    
    
    

}
