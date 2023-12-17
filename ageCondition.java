//Wap to divide people into 3 age group depending upon their age.
//AGE      : Output
//Below 12  :  Child
//Below 12 and 18  : Teenager
//Above 18  : Adult

import java.util.Scanner;

public class ageCondition {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the age");
        int age=sc.nextInt();
        if(age<=12){
            System.out.println("Child");
        }
        else if(age>12 &&  age<18){

            System.out.println("Teenager");
        }
        else{
            System.out.println("Adult");
        }
        
    }
    
}
