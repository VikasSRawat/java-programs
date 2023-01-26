import java.lang.*;
class thread1 extends Thread{
    String name=Thread.currentThread().getName();
    public void run(){
        for(int i=0;i<=5;i++){
            System.out.println("name = "+name);
            Thread.yield();//Due to yield , it will suspend this current thread and send it into waiting state and hence wait for the other threads to get executed 
        }
    }
}
class thread2 extends Thread{
    String name=Thread.currentThread().getName();
    public void run(){
        for(int i=0;i<=5;i++){
            System.out.println(name);
            // Thread.yield();
        }
    }
}

public class vikas22{
    public static void main(String[] args) {
        thread1 obj1=new thread1();
        thread2 obj2=new thread2();
        
        obj1.start();
        obj2.start();

        // obj2 threads get executed first and then obj1 threads get executed
    }
}
// A yield() method is a static method of Thread class and it can stop the currently executing thread and will give a chance to other waiting threads of the same priority. 
// If in case there are no waiting threads or if all the waiting threads have low priority then the same thread will continue its execution. 
// The advantage of yield() method is to get a chance to execute other waiting threads so if our current thread takes more time to execute and allocate processor to other threads.


// Stop method is used to terminated a thread i.e., makes its current state dead so that the thread scheduler does not let it run again