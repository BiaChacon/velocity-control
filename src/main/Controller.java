package main;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import main.VelocityControl;

public class Controller {

    @FXML
    private Button button;

    @FXML
    private TextField distance;

    @FXML
    private void analisar(){
        VelocityControl.analise(Double.parseDouble(distance.getText()));
    }

}
