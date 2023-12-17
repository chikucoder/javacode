// 1 2 3  4 5 6 7
// 2 3 4 5  6 7 1 
// 3 4 5 6 7 1  2
// 4 5 6 7 1 2 3 4
// 5 6 7 1 2 3 4 5
// 6 7 1 2 3 4 5
// 7 1 2 3 4 5 6

import java.util.Scanner;

public class NumericalRectangularEx1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int r=sc.nextInt();
        int c=sc.nextInt();
        for(int i=1;i<=r;i++)
        {
            for(int j=i;j<=c;j++)
            {
                System.out.print(j);
            }
            
            System.out.println();
        }
    }
    
}
