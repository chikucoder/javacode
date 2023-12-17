
//Print the sum of  first n natural numbers,when n is the input.
//1,2,3,4,.....n
//1, 1+2,3+3,6+4,.......
import java.util.Scanner;

public class SumNaturalNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
         int num=1;
         int sum=0;
       while(num<=n){
            
           System.out.println("Natural number:"+num);
           sum=sum+num;
           num ++;  //num=num+1
        }
       System.out.println(sum);

    //  for(int num=1;num<n;num++){
    //         System.out.println("Natural number:"+num);
    //          sum=sum+num;
             
    // }
    //  System.out.println("sum of natural number:" +sum);
   
}
    
}