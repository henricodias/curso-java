package application;

import model.entities.Employee;
import model.entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ProgramEmployee {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();

        System.out.print("Enter the number of employees: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.printf("Employee #%d data:", i);

            System.out.print("Outsourced (Y/N): ");
            char ch = scanner.next().charAt(0);

            System.out.print("Name: ");
            scanner.nextLine();
            String name = scanner.nextLine();

            System.out.print("Hours: ");
            int hours = scanner.nextInt();

            System.out.print("Value per hour: ");
            double valuePerHour = scanner.nextDouble();

            if (ch == 'Y') {
                System.out.print("Additional charge: ");
                double additionalCharge = scanner.nextDouble();
                Employee emp = new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge);
                list.add(emp);
            } else {
                Employee emp = new Employee(name, hours, valuePerHour);
                list.add(emp);
            }

        }
        System.out.println();
        System.out.println("----PAYMENTS----");

        for (Employee emp : list) {
            System.out.printf("Name: %s - Payment: $ %.2f\n", emp.getName(), emp.payment());
        }
        scanner.close();
    }
}