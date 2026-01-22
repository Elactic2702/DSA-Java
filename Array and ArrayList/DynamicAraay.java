import java.util.Scanner;
public class DynamicAraay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no of rows");
        int row = sc.nextInt();

        System.out.println("Enter no of columns");
        int col = sc.nextInt();

        int[][] arr = new int[row][col];                //Initialisation

        System.out.println("Enter elements");
        // Input for every row
        for (row = 0; row < arr.length; row++) {
            for (col = 0; col < arr[row].length; col++) { // Input for every column of a row

                arr[row][col] = sc.nextInt();

            }
        }
        
        //Output for 2D Arrays
        for (row = 0; row < arr.length; row++) {
            for (col = 0; col < arr[row].length; col++) {

                System.out.print(arr[row][col] + " ");

            }
            System.out.println();
        }
        sc.close();

    }
}
