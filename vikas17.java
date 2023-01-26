import java.lang.Thread;
// CREATING A THREAD BY EXTENDING THE 'Thread' class
class makingthread1 extends Thread{
    @Override
    public void run(){
        int i=0;
        while(i<20){
            System.out.println("The first thread class");
            System.out.println("Vikas is a god");
            i++;
        }
    }
}
class makingthread2 extends Thread{
    @Override
    public void run(){
        int i=0;
        while(i<20){
            System.out.println("The second thread class");
            System.out.println("Going for a good life");
            i++;
        }
    }
}
public class  vikas17 {
    
    public static void main(String[] args) {
        // System.out.println("Hello world");
        makingthread1 obj1=new makingthread1();
        makingthread2 obj2=new makingthread2();
        obj1.run();
        obj2.run();
        System.out.println("obj2 function will run after obj1 function gets completed \n");
        obj1.start();
        obj2.start();
        // It will keep intermittently switch between makingthread1 and makingthread2 as the process of calling the 2 functions have been divided into small threads which will keep on intimittently run between the two
        System.out.println("The current state of obj1 is "+obj1.getState());
        System.out.println("The current state of obj2 is "+obj2.getState());
        System.out.println(Thread.currentThread().getState());
        // CurrentThread gets the reference of the current thread which is being executed
    }
}
