package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Test2 extends Application {
	
	@Override
	public void start(Stage stage) throws Exception {
					// 1. �������� ��ü�� ���ϱ� 
		
		//2. fxml ���� ��üȭ 
		Parent parent = FXMLLoader.load( getClass().getResource("test1.fxml"));
			// Parent : fxml���� ��üȭ Ŭ����
		// 3. ��
		Scene scene = new Scene( parent ); // fxml ��ü ���� �ֱ�
		// 4. ��������
		stage.setScene(scene);
		stage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
