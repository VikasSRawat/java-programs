class test extends Thread{
    public void run(){
        for(int i=0;i<2000;i++){
            System.out.println("Yo I am in test class");
        }
    }
}
class next extends Thread{
    public void run(){
        for(int i=0;i<1000;i++)
            System.out.println("Hell am in next class");
    }
}
class another extends Thread{
    public void run(){
        for(int i=0;i<4000;i++){
            System.out.println("Yo I am in another class using sleep method");
            try{
                Thread.sleep(699);//This will make the thread go to sleep for 699 milliseconds
            }
            catch(InterruptedException e){
                e.printStackTrace();// Will throw an exception for this error
            }
        }
    }
}
class lol extends Thread{
    public void run(){
        for(int i=0;i<45;i++)
            System.out.println("Yo i am in lol");
    }
}
public class vikas21 {
    public static void main(String[] args) {
        // test obj=new test();
        // next nobj=new next();
        // obj.start();
        // try{
        //     obj.join();// Might throw Interrupted Exception hence we will use a try catch block to handle this exception
        //     // Interrupted exception will not make the thread obj to run hence it will throw an exception
        //     // Join will make it so that thread obj is finished and then only the threads below obj will run in this case nobj
        // }
        // catch(Exception e){
        //     System.out.println(e);
        // }
        // nobj.start();

        another aobj=new another();
        lol lobj=new lol();
        aobj.start();// This will make aobj sleep for 699 millesecond and hence will make lobj thread will run
        lobj.start();
    }
}
