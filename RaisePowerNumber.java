//Give 2 numbers a and b.find a raise to the power b.
//2^3=8
//2^5=32
import java.util.Scanner;

public class RaisePowerNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of a:");
        int a=sc.nextInt();

        System.out.println("Enter number of b");
        int b=sc.nextInt();
        int ans=1;
        for(int i=1;i<=b;i++)
        {
            ans*=a;
            
        }
        System.out.println(ans);
        
    }
}
    
