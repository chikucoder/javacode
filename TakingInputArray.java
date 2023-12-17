//Takung input in array

import java.util.Scanner;

public class TakingInputArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int n=sc.nextInt();
        int[] arr=new int[5];

        System.out.println("Enter the array Element");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("The elements are :");
        for(int i=0;i<n;i++){  

        System.out.print(arr[i] + " ");
        }
        
        
    }
    
}
