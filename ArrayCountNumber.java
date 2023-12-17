//Count the number of occurrences of a particular element x.


//Input :arr[]={1,5,5,3,5,8,9,8}
//x=5
//Output:3



public class ArrayCountNumber {
    public static void main(String[] args) {
        

        int[] arr={1,5,5,3,5,8,9,8};
        int x=5;
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
           if(x==arr[i])
           {    
           count++;
           }
           
        }
        System.out.println("Count the number " + x + " is : "  +count +" times ");

    }

    
}




