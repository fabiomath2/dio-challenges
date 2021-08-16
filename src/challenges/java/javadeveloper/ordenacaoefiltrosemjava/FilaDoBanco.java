package challenges.java.javadeveloper.ordenacaoefiltrosemjava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FilaDoBanco {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int linhas = Integer.parseInt(br.readLine());
        int qtdeNaoMudou;

        List<Integer> listaNumeros = new ArrayList<>();
        List<Integer> listaOrdenada = new ArrayList<>();

        for (int i = 0; i < linhas; i++) {
            qtdeNaoMudou = 0;
            var clientes = Integer.parseInt(br.readLine());
            var sms = br.readLine();

            listaNumeros.addAll(Arrays.stream(sms.split(" ")).map(Integer::valueOf).collect(Collectors.toList()));
            listaOrdenada.addAll(listaNumeros.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()));

            for (int j = 0; j < clientes; j++) {
                if (listaNumeros.get(j).compareTo(listaOrdenada.get(j)) == 0) {
                    qtdeNaoMudou++;
                }
            }

            System.out.println(qtdeNaoMudou);
            listaNumeros.clear();
            listaOrdenada.clear();
        }
    }
}
