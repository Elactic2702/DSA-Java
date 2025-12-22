import java.util.*;

public class WhileLoop {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Printing Hello World 10 times

        /*
         * int counter = 0;
         * while (counter < 10) {
         * System.out.println("Hello World");
         * counter++;
         * }
         * System.out.println("Printed Hello World 10 times");
         */

        // Printing first 10 numbers that is 1 to 10
        /*
         * int counter=1;
         * while (counter<=10) {
         * System.out.print(counter+" ");
         * counter++;
         * }
         * System.out.println("\nNumbers printed from 1 to 10");
         */

        // Printing numbers from 1 to n
        /*
         * int counter=1; //i
         * int range=sc.nextInt(); //n
         * while (counter<=range) {
         * System.out.println(counter);
         * counter++;
         * }
         * System.out.println();
         */

        // Printing sum of first n natural numbers
        /*
         * int sum=0;
         * int i=1; //counter
         * int n=sc.nextInt();
         * 
         * while (i<=n) {
         * sum=sum+i;
         * System.out.println(sum);
         * i++;
         * }
         * System.out.println("Sum of first n natural numbers");
         */

        System.out.println("Enter range of loop");
        int n = sc.nextInt();

        int i = 1;
        while (i <= n) {
            System.out.println(i);
            i++;
        }
        System.out.println("Numbers printed from 1 to " + n);
        sc.close();
    }
}