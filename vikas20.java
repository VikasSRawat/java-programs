class Mythr1 extends Thread{
    // @Override
    public Mythr1(String name){
        super(name);
    }
    public void run(){
        for(int i=0;i<10;i++)
            System.out.println("I am run of Mythr1 and my name is "+getName());
    }
};

class Mythr2 implements Runnable{
    public void run(){
        for(int i=0;i<10;i++)
            System.out.println("I am run of Mythr2 and my name is "+ Thread.currentThread().getName());
    }
};
public class vikas20 {
    public static void main(String[] args) {
        Mythr1 t1=new Mythr1("god");
        Mythr1 t2=new Mythr1("vikas");
        Mythr1 t3=new Mythr1("lol");
        Mythr1 t4=new Mythr1("hola");
        Mythr1 t5=new Mythr1("this");

        t1.setPriority(Thread.MAX_PRIORITY);// Will get the most priority 
        t2.setPriority(Thread.MIN_PRIORITY);// Minimum priority given to this 
        t3.setPriority(Thread.MIN_PRIORITY);// Minimum priority given to this
        t4.setPriority(Thread.NORM_PRIORITY);// Will get the second most priority
        t5.setPriority(Thread.MIN_PRIORITY);// Minimum priority given to this

       
        // t1.start();
        // t2.start();
        // t3.start();
        // t4.start();
        // t5.start();

        Mythr2 obj=new Mythr2();
        Thread gun1= new Thread(obj,"Second class");
        gun1.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        gun1.start();

        // As both t1 and gun1 have the same priority they both will be run simultaneously
        // Though the OS sets the thread priority in general cases
    }
}
