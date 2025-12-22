import java.util.*;

public class IfStatement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter salary of employee: ");
        int salary = sc.nextInt();

        if (salary>=50000) {
            System.out.println("The employyer is senior manager");
            
        }
        else{
            System.out.println("The employeer is junior manager");
        }
    }
}