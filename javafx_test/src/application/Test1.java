package application;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Test1 extends Application {
	// 1. javafx�κ��� ��ӹޱ� [ �ش� Ŭ������ �޸� �̿밡�� ]
		// Application Ŭ�����κ��� ��ӹޱ� 
	// 2. Start �޼ҵ� ������ 
		// javafx ���� 
	@Override
	public void start(Stage stage ) throws Exception {
				// 4. Stage ��ü �̸� ���ϱ� 
		
		// 5. �����̳� ����� 
		VBox vBox = new VBox();
		vBox.setAlignment( Pos.CENTER ); 	// �����̳� �� ��Ʈ�� ���� 
		
			// 5-1 �����̳� => ��Ʈ�� ���� 
				Button button = new Button(); // ��ư��ü ����� 
				button.setText("�ݱ�");			// ��ư�� �ؽ�Ʈ ���� 
				button.setOnAction( e -> Platform.exit() ); // ��ư�� Ŭ�������� �÷��� �ݱ� 
				
			// 5-2 
				Label label = new Label();		// ���̺� ��ü ����� 
				label.setText("�ȳ��ϼ��� javafx �Դϴ�");	// ���̺� �ؽ�Ʈ ����
				label.setFont( new Font(30) );			// ���̺� �۲� ���� 
				
		// 5-3 �����̳ʿ� ��Ʈ�� �ֱ� 
		vBox.getChildren().add(label);
		vBox.getChildren().add(button);
				
		// 6. �� �����  => �����̳��� ���� �ֱ� 
		Scene scene = new Scene(vBox , 500 , 500  );	// �����̳ʸ� , ���α��� , ���α��� 
		// 7. ���������� �� �ֱ� 
		stage.setScene(scene);
		// 8. �������� ����
		stage.show();
	}
	public static void main(String[] args) {
							// main�޼ҵ��� �μ�  args �迭 => �ֿܼ� �Էµ� ������ ���� 
	// 3. Start �޼ҵ� ȣ�� 
		launch(args);
	}
}
