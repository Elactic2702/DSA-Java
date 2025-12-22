import java.util.Scanner;

public class Occurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // WAP to check how many times a digit occurs in any number

        System.out.println("Enter a number");
        int n = sc.nextInt();

        int count = 0; // Count of digits in number initally set to 0

        while (n > 0) {
            int rem = n % 10; // The division of number n with 10 gives a remainder which is the last digit of
                              // the numbeer n

            if (rem == 3) {

                count++;
            }
            n = n / 10; // The no n is divided with 10 to give quoitent and remaining digits of no is
                        // again goes through while loop
        }

        System.out.println("The number of times digit occurred in no. is: "+count);

    }

}
