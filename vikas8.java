class phone{
    public void greet(){
        System.out.println("Good Morning");
    }
    public void name(){
        System.out.println("Yo this is class one");
    }
}

class smartphone extends phone{
    public void swagat(){
        System.out.println("Namashkar ji");
    }
    public void name(){
        System.out.println("Oh bidu yeh class two h");
    }
}
public class vikas8 {
    public static void main(String[] args) {
        // phone obj=new phone();
        smartphone smobj=new smartphone();

        phone obj=new smartphone();//allowed
        //It is basically run-time polymorphism
        //phone is the reference here but the object is of smartphone
        obj.name();
        // Hence smartphone name is called
        // obj.greet();//will call greet from phone as it is derived in smartphone
        // obj.swagat();//As there is no swagat method in phone hence it will give an error(it can only call the methods which are either in the referenced class or which are overriden in the derived class)

        // ref is refference of phone but it will point to the object of smartphone and hence it can call the smartphones references
        phone ref;
        ref=smobj;
        ref.name();

        // It can still call the base class methods
        ref.greet();
    }
}
// Objects with references will call only those methods which are either being overriden in the derived class or of those in the referenced class