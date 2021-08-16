package challenges.java.codeanywhere.solucionandodesafiosmatematicosemjava;

import java.text.DecimalFormat;

public class AreaDoCirculo {
    public static void main(String[] args) {

        double area = 3.14159;
        double raio = 2;
        double result = (Math.pow(raio, 2) * area);

        DecimalFormat decimalFormat = new DecimalFormat("00.0000");

        System.out.println("Areado circulo: " + (decimalFormat.format(result)));
    }
}
