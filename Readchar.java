//WAP to read a character from the string

//next-it can use for print string but not print  string after spaces;
//nextline-it can use for print string but also print string after spaces;

import java.util.Scanner;

public class Readchar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); 
        System.out.println("Enter the character"); 
        //char c=sc.next().charAt(2);
        char c=sc.nextLine().charAt(12);
        System.out.println("Character is:"+c);
        
    }
   
}
