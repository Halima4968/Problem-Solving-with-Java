import java.util.Scanner;

public class SumDigits {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Number");
        int number = scanner.nextInt();
        int sum = 0;

        while (number > 0)
        {
            int value = number % 10;
            sum = sum + value;
            number = number / 10;

        }
        System.out.println("Sum of the digits " + sum);

    }
}
