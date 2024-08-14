package com.vpteruel.cubecalculator;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CubeCalculatorController {

    @FXML
    private TextField numberInput;

    @FXML
    private Label resultLabel;

    @FXML
    protected void calculateCube() {
        try {
            double number = Double.parseDouble(numberInput.getText());
            double cube = Math.pow(number, 3);
            resultLabel.setText("Cube of " + number + " is: " + cube);
        } catch (NumberFormatException e) {
            resultLabel.setText("Please enter a valid number.");
        }
    }
}
