
//WAP to take input from users.

import java.util.Scanner;

public class takinginput {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

       //for printing string
        System.out.println("Enter your name");
        String name=sc.nextLine();
        System.out.println("Name is:"+name);

        //for printing int
       System.out.println("Enter your number");
        int num1=sc.nextInt();
        System.out.println("Lucky number is:"+num1);
    }
    
}
