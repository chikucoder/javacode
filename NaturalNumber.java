//Print the  first n natural numbers,when n is the input.
//1,2,3,4,.....n

import java.util.Scanner;

public class NaturalNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        // int num=1;
        // while(num<=n){
            
        //     System.out.println("Natural number:"+num);
        //     num=num+1;//num++

       
        for(int num=1;num<=n;num++)
        {
            System.out.println("Natural number :" +num);
        }
        
       
    }
}
    