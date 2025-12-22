import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
         * int i=1;
         * do{
         * System.out.println(i);
         * i++;
         * 
         * }while(i<=10);
         * System.out.println("Printed numbers from 1 to 10");
         */




        // Print numbers from 1 to n

        System.out.println("Enter range of loop");
        int n = sc.nextInt();

        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i <= n);
        System.out.println("Numbers printed from 1 to " + n + " using do-while loop");


    }

}
