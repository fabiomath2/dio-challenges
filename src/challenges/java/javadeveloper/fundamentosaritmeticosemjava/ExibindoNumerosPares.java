package challenges.java.javadeveloper.fundamentosaritmeticosemjava;

import java.util.Scanner;

public class ExibindoNumerosPares {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int x = input.nextInt();
        System.out.print("\n");

        for (int i = 1; i <= x; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
