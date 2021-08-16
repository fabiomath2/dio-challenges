package challenges.java.javadeveloper.fundamentosaritmeticosemjava;

import java.util.Scanner;

public class ConsumoMedioDoAutomovel {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int x = input.nextInt();
        double y = input.nextDouble();
        double media = x / y;

        System.out.println(String.format("%.3f km/l", media));
    }
}
