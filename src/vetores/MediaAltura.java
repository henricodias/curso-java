package vetores;

import java.util.Locale;
import java.util.Scanner;

public class MediaAltura {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho do vetor: ");
        int n = scanner.nextInt();

        double[] vetor = new double[n];

        for (int i = 0; i<n; i++) {
            System.out.printf("Digite a %dª altura: ", i+1);
            vetor[i] = scanner.nextDouble();
        }

        double soma = 0.0;

        for (int i=0; i<n; i++) {
            soma += vetor[i];
        }

        double media = soma / n;

        System.out.printf("Média: %.2f", media);

        scanner.close();
    }
}
