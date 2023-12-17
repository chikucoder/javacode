

//WPrint the first multiple of 5 which is also multiple of 7.
// ans is 35




public class breakKeyword{
    public static void main(String[] args) {
        
        int num=1;

         while(true)
         {
            if((num%5==0)&&(num%7==0))
            {
                System.out.println("Found:"+num);
                break;
            }
            num++;

         }
         
    }
    
}


