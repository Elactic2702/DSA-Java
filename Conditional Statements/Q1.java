import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Program to finf max of three numbers

        System.out.println("Enter first number: ");
        int a = sc.nextInt();

        System.out.println("Enter second number: ");
        int b = sc.nextInt();

        System.out.println("Enter third number: ");
        int c = sc.nextInt();

        int max = a;
        if (b > max) {
            max = b;

        }

        if (c > max) {
            max = c;

        }

        System.out.println("The largest number is: " + max);

        
       // System.out.println(Math.max(c,Math.max(a, b)));

    }
}




// Method-2
/*
 * System.out.println("Enter first number: ");
 * int a = sc.nextInt();
 * 
 * System.out.println("Enter second number: ");
 * int b = sc.nextInt();
 * 
 * System.out.println("Enter third number: ");
 * int c = sc.nextInt();
 * 
 * 
 * if (b > a && b>c) {
 * System.out.println("The greatest no is"+b);
 * 
 * }
 * 
 * else if (c >a && c>b) {
 * System.out.println("The greatest no is"+c);
 * 
 * }
 * 
 * else{
 * 
 * System.out.println("The greatest no is"+a);
 * }
 * }
 * }
 * 
 */
