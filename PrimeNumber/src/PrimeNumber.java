import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int inputNumber = scanner.nextInt();

        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(inputNumber); i++) {
            if (inputNumber % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println(inputNumber + " is a prime number!");
        } else {
            System.out.println(inputNumber + " is not a prime number!");
        }
    }
}
