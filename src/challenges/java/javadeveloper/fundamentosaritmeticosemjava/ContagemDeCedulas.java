package challenges.java.javadeveloper.fundamentosaritmeticosemjava;

import java.util.Scanner;

public class ContagemDeCedulas {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int nota_100 = 100;
        int nota_50 = 50;
        int nota_20 = 20;
        int nota_10 = 10;
        int nota_5 = 5;
        int nota_2 = 2;
        int nota_1 = 1;
        int valor = input.nextInt();

        System.out.println(valor);

        if (valor >= 0 && valor <= 1000000) {
            if (nota_100 > 0) {
                nota_100 = valor / 100;
                valor = valor % 100;
                System.out.println(nota_100 + " nota(s) de R$ 100,00");
            }
            if (nota_50 > 0) {
                nota_50 = valor / 50;
                valor = valor % 50;
                System.out.println(nota_50 + " nota(s) de R$ 50,00");
            }
            if (nota_20 > 0) {
                nota_20 = valor / 20;
                valor = valor % 20;
                System.out.println(nota_20 + " nota(s) de R$ 20,00");
            }
            if (nota_10 > 0) {
                nota_10 = valor / 10;
                valor = valor % 10;
                System.out.println(nota_10 + " nota(s) de R$ 10,00");
            }
            if (nota_5 > 0) {
                nota_5 = valor / 5;
                valor = valor % 5;
                System.out.println(nota_5 + " nota(s) de R$ 5,00");
            }
            if (nota_2 > 0) {
                nota_2 = valor / 2;
                valor = valor % 2;
                System.out.println(nota_2 + " nota(s) de R$ 2,00");
            }
            if (nota_1 > 0) {
                nota_1 = valor / 1;
                valor = valor % 1;
                System.out.println(nota_1 + " nota(s) de R$ 1,00");
            }
        } else {
            System.out.println("Error");
        }
    }
}
