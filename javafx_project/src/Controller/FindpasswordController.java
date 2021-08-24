package Controller;

import java.net.URL;
import java.util.ResourceBundle;

import Dao.MemberDao;
import Domain.List;
import Domain.Member;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class FindpasswordController implements Initializable {
	
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		lblconfirm.setText("");
	}
    @FXML
    private TextField txtid;

    @FXML
    private TextField txtemail;

    @FXML
    private Label lblconfirm;

    @FXML
    private Label btnfindpassword;

    @FXML
    void findpassword(MouseEvent event) {
    	
    	MemberDao memberDao = MemberDao.getMemberDao();
    	String result = memberDao.findpassword( txtid.getText() , txtemail.getText() );
    	if( result != null ) {
    		lblconfirm.setText(" �ش� ������ ��й�ȣ ã�� ���� ");
    		Alert alert = new Alert(AlertType.INFORMATION ); 
    		alert.setContentText(" ȸ������ ��й�ȣ : "+ result ); 
    		alert.setHeaderText(" ��й�ȣ ã�� ���� "); 
    		alert.showAndWait();
    		btnfindpassword.getScene().getWindow().hide(); 
    		return; 
    	}
    	lblconfirm.setText(" �ش� ������ ���̵� �� �����ϴ�. ");
    	
    	
		/*// ����ó��
		 * for( Member member : List.members ) { if( member.getId().equals(
		 * txtid.getText() ) && member.getEmail().equals( txtemail.getText() )) {
		 * lblconfirm.setText(" �ش� ������ ��й�ȣ ã�� ���� "); // �޽��� Alert alert = new Alert(
		 * AlertType.INFORMATION );
		 * alert.setContentText(" ȸ������ ��й�ȣ : "+member.getPassword());
		 * alert.setHeaderText(" ��й�ȣ ã�� ����"); alert.showAndWait();
		 * btnfindpassword.getScene().getWindow().hide(); return; } }
		 * lblconfirm.setText(" �ش� ������ ȸ���� �����ϴ�. ");
		 */
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

}
