package com.example.binariodecimal;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class BinaryApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(BinaryApplication.class.getResource("binary-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 352.0, 237.0);
        stage.setTitle("Decimal to Binary");
        stage.setScene(scene);
        stage.getIcons().add(new Image("file:src/main/resources/com/example/binariodecimal/img/codigo-binario.png"));
        stage.show();
    }

    public static void main(String[] args) {launch();}
}