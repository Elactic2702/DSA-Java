import java.util.Arrays;

public class PassingInFunction {

    public static void change(int arr[]) {
        arr[0] = 99;
    }

    public static void main(String[] args) {
        int nums[] = { 3, 4, 5, 6 };
        System.out.println(Arrays.toString(nums));

        change(nums);
        System.out.println(Arrays.toString(nums)); // CALL BY VALUE IN JAVA Arrays are muttable i.e. main method get
                                                          // affected by the function call iunlike striings and intgeres
    }
}
