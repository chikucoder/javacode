
//Pattern Printing : Rectangular Pattern

//  ****** 
//  *    *
//  *    * 
//  ******
//row-4
//col-6

import java.util.Scanner;

public class RectangularPatternEx2 {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number for i and j");
         int r=sc.nextInt();
         int c=sc.nextInt();
         
         for(int i=1;i<=r; i++){
            
            for(int j=1;j<=c; j++)
            {
                if(i==1 || i==r || j==1 || j==c){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ") ;
                   }
            
           }
           System.out.println(); 
     }
   }
}


