import java.util.Arrays;
import java.util.Collections;

public class Sort {
    public static void main(String[] args) {
        Integer[] arr = {3, 7, 2, 9, 4}; 

        Arrays.sort(arr, Collections.reverseOrder());

        
        System.out.println("Sorted in descending order:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}






