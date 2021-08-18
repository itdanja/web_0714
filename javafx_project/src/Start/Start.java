package Start;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Start extends Application {

	@Override // extends Application 상속받아 오버라이딩
	public void start(Stage stage) throws Exception {
					// 1. 스테이지 이름
		// 2. fxml 파일 객체화									// 현재 클래스와 패키지가 다르기 때문에 [ 경로 설정 ] 
		Parent parent = FXMLLoader.load(getClass().getResource("/FXML/login.fxml"));
		// 3. 씬 만들어서 fxml파일 넣기 
		Scene scene = new Scene(parent);
		// 4. 스테이지에 씬 넣기 
		stage.setScene(scene);
		// 5. 스테이지 설정 및 실행 
		stage.show();
		
	}
	
	public static void main(String[] args) {
		launch(args); // start메소드 호출 
	}
	
}

	/*
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
	








