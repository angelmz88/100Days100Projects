package com.angelmz.conversiones;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.scene.control.TextFormatter;
import javafx.util.converter.DoubleStringConverter;

public class DivModel {

    private double val1;

    //Asignamos el valor de cambio
    public double prueba(String divSelect1, String divSelect2, String txt_divisa1, String txt_divisa2){
            if (divSelect1.equals(divSelect2)){
                System.out.println("Nel, no se puede");
            } else if ((divSelect1.equals("MXN")&&divSelect2.equals("USD")&& txt_divisa2.isEmpty())
                    || (divSelect1.equals("USD")&&divSelect2.equals("MXN")&& txt_divisa1.isEmpty())) {
                val1 = 0.0580394;
            } else if ((divSelect1.equals("MXN")&&divSelect2.equals("JPY")&& txt_divisa2.isEmpty())
            || (divSelect1.equals("JPY")&&divSelect2.equals("MXN")&& txt_divisa1.isEmpty())){
                val1 = 8.69149;
            } else if ((divSelect1.equals("USD")&&divSelect2.equals("MXN")&& txt_divisa2.isEmpty())
                    || (divSelect1.equals("MXN")&&divSelect2.equals("USD")&& txt_divisa1.isEmpty())){
                val1 = 17.228954;
            } else if ((divSelect1.equals("USD")&&divSelect2.equals("JPY")&& txt_divisa2.isEmpty())
                    || (divSelect1.equals("JPY")&&divSelect2.equals("USD")&& txt_divisa1.isEmpty())){
                val1 = 149.71319;
            } else if ((divSelect1.equals("JPY")&&divSelect2.equals("MXN")&& txt_divisa2.isEmpty())
                    || (divSelect1.equals("MXN")&&divSelect2.equals("JPY")&& txt_divisa1.isEmpty())){
                val1 = 0.11507662;
            } else if ((divSelect1.equals("JPY")&&divSelect2.equals("USD")&& txt_divisa2.isEmpty())
                    || (divSelect1.equals("USD")&&divSelect2.equals("JPY")&& txt_divisa1.isEmpty())){
                val1 = 0.00667943;
            }
        return val1;
    }

    //Convertimos divisas
    public double conversionDivisas(double precio, double txt_valor1, double txt_valor2){
        double resultado =0;
        System.out.println(precio +" "+txt_valor1+" "+ txt_valor2);
        if (txt_valor1 !=0 ){
        resultado = txt_valor1 * precio;
        } else if (txt_valor2 != 0) {
            resultado = txt_valor2 * precio;
        }
        return Math.round(resultado * 100.0) / 100.0;
    }

    private final DoubleProperty valor = new SimpleDoubleProperty();

    public double getValor() {
        return valor.get();
    }

    public DoubleProperty valorProperty() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor.set(valor);
    }
}
