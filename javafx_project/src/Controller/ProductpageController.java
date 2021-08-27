package Controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.image.ImageView;

public class ProductpageController implements Initializable {
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
	
	}
	
	@FXML
    private TableView<?> tableview;

    @FXML
    private Button btnproductadd;

    @FXML
    private Button btnproductsum;

    @FXML
    private ImageView productimg;

    @FXML
    private Label lblproductcontents;

    @FXML
    private Label lblproductactivation;

    @FXML
    private Label lblproductname;

    @FXML
    void productadd(ActionEvent event) {
    	MainpageController.getinstance().loadpage("productaddpage");
    }

    @FXML
    void productsum(ActionEvent event) {

    }
	
    
    
    
    
    
    
    
    
    
    
    
    
	
}
