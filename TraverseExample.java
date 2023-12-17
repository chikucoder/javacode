import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.TreeSet;

public class TraverseExample {
     public static void main(String[] args) {
        //Type safe
        ArrayList<String> names=new ArrayList<String>();
         names.add("ram");
         names.add("atul");
         names.add("chicku");
         names.add("chicku");

         //for each loop
         for(String str:names){
            System.out.println(str+" "+str.length());

            StringBuffer buffer=new StringBuffer(str);
            System.out.println(buffer.reverse());
            System.out.println("_________________________");

            //traversing using ITERATOR:Forward traversing
              Iterator<String> itr=names.iterator();
              while(itr.hasNext()){
                String next=itr.next();
                System.out.println(next);

                System.out.println("+++++++++++++++++++");

                //Backward traversing

            ListIterator<String> li=names.listIterator(names.size());
            while(li.hasPrevious()){
                String previous=li.previous();
                System.out.println(previous);

                //Enumeration
                System.out.println("++++++++++++++++++++");
                //for each method
                names.forEach(e->{
                    System.out.println(e);
                });

                System.out.println("Sorting of Elements");
                TreeSet<String> set=new TreeSet<>();
                set.addAll(names);
               set.forEach(f->{
                System.out.println(f);

                //Comparable
                //Comparator
               });
            }
              }

         }
     }
}
