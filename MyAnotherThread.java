//Creating thread using Thread Class

public class MyAnotherThread extends Thread{
    public void run(){
        for(int i=10;i>1;i--){
            System.out.println("Another Thread:"+i);
            try{

                Thread.sleep(2000);
            }catch(Exception e){

            }
        }
        
    }
    public static void main(String[] args) {
       // MyAnotherThread thr=new MyAnotherThread();
       // thr.start();
        
    }

    
}
