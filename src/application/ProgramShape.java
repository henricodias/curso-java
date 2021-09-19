package application;

import model.entities.Circle;
import model.entities.Rectangle;
import model.entities.Shape;
import model.entities.enums.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ProgramShape {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        List<Shape> list = new ArrayList<>();

        System.out.print("Enter the number os shapes: ");
        int n = scanner.nextInt();


        for (int i = 1; i <=n; i++) {
            System.out.printf("Shape #%d\n", i);

            System.out.print("Rectangle or Circle (R/C): ");
            char ch = scanner.next().charAt(0);

            System.out.print("Color (BLACK/BLUE/RED): ");
            Color color = Color.valueOf(scanner.next());

            if (ch == 'R') {
                System.out.print("Width: ");
                double width = scanner.nextDouble();

                System.out.print("Height: ");
                double height = scanner.nextDouble();

                Shape rect = new Rectangle(color, width, height);
                list.add(rect);
            }
            else {
                System.out.print("Radius: ");
                double radius = scanner.nextDouble();

                Shape circ = new Circle(color, radius);
                list.add(circ);
            }
        }

        System.out.println();
        System.out.println("---Shape Areas---");

        for (Shape shape : list)  {
            System.out.printf("%.2f\n", shape.area());
        }
        scanner.close();
    }
}