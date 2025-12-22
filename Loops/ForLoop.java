import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // Print numbers from 1 to 5

        /* for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        } */

       
        //Print numbers from 1 to n
        System.out.println("Enter range of loop");
        int n=sc.nextInt();
        for (int i = 1; i <=n; i++) {
            System.out.print(i+" ");
            System.out.println("Hello World");
           
        }
         System.out.println("\nNumbers printed from 1 to " + n);
         sc.close();


    }
}
