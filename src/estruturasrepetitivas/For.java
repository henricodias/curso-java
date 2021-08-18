package estruturasrepetitivas;

import java.util.Scanner;

public class For {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int soma = 0;

        for (int i=0; i<N; i++){
            System.out.println("Digite o valor de X.");
            int x = scanner.nextInt();
            soma += x;
        }
        System.out.printf("Soma = %d\n", soma);
        System.out.println("Fim do programa");
        scanner.close();
    }
}
