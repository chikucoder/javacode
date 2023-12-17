//Given an array 'a' consiting of integers.Return the first value that is repeating in this array.
//If no value is being repeated,return -1.

//1 2 5 3 4 6 3 4
//ans=3
//1 2 4 6 7
//ans=-1
/* 
import java.util.Scanner;

public class ArrayManipulationConsitingInteger
{
    static int number(int[]arr){
        int n=arr.length;
       for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
         if(arr[i]==arr[j]){
           return arr[i];
                }
            }
        }
         return -1;
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

        System.out.println("First value that has been repeated : ");
        
        System.out.print("Output :"+number(arr));
    }    
}
*/

//logic code for last repeating number
 import java.util.Scanner;

public class ArrayManipulationConsitingInteger
{
static int number(int[]arr){
    int n=arr.length;
    int ans=-1;
   for(int i=0;i<n;i++){
    for(int j=i+1;j<n;j++){
     if(arr[i]==arr[j]){
       ans=arr[i];
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

        System.out.println("First value that has been repeated : ");
        
        System.out.print("Output :"+number(arr));
    }    
}
