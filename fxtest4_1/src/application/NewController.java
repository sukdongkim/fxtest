package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class NewController {
	Main main = new Main();
    @FXML
    void onClickBack(ActionEvent event) {
    	SampleController.stage.close();
    	main.showMainView();
    }
}
