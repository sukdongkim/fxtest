module javafx6 {
	requires javafx.controls;
	requires javafx.fxml;
	requires java.sql;
	requires java.desktop;
	requires javafx.graphics;
	
	opens application to javafx.graphics, javafx.fxml;
}
