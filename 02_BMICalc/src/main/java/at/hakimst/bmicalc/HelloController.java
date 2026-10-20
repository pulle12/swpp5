package at.hakimst.bmicalc;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private TextField tfHeight, tfWeight, tfBmi;

    @FXML
    protected void calcBmi() {
        double weight = Double.parseDouble(tfWeight.getText());
        double height = Double.parseDouble(tfHeight.getText());
        tfBmi.setText(Double.toString(bmi(weight, height)));
    }

    private double bmi(double weight, double height) {
        return weight / (height * height);
    }
}