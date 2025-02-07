module com.example.arithmaticoperation {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.arithmaticoperation to javafx.fxml;
    exports com.example.arithmaticoperation;
}