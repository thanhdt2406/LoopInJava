import java.util.Scanner;

public class Interest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of month: ");
        int month = scanner.nextInt();

        System.out.println("Enter money: ");
        long money = scanner.nextLong();

        System.out.println("Enter rate: ");
        float rate = scanner.nextFloat();

        double totalInterest = 0d;
        for(int i=0;i<month;i++){
            totalInterest += money * (rate/100)/12 * month;
        }

        System.out.println("Total of interest: "+totalInterest);
    }
}
