class UserThread extends Thread{
    //task for thread......
    public void run(){
        System.out.println("this is user defined thread");

    }
}
public class ThreadOperation {
    public static void main(String[] args) {
        System.out.println("Program Started...");
        int x=5+10;
        System.out.println(x);

        Thread t=Thread.currentThread();
        String str=t.getName();
        System.out.println("current running thread is "+ str);
        t.setName("MyMain");
        System.out.println(t.getName());
        try{
        Thread.sleep(4000);
        }
        catch(Exception e){

        }
        System.out.println(t.getId());
        
        //going to start user defined thread.
        UserThread m=new UserThread ();
        m.start();
        
        System.out.println("Program Ended...");
    }
    
}
