package challenges.java.codeanywhere.solucionandodesafiosmatematicosemjava;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculoDeViagem {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Tempo de viagem: ");
        int tempoDeViagem = input.nextInt();

        System.out.print("Media de Km/h: ");
        int mediaKmh = input.nextInt();

        float qtdLitrosNedd = (tempoDeViagem * mediaKmh);

        DecimalFormat decimalFormat = new DecimalFormat("00.000");

        //Considerando que o veículo faz 12km/L:
        System.out.println("Seu veículo faz 12km/L então: Você precisa de: " + (decimalFormat.format(qtdLitrosNedd / 12)) +
                " Litros de combustível para a sua viagem!");
    }
}
