//Find rthe smallest and largest elements in array
// 1 8 2 3 9
//smallest =1
//largest =9

import java.util.Arrays;

public class AraaySmallestLargest {
    public static void main(String[] args) {
        
       //original array
        int[] arr={1,8,2,3,9,29,24,32,34,12};
        
    
        Arrays.sort(arr);
        //after sorted array
        System.out.println(Arrays.toString(arr));
        int[] ans={arr[0],arr[arr.length-1]};
        System.out.println("Smallest : "+ans[0]);
        System.out.println("Largest : "+ans[1]);
    }
    
}




/* 
public class AraaySmallestLargest {
    public static void main(String[] args) {
        
       //original array
        int[] arr={1,8,2,3,9,29,24,32,34,12};
      
        int min=arr[0];
    int max=arr[0];
    for(int i=0;i<arr.length;i++)
    {
        if(max<arr[i]){

            max=arr[i];
        }
        else if(min>arr[i]){
            min=arr[i];
        }
        
    }
    System.out.println("Minimum : "+min );
    System.out.println("Maximum : "+max);
    
    }
    
}

*/
