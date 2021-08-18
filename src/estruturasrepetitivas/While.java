package estruturasrepetitivas;

import java.util.Scanner;

public class While {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int soma = 0;

        while (x  != 0) {
            soma += x;
            System.out.println("Digite outro número.");
            x = scanner.nextInt();

        }
        System.out.printf("Soma = %d\n", soma);
        System.out.println("Fim do programa.");
        scanner.close();
    }
}
