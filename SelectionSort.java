//7 8 3 1 2
//smallest 0[7] --> 2[3] -->3[1]
// 1 8 3 7 2

//smallest1[8]--> 2[3]  --> 4[2]
// 1 2 3 7 8

//smallest 2[3]
//smallest  3[7]

public class SelectionSort {
    

    public static void Selection(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={7,8,3,1,2};
        for(int i=0;i<arr.length-1;i++){
            int smallest=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[smallest]>arr[j]){
                    smallest=j;
                }
            }
            int temp=arr[smallest];
            arr[smallest]=arr[i];
            arr[i]=temp;
        }
       Selection(arr);
    
}

    
}
