import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
public class CustomArrayList {
    public static void main(String[] args) {
        ArrayList<String>list=new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("C");
        System.out.println(list);


        list.add(1,"C");
        System.out.println(list);
        System.out.println(list.get(2));
        System.out.println(list.set(0, "Django"));
        System.out.println(list);

        list.remove(1);
        System.out.println(list);

        list.get(1);
        System.out.println(list);

        list.sort(null);
        System.out.println(list);

        //MAX MIN Element
        String maximum=Collections.max(list);
        String minimum=Collections.min(list);
        System.out.println(list);

        //Sorte ArrayList
        Collections.sort(list);
        System.out.println(list);

        //For each iteration
        for(String l:list){
            System.out.println(l);
        }

    }
    
}
