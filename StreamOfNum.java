//Wap to sum of any number taking input from user
// 1+20+10=31


import java.util.Scanner;

public class StreamOfNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter th numb");
        int num=sc.nextInt();
         int sum=0;

         while(num!=-1)
         {
            sum+=num;
            num=sc.nextInt();
            

         }
         System.out.println(sum);
    }
    
}






 









