import java.util.Scanner;

public class count_notes {

    public static void main(String[] args) {
       Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your value");
        int amount= scanner.nextInt();

        int[] notes = {1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};


        for (int i = 0; i < notes.length; i++) {
            int number = notes[i];
            if (amount >= number) {
                int count = amount / number;
                amount = amount % number;
                System.out.println(number + " " + count);
            }


        }

    }
}

