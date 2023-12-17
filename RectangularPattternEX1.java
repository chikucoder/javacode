//Pattern Printing : Rectangular Pattern

//  ***** 
//  *****
//  ***** 
//row-3
//col-5

import java.util.Scanner;

public class RectangularPattternEX1 {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number for i and j");
         int r=sc.nextInt();
         int c=sc.nextInt();
         
         for(int i=1;i<=r; i++){
            for(int j=1;j<=c; j++)
            {
                System.out.print("*");
            }
            System.out.println();

         }
    }
    
}
