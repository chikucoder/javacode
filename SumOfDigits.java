//Find the sum of digits in a given number n
// 765  = 7+6+5=18
//sol --> (Any num)%10 =last digit num
//         765%10==5
//remaing number 76--->   76/10
   
    
    import java.util.Scanner;

    public class SumOfDigits {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the number");
            int num=sc.nextInt();
            int sum =0;
            int digits;
            while(num>0){
                digits=num%10;
                sum=sum+digits;
                num=num/10;
            }
            System.out.println("sums:" +sum);


            // int sum_0f_digits=0;
            // int original_numb=num;
            // while(num>0)
            // {
            //     sum_0f_digits +=num%10;
            //     num=num/10;
                


            // }
            // System.out.println("sum"+ original_numb + ":" +sum_0f_digits);

           
        }
    }
