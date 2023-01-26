class totalearnings extends Thread{
    int total=0;
    public void run(){
        synchronized(this){
            for(int i=1;i<=10;i++)
                total+=100;
            this.notify();// This will make totalearnings release this lock and it will return to the main thread
            // this.notifyAll(); same output as above
        }
    }
}
public class vikas26 {
    public static void main(String[] args)throws InterruptedException {
        totalearnings te=new totalearnings();
        te.start();
        // System.out.println(te.total);//Without the synchronized block it will print 0 as the main thread will be executed first due to the for loop present in totalearnings class
        synchronized(te){
            te.wait();// main method will release the lock and hence totalearnings will get the lock
            System.out.println("TOtal = "+te.total);
        }
    }
}


// The wait() method causes the current thread to wait until another thread invokes the notify() or notifyAll() methods for that object. 
// The notify() method wakes up a single thread that is waiting on that object’s lock.
//  The notifyAll() method wakes up all threads that are waiting on that object’s lock