public class Prime_numbers {
    public static void main(String[] args) {

        String primeNumbers = "";
        for (int i = 2; i <= 100; i++)
        {
            int sum = 0;
            for (int j = i; j >= 1; j--)
            {
                if (i % j == 0)
                {
                    sum = sum + 1;
                }
            }

            if (sum == 2)
            {
                primeNumbers = primeNumbers + i + ",";
            }
        }
        System.out.println("Prime numbers are:");
        System.out.println(primeNumbers);


    }
}
