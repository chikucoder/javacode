//Pattern: Array Manipulation
//Find the unique number in a given Array where all the elements are being
//repeated twice with one value being unique.
// 1 2 1 2 3 3 4 5 5
//output=4

import java.util.Scanner;

public class ArrayManipulationUniqueNumb
{
    static int uniquenumb(int[]arr){
        int n=arr.length;

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    arr[i]=-1;
                    arr[j]=-1;

                }
            }
        }

        int ans=-1;
        for(int i=0;i<n;i++){
            if(arr[i]>0){
                ans=arr[i];
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

        System.out.println("Unique number: ");
        
        System.out.print("Output :"+uniquenumb(arr));

    }




    
}
