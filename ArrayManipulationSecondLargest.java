//Pattern: Array Manipulation
//Ans will always exits.
//Find the second largest element in the given array.
//9 8 9 6 9 5 8
//max=9
//secondmax=8

//0 -2 0 -3 0 -4
//max=0
//secondmax=-2

import java.util.Scanner;

public class ArrayManipulationSecondLargest
{
    static int firstMaxNumber(int[]arr){
        int n=arr.length;
        int max=Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            
                if(arr[i]>max){
                  max=arr[i];

                }
            }
            return max;
        }

        static int secondMaxNumber(int[]arr){
            int max=firstMaxNumber(arr);
            int n=arr.length;
            for(int i=0;i<n;i++){
                
                    if(arr[i]==max){
                        arr[i]=Integer.MIN_VALUE;
                    }
                }
                int secondmax=firstMaxNumber(arr);
                return secondmax;
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

        System.out.println("Second max number : ");
        
        System.out.print("Output :"+secondMaxNumber(arr));
    }
}



/* 
//Pattern: Array Manipulation
//Ans will always exits.
//Find the second smallest element in the given array.
//9 8 9 6 9 5 8
//min=5
//secondmax=6

//0 -2 0 -3 0 -4
//max=-2
//secondmax=-3

import java.util.Scanner;

public class ArrayManipulationSecondLargest
{
    static int firstMinNumber(int[]arr){
        int n=arr.length;
        int min=Integer.MAX_VALUE;

        for(int i=0;i<n;i++){
            
                if(arr[i]<min){
                  min=arr[i];

                }
            }
            return min;
        }

        static int secondMinNumber(int[]arr){
            int min=firstMinNumber(arr);
            int n=arr.length;
            for(int i=0;i<n;i++){
                
                    if(arr[i]==min){
                        arr[i]=Integer.MAX_VALUE;
                    }
                }
                int secondmin=firstMinNumber(arr);
                return secondmin;
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

        System.out.println("Second min number : ");
        
        System.out.print("Output :"+secondMinNumber(arr));
    }
}

*/

