//Given 2 integers a and b .Swap the 2 given values using temparory variables.
//Before swap  a=3 b=4
//After swap  a=4 b=3
/* 
public class ArraySwapNumber {
        static void swap(int a,int b){
        System.out.println(" Before swaaping: ");
        System.out.println(" a :"+a);
        System.out.println(" b :"+b);

        System.out.println(" After swaaping: ");
         int temp= a;//6
         a=b;//3
         b=temp;//6
         System.out.println(" a :"+a);
         System.out.println(" b :"+b);    
    }
    public static void main(String[] args) {
        int a=9;
        int b=3;
       //int[] arr={1,2,3,4,5};
        swap(a, b);
    }    
}

*/

 
/* 
public class ArraySwapNumber {
        public static void main(String[] args) {
       
        int a=6;
        int b=3;
      //  int [] arr={1,2,3,4,5};
        
        
        System.out.println(" Before swaaping: ");
        System.out.println(" a :"+a);
        System.out.println(" b :"+b);


        System.out.println(" After swaaping: ");
         int temp= a;//6
         a=b;//3
         b=temp;//6
         System.out.println(" a :"+a);
         System.out.println(" b :"+b);
        
         System.out.println();
    }       
}

*/

//Taking input fromn users.

import java.util.Scanner;

public class ArraySwapNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the valur for a and b :");
   
    int a=sc.nextInt();
    int b=sc.nextInt();
    //int [] arr={1,2,3,4,5};
    
    
    System.out.println(" Before swaaping: ");
    System.out.println(" a :"+a);
    System.out.println(" b :"+b);


    System.out.println(" After swaaping: ");
     int temp= a;//6
     a=b;//3
     b=temp;//6
     System.out.println(" a :"+a);
     System.out.println(" b :"+b);
    
     System.out.println();
}    
}


