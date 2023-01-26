class base{
    int x;
    base(){
        // super();//Does not have any effect
        System.out.println("Ayo this is base class constructor");
    
    }
    base(int i){
        System.out.println("Ayo this is a base class parameterized constructor "+i);
    }
    public void setx(int x){
        this.x=x;
    }
    public int getx(){
        return x;
    }

    int z=0;
    public void print(){
        System.out.println("Hello I am in base class");
    }
}
class derived extends base{
    int y;
    derived(){
        // super(0);
        super();//super can not be called without any arguements 
        System.out.println("Ayo this is derived class constructor");
    }
    derived(int i){
        System.out.println("Ayo this is a derived parameterized constructor but with only 1 arguement "+i);
    }
    derived(int i,int j){
        super(j);
        System.out.println("Ayo this is a derived parameterized constructor "+i);
    }
    public void sety(int y){
        this.y=y;
    }
    public int gety(){
        super.print();
        return y;
    }

    // Overriding print()
    @Override
    public void print(){
        // super.print();
        System.out.println("Yo i am in derived class + "+super.z);
    }
}
class childofderived extends derived{
    childofderived(int x,int y,int z){
        super(y);
        System.out.println("Childofderived class parameterized constructor "+y);
    }
}
public class vikas7 {
    public static void main(String[] args) {
        derived obj=new derived(2,1);
        obj.setx(56);
        System.out.println("The value of x in derived class object is "+obj.getx());
        obj.sety(12);
        System.out.println("The value of y in derived is "+obj.gety());
        obj.print();

        derived obj2=new derived(231);

        derived obj3=new derived();
        // base obj1=new base(34);
        // obj1.setx(45);
        // System.out.println("The value of x in base class is "+obj1.getx());
        // obj1.print();
        childofderived newobj=new childofderived(1,2,3);
    }
}
// Explanation


//The calling of constructor is mostly same as c++ in terms of heirarchy But the only difference is that the base default constructor is called when the derived parameterized constructor

/*The super keyword is used to call parent class methods and fields of the immediate parent class*/
// We can also call the immediate parent class constructor using super
// Note : We cannot call 2 superclass constructor from the base class
// Note: The super keyword must come before everything else in a constructor definition

// We can override a method by making the same name method and also the same arguement list
// If we change the arguement list then it is known as method overloading 

// @Override This annotation is used to check if a method is getting overrided or not
//By commenting out the print in the derived class and keeping @override will cause an error