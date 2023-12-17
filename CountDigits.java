//Count the number of  digits for a given number num
//12345  ----->5          //solut--    1234/10=123
//12  --->  2             //        123/10=12
                          //       12/10=1
                           //      1/10=0

import java.util.Scanner;


public class CountDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number:");
        int num=sc.nextInt();
        int count=0;
        int original_num=num;
        while(num>0)
        {
            num=num/10;
            count++;
        }
       System.out.println("Number of digits:"+ original_num+ "=" +count);
        
    }
    
}
