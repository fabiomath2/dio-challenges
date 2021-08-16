package challenges.java.codeanywhere.solucionandodesafiosmatematicosemjava;

import java.util.Scanner;

public class Mutiplos {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Número: ");
        int x = input.nextInt();

        System.out.print("E número: ");
        int y = input.nextInt();
        System.out.print("\n");

        if (x % y == 0) {
            System.out.println("São Multiplos.");
        } else {
            System.out.println("Não São Multiplos.");
        }
    }
}
