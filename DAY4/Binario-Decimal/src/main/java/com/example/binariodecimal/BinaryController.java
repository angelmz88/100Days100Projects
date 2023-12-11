package com.example.binariodecimal;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.util.converter.DoubleStringConverter;
import javafx.util.converter.IntegerStringConverter;

public class BinaryController {

    @FXML
    private TextField txt_Decimal;
    @FXML
    private TextField txt_Binary;
    BinaryModel BM = new BinaryModel();


    @FXML
    protected void onClean() {//Set empty text at the TextFields
        txt_Decimal.setText("");
        txt_Binary.setText("");
    }

    @FXML
    protected void onConvert(){//Call to the methods
        if (txt_Decimal.getText().isEmpty() && txt_Binary.getText().isEmpty()){System.out.println("Error");
        }else if (txt_Decimal.getText().isEmpty()){txt_Decimal.setText(BM.decimal(txt_Binary.getText()));//Call to the method Binary to Decimal
        }else if (txt_Binary.getText().isEmpty()) {txt_Binary.setText(BM.binary(txt_Decimal.getText()));//Call to the method Decimal to Binary
        }
    }

    @FXML
    private void initialize() {//Only numbers validation
        txt_Binary.setTextFormatter(new javafx.scene.control.TextFormatter<>(new IntegerStringConverter(), null, c ->
                (c.getControlNewText().matches("[01]*") ? c : null)));//Only 0 and 1
        txt_Decimal.setTextFormatter(new javafx.scene.control.TextFormatter<>(new IntegerStringConverter(), null, c ->
                (c.getControlNewText().matches("-?\\d*") ? c : null)));//Only numbers
    }

}