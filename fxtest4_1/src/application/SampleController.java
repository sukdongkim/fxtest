package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class SampleController {
	Main main = new Main();
	static Stage stage=new Stage();
    @FXML
    private Text text1;
    
    @FXML
    void onClick(ActionEvent event) {
    	String ss = text1.getText();
    	if(ss.equals("On"))
    		text1.setText("Off");
    	else if(ss.equals("Off"))
    		text1.setText("On");
    	else
    		text1.setText("On");
    }
    
    @FXML
    void onClickStop(ActionEvent event) {
    	System.exit(0);
    }

    @FXML
    void onClickNew(ActionEvent event) {
    	showNewView();
    }
	public void showNewView() {
		try {

			Parent root = FXMLLoader.load(getClass().getResource("New.fxml"));
			Scene scene = new Scene(root,400,300);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			stage.setScene(scene);
			stage.setTitle("New");
			stage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
