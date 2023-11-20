package com.angelmz.conversiones;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TextFormatter;
import javafx.scene.layout.Pane;
import javafx.util.converter.DoubleStringConverter;

import static com.angelmz.conversiones.HelloApplication.llenarCB;

public class HelloController {

    @FXML
    private Pane conversorPane;
    @FXML
    private TextField div1;
    @FXML
    private TextField div2;
    @FXML
    private ComboBox cbox_div1;
    @FXML
    private ComboBox cbox_div2;


    private DivModel dm = new DivModel();


    ObservableList<String> divisasList = FXCollections.observableArrayList("MXN","USD","JPY");

    @FXML
    protected void onButtonClick() {
        String a = (String) cbox_div1.getValue();
        String b = (String) cbox_div2.getValue();
        double cambio = dm.prueba(a,b,String.valueOf(div1.getText()),String.valueOf(div2.getText()));

        if (String.valueOf(div2.getText()).isEmpty()){
            double resultado = dm.conversionDivisas(cambio,Double.parseDouble(div1.getText()),0);
            div2.setText(String.valueOf(resultado));
        } else if (String.valueOf(div1.getText()).isEmpty()) {
            double resultado = dm.conversionDivisas(cambio,0,Double.parseDouble(div2.getText()));
            div1.setText(String.valueOf(resultado));
        }
    }

    @FXML
    protected void onLimpiar(){
        div1.setText("");
        div2.setText("");
    }

    public void listarDivisas(Event event) {
        llenarCB(cbox_div1,divisasList);
        cbox_div1.setValue("MXN");
        llenarCB(cbox_div2,divisasList);
        cbox_div2.setValue("USD");
    }




    @FXML
    private void initialize() {
        // Configurar el TextFormatter para aceptar números flotantes
        div1.setTextFormatter(new javafx.scene.control.TextFormatter<>(new DoubleStringConverter(), null, c ->
                (c.getControlNewText().matches("-?\\d*\\.?\\d*") ? c : null)));
        div2.setTextFormatter(new javafx.scene.control.TextFormatter<>(new DoubleStringConverter(), null, c ->
                (c.getControlNewText().matches("-?\\d*\\.?\\d*") ? c : null)));
    }

}