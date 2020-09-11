import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = scanner.nextInt();

        while (num1 != num2) {
            if (num1 < num2) {
                num2 = num2 - num1;
            } else {
                num1 = num1 - num2;
            }
        }

        System.out.println("Greatest common divisor is: "+num1);
    }
}
