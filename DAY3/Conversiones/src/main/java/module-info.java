module com.angelmz.conversiones {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.angelmz.conversiones to javafx.fxml;
    exports com.angelmz.conversiones;
}