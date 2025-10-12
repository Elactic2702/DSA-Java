import java.util.*;
public class BinaryNumberEnqueue{
    public static void main(String args[]){
        Queue<String>q=new LinkedList<>();
        q.add("1");
        int n=10;

        for (int i = 0; i < n; i++) {
            String curr=q.remove();
            System.out.println(curr);

            q.add(curr+"0");
            q.add(curr+"1");

            System.out.println("Genersting binary numbers"+i);
        }
    }
}