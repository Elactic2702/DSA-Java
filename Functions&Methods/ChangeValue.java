import java.util.Arrays;

public class ChangeValue {
    // Program to demonstrate Call By Value in java

    public static void change(int[] nums) {
        nums[0] = 99;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, 2, 45, 6 };

        change(arr); // In call by value the array arr[] changes to {99,3,2,45,6} unlike strings and
                     // integrs where objects in main() method are unaffected by function()
 

        System.out.println(Arrays.toString(arr));

    }

}
