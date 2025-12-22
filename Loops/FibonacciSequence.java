import java.util.Scanner;

public class FibonacciSequence {
    public static void main(String[] args) {

        // WAP to fing nth fibonacci number

        Scanner sc = new Scanner(System.in);
        
        int a=0;
        int b=1;

        System.out.println("Enter range of fibonacci sequence to be printed");
        int n=sc.nextInt();

        for (int i = 1; i <=n; i++) {          //To print till nth fibonacci sequence
            System.out.print(a);
            int next = a+b;
            a=b;
            b=next;

        }
        sc.close();



    }

}
