package challenges.java.codeanywhere.iniciandoprogramacaocomjava;

import java.util.Arrays;
import java.util.Scanner;

public class EntradaESaidaCPF {
    private static final String CPF_SEPARATOR_REGEX = "[.\\-]";

    public static void main(String[] args) {

        Arrays.stream(getCPF(new Scanner(System.in).nextLine())).forEach(System.out::println);

    }

    public static String[] getCPF(String cpfWSC) {
        return cpfWSC.split(CPF_SEPARATOR_REGEX);
    }
}
