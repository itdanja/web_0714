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

	@Override // extends Application 상속받아 오버라이딩
	public void start(Stage stage) throws Exception {
		
		// 회원 로드 
		//FileUtil.fileload();
					// 1. 스테이지 이름
		// 2. fxml 파일 객체화									// 현재 클래스와 패키지가 다르기 때문에 [ 경로 설정 ] 
		Parent parent = FXMLLoader.load(getClass().getResource("/FXML/login.fxml"));
		// 3. 씬 만들어서 fxml파일 넣기 
		Scene scene = new Scene(parent);
		// 4. 스테이지에 씬 넣기 
		stage.setScene(scene);
		// 5. 스테이지 설정 및 실행 
		stage.setResizable(false); // 스테이지 크기변경불가 
		stage.setTitle("adidas sports"); // 스테이지 타이틀 
		// 스테이지 아이콘 
			// 1.이미지 불러오기 
			Image image = new Image("file:C:/Users/User/Desktop/H/web0714/javafx_project/src/FXML/icon.jpg");
			stage.getIcons().add(image);
		stage.show();
		
	}
	
	public static void main(String[] args) {
		launch(args); // start메소드 호출 
	}
	
}

// 1. 씬빌더[ fxml ]
// 2. 컨트롤러 [ java ]
// 3. fxml 파일에 fx:controller = 패키지명.컨트롤명 		 이용한 두 파일 연결 
//						

	/*
	 * 	login.fxml
	 * 	씬빌더 작성된 컨테이너 or 컨트롤 이름 정하기 
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
		 * 	씬빌더 작성된 컨테이너 or 컨트롤 이름 정하기 
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
			 * 	씬빌더 작성된 컨테이너 or 컨트롤 이름 정하기 
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
			 * 	씬빌더 작성된 컨테이너 or 컨트롤 이름 정하기 
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
 * 			테이블 : tableview 
 * 			제품등록버튼 : btnproductadd	productadd
 * 			제품통계버튼 : btnproductsum	productsum
 * 			lblproductname		
 * 			lblproductcontents
 * 			lblproductactivation
 * 			productimg
 * 
 */
	


			
			






