package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.text.Text;

public class SampleController {

    @FXML
    private Text text1;
    
    @FXML
    void onClick(ActionEvent event) {
    	text1.setText("Click Button");
    }

}
