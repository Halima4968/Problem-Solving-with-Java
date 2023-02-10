import java.util.Scanner;

public class Count_of_vowel_consonents {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your word");
        String word=scanner.next();
        int vowel=0,consonants=0;
        word=word.toLowerCase();
        for(int i=0;i<word.length();i++)
        {
            if(word.charAt(i)=='a'||word.charAt(i)=='e'||word.charAt(i)=='i'||word.charAt(i)=='o'||word.charAt(i)=='u')
            {
                vowel=vowel+1;
            }
            else{
                consonants=consonants+1;
            }
        }
        System.out.println("Vowel "+vowel);
        System.out.println("Consonants "+consonants);

    }

}
