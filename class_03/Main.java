package class_03;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Define o locale como US para garantir o uso do ponto como separador decimal
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Declaração das variáveis
        String x;
        int y;
        double z;

        // Leitura dos dados
        x = sc.next();
        y = sc.nextInt();
        z = sc.nextDouble();

        // Exibição dos dados digitados
        System.out.println("Dados digitados:");
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

        // Utilizando System.out.printf para formatar a saída do número decimal
        System.out.printf("O número decimal formatado: %.2f%n", z);

        // Fechando o Scanner
        sc.close();
    }
}
