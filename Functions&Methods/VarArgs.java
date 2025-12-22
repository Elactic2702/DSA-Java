import java.util.Arrays;

public class VarArgs {

    public static void fun(int... v) {
        System.out.println(Arrays.toString(v));
    }

    public static void mad(String... x) {
        System.out.println(Arrays.toString(x));
    }

    public static void main(String[] args) {
        fun(1, 2, 3, 4); // Variable length arguments,it will print array of numbers i.e. [1,2,3,4]

        mad("Hello", "World", "Welcome"); // Variable length arguments,it will print array of strings
    }
}