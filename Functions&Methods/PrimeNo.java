import java.util.Scanner;

public class PrimeNo {

    public static void prime(int a) {
        if (a == 1) {
            System.out.println("NO is neither prime nor composite");
        }
        System.out.println(a);
    }

    public static boolean isPrime(int n) {

        if (n == 2) {
            return true;
        }

        for (int i = 2; i < n - 1; i++) {
            if (n % i == 0) { // no gettibg completely divided by another no
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no");
        int n = sc.nextInt();

        System.out.println(isPrime(n));


        System.out.println("Enter no 1");
        int a = sc.nextInt();
        prime(a);

        sc.close();

    }
}
