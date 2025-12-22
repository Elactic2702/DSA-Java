import java.util.*;
public class TypeCasting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //Implicit Type Casting (Widening)
        int a=15;
        float b=a;
        System.out.println("Type casting from integer to float value is: "+b);


        //Explicit Type Casting (Narrowing)
        float c=25.999f;
        int d=(int)c;
        System.out.println("Type casting from float to int value is: "+d);



    }
}
