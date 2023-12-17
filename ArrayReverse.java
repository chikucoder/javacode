//Reverse an array consisting of integer values.

//import java.util.Scanner;
public class ArrayReverse {
    public static void main(String[] args) {
        
        int[] arr={1,2,3,4};
       // int rev=' ';
        int n=arr.length;
       for(int i=n-1;i>=0;i-- )
       {
        System.out.print(arr[i]+" ");
       }
    
    
     System.out.println();
}    
}


/* 
import java.util.Scanner;
public class ArrayReverse {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];

        System.out.println("Before Reverse : ");
        for(int i=0;i<n; i++){
           arr[i]=sc.nextInt();
        }
     System.out.println("After Reverse :");
       for(int i=n-1;i>=0;i-- )
       {
        System.out.print(arr[i]+" ");
       }       
}    
}

*/

/* 

import java.util.Scanner;
public class ArrayReverse {
    static void reverse( int[] arr){
     
    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];

        System.out.println("Before Reverse : ");
        for(int i=0;i<n; i++){
           arr[i]=sc.nextInt();
        }
     System.out.println("After Reverse :");
       for(int i=n-1;i>=0;i-- )
       {
        System.out.print(arr[i]+" ");
       }     
      reverse(arr); 
}    
}

*/
