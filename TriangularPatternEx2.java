//program for tringular pattern

// **** r i-4    r+1-i=4+1-1=4
// ***  r i-3    r+1-i=4+1-2=3
// **   i-2
// *   i-1

/* 
import java.util.Scanner;

public class TriangularPatternEx2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int r=sc.nextInt();
        for(int i=1;i<=r;i++) {
            for(int j=1;j<=(r+1-i);j++){
                System.out.print("*");
            }
            System.out.println();

        }

    }
    
}

*/

import java.util.Scanner;

public class TriangularPatternEx2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int r=sc.nextInt();
        for(int i=r;i>=1;i--) {
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();

        }

    }
}
    

