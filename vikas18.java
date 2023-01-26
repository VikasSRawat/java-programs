// package java(tutorials); Look into this later pls
class Mythread_runnable1 implements Runnable{
    @Override
    public void run(){
        for(int i=0;i<10;i++)
            System.out.println("Hello I am run of Mythread_runnable1 class");
    }
}
class Mythread_runnable2 implements Runnable{
    @Override
    public void run(){
        for(int i=0;i<10;i++)
            System.out.println("Hello I am run of   Mythread_runnable2 class");
    }
}
public class vikas18 {
    // Implementing threads using runnable interface
    public static void main(String[] args) {// We are exteding the runnable interface into the classes and making run implementor and make objects of those classes
        Mythread_runnable1 obj1=new Mythread_runnable1();//Making implementor of thread1
        Mythread_runnable2 obj2=new Mythread_runnable2();//Making implementor of thread2
        
        // But to running the thread we need to pass the implementor into the thread constructor and use .start() to run the thread
        Thread g1=new Thread(obj1);// Running the thread
        Thread g2=new Thread(obj2);
        
        g1.start();
        g2.start();
    }    
}


// Life cycle of a thread

// New - Instance of thread created which is not yet started by invoking start()

// Runnable - After invocation of start() and before it is selected to be run by the scheduler

// Running - The thread is running or executing after the thread scheduler has selected it

// Non Runnable - Thread is alive but not eligible to run as we don't need any computing power is not given . 
// When the sleep() or wait() method is called by the thread class, the thread enters into a non-runnable state

// Terminated - run() method has been exited (The method has been executed) 