import java.util.ArrayList;
public class ArrayListEx {
    public static void main(String[] args) {
        //Wrapper class
         //int i=Integer.valueOf(4);
         //System.out.println(i);
         ArrayList<Integer> l1=new ArrayList<Integer>();
         // add new element
          l1.add(5);
         l1.add(3);
         l1.add(8);
         //get an element at index i
       //  System.out.println(l1.get(2));//8
       //print with for loop
    //    for (int j = 0; j < l1.size(); j++) {
    //     System.out.println(l1.get(j));
        
    //    }

       //print the array list directly
       System.out.println(l1);//[5,3,8]

       //adding element at some index i
       l1.add(1, 15);
       System.out.println(l1);

       //modify element at  index i
       l1.set(2, 16);
       System.out.println(l1);
        //removing an element at  index i
        l1.remove(2);
        System.out.println(l1);

        //removing an element e
        l1.remove(Integer.valueOf(5));
        System.out.println(l1);

         //checking if an element exits
        boolean b1= l1.contains(Integer.valueOf(5));
         System.out.println(b1);

         //if you don't speccify class,you can put anything inside l
         ArrayList a1=new ArrayList();
         a1.add(12);
         a1.add(true);
         a1.add("Apple");
         System.out.println(a1);





    }
    
}
