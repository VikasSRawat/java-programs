class A extends Thread{
    public void run(){
        for(int i=0;i<40;i++)
            System.out.println("Hello people");
    }
}
class B extends Thread{
    public void run(){
        for(int i=0;i<3;i++)
            System.out.println("In B thread");
    }
}
public class vikas23 {
    public static void main(String[] args) {
        A obj=new A();
        B oB=new B();

        obj.start();
        oB.start();
        oB.stop();
        System.out.println(obj.isAlive());
        System.out.println(oB.isAlive());// Will give false due to stop method being applied on oB
    }
}
