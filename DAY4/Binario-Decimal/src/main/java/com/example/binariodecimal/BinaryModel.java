package com.example.binariodecimal;

import java.util.Objects;

public class BinaryModel {
    protected String binary(String decimalNumber){//Get the text
        int dn = Integer.parseInt(decimalNumber);//Transform the text to int
        StringBuilder binary = new StringBuilder();
        String aux,reverse;

        do {
           aux = Integer.toString(dn%2);//Get module value of the number
           binary.append(aux);//Add the module value in a StringBuilder
           dn = dn/2;//Update the value of the number
        }while(dn!=0);
        reverse = String.valueOf(binary.reverse());//Reverse the string
        return reverse;
    }

    protected String decimal(String binaryNumber){//Get the number
      StringBuilder binary = new StringBuilder(binaryNumber);//Transform binaryNumber to a StringBuilder
      StringBuilder reverse = new StringBuilder(binary.reverse());//Reverse the StringBuilder
      int elemnt = 0, aux = 1, decimal = 0;

        for (int i = 0; i < reverse.length(); i++){
            elemnt = Integer.parseInt(String.valueOf(reverse.charAt(i)));//Transform the char element to int
            if (elemnt == 1){//If the element equals 1, decimal + the value of the position
                decimal = decimal + aux;
            }
            aux = aux * 2;//Get the value of the next position
        }
        return String.valueOf(decimal);//Transform var decimal to int
    }

}
