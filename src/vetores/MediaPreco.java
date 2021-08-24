package vetores;

import entities.ProductVect;

import java.util.Locale;
import java.util.Scanner;

public class MediaPreco {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);


        int n = scanner.nextInt();

        ProductVect[] vetor = new ProductVect[n];

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Produto: ");
            scanner.nextLine();
            String name = scanner.nextLine();

            System.out.print("Preço: ");
            double price = scanner.nextDouble();

            vetor[i] = new ProductVect(name, price);
        }

        double sum = 0.0;

        for (int i = 0; i < vetor.length; i++) {
            sum += vetor[i].getPrice();
        }

        double avg = sum / n;

        System.out.printf("Average price: %.2f", avg);
        scanner.close();
    }
}