import java.util.Arrays;
import java.util.Scanner;

public class Overloading {
    public static int fun(int a) {
        System.out.println(a);
        return a;
    }

    public static void fun(String name) {
        System.out.println("Your name is: " + name);
    }

    public static void demo(int... v) {
        System.out.println(Arrays.toString(v));
    }

    public static void demo(String... v) {
        System.out.println(Arrays.toString(v));
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.nextLine();
        fun(name); // fun(String)

        fun(2); // fun(int)




        demo(2, 3, 4, 54, 5, 6, 65466); // demo(int...v)

        demo("abc", "xyz", "aaa", "bbb"); // demo(String...v)


        sc.close();
    }
}
