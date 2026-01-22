import java.util.Scanner;
import java.util.ArrayList;

public class ArrayListing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ArrayList Syntax
        ArrayList<Integer> list1 = new ArrayList<>(10);     // Constructor creation (class obj=new class;)

/*        list1.add(67);              // obj.method();
        list1.add(11);   
        list1.add(101);    
        

        System.out.println(list1);

        list1.set(0,99);
        System.out.println(list1);


        System.out.println(list1.contains(11));

        list1.remove(2);
        System.out.println(list1);      */ 





        //Input
        System.out.println("Enter elements in Array list");
        for (int i = 0; i < 5; i++) {
            list1.add(sc.nextInt());
        }

        //Output
        for (int i = 0; i < 5; i++) {
            System.out.print(list1.get(i));             //pass list.get(index) here, list[index] will not worklike in Arrays
        }
        System.out.println();

        sc.close();
    }
}
