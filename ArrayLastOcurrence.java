//Find the last occurrence of a  element x in a given array.


//Input :arr[]={1,5,5,3,5,8,9,8}
//x=5
//Output:4



public class ArrayLastOcurrence {
    public static void main(String[] args) {
        

        int[] arr={1,5,5,3,5,8,9,8};
        int x=5;
        int lastOcurrence=0;
        for(int i=0;i<arr.length;i++)
        {
           if(x==arr[i])
           {    
           lastOcurrence=i;
           }
           
        }
        System.out.println("LastOcurrence of number " + x + " is : "  + lastOcurrence +" position ");

    }

    
}




