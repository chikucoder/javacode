// 7 8 3 1 2
//7 8 3 1 2
//7 3 8 1 2
//7 3 1 8 2
//7 3 1 2 8
//3 7 1 2 8
//3 1 7 2 8
//3 1 2 7 8
//1 3 2 7 8
//1 2 3 7 8--->Bubble sort



public class Bubblesort {

    public static void bubble(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={7,8,3,1,2};
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                }
            }
        }
        bubble(arr);
    }
    
}
