//Check if the given array is sorted or not..
// 1 2 3 4 6 9 12  ---sorted
// 1 3 4 6 2 9    --- not sorted



public class ArrraySort {
    public static void main(String[] args) {
        
        Boolean check=true;
       // int arr[]={1,3,5,7,9};
       int arr[]={1,2,5,7,3};

        for(int i=1;i<arr.length;i++){
            if(arr[i]<arr[i-1]){
               check=false;
            }
        }
        System.out.println("Array sorting : "+check);

    }
    
}




