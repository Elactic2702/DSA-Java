/* class ReturnString {

    public static String greet() {

        String greeting = "How are you";
        return greeting;

    }

    public static void main(String args[]) {
        String message=greet();

        System.out.println(message);
    }

}
    */

import java.util.Scanner;
class ReturnString {
    public static String greet(String name){
         String message="Hello" + name + "!";

         return message;
    }

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name");
        String name=sc.nextLine();

        String message=greet(name);                       //Calling String function
        System.out.println(message);


    }
}
