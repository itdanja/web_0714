module javafx_project {
	requires javafx.controls;
	requires javafx.fxml;
	requires java.sql;

	
	// opens ��Ű���� to ���̺귯���� 
	opens Start to javafx.graphics, javafx.fxml;
	opens Controller to javafx.graphics, javafx.fxml;
	opens Dao to java.sql;
	opens Domain to javafx.base;
}
