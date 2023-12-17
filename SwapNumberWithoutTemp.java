//Given 2 integers a and b .Swap the 2 given values using sum and difference method.
//Before swap  a=9 b=3
//After swap  a=3 b=9
/* 
public class SwapNumberWithoutTemp{
    static void swap(int a,int b){
    System.out.println(" Before swaaping: ");
    System.out.println(" a :"+a);
    System.out.println(" b :"+b);

    System.out.println(" After swaaping: ");
     a=a+b;//12
     b=a-b;//9
     a=a-b;//6
     System.out.println(" a :"+a);
     System.out.println(" b :"+b);    
}
public static void main(String[] args) {
    int a=9;
    int b=3;
   //int[] arr={1,2,3,4,5};
    swap(a,b);
}    
}
*/


public class SwapNumberWithoutTemp{
    public static void main(String[] args) {
        int a=9;
        int b=3;
    
    System.out.println(" Before swaaping: ");
    System.out.println(" a :"+a);
    System.out.println(" b :"+b);

    System.out.println(" After swaaping: ");
     a=a+b;//12
     b=a-b;//9
     a=a-b;//3
     System.out.println(" a :"+a);
     System.out.println(" b :"+b); 

     System.out.println();
  } 
}    


