module com.vpteruel.cubecalculator {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.vpteruel.cubecalculator to javafx.fxml;
    exports com.vpteruel.cubecalculator;
}
