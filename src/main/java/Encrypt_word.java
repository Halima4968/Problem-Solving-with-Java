import java.util.Scanner;

public class Encrypt_word {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your word");
        String word= scanner.next();
        char[] chars=word.toCharArray();
        for(char input:chars)
        {
            input+=5;
            System.out.print(input);
        }


    }
}
