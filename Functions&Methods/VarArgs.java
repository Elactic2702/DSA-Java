import java.util.Arrays;

public class VarArgs {

    public static void fun(int... v) {
        System.out.println(Arrays.toString(v));
    }

    public static void mad(String... x) {
        System.out.println(Arrays.toString(x));
    }

    public static void multiple(int a,int b,String...v){  //variable lenght arguments should be at end of function
        System.out.println(a);
        System.out.println(b);
        System.out.println(Arrays.toString(v));

    }

    public static void main(String[] args) {
        fun(1, 2, 3, 4); // Variable length arguments,it will print array of numbers i.e. [1,2,3,4]

        mad("Hello", "World", "Welcome"); // Variable length arguments,it will print array of strings

        multiple(2, 3, "Hello","world","my","name");
    }
}