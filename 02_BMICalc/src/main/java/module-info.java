module at.hakimst.bmicalc {
    requires javafx.controls;
    requires javafx.fxml;


    opens at.hakimst.bmicalc to javafx.fxml;
    exports at.hakimst.bmicalc;
}