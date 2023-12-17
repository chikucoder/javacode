
//Print the reverse of  first n natural numbers,when n is the input.
//n=10;
//10,9,8,7,6,5,4,3,2,1...

import java.util.Scanner;

public class ReverseNaturalNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        
        for(int num=n;num>=1;num --){
            
            System.out.println("Natural number:"+num);
            
             
        }
   
    }
}