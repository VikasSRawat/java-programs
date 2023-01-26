interface bicycle{
    int a=45;
    void brake(int dec);
    void accelerate(int inc);
}
interface blowhorn{
    void normalhorn();
    void songhorn();
}

//Interfaces cannot have definition of methods they can only have abstract methods (and fields)
//Interfaces methods are public by default
//Interfaces can also extend from multiple interfaces
//We can create references of interfaces but not objects
//When implementing an interface inside a class , it is neccessary to override the methods but not neccessarily the fields
interface father{
    void display();
}
interface mother{
    void mother();
}
interface child extends father,mother{//extending multiple inheritance
    int x=90;//field
    void show();//method
}


//We can also implement multiple inheritances using interfaces
class avonbicycle implements bicycle,blowhorn,child{
    public int speed=69;
    public int x=100;//This won't change the value of x in interface child but will just make another copy inside avonbicycle which will override that x
    //whenever  we are defining methods of interface inside a class then we have to put public before every method
    public void brake(int dec){
        System.out.println("Applying brake");
        speed=speed-dec;
    }
    public void accelerate(int inc){
        System.out.println("Accelerating");
        speed=speed+inc;
    }
    public void normalhorn(){
        System.out.println("Blowing normal horn");
    }
    public void songhorn(){
        System.out.println("Mai toh yamla pagla deewana");
    }
    public void show(){
        System.out.println("This is show");
    }
    public void display(){
        System.out.println("This is display");
    }
    public void mother(){
        System.out.println("This is mother");
    }
}

abstract class test{
    void abs();
}

interface inte extends test{
    void newabs();
}

class testoutput implements inte{

    public void abs(){
        System.out.println("This abs is of class test");
    }

    public void newabs(){
        System.out.println("This newabs is of interface int");
    }
}

public class vikas10 {
    public static void main(String[] args) {
        avonbicycle obj=new avonbicycle();
        obj.brake(30);
        System.out.println("New speed = "+obj.speed);
        obj.songhorn();
        obj.display();
        obj.mother();
        System.out.println(obj.a);
        // obj.a++;//values inside an interface are final that is they cannot be modified
        System.out.println(obj.x);
        avonbicycle newobj=new child();
        // newobj.display();

        testoutput test=new testoutput();
        test.abs();
    }
}


// Difference between abstract classes and interfaces

// 1)
// Abstract class can have abstract and non-abstract methods.	
// Interface can have only abstract methods. Since Java 8, it can have default and static methods also.

// 2)
// Abstract class doesn't support multiple inheritance.	
// Interface supports multiple inheritance.

// 3)
// Abstract class can have final, non-final, static and non-static variables.	
// Interface has only static and final variables.i.e., we cannot  modify a value inside an interface

// 4) 
// Abstract class can provide the implementation of interface.	
// Interface can't provide the implementation of abstract class.

// 5) 
// The abstract keyword is used to declare abstract class.	
// The interface keyword is used to declare interface.

// 6) 
// An abstract class can extend another Java class and implement multiple Java interfaces.
// An interface can extend another Java interface only.

// 7)
// An abstract class can be extended using keyword "extends".	
// An interface can be implemented using keyword "implements".

// 8)
// A Java abstract class can have class members like private, protected, etc.
//	Members of a Java interface are public by default.

// 9)
// Example:
// public abstract class Shape{
// public abstract void draw();
// }

// Example:
// public interface Drawable{
// void draw();
// }