// package java(tutorials);

// Constructors of a thread class

class Mythr extends Thread{
    // We are overloading the constructor Thread(string)  which will give a new name to the thread
    public Mythr(String name){
        super(name);
    }
    @Override
    public void run(){
        for(int i=0;i<10;i++)
            System.out.println("I am god(thread) of Mythr run()"+getName());
    }
};

// class Mythr2 implements Runnable{
//     public Mythr2(Runnable r,String name){
//         super(r,name);

//     }
//     public void run(){
//         System.out.println("I am run of Mythr2");
//     }
// };
public class vikas19 {
    public static void main(String[] args) {
        Mythr t1=new Mythr("Vikas is a god");
        System.out.println(t1.getName());
        System.out.println(t1.getId());

        // Mythr2 obj=new Mythr2(t1,"Vikas");
        // Thread gun = new Thread(obj,"Vikas");
        // System.out.println(gun.getName());
    }
}
