module javafx_project {
	requires javafx.controls;
	requires javafx.fxml;
	
	// opens ��Ű���� to ���̺귯���� 
	opens Start to javafx.graphics, javafx.fxml;
}
