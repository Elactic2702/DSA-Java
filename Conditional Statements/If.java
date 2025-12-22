import java.util.*;

public class If {
    public static void main(String[] args) {

        //IF-ELSE-IF

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter salary of employee: ");
        int salary = sc.nextInt();

        if (salary > 50000) {
            System.out.println("The employyer is senior manager");

        } else if (salary <= 50000 && salary>=30000) {
            System.out.println("The eemployeer is a manager");
            salary +=3000; // salary=salary+3000
        } else {
            System.out.println("The employeer is juinor manager");
            salary += 5000; // salary=salary+5000
        }
        System.out.println("The salary of employee is: "+salary);

    }
}