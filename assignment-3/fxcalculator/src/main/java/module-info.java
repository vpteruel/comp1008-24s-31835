module com.vpteruel.fxcalculator {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.vpteruel.fxcalculator to javafx.fxml;
    exports com.vpteruel.fxcalculator;
}
