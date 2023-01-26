//THREADS IN JAVA
// Threads in java are typically just subprocess 
// Multiprocessing involves running multiple process simultaneously which takes a lot more resources and 
// hence it might casue all the resources to get eaten up. Plus it takes more time to switch between multiple processes
// Unlike multiprocesses multithreading uses the same memory allocation for all the resources which then will give an advantage as threads are lightweight and hence it will take less time between switching between threads and hence speeding up the processes
// If there is an exception in one of the threads it will not affect the other processes
// Multithreading help us achieve concurrency



// 2 Ways of creating threads 
// By extending thread class
// By implementing runnable interface 

public class vikas16{
    public static void main(String[] args) {
        System.out.println("YO WASSUP");
    }
}