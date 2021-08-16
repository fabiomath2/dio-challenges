package challenges.java.javadeveloper.solucaodeproblemascomjava;

import java.util.Scanner;

public class VogaisExtraterrestres {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        String alfabeto;
        String frase;
        int quantidade = 0;

        while (scr.hasNextLine()) {
            quantidade = 0;
            alfabeto = scr.nextLine();
            frase = scr.nextLine();

            for (int i = 0; i < alfabeto.length(); i++) {
                for (int j = 0; j < frase.length(); j++) {
                    if (frase.charAt(j) == alfabeto.charAt(i)) {
                        quantidade++;
                    }
                }
            }

            System.out.println(quantidade);
        }
    }
}
