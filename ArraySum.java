//Calculate the sum of all the elements in the given array.

//Input :arr[]={1,5,3}
//Output:9



public class ArraySum {
    public static void main(String[] args) {
        

        int[] arr={1,5,3};
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum=sum+arr[i];
           
        }
        System.out.println(sum);

    }

    
}
