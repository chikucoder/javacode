//  Wap to print prefix and postfix of a number..

//postfix
      //  p++ --->first Assign then increment

//prefix
     //   ++q  ---> fist increment then Assign

public class UnaryOperator {
    public static void main(String[] args) {
        int p=124;int q=111;
        //postfix
        System.out.println(p++); //124
        System.out.println(p);  //125

        //prefix
        System.out.println(++q); //112
        System.out.println(q);  //112

        int x=p++;
        int y=++q;

        System.out.println(x); //125
        

        //prefix
        System.out.println(y); //113

        
    }

}
