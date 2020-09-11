import java.util.Scanner;

public class SolveQuadratic {
    public static void main(String[] args) {
        System.out.println("Programmer solve the quadratic: a^2*x + b*x + c = 0");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a:");
        double a = scanner.nextDouble();
        System.out.println("Enter b:");
        double b = scanner.nextDouble();
        System.out.println("Enter c:");
        double c = scanner.nextDouble();

        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Phương trình vô số nghiệm!");
                } else {
                    System.out.println("Phương trình vô nghiệm");
                }
            } else {
                System.out.println("Phương trình có nghiệm x = " + (-c / b));
            }
        } else {
            double delta = Math.pow(b, 2) - 4 * a * c;
            if (delta < 0) {
                System.out.println("Phương trình vô nghiệm!");
            } else if (delta == 0) {
                System.out.println("Phương trình có nghiệm kép x1 = x2 = " + (-b / 2 / a));
            } else {
                double x1 = (-b - Math.sqrt(delta)) / 2 / a;
                double x2 = (-b + Math.sqrt(delta)) / 2 / a;
                System.out.println("Phương trình có 2 nghiệm x1 = " + x1 + " ; x2 = " + x2);
            }
        }
    }
}
