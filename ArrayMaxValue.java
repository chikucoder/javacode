//Calculate the maximum value of all the elements in the given array.

//Input :arr[]={1,5,3}
//Output:5



public class ArrayMaxValue {
    public static void main(String[] args) {
        

        int[] arr={1,5,3};
        int max=0;
        for(int i=0;i<arr.length;i++)
        {
           if(max<arr[i])
           {
           max=arr[i];
           }
           
        }
        System.out.println("Maximum Value: " +max);

    }

    
}

