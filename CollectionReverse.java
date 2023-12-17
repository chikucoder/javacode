import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionReverse {
    public static void main(String[] args) {
         ArrayList<Integer> a=new ArrayList<>();// here a is used for list
         a.add(10);
         a.add(5);
         a.add(33);
         a.add(8);
         a.add(50);
         System.out.println("Original List"+a);
         Collections.reverse(a);
         System.out.println("Reversed List"+a);
         Collections.sort(a);
         System.out.println("Ascending order" + a);
         Collections.sort(a,Collections.reverseOrder());
         System.out.println("Descending order:"+ a);

        ArrayList<String> l1=new ArrayList<>();
        l1.add("welcome");
        l1.add("to");
        l1.add("apple");
        l1.add("home");
        l1.add("guys");
        System.out.println("Original String:"+l1);
        Collections.sort(l1);
        System.out.println("Ascending order" + l1);
        Collections.sort(l1,Collections.reverseOrder());
        System.out.println("Descending order:"+ l1);

    }
    
}
