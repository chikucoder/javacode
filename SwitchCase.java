//WAP to print day based on the day number
//
//Day number  :  Output
//1           :   Monday   
//2           :   Tuesday
//7           :    Sunday

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the day number");
        int  day=sc.nextInt();
        switch(day){
        case 1:
        System.out.println("Monday");
        break;
        case 2:
        System.out.println("Tuesday");
        break;
        case 3:
        System.out.println("Wedensday");
        break;
        case 4:
        System.out.println("Thursday");
        break;
        case 5:
        System.out.println("friday");
        break;
        case 6:
        System.out.println("Saturday");
        break;
        case 7:
        System.out.println("Sunday");
        break;
        default:
        System.out.println("Invalid Day Number");

        }
    }
    
    
}
