package Start;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Start extends Application {

	@Override // extends Application ��ӹ޾� �������̵�
	public void start(Stage stage) throws Exception {
					// 1. �������� �̸�
		// 2. fxml ���� ��üȭ									// ���� Ŭ������ ��Ű���� �ٸ��� ������ [ ��� ���� ] 
		Parent parent = FXMLLoader.load(getClass().getResource("/FXML/login.fxml"));
		// 3. �� ���� fxml���� �ֱ� 
		Scene scene = new Scene(parent);
		// 4. ���������� �� �ֱ� 
		stage.setScene(scene);
		// 5. �������� ���� �� ���� 
		stage.show();
		
	}
	
	public static void main(String[] args) {
		launch(args); // start�޼ҵ� ȣ�� 
	}
	
}