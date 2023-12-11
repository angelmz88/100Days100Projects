module com.example.binariodecimal {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.binariodecimal to javafx.fxml;
    exports com.example.binariodecimal;
}