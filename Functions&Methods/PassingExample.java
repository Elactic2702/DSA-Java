import java.util.Scanner;
public class PassingExample {
   public static void greet(String name){
   System.out.println("The name of the person is: "+name);
   }

   public static void main(String[] args) {
  /*  greet("Hetaksh");
   greet("Khushi"); */

   Scanner sc=new Scanner(System.in);
   System.out.println("Enter name of the person");
   String name=sc.nextLine();

   greet(name);

   sc.close();




   }
}
