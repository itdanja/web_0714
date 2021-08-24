package Controller;

import java.io.FileOutputStream;
import java.net.URL;
import java.util.ResourceBundle;

import Dao.FileUtil;
import Dao.MemberDao;
import Domain.List;
import Domain.Member;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.input.MouseEvent;

public class SignupController implements Initializable {
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		lblconfirm.setText("");
	}
	// fx:id �������� 
    @FXML
    private TextField txtid;

    @FXML
    private PasswordField txtpassword;

    @FXML
    private PasswordField txtpasswordconfirm;

    @FXML
    private TextField txtname;

    @FXML
    private TextField txtemail;

    @FXML
    private TextField txtphone;

    @FXML
    private Label lblconfirm;

    @FXML
    private Label btnsignup;

    @FXML
    void signup(MouseEvent event) {
    	// ��ȿ�� �˻� 
    		// 0. �ߺ� ���̵� üũ
    		// 1. ���̵�� 4~10�����̳� 
    	if( txtid.getText().length() <= 3 || txtid.getText().length() > 10  ) {
    		lblconfirm.setText("���̵�� 4~10�����̳��� �����մϴ�.");
    		return;
    	}
    		// 2. ��й�ȣ�� ��й�ȣ Ȯ���� ��� �ٸ���� ���� 
    	if( !txtpassword.getText().equals( txtpasswordconfirm.getText() ) ) {
    		lblconfirm.setText("�н����尡 ���� �ٸ��ϴ�. ");
    		return;
    	}
    		// 3. ��й�ȣ 8~15�����̳� 
    	if( txtpassword.getText().length() <= 7  || txtpassword.getText().length() > 15) {
    		lblconfirm.setText("��й�ȣ�� 8~15�����̳��� �����մϴ�.");
    		return;
    	}
    		// 4. �̸��� �ݵ�� @ ���Եǵ��� 
    	if( !txtemail.getText().contains("@") ) {
    		lblconfirm.setText("�̸��� �������� �Է����ּ���.");
    		return;
    	}
    	
		/*
		 * try { // ����ó ���ڸ� �Է�������쿡 ���� �߻� Integer.parseInt( txtphone.getText() ) ;
		 * }catch (Exception e) { lblconfirm.setText("����ó�� -������ ���� 11 �ڸ� ."); return; }
		 */
    	
    		// 5. ����ó -������ 11���� 
    	if( txtphone.getText().contains("-") || txtphone.getText().length() != 11 ) {
    		lblconfirm.setText("����ó�� -������ ���� 11 �ڸ� .");
    		return;
    	}
    	
    	// ��üȭ
    	Member member = new Member( txtid.getText() , txtpassword.getText() 
    			, txtname.getText() , txtemail.getText() , txtphone.getText() , 100 );
    	// ����Ʈ ��� 
    		//List.members.add(member);
    	// ����ó��
	    	// FileUtil.filesave();
    	
	    // DBó��
	    	MemberDao memberDao = MemberDao.getMemberDao();
	    	boolean result =  memberDao.signup(member);
	    	
	    	if( result ) {
	    	    // ȸ������ ���� [ �޽��� ���� �ش� �������� �ݱ� ] 
	    		// 1. �޽��� ��ü ����� [ Alert Ŭ���� ]
		    	Alert alert = new Alert( AlertType.INFORMATION );
		    	// 2. �޽��� ���� �ֱ� 
		    	alert.setContentText(" adidas sports ������ �����մϴ� [ ���� ����Ʈ 100 ���� ] ");
		    	alert.setHeaderText(" ȸ������ ���� " );	    	
		    	// 3. �޽��� ���� 
		    	alert.showAndWait(); // â���� ������ ���� ��ٸ���
		    	// 4. ���� ȸ������ �������� ���� 
		    	btnsignup.getScene().getWindow().hide();   	
		    	return;
	    	}else {
	    		// DB �����̰ų� ���̵� �ߺ��Ǿ� �ִ°�� ���� 
	    		lblconfirm.setText("������ ���̵� �����մϴ�");
	    		return;
	    	}
	    	
    }

    
}
