//Count the number of triplets whose sum is equal to the given value x.
// 1 4 5 6 3
//target =12
//ans=2 (1,5,6) (4,5,3)

/* 
public class ArrayTargetTripleSum {
    public static void main(String[] args) {
        int [] arr={1,4,5,6,3};
        int n=arr.length;
        int target=12;
        int ans=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    if(arr[i]+arr[j]+arr[k]==target){
                        ans++;
                    }

                }
            }

        }
        System.out.println("Number of triplets sum : " +ans);
    }
    
}

*/

import java.util.Scanner;

public class ArrayTargetTripleSum{
    static int arrayTargetTripleSum(int[] arr,int target)
    {
        int ans=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    if(arr[i]+arr[j]+arr[k]==target){
                        ans++;
                    }
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

      System.out.println("Enter the array elements :");
      for(int i=0;i<n; i++)
      {
        arr[i]=sc.nextInt();
      }
      System.out.println("Enter target value: ");
      int target=sc.nextInt()
      ;
      System.out.println("Output :" +arrayTargetTripleSum(arr, target));

    }

}
