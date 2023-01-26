class A extends Thread{
    public void run(){
        // for(int i=0;i<5;i++)
        //     System.out.println("Hello i am in running state "+Thread.currentThread().getName());// Thread won't get interrupted as it is in running state
        try{
            for(int i=0;i<5;i++){
                System.out.println("I am going to get interrupted "+Thread.currentThread().getName());
                Thread.sleep(2000);// Making the thread go into wait state
            }
        }
        catch(InterruptedException e){
            System.out.println("Thread got terminated due to interruption "+e);
        }
    }
}
public class vikas24 {
    public static void main(String[] args) {
        A obj=new A();
        obj.start();
        obj.interrupt();
    }
}
// Thread interrupts are used for interrupting a thread 
// They will only work on threads which are in wait state and hence will make them unable to run again when they are interrupted