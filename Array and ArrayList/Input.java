import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of the array");
        int n = sc.nextInt();


        int arr[] = new int[n];


        // input using for loop
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        

        //Method-2 output
        System.out.println(Arrays.toString(arr));

/* 
        //Method-1 output
        // printing elenmts of array using for loop
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
*/            



/* 
        for (int num : arr) {
            System.out.println(num +" ");     //here num represents the element of the array    //In 1D array each element of 1d array is an integer
        }
*/             

    sc.close();

    }
}
