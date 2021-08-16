package challenges.java.javadeveloper.fundamentosaritmeticosemjava;

import java.util.Scanner;

public class QuantidadeDeNumerosPositivos {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        float[] numbers = new float[6];
        int total = 6;
        int positiveNumbers = 0;

        System.out.print("\n");

        for (int i = 0; i < total; ++i) {
            System.out.print("Insira um número: ");
            numbers[i] = input.nextFloat();

            if (numbers[i] >= 0) {
                positiveNumbers++;
            }
        }

        System.out.print("\n");

        for (int i = 0; i < total; ++i) {
            System.out.println("-- > " + numbers[i]);
        }

        System.out.println("\n" + positiveNumbers + " valores positivos.");

    }
}
