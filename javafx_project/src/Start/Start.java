package Start;

import Dao.BoardDao;
import Dao.FileUtil;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Start extends Application {

	@Override // extends Application ��ӹ޾� �������̵�
	public void start(Stage stage) throws Exception {
		
		// ȸ�� �ε� 
		//FileUtil.fileload();
					// 1. �������� �̸�
		// 2. fxml ���� ��üȭ									// ���� Ŭ������ ��Ű���� �ٸ��� ������ [ ��� ���� ] 
		Parent parent = FXMLLoader.load(getClass().getResource("/FXML/login.fxml"));
		// 3. �� ���� fxml���� �ֱ� 
		Scene scene = new Scene(parent);
		// 4. ���������� �� �ֱ� 
		stage.setScene(scene);
		// 5. �������� ���� �� ���� 
		stage.setResizable(false); // �������� ũ�⺯��Ұ� 
		stage.setTitle("adidas sports"); // �������� Ÿ��Ʋ 
		// �������� ������ 
			// 1.�̹��� �ҷ����� 
			Image image = new Image("file:C:/Users/User/Desktop/H/web0714/javafx_project/src/FXML/icon.jpg");
			stage.getIcons().add(image);
		stage.show();
		
	}
	
	public static void main(String[] args) {
		launch(args); // start�޼ҵ� ȣ�� 
	}
	
}

// 1. ������[ fxml ]
// 2. ��Ʈ�ѷ� [ java ]
// 3. fxml ���Ͽ� fx:controller = ��Ű����.��Ʈ�Ѹ� 		 �̿��� �� ���� ���� 
//						

	/*
	 * 	login.fxml
	 * 	������ �ۼ��� �����̳� or ��Ʈ�� �̸� ���ϱ� 
	 * fx:id
	 * 	
	 * 	TextField 		: txtid
	 * 	PasswordFirld	: txtpassword
	 * 	Lable 			: btnlogin
	 * 			On Mouse Clicked : login
	 * 	Lable 			: btnsignup
	 * 			On Mouse Clicked : signup
	 * 	Lable			: btnfindid
	 * 			On Mouse Clicked : 	findid
	 * 	Lable			: btnfindpassword
	 * 			On Mouse Clicked : 	findpassword
	 *  Lable			: lblconfirm
	 * 	ImageView		: imgloading
	
	 */ 
	
		
		/*
		 * 	signup.fxml
		 * 	������ �ۼ��� �����̳� or ��Ʈ�� �̸� ���ϱ� 
		 * fx:id
		 * 	
		 * 	TextField 		: txtid
		 * 	PasswordFirld	: txtpassword
		 * 	PasswordFirld	: txtpasswordconfirm
		 * 	TextField 		: txtname
		 * 	TextField 		: txtemail
		 * 	TextField 		: txtphone
	
		 * 	Lable 			: btnsignup
		 * 			On Mouse Clicked : signup

		 *  Lable			: lblconfirm

		 */ 

			
			/*
			 * 	findid.fxml
			 * 	������ �ۼ��� �����̳� or ��Ʈ�� �̸� ���ϱ� 
			 * fx:id
			 * 
			 * 	TextField 		: txtname
			 * 	TextField 		: txtemail

			 * 	Lable 			: btnfindid
			 * 			On Mouse Clicked : findid
			
			 *  Lable			: lblconfirm
			
			 */ 
					
					
			/*
			 * 	findpassword.fxml
			 * 	������ �ۼ��� �����̳� or ��Ʈ�� �̸� ���ϱ� 
			 * fx:id
			 * 
			 * 	TextField 		: txtid
			 * 	TextField 		: txtemail
			
			 * 	Lable 			: btnfindpassword
			 * 			On Mouse Clicked : findpassword	
			
			 *  Lable			: lblconfirm
			
			 */ 
					

		/*
		 * mainpage.fxml
		 * 
		 * 	BoarderPane 	boarderpane
			AnchorPane		lp
			AnchorPane		cp
			Lable			lblloginid
			Button			btnlogout
						OnAction : logout
			
			Lable		btncommunty
						OnMouseClicked : communty
			Lable		btnproduct
						OnMouseClicked : product
			Lable		btnchatting
						OnMouseClicked : chatting
			Lable		btninfo
						OnMouseClicked : info
		 * 
		 * 
		 */

		/*
		 * 
		 * 	infopage.fxml 
		 * 
		 * 	txtid
		 * 	txtname
		 * 	txtemail
		 * 	txtphone
		 * 	txtpoint
		 * 	btnupdate
		 * 		update
		 * 	btndelete
		 * 		delete
		 * 	
		 * 
		 * 
		 *
		 */
	
	/*
	 * 
	 * 	infoupdatepage.fxml 
	 * 
	 * 	txtpassword
	 * 	txtnewpassword
	 * 	txtname
	 * 	txtemail
	 * 	txtphone
	 * 	btnupdate
	 * 		update
	
	 * 	
	 * 
	 * 
	 *
	 */

/*
 * 
			 * 	tableview
				btnboardwrite
					boardwrite
			
			txttitle
			txtcontents
			btnboardwrite
				boardwrite
			btnboardcancel
				boardcancel
			
			lblbwrier
			lblbcount
			lblbdate
			txttitle
			txtcontents
			btnboardupdate
				boardupdate
			btnboarddelete
				boarddelete
			btnboardlist
				boardlist
				
				
			txttitle
			txtcontents
			btnboardupdate
				boardupdate
			btnboardcancel
				boardcancel	
				

 * 
 * 		FX:ID 
 * 			���̺� : tableview 
 * 			��ǰ��Ϲ�ư : btnproductadd	productadd
 * 			��ǰ����ư : btnproductsum	productsum
 * 			lblproductname		
 * 			lblproductcontents
 * 			lblproductactivation
 * 			productimg
 * 
 */
	


			
			






