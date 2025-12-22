public class Shadowing {

    static int x = 90; // Scope of x is inside class Shadowing   /This will be shadowed at line 8

    public static void main(String[] args) {
        System.out.println(x); // output 90

        int x = 40;// Scope of x inside main() method only 
        System.out.println(x); // output 40

        fun();
    }

    public static void fun() {
        System.out.println(x);
    }

}
