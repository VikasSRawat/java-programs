// Abstract classes are those classes which have methods(atleast one) which are not defined but are only declared and hence will be defined in the class being derived

abstract class base{
    abstract void display();
    abstract void look();
}
abstract class derived extends base{
    void display(){
        System.out.println("Hey this display was an abstract method in base class");
    }
    abstract void show();
}
class derived1 {
    void display(){
        System.out.println("Hey this display was an abstract method in base class which i am overriding in derived1");
    }
}
class subderived extends derived{
    void show(){
        System.out.println("Hey this show was an abstract method in derived class");
    }

    //we can also define abstract classes which were inherited from a class which was also inherited from another class
    void look(){
        System.out.println("Hey this look was an abstract method in base class");
    }
}

public class vikas9 {
    public static void main(String[] args) {
        // derived obj=new derived();
        // obj.display();
        //Cannot create objects of abstract classes        

        subderived sobj=new subderived();
        sobj.display();
        sobj.show(); 
        sobj.look();

        derived1 obj1=new derived1();
        obj1.display();
    }
}
