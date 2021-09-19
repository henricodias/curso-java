package application;

import javax.swing.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ProgramException {

    public static void main(String[] args) {

        method1();

        System.out.println("End program.");
    }

    public static void method1() {
        System.out.println("***METHOD 1 START***");
        method2();
        System.out.println("***METHOD 1 START***");
    }

    public static void method2() {

        System.out.println("***METHOD 2 START***");

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the vector: ");
            String[] vect = scanner.nextLine().split(" ");

            System.out.print("Enter the position: ");
            int position = scanner.nextInt();

            System.out.println(vect[position]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid position!");
            e.printStackTrace();
            scanner.next();
        } catch (InputMismatchException e) {
            System.out.println("Input error.");
        }

        scanner.close();
        System.out.println("***METHOD 2 END***");

    }

}
