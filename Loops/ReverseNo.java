import java.util.Scanner;

public class ReverseNo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int n = sc.nextInt();

        int rev = 0;                                           // Reverse of number

        while (n > 0) {

            int rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;

        }

        System.out.println("Reverse of the string is: " + rev);

    }
}
