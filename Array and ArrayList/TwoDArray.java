import java.util.Arrays;
import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[][] = new int[3][3];             //Initialisation
        // or directly
        /*
         * int arr[][]={
         * {1,2,3},
         * {4,5},
         * {6,7,8,9}
         * };
         */

        // Inpput for 2D Array

        // for each row of 2D array
        for (int row = 0; row < arr.length; row++) {
            // for each column in every row
            for (int col = 0; col < arr[row].length; col++) {

                arr[row][col] = sc.nextInt();
            }
        }

        

/* 
            //Method-1 for Output for 2D Array

            // for each row of 2D array
            for (int row = 0; row < arr.length; row++) {
                // for each column in every row
                for (int col = 0; col < arr[row].length; col++) {

                    System.out.print(arr[row][col]+" ");
                }
                System.out.println();  //prints new line after each row
            }
*/
            

            //Method-2 for Output of 2D Array

              // for each row of 2D array
            for (int row = 0; row < arr.length; row++) {
               System.out.println(Arrays.toString(arr[row]));
            }

            

/*           //Output using vforeach loop
            for (int[] arr1 : arr) {                                //In 2D array each element of 2d array itself is an array
                System.out.println(Arrays.toString(arr1));
            }
*/ 

       sc.close();

        }
    }
