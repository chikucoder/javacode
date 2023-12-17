//7 8 3 1 2
//7|8 3 1 2
//7 8|3 1 2
//7 8 3|1 2
//7 3 8| 1 2
//3 7 8| 1 2
//3 7 8 1| 2
//3 7 1 8| 2
//3 1 7 8| 2
//1 3 7 8| 2
//1 3 7 8 2
//1 3 7 2 8
//1 3 2 7 8
//1 2 3 7 8--->insertion sort

public class InsertionSort {

    
    public static void insertion(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={7,8,3,1,2};
        for(int i=1;i<arr.length;i++){
            int current=arr[i];
            int j=i-1;
          
                while(j>=0 && current<arr[j]){
                    arr[j+1]=arr[j];
                    j--;
                }
                arr[j+1]=current;
            }

    insertion(arr);
 }    
}

    
