package challenges.java.javadeveloper.introducaoaprogramacaocomjava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class FolhaDePagamento {
    public static void main(String[] args) throws IOException {

        int valor1;
        int valor2;
        double valor3;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        DecimalFormat decimalFormat = new DecimalFormat("000.00");

        valor1 = Integer.parseInt(br.readLine());
        valor2 = Integer.parseInt(br.readLine());
        valor3 = Double.parseDouble(br.readLine());

        double salary = (valor2 * valor3);

        System.out.println("NUMBER = " + valor1);
        System.out.println("SALARY = U$ " + (decimalFormat.format(salary)));
    }
}
