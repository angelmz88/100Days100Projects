package com.angelmz.conversiones;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextFormatter;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.util.converter.DoubleStringConverter;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 471, 328);
        scene.getStylesheets().add(getClass().getResource("styles.css").toExternalForm());
        stage.setTitle("Divisas");
        stage.setScene(scene);
        stage.getIcons().add(new Image("file:src/main/resources/presupuesto.png"));
        stage.show();

        HelloController controller = fxmlLoader.getController();
    }

    public static void main(String[] args) {
        launch();
    }

    public static void llenarCB (ComboBox<String> llenar, ObservableList<String> infocombo){
        llenar.setItems(infocombo);
    }
}