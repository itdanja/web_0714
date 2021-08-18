module javafx_project {
	requires javafx.controls;
	requires javafx.fxml;
	
	// opens 패키지명 to 라이브러리명 
	opens Start to javafx.graphics, javafx.fxml;
}
