//Pattern:Target sum
//find the total number of pairs in the array whose sum is 
// equal to the given value x.
//4 6 3 5 8 2
//target = 7
//ans=2    (4,3) (5,2)


/* 
public class ArrayTargetSum {
    public static void main(String[] args) {
        int[] arr={1,3,2,4,5,6};
        int n=arr.length;
        int target=7;
        int ans=0;

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){

                if(arr[i]+arr[j]==target)
                {
                    ans++;
                }
            }
              
        }
        System.out.println("Target sum:" +ans); 
        
    }
    
}

*/

import java.util.Scanner;

public class ArrayTargetSum{

    static int arrayTargetSum(int[] arr,int target)
    {
        int n=arr.length;
        int ans=0;

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==target)
                {
                    ans++;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n=sc.nextInt();
        int[] arr=new int[n];

        System.out.println("Enter the array element : ");
        for(int i=0;i<n;i++)
        {
             arr[i]=sc.nextInt();

        }

        System.out.println("the target sum  value: ");
        int target=sc.nextInt();
 
        System.out.print("Output :"+arrayTargetSum(arr, target));

    }
}
