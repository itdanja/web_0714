module javafx_test {
	requires javafx.controls;
	requires javafx.fxml; // �ش� ���̺귯�� ��� 
	
	// opens ��Ű���� to ���̺귯����
	opens application to javafx.graphics, javafx.fxml;
	
}
