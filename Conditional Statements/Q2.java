import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //Program to find wether an alpahabet is uppercase or lowercase

        System.out.println("Enter a character: ");
        char ch=sc.next().trim().charAt(0);

        if (ch>='a' && ch<='z') {
            System.out.println("Lowercase");
            
        }
        else{
            System.out.println("Uppercase");
        }
        System.out.println("Character is "+ch);

    }
}
