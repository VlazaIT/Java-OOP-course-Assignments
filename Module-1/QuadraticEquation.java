// Module 1.3. Task 1.

import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Provide with coefficient a (x^2): ");
        double a = Double.parseDouble(scanner.nextLine());
        System.out.print("Provide with coefficient b (x): ");
        double b = Double.parseDouble(scanner.nextLine());
        System.out.print("Provide with coefficient c (without x): ");
        double c = Double.parseDouble(scanner.nextLine());

        double D = Math.pow(b, 2) - 4*a*c;
        //System.out.print(D);

        double x1; double x2;

        if (D > 0) {
            x1 = (-b + Math.sqrt(D))/(2*a);
            x2 = (-b - Math.sqrt(D))/(2*a);
            System.out.printf("The equation has 2 roots: x1 = %.2f and x2 = %.2f", x1, x2);
        }
        else if (D == 0) {
            x1 = -b/(2*a);
            System.out.printf("The equation has 1 root x = %.2f", x1);
        }
        else {
            System.out.println("The equation has no real roots");
        }
    }
}
