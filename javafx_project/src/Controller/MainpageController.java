package Controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

public class MainpageController implements Initializable  {
	
	private String loginid;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
	
		loginid = LoginController.getinstance().getloginid();
		// 로그인 컨트롤에서 로그인된 아이디 가져오기 
		lblloginid.setText( loginid );
		
	}

	// fx:id 가져오기 
    @FXML
    private BorderPane boarderpane;

    @FXML
    private AnchorPane cp;

    @FXML
    private AnchorPane lp;

    @FXML
    private Label lblloginid;

    @FXML
    private Button btnlogout;

    @FXML
    private Label btncommunty;

    @FXML
    private Label btninfo;

    @FXML
    private Label btnproduct;

    @FXML
    private Label btnchatting;

    @FXML
    void chatting(MouseEvent event) {

    }

    @FXML
    void communty(MouseEvent event) {

    }

    @FXML
    void info(MouseEvent event) {

    }

    @FXML
    void logout(ActionEvent event) {

    }

    @FXML
    void product(MouseEvent event) {

    }
	
}
