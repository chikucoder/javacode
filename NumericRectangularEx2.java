
// 12345
// 23451
// 34512
// 45123

import java.util.Scanner;

public class NumericRectangularEx2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int r=sc.nextInt();
        for(int i=1;i<=r;i++)
        {
            for(int j=i;j<=r;j++)
            {
                System.out.print(j);
            }
            for(int k=1;k<=i-1;k++)
            {
                System.out.print(k);
            }
            System.out.println();
        }
    }
    
} 


// 1 2 3 4 5 6 
// 1 2 3 4 5 6  
// 1 2 3 4 5 6 
// 1 2 3 4 5 6
/*
import java.util.Scanner;

public class NumericRectangularEx2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int r=sc.nextInt();
        for(int i=1;i<=r;i++)
        {
            for(int j=1;j<=r;j++)
            {
                System.out.print(j+" ");
            }
           
            System.out.println();
        }
    }
    
}

 */