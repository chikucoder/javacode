//Numeric Triangular Pattern
// 1  
// 1 2
// 1 2 3  
// 1 2 3 4 

import java.util.Scanner;

public class NumericTriangular {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int r=sc.nextInt();
        for(int i=1;i<=r;i++)
        {
            for(int j=1;j<=i;j++)
            {
            System.out.print(j);
            }
            System.out.println();
        }
           
        }
    }
    


