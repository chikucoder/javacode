//Search the given element x in the array.
//If present then return the index else return -1.

//Input :arr[]={1,5,5,3,5,8,9,8}
//x=5
//Output:1



public class ArraySearchElement {
    public static void main(String[] args) {
        

        int[] arr={1,5,5,3,5,8,9,8};
        int x=8;
        int search=-1;
        for(int i=0;i<arr.length;i++)
        {
           if(x==arr[i])
           {
           search=i;
           break;
           }
           
        }
        System.out.println("Search the " + x + " value at : "  +search);

    }

    
}




