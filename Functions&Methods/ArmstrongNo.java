import java.util.Scanner;

public class ArmstrongNo {

    public static boolean armstrong(int n) {

        int original = n;
        int sum = 0;

        while (n > 0) {

            int rem = n % 10;              // 153---->3
            n = n / 10;                     // 153--->15
            int cube = rem * rem * rem;          // 3*3*3--->27

            sum += cube;                       // 1+125+27
        }

        if (sum == original) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no");
        int n = sc.nextInt();

         System.out.println(armstrong(n));      // Program to check wether number is armstrong or not


       //Program to print 3-digit Armstrong numbers
        for (int i = 100; i < 1000; i++) {
            if (armstrong(i)) {
                System.out.print(i + " ");
            }
        }

        sc.close();

    }
}
