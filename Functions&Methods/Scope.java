public class Scope {

    public static void random(int marks) {
        // System.out.println(a);
        //  Scope of variable 'a' is limited to main() method only
        // 'marks' is accessible only inside this method
    }

    public static void main(String[] args) {

        int a = 10;   // Variable 'a' is declared in main()
        int b = 20;

        a = 100;      //  Value of 'a' can be changed (not redeclared)

        {
            a = 78;   //  Variable declared outside the block can be used inside the block

            int c = 100;   // 'c' is declared inside this block
            c = 20;        // Value of 'c' can be changed inside the block

            // int c = 10;
            //  Cannot redeclare 'c' in the same block
        }

        // int c = 100;
        //  This is a NEW variable 'c'
        //  The previous 'c' declared inside the block is not accessible here
        int c = 20;

        // System.out.println(marks);
        //  Scope of argument 'marks' is limited to random() method only

        for (int i = 0; i < 4; i++) {
            System.out.println(i);

            int num = 100; // 'num' exists only inside the loop
            int x = 12;    // 'x' exists only inside the loop

            // int a = 20;
            //  Cannot redeclare 'a' inside the same method
        }

        // 'i', 'num', and 'x' cannot be accessed outside the loop
    }
}
