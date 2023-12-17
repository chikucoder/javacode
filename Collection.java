//creating collection
//Type safe -same type of elements(objects) are added to collection.

//un type safe-different type of elements(objects) are added to collection.such as int,float,double....

import java.util.*;
//import java.util.LinkedList;
public class Collection {
    public static void main(String[] args) {
        //Type safe
        ArrayList<String> names=new ArrayList<String>();
         names.add("ram");
         names.add("atul");
         names.add("chicku");
         names.add("chicku");
         // names.add(1234); Error comes
         //System.out.println(names);
         //System.out.println(names.get(2));
         names.remove("atul");
         System.out.println(names);
        // names.size();
         System.out.println(names.size());
         System.out.println(names.contains("ram"));//true
         System.out.println(names.isEmpty());//false
         names.set(2,"ritik");
         System.out.println(names);

         //un type safe
        //  LinkedList l1=new LinkedList();
        //  l1.add("chicku");
        //  l1.add("25");
        //  l1.add(25000.0);
        //  System.out.println(l1);

        Vector<String> vector=new Vector<String>();
        vector.addAll(names);
        System.out.println("Vector"+vector);
         vector.add(1,"honey");
        System.out.println("Vector"+vector);
        System.out.println("________________________________");

        HashSet<Double> h1=new HashSet<Double>();
        h1.add(14.14);
        h1.add(34.12345);
        h1.add(2354.235);
        h1.add(99.9);
        h1.add(99.9);
        h1.add(5.3);
        System.out.println(h1);

        TreeSet<Double> tSet=new TreeSet<>();
        tSet.addAll(h1);
        System.out.println(tSet);


        
    }
    
}
