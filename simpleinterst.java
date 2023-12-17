//sisi=(p*r*t)/100

import java.util.Scanner;

public class simpleinterst {
    public static void main(String[] args) {
        
  
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter your Principle");
    float p=sc.nextFloat();
    System.out.println("Enter your Rate of interest");
    float r=sc.nextFloat();
    System.out.println("Enter your time");
    float t=sc.nextFloat();
    System.out.println("Principle:"+p);
    System.out.println("Rate of interest:"+r);
    System.out.println("Time:"+t);
    float si=(p*r*t)/100;
    System.out.println("Simple Interest:"+si);


    }   
}
