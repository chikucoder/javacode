//Creating thread using runnable interface
public class MyThread implements Runnable{

    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("Value of:"+i);
            try{
                Thread.sleep(1000);

            }catch(Exception e){
                
            }
        }
    }
    public static void main(String[] args) {
        MyThread t=new MyThread();
        Thread thread =new Thread(t);
        thread.start();

      //    MyAnotherThread thr=new MyAnotherThread();


       // thr.start();
        //  thread.start();
        

        
        
    }
    
}
