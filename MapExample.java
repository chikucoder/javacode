import java.util.HashMap;

public class MapExample {
    public static void main(String[] args) {
        HashMap<String,Integer> courses=new HashMap<>();
        courses.put("Java",5000);
        courses.put("Python",3000);
        courses.put("Spring",1000);
        courses.put("C++",4000);
          courses.put("C++",6000);
        courses.put("DBMS",3500);
        System.out.println(courses);

        // courses.forEach((e1,e2)->{
        //     System.out.println(e1+"=>"+e2);
        // });

         courses.forEach((key,value)->{
            System.out.print(key);
            System.out.print("=>");
            System.out.println(value);
            System.out.println();
            //entry set
            //key set  
        });
        System.out.println(courses.get("Java"));
    }
    
}
