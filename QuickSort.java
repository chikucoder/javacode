public class QuickSort {
    public static int partiation(int arr[],int low, int high){
  int pivot=arr[high];
  int i=low-1;
  for(int j=low;j<high;j++){
    if(arr[j]<pivot){
        i++;
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
  }
  i++;
        int temp=arr[i];
        arr[i]=arr[high];
        arr[high]=temp;
        return i;

    }
    public static void quick(int arr[],int low,int high){
        if(low<high){
        int pivindx=partiation( arr,low,high);

        quick(arr, low, pivindx-1);
        quick(arr, pivindx+1, high);
         
    }
}
    public static void main(String[] args) {
        
        int[] arr={5,2,8,3,6,9};
        int n=arr.length;
        quick(arr, 0, n-1);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

    }
    
}
