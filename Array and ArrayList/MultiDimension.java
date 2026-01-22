import java.util.Scanner;
import java.util.ArrayList;

public class MultiDimension {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        ArrayList<ArrayList<Integer>> list= new ArrayList<>();
    
        //Initialisation
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }


        //add elements or input
        System.out.println("Enter eleemst of array");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add(sc.nextInt());
            }
        }

        //output
        System.out.println(list);

        sc.close();


    }
}
