package estruturasrepetitivas;

import java.util.Scanner;

public class DoWhile {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        char resp;

        do {
            System.out.println("Digite a temperatura em ºC: ");
            double celsius = scanner.nextInt();
            double fahreneit = 9.0 * celsius / 5.0 + 32.0;
            System.out.printf("Temperatura em ºF: %.1f\n", fahreneit);
            System.out.println("Deseja repetir? ");
            resp = scanner.next().charAt(0);
        } while (resp != 'n');
        scanner.close();
        System.out.println("Fim do programa.");
    }
}
