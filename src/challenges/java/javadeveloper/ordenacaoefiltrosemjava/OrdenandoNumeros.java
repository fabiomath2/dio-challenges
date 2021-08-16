package challenges.java.javadeveloper.ordenacaoefiltrosemjava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class OrdenandoNumeros {
    public static void main(String[] args) {

        Scanner inputx = new Scanner(System.in);
        int minSize = 1, maxSize = 10000, size;
        size = inputx.nextInt();

        if (size < minSize || size > maxSize) {
            System.out.println("Array size error!");
            System.exit(0);
        }

        List<Integer> lista = new ArrayList<>(size);

        for (int x = 0; x < size; x++) {
            lista.add(inputx.nextInt());

            if (lista.get(x) < 0) {
                System.out.println("Invalid value!");
                System.exit(0);
            }
        }

        List<Integer> impares = new ArrayList<>();
        List<Integer> pares = new ArrayList<>();

        for (int x = 0; x < lista.size(); x++) {
            if (lista.get(x) % 2 != 0) {
                impares.add(lista.get(x));
            } else if (lista.get(x) % 2 == 0) {
                pares.add(lista.get(x));
            }
        }

        Collections.sort(pares);

        for (int y = 0; y < pares.size(); y++) {
            System.out.println(pares.get(y));
        }

        Collections.sort(impares, Collections.reverseOrder());

        for (int z = 0; z < impares.size(); z++) {
            System.out.println(impares.get(z));
        }
    }
}