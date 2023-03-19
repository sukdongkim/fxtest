package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.text.Text;

public class SampleController {

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

}
