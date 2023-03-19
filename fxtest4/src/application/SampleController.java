package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.text.Text;

public class SampleController {
	Main main = new Main();
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
    	main.showNewView();
    }
}
