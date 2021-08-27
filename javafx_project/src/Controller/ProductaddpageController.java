package Controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.ImageView;

public class ProductaddpageController implements Initializable {

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
	
	// fx : id 
	@FXML
    private Button btnproductadd;

    @FXML
    private Button btnproductcancel;

    @FXML
    private ImageView uploadimg;

    @FXML
    private TextField txtpname;

    @FXML
    private TextArea txtpcontents;

    @FXML
    private TextField txtpprice;

    @FXML
    private TextField txtpstock;

    @FXML
    private RadioButton opt_1;

    @FXML
    private ToggleGroup category;

    @FXML
    private RadioButton opt_2;

    @FXML
    private RadioButton opt_3;

    @FXML
    private RadioButton opt_4;

    @FXML
    private RadioButton opt_5;

    @FXML
    private Button btnupload;

    @FXML
    private Label lblpath;

    @FXML
    void productadd(ActionEvent event) {

    }

    @FXML
    void productcancel(ActionEvent event) {

    }

    @FXML
    void upload(ActionEvent event) {

    }
	
	
}
