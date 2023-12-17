//program for tringular pattern
// *  r  i-1
// **  r i-2
// ***   i-3
// ****  i-4

import java.util.Scanner;

public class TriangularPattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int r=sc.nextInt();
        for(int i=1;i<=r;i++) {
            for(int j=1;j<=i;j++){

                //for reverse 
                //for(int j=i;j<=r;j++);
                System.out.print("*");
            }
            System.out.println();

        }

    }
    
}
