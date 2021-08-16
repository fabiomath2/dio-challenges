package challenges.java.javadeveloper.introducaoabuscaesubstituicaoemjava;

import java.util.Scanner;

public class AtalhosParaOWebBlogger {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        String linha;

        while (scr.hasNextLine()) {
            linha = scr.nextLine();
            boolean inicio = true;

            while (linha.contains("_") || linha.contains("*")) {
                if (linha.contains("_") && inicio) {
                    linha = linha.replaceFirst("_", "<i>");
                    inicio = false;
                } else if (linha.contains("_") && !inicio) {
                    linha = linha.replaceFirst("_", "</i>");
                    inicio = true;
                } else if (linha.contains("*") && inicio) {
                    linha = linha.replaceFirst("\\*", "<b>");
                    inicio = false;
                } else if (linha.contains("*") && !inicio) {
                    linha = linha.replaceFirst("\\*", "</b>");
                    inicio = true;
                }
            }

            System.out.println(linha);
        }
    }
}
