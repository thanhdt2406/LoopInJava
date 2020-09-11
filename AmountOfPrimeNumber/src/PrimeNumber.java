import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter amount of prime number that you want to show: ");
        int inputNumber = scanner.nextInt();
        int count = 0;
        int number = 2;
        while (count != inputNumber) {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(number);
                count++;
            }
            number++;
        }
    }
}
