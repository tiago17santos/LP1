module com.cyber.cybernexus {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.lp1 to javafx.fxml;
    exports com.lp1;
}